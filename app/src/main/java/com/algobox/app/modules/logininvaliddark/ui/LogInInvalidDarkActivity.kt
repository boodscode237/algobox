package com.algobox.app.modules.logininvaliddark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLogInInvalidDarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.logininvaliddark.`data`.viewmodel.LogInInvalidDarkVM
import com.algobox.app.modules.welcometoalgoboxdark.ui.WelcomeToAlgoboxDarkActivity
import kotlin.String
import kotlin.Unit

public class LogInInvalidDarkActivity :
    BaseActivity<ActivityLogInInvalidDarkBinding>(R.layout.activity_log_in_invalid_dark) {
  private val viewModel: LogInInvalidDarkVM by viewModels<LogInInvalidDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.btnLogIn.setOnClickListener {
    val destIntent = HomePageDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageBackArrow.setOnClickListener {
    val destIntent = WelcomeToAlgoboxDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.logInInvalidDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOG_IN_INVALID_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInInvalidDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
