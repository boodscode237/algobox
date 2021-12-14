package com.algobox.app.modules.signup.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.signup.`data`.model.SignUpModel

public class SignUpVM : ViewModel() {
  public val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())
}
