package com.algobox.app.modules.lesson.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class LessonModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)
