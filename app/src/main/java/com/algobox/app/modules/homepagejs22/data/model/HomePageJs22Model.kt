package com.algobox.app.modules.homepagejs22.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class HomePageJs22Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.msg33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.msg34)
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
  public var etTimeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTime1Value: String? = null
)
