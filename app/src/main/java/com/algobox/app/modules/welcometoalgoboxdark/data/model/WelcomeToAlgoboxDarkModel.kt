package com.algobox.app.modules.welcometoalgoboxdark.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class WelcomeToAlgoboxDarkModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcometo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtALGOBOX: String? = MyApp.getInstance().resources.getString(R.string.lbl_algobox)

)
