package com.algobox.app.modules.login.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.login.`data`.model.LogInModel

public class LogInVM : ViewModel() {
  public val logInModel: MutableLiveData<LogInModel> = MutableLiveData(LogInModel())
}
