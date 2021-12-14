package com.algobox.app.modules.homepagedark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.homepagedark.`data`.model.HomePageDarkModel

public class HomePageDarkVM : ViewModel() {
  public val homePageDarkModel: MutableLiveData<HomePageDarkModel> =
      MutableLiveData(HomePageDarkModel())
}
