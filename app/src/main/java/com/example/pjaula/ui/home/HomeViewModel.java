package com.example.pjaula.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Presiona Durante 3 Segundos para Activar la Alarma de Forma Manual");
    }

    public LiveData<String> getText() {
        return mText;
    }
}