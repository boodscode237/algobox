package com.algobox.app.modules.settingsdark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySettingsdarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.searchdark.ui.SearchDarkActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import com.algobox.app.modules.settingsdark.`data`.viewmodel.SettingsdarkVM
import kotlin.String
import kotlin.Unit

public class SettingsdarkActivity :
    BaseActivity<ActivitySettingsdarkBinding>(R.layout.activity_settingsdark) {
  private val viewModel: SettingsdarkVM by viewModels<SettingsdarkVM>()

  public override fun setUpClicks(): Unit {
    binding.imageSearch.setOnClickListener {
            val destIntent = SearchDarkActivity.getIntent(this, null)
            startActivity(destIntent)
            }
    binding.imageGroup3.setOnClickListener {
            val destIntent = SettingsActivity.getIntent(this, null)
            startActivity(destIntent)
            }
    binding.imageHome.setOnClickListener {
            val destIntent = HomePageDarkActivity.getIntent(this, null)
            startActivity(destIntent)
            }
  }

  public override fun onInitialized(): Unit {
    binding.settingsdarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SETTINGSDARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsdarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
