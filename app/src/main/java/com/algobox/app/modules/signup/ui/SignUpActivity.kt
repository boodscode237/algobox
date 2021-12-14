package com.algobox.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySignUpBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.signup.`data`.viewmodel.SignUpVM
import com.algobox.app.modules.welcometoalgobox.ui.WelcomeToAlgoboxActivity
import kotlin.String
import kotlin.Unit

public class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  public override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
    val destIntent = HomePageActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageBackArrow.setOnClickListener {
    val destIntent = WelcomeToAlgoboxActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.signUpVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
