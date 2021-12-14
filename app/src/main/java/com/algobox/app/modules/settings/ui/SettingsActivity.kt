package com.algobox.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySettingsBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.search.ui.SearchActivity
import com.algobox.app.modules.settings.`data`.viewmodel.SettingsVM
import kotlin.String
import kotlin.Unit

public class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  public override fun setUpClicks(): Unit {
    binding.imageSearch.setOnClickListener {
                        val destIntent = SearchActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.imageHome.setOnClickListener {
                        val destIntent = HomePageActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
  }

  public override fun onInitialized(): Unit {
    binding.settingsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SETTINGS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
