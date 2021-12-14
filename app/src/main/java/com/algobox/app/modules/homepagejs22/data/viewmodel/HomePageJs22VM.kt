package com.algobox.app.modules.homepagejs22.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.homepagejs22.`data`.model.HomePageJs22Model

public class HomePageJs22VM : ViewModel() {
  public val homePageJs22Model: MutableLiveData<HomePageJs22Model> =
      MutableLiveData(HomePageJs22Model())
}
