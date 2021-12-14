package com.algobox.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivitySearchBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.lesson.ui.LessonActivity
import com.algobox.app.modules.search.`data`.viewmodel.SearchVM
import com.algobox.app.modules.settings.ui.SettingsActivity
import kotlin.String
import kotlin.Unit

public class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  public override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
                        val destIntent = HomePageActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.imageSetting.setOnClickListener {
                        val destIntent = SettingsActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.linearFrame5.setOnClickListener {
                        val destIntent = LessonActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
    binding.frameFrame8.setOnClickListener {
                        val destIntent = LessonActivity.getIntent(this, null)
                        startActivity(destIntent)
                        }
  }

  public override fun onInitialized(): Unit {
    binding.searchVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
