package com.algobox.app.modules.lesson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.algobox.app.R
import com.algobox.app.appcomponents.base.BaseActivity
import com.algobox.app.databinding.ActivityLessonBinding
import com.algobox.app.modules.homepage.ui.HomePageActivity
import com.algobox.app.modules.lesson.`data`.viewmodel.LessonVM
import kotlin.String
import kotlin.Unit

public class LessonActivity : BaseActivity<ActivityLessonBinding>(R.layout.activity_lesson) {
  private val viewModel: LessonVM by viewModels<LessonVM>()

  public override fun setUpClicks(): Unit {
    binding.imagePolygon1.setOnClickListener {
                    val destIntent = HomePageActivity.getIntent(this, null)
                    startActivity(destIntent)
                    }
  }

  public override fun onInitialized(): Unit {
    binding.lessonVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LESSON_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LessonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
