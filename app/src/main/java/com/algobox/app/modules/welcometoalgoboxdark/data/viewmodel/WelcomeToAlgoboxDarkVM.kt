package com.algobox.app.modules.welcometoalgoboxdark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.welcometoalgoboxdark.`data`.model.WelcomeToAlgoboxDarkModel

public class WelcomeToAlgoboxDarkVM : ViewModel() {
  public val welcomeToAlgoboxDarkModel: MutableLiveData<WelcomeToAlgoboxDarkModel> =
      MutableLiveData(WelcomeToAlgoboxDarkModel())
}
