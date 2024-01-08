package com.test.ui.school;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SchoolViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SchoolViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is school fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}