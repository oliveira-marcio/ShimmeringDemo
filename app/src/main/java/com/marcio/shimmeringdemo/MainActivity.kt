package com.marcio.shimmeringdemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shimmeringViews = listOf(
            findViewById<View>(R.id.ovalShimmeringView1),
            findViewById(R.id.ovalShimmeringView2),
            findViewById(R.id.ovalShimmeringView3),
            findViewById(R.id.shimmeringView1),
            findViewById(R.id.shimmeringView2),
            findViewById(R.id.shimmeringView3),
            findViewById(R.id.shimmeringView4),
            findViewById(R.id.shimmeringView5),
            findViewById(R.id.shimmeringView6)
        )

        shimmeringViews.forEach {
            startAnimation(it)
        }
    }

    private fun startAnimation(view: View) {
        val animationDrawable = view.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(500)
        animationDrawable.setExitFadeDuration(500)
        animationDrawable.start()
    }
}
