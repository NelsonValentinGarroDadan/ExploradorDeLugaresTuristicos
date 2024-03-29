package com.example.exploradordelugarestursticos.ui.configuraciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfiguracionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ConfiguracionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragment de configuraciones");
    }

    public LiveData<String> getText() {
        return mText;
    }
}