package com.algobox.app.modules.welcometoalgobox.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityWelcomeToAlgoboxBinding
import com.algobox.app.modules.login.ui.LogInActivity
import com.algobox.app.modules.signup.ui.SignUpActivity
import com.algobox.app.modules.welcometoalgobox.`data`.viewmodel.WelcomeToAlgoboxVM
import kotlin.String
import kotlin.Unit

public class WelcomeToAlgoboxActivity :
    BaseActivity<ActivityWelcomeToAlgoboxBinding>(R.layout.activity_welcome_to_algobox) {
  private val viewModel: WelcomeToAlgoboxVM by viewModels<WelcomeToAlgoboxVM>()

  public override fun setUpClicks(): Unit {
    binding.btnLogIn.setOnClickListener {
                val destIntent = LogInActivity.getIntent(this, null)
                startActivity(destIntent)
                }
    binding.btnSignUp.setOnClickListener {
                val destIntent = SignUpActivity.getIntent(this, null)
                startActivity(destIntent)
                }
  }

  public override fun onInitialized(): Unit {
    binding.welcomeToAlgoboxVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WELCOME_TO_ALGOBOX_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeToAlgoboxActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
