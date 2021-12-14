package com.algobox.app.modules.logininvalid.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.logininvalid.`data`.model.LogInInvalidModel

public class LogInInvalidVM : ViewModel() {
  public val logInInvalidModel: MutableLiveData<LogInInvalidModel> =
      MutableLiveData(LogInInvalidModel())
}
