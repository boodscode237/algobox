package com.algobox.app.modules.welcometoalgobox.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.welcometoalgobox.`data`.model.WelcomeToAlgoboxModel

public class WelcomeToAlgoboxVM : ViewModel() {
  public val welcomeToAlgoboxModel: MutableLiveData<WelcomeToAlgoboxModel> =
      MutableLiveData(WelcomeToAlgoboxModel())
}
