package com.createsapp.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionList = Constants.getQuestion()
        Log.i("Questions Size", "${questionList.size} ")
    }
}