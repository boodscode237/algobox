package com.algobox.app.modules.searchdark.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.searchdark.`data`.model.SearchDarkModel

public class SearchDarkVM : ViewModel() {
  public val searchDarkModel: MutableLiveData<SearchDarkModel> = MutableLiveData(SearchDarkModel())
}
