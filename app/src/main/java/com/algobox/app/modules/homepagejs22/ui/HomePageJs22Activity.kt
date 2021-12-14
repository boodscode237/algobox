package com.algobox.app.modules.homepagejs22.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityHomePageJs22Binding
import com.algobox.app.modules.homepagejs22.`data`.viewmodel.HomePageJs22VM
import com.algobox.app.modules.lesson.ui.LessonActivity
import com.algobox.app.modules.search.ui.SearchActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import kotlin.String
import kotlin.Unit

public class HomePageJs22Activity :
    BaseActivity<ActivityHomePageJs22Binding>(R.layout.activity_home_page_js22) {
  private val viewModel: HomePageJs22VM by viewModels<HomePageJs22VM>()

  public override fun setUpClicks(): Unit {
    binding.linearJSVariables2.setOnClickListener {
        val destIntent = LessonActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.imageSetting.setOnClickListener {
        val destIntent = SettingsActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.imageSearch.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivity(destIntent)
        }
    binding.frameNavBar.setOnClickListener {
        val destIntent = SettingsActivity.getIntent(this, null)
        startActivity(destIntent)
        }
  }

  public override fun onInitialized(): Unit {
    binding.homePageJs22VM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_PAGE_JS22ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageJs22Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
