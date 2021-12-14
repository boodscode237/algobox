package com.algobox.app.modules.logininvaliddark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.logininvaliddark.`data`.model.LogInInvalidDarkModel

public class LogInInvalidDarkVM : ViewModel() {
  public val logInInvalidDarkModel: MutableLiveData<LogInInvalidDarkModel> =
      MutableLiveData(LogInInvalidDarkModel())
}
