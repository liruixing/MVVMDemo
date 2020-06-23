package com.dennis.module_second;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dennis.module_second.databinding.SecondActivitySecondBinding;
import com.lrx.module_base.base.BaseActivity;
import com.lrx.module_base.base.NoViewModel;


@Route(path="/second/second")
public class SecondActivity extends BaseActivity<NoViewModel, SecondActivitySecondBinding> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_second);

        bindingView.btn1.setOnClickListener(this);
        showContentView();
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
