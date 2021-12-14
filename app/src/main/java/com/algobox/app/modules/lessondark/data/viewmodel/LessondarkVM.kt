package com.algobox.app.modules.lessondark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.lessondark.`data`.model.LessondarkModel

public class LessondarkVM : ViewModel() {
  public val lessondarkModel: MutableLiveData<LessondarkModel> = MutableLiveData(LessondarkModel())
}
