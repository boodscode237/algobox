package com.algobox.app.modules.darktheme.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.darktheme.`data`.model.DarkThemeModel

public class DarkThemeVM : ViewModel() {
  public val darkThemeModel: MutableLiveData<DarkThemeModel> = MutableLiveData(DarkThemeModel())
}
