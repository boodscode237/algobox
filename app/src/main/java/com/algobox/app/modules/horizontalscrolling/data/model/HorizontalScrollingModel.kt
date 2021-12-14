package com.algobox.app.modules.horizontalscrolling.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class HorizontalScrollingModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.msg43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etForumsValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPracticeValue: String? = null
)
