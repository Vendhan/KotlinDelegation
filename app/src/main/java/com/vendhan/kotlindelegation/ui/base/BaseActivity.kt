package com.vendhan.kotlindelegation.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sendAnalytics(this, "onCreate")
    }

    override fun onResume() {
        super.onResume()
        sendAnalytics(this, "onResume")
    }

    override fun onPause() {
        super.onPause()
        sendAnalytics(this, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        sendAnalytics(this, "onDestroy")
    }

    private fun sendAnalytics(activity: AppCompatActivity, tag: String) {
        println(tag)
    }
}
