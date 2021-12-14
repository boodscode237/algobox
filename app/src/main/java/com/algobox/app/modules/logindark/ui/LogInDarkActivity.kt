package com.algobox.app.modules.logindark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLogInDarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.logindark.`data`.viewmodel.LogInDarkVM
import com.algobox.app.modules.logininvaliddark.ui.LogInInvalidDarkActivity
import com.algobox.app.modules.welcometoalgoboxdark.ui.WelcomeToAlgoboxDarkActivity
import kotlin.String
import kotlin.Unit

public class LogInDarkActivity :
    BaseActivity<ActivityLogInDarkBinding>(R.layout.activity_log_in_dark) {
  private val viewModel: LogInDarkVM by viewModels<LogInDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.imageBackArrow.setOnClickListener {
        val destIntent = WelcomeToAlgoboxDarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.linearEmailAddress.setOnClickListener {
        val destIntent = LogInInvalidDarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.btnLogIn.setOnClickListener {
        val destIntent = HomePageDarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.logInDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOG_IN_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
