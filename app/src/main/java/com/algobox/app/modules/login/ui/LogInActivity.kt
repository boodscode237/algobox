package com.algobox.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLogInBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.login.`data`.viewmodel.LogInVM
import com.algobox.app.modules.logininvalid.ui.LogInInvalidActivity
import com.algobox.app.modules.welcometoalgobox.ui.WelcomeToAlgoboxActivity
import kotlin.String
import kotlin.Unit

public class LogInActivity : BaseActivity<ActivityLogInBinding>(R.layout.activity_log_in) {
  private val viewModel: LogInVM by viewModels<LogInVM>()

  public override fun setUpClicks(): Unit {
    binding.linearEmailAddress.setOnClickListener {
    val destIntent = LogInInvalidActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.btnLogIn.setOnClickListener {
    val destIntent = HomePageActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageBackArrow.setOnClickListener {
    val destIntent = WelcomeToAlgoboxActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.logInVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LOG_IN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
