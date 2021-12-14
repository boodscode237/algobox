package com.algobox.app.modules.signupdark.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpDarkModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup70Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup71Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup72Value: String? = null
)
