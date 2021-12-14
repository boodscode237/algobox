package com.algobox.app.modules.horizontalscrolling.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.horizontalscrolling.`data`.model.HorizontalScrollingModel

public class HorizontalScrollingVM : ViewModel() {
  public val horizontalScrollingModel: MutableLiveData<HorizontalScrollingModel> =
      MutableLiveData(HorizontalScrollingModel())
}
