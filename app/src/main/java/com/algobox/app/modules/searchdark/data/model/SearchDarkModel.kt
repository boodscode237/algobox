package com.algobox.app.modules.searchdark.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchDarkModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.msg4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_ways_to_le)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFindwhatlangu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_what_langu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup6Value: String? = null
)
