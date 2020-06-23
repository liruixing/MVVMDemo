package com.dennis.module_first;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.dennis.module_first.databinding.FirstActivityMainBinding;
import com.lrx.module_base.base.BaseActivity;


@Route(path="/first/first")
public class FirstActivity extends BaseActivity<FirstModelView, FirstActivityMainBinding> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_main);
        bindingView.btn1.setOnClickListener(this);
        bindingView.btn2.setOnClickListener(this);
        showContentView();
        bindingView.setViewModel(viewModel);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {
            ARouter.getInstance().build("/second/second").navigation();
        } else if (id == R.id.btn2) {
            Toast.makeText(this,"ceshi",Toast.LENGTH_LONG).show();
            if(viewModel.isShowing()){
                viewModel.setIsShowTipsView(false);
            }else{
                viewModel.setIsShowTipsView(true);
            }
        }
    }
}
