package com.algobox.app.modules.signupdark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySignUpDarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.signupdark.`data`.viewmodel.SignUpDarkVM
import com.algobox.app.modules.welcometoalgoboxdark.ui.WelcomeToAlgoboxDarkActivity
import kotlin.String
import kotlin.Unit

public class SignUpDarkActivity :
    BaseActivity<ActivitySignUpDarkBinding>(R.layout.activity_sign_up_dark) {
  private val viewModel: SignUpDarkVM by viewModels<SignUpDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.imageBackArrow.setOnClickListener {
    val destIntent = WelcomeToAlgoboxDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
    val destIntent = HomePageDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.signUpDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
