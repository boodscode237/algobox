package com.algobox.app.modules.lessondark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLessondarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.lessondark.`data`.viewmodel.LessondarkVM
import kotlin.String
import kotlin.Unit

public class LessondarkActivity :
    BaseActivity<ActivityLessondarkBinding>(R.layout.activity_lessondark) {
  private val viewModel: LessondarkVM by viewModels<LessondarkVM>()

  public override fun setUpClicks(): Unit {
    binding.imagePolygon1.setOnClickListener {
    val destIntent = HomePageDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.lessondarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LESSONDARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LessondarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
