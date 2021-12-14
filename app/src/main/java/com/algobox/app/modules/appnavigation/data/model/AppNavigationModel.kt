package com.algobox.app.modules.appnavigation.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchdark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_dark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettingsdark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_settingsdark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDarktheme: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dark_theme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomePagejs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_page_js)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomePagejs22: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_page_js22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomePagedark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_page_dark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpdark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sign_up_dark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLesson: String? = MyApp.getInstance().resources.getString(R.string.lbl_lesson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLessondark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lessondark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogIndark: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_log_in_dark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogInInvalid: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_invali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogInInvaliddark: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_invali2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeToAlgoBox: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_algo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeToAlgoBoxdark: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_algo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHorizontalScrolling: String? =
      MyApp.getInstance().resources.getString(R.string.msg_horizontal_scro)

)
