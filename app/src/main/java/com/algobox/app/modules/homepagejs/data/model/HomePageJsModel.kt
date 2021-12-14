package com.algobox.app.modules.homepagejs.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class HomePageJsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.msg31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.msg32)

)
