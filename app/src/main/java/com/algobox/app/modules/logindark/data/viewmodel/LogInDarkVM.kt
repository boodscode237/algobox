package com.algobox.app.modules.logindark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.logindark.`data`.model.LogInDarkModel

public class LogInDarkVM : ViewModel() {
  public val logInDarkModel: MutableLiveData<LogInDarkModel> = MutableLiveData(LogInDarkModel())
}
