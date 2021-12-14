package com.algobox.app.modules.lesson.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algobox.app.modules.lesson.`data`.model.LessonModel

public class LessonVM : ViewModel() {
  public val lessonModel: MutableLiveData<LessonModel> = MutableLiveData(LessonModel())
}
