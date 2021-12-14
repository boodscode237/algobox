package com.algobox.app.modules.settings.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_student_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed1: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_stats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed2: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.msg6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed3: String? = MyApp.getInstance().resources.getString(R.string.lbl_90)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.msg7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed4: String? = MyApp.getInstance().resources.getString(R.string.lbl_135)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.msg8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed5: String? = MyApp.getInstance().resources.getString(R.string.lbl_114)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.msg9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed6: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt6: String? = MyApp.getInstance().resources.getString(R.string.msg10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg11)

)
