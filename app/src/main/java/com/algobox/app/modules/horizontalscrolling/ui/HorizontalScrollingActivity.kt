package com.algobox.app.modules.horizontalscrolling.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityHorizontalScrollingBinding
import com.algobox.app.modules.horizontalscrolling.`data`.viewmodel.HorizontalScrollingVM
import kotlin.String
import kotlin.Unit

public class HorizontalScrollingActivity :
    BaseActivity<ActivityHorizontalScrollingBinding>(R.layout.activity_horizontal_scrolling) {
  private val viewModel: HorizontalScrollingVM by viewModels<HorizontalScrollingVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.horizontalScrollingVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HORIZONTAL_SCROLLING_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HorizontalScrollingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
