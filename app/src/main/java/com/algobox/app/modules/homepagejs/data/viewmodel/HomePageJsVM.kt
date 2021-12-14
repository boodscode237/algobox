package com.algobox.app.modules.homepagejs.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.homepagejs.`data`.model.HomePageJsModel

public class HomePageJsVM : ViewModel() {
  public val homePageJsModel: MutableLiveData<HomePageJsModel> = MutableLiveData(HomePageJsModel())
}
