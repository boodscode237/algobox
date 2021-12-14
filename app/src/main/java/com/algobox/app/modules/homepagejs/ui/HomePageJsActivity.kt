package com.algobox.app.modules.homepagejs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityHomePageJsBinding
import com.algobox.app.modules.homepagejs.`data`.viewmodel.HomePageJsVM
import com.algobox.app.modules.homepagejs22.ui.HomePageJs22Activity
import com.algobox.app.modules.lesson.ui.LessonActivity
import com.algobox.app.modules.search.ui.SearchActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import kotlin.String
import kotlin.Unit

public class HomePageJsActivity :
    BaseActivity<ActivityHomePageJsBinding>(R.layout.activity_home_page_js) {
  private val viewModel: HomePageJsVM by viewModels<HomePageJsVM>()

  public override fun setUpClicks(): Unit {
    binding.recyclerHorizontalScro.setOnClickListener {
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
    binding.imagePage.setOnClickListener {
    val destIntent = HomePageJs22Activity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.homePageJsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_PAGE_JS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageJsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
