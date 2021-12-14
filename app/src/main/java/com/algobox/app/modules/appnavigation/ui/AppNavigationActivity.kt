package com.algobox.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityAppNavigationBinding
import com.algobox.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.algobox.app.modules.darktheme.ui.DarkThemeActivity
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.homepagejs.ui.HomePageJsActivity
import com.algobox.app.modules.homepagejs22.ui.HomePageJs22Activity
import com.algobox.app.modules.horizontalscrolling.ui.HorizontalScrollingActivity
import com.algobox.app.modules.lesson.ui.LessonActivity
import com.algobox.app.modules.lessondark.ui.LessondarkActivity
import com.algobox.app.modules.login.ui.LogInActivity
import com.algobox.app.modules.logindark.ui.LogInDarkActivity
import com.algobox.app.modules.logininvalid.ui.LogInInvalidActivity
import com.algobox.app.modules.logininvaliddark.ui.LogInInvalidDarkActivity
import com.algobox.app.modules.search.ui.SearchActivity
import com.algobox.app.modules.searchdark.ui.SearchDarkActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import com.algobox.app.modules.settingsdark.ui.SettingsdarkActivity
import com.algobox.app.modules.signup.ui.SignUpActivity
import com.algobox.app.modules.signupdark.ui.SignUpDarkActivity
import com.algobox.app.modules.welcometoalgobox.ui.WelcomeToAlgoboxActivity
import com.algobox.app.modules.welcometoalgoboxdark.ui.WelcomeToAlgoboxDarkActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linearHorizontalScrolling.setOnClickListener {
    val destIntent = HorizontalScrollingActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHomePage.setOnClickListener {
    val destIntent = HomePageActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSearchdark.setOnClickListener {
    val destIntent = SearchDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLogIn.setOnClickListener {
    val destIntent = LogInActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
    val destIntent = SignUpActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLogInInvalid.setOnClickListener {
    val destIntent = LogInInvalidActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearDarktheme.setOnClickListener {
    val destIntent = DarkThemeActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSettingsdark.setOnClickListener {
    val destIntent = SettingsdarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHomePagejs22.setOnClickListener {
    val destIntent = HomePageJs22Activity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSearch.setOnClickListener {
    val destIntent = SearchActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHomePagejs.setOnClickListener {
    val destIntent = HomePageJsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearWelcomeToAlgoBox.setOnClickListener {
    val destIntent = WelcomeToAlgoboxActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearWelcomeToAlgoBoxdark.setOnClickListener {
    val destIntent = WelcomeToAlgoboxDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHomePagedark.setOnClickListener {
    val destIntent = HomePageDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLogInInvaliddark.setOnClickListener {
    val destIntent = LogInInvalidDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSignUpdark.setOnClickListener {
    val destIntent = SignUpDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSettings.setOnClickListener {
    val destIntent = SettingsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLessondark.setOnClickListener {
    val destIntent = LessondarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLogIndark.setOnClickListener {
    val destIntent = LogInDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearLesson.setOnClickListener {
    val destIntent = LessonActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
