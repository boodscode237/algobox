package com.algobox.app.modules.homepage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.homepage.`data`.model.HomePageModel

public class HomePageVM : ViewModel() {
  public val homePageModel: MutableLiveData<HomePageModel> = MutableLiveData(HomePageModel())
}
