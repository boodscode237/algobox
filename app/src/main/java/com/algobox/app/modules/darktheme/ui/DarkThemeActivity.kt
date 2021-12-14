package com.algobox.app.modules.darktheme.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityDarkThemeBinding
import com.algobox.app.modules.darktheme.`data`.viewmodel.DarkThemeVM
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.searchdark.ui.SearchDarkActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import kotlin.String
import kotlin.Unit

public class DarkThemeActivity :
    BaseActivity<ActivityDarkThemeBinding>(R.layout.activity_dark_theme) {
  private val viewModel: DarkThemeVM by viewModels<DarkThemeVM>()

  public override fun setUpClicks(): Unit {
    binding.imageSearch.setOnClickListener {
    val destIntent = SearchDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageHome.setOnClickListener {
    val destIntent = HomePageDarkActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageGroup3.setOnClickListener {
    val destIntent = SettingsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.darkThemeVM = viewModel
  }

  public companion object {
    public const val TAG: String = "DARK_THEME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DarkThemeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
