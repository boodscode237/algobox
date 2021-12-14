package com.algobox.app.modules.settingsdark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.settingsdark.`data`.model.SettingsdarkModel

public class SettingsdarkVM : ViewModel() {
  public val settingsdarkModel: MutableLiveData<SettingsdarkModel> =
      MutableLiveData(SettingsdarkModel())
}
