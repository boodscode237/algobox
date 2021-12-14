package com.algobox.app.modules.searchdark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySearchDarkBinding
import com.algobox.app.modules.homepagedark.ui.HomePageDarkActivity
import com.algobox.app.modules.lessondark.ui.LessondarkActivity
import com.algobox.app.modules.searchdark.`data`.viewmodel.SearchDarkVM
import com.algobox.app.modules.settingsdark.ui.SettingsdarkActivity
import kotlin.String
import kotlin.Unit

public class SearchDarkActivity :
    BaseActivity<ActivitySearchDarkBinding>(R.layout.activity_search_dark) {
  private val viewModel: SearchDarkVM by viewModels<SearchDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.linearFrame5.setOnClickListener {
        val destIntent = LessondarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.frameFrame8.setOnClickListener {
        val destIntent = LessondarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.imageSetting.setOnClickListener {
        val destIntent = SettingsdarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.imageHome.setOnClickListener {
        val destIntent = HomePageDarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.frameNavBar.setOnClickListener {
        val destIntent = SettingsdarkActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.searchDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
