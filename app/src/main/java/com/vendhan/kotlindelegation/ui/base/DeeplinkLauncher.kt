package com.vendhan.kotlindelegation.ui.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class DeeplinkLauncher : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        // Handle Deeplink and open the respective activity
    }
}
