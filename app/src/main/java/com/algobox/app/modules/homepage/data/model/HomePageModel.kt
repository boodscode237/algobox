package com.algobox.app.modules.homepage.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.msg24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.msg25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_javascript_cour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVariables: String? = MyApp.getInstance().resources.getString(R.string.lbl_variables)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_javascript_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_review_concept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription1: String? = MyApp.getInstance().resources.getString(R.string.msg26)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.msg27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_javascript_cour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVariables1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_variables)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_javascript_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_review_concept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etTimeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTime1Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etForumsValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPracticeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTime2Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTime3Value: String? = null
)
