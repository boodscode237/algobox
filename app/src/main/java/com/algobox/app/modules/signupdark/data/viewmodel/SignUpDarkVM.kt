package com.algobox.app.modules.signupdark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.signupdark.`data`.model.SignUpDarkModel

public class SignUpDarkVM : ViewModel() {
  public val signUpDarkModel: MutableLiveData<SignUpDarkModel> = MutableLiveData(SignUpDarkModel())
}
