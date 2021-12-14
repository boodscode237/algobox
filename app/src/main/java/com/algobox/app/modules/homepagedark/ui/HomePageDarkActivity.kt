package com.algobox.app.modules.homepagedark.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityHomePageDarkBinding
import com.algobox.app.modules.homepagedark.`data`.viewmodel.HomePageDarkVM
import com.algobox.app.modules.lessondark.ui.LessondarkActivity
import com.algobox.app.modules.searchdark.ui.SearchDarkActivity
import com.algobox.app.modules.settingsdark.ui.SettingsdarkActivity
import kotlin.String
import kotlin.Unit

public class HomePageDarkActivity :
    BaseActivity<ActivityHomePageDarkBinding>(R.layout.activity_home_page_dark) {
  private val viewModel: HomePageDarkVM by viewModels<HomePageDarkVM>()

  public override fun setUpClicks(): Unit {
    binding.linearHorizontalScro.setOnClickListener {
                        val destIntent = LessondarkActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.imageSetting.setOnClickListener {
                        val destIntent = SettingsdarkActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.imageSearch.setOnClickListener {
                        val destIntent = SearchDarkActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.frameNavBar.setOnClickListener {
                        val destIntent = SettingsdarkActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
  }

  public override fun onInitialized(): Unit {
    binding.homePageDarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_PAGE_DARK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageDarkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
