package com.algobox.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityHomePageBinding
import com.algobox.app.modules.homepage.`data`.viewmodel.HomePageVM
import com.algobox.app.modules.lesson.ui.LessonActivity
import com.algobox.app.modules.search.ui.SearchActivity
import com.algobox.app.modules.settings.ui.SettingsActivity
import kotlin.String
import kotlin.Unit

public class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  public override fun setUpClicks(): Unit {
    binding.imageSetting.setOnClickListener {
    val destIntent = SettingsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.frameNavBar.setOnClickListener {
    val destIntent = SettingsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHorizontalScro.setOnClickListener {
    val destIntent = LessonActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.imageSearch.setOnClickListener {
    val destIntent = SearchActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.homePageVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_PAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
