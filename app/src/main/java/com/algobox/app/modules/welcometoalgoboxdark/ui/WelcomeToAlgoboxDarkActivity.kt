package com.algobox.app.modules.welcometoalgoboxdark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityWelcomeToAlgoboxDarkBinding
import com.algobox.app.modules.logindark.ui.LogInDarkActivity
import com.algobox.app.modules.signupdark.ui.SignUpDarkActivity
import com.algobox.app.modules.welcometoalgoboxdark.`data`.viewmodel.WelcomeToAlgoboxDarkVM
import kotlin.String
import kotlin.Unit

public class WelcomeToAlgoboxDarkActivity :
    BaseActivity<ActivityWelcomeToAlgoboxDarkBinding>(R.layout.activity_welcome_to_algobox_dark) {
  private val viewModel: WelcomeToAlgoboxDarkVM by viewModels<WelcomeToAlgoboxDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
            val destIntent = SignUpDarkActivity.getIntent(this, null)
            startActivity(destIntent)
            }
    binding.btnLogIn.setOnClickListener {
            val destIntent = LogInDarkActivity.getIntent(this, null)
            startActivity(destIntent)
            }
  }

  public override fun onInitialized(): Unit {
    binding.welcomeToAlgoboxDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WELCOME_TO_ALGOBOX_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomeToAlgoboxDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
