package com.algobox.app.modules.logininvalid.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLogInInvalidBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.logininvalid.`data`.viewmodel.LogInInvalidVM
import com.algobox.app.modules.welcometoalgobox.ui.WelcomeToAlgoboxActivity
import kotlin.String
import kotlin.Unit

public class LogInInvalidActivity :
    BaseActivity<ActivityLogInInvalidBinding>(R.layout.activity_log_in_invalid) {
  private val viewModel: LogInInvalidVM by viewModels<LogInInvalidVM>()

  public override fun setUpClicks(): Unit {
    binding.imageBackArrow.setOnClickListener {
    val destIntent = WelcomeToAlgoboxActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.btnLogIn.setOnClickListener {
    val destIntent = HomePageActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.logInInvalidVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOG_IN_INVALID_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInInvalidActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
