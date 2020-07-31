package com.example.futureheight

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep((2 * 1000).toLong())

                    val i = Intent(baseContext, MainActivity::class.java)
                    startActivity(i)
                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
