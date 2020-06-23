package com.dennis.module_first;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.lrx.module_base.base.BaseViewModel;

public class FirstModelView extends BaseViewModel {

    public ObservableField<Boolean> isShowTipsView  = new ObservableField<>();

    public FirstModelView(@NonNull Application application) {
        super(application);
    }

    public void setIsShowTipsView(boolean isShow) {
        isShowTipsView.set(isShow);
    }

    public boolean isShowing(){
        if(isShowTipsView.get() == null)return false;

        return isShowTipsView.get();
    }
}
