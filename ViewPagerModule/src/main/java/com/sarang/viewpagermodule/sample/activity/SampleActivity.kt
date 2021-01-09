package com.sarang.viewpagermodule.sample.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarang.viewpagermodule.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnImageLoad.setOnClickListener {
            ImageLoadViewPagerActivity.go(this)
        }

        viewBinding.btnViewPagerIndicator.setOnClickListener {
            ViewPagerIndicatorActivity.go(this)
        }
    }

    companion object{
        fun go(context: Context){
            context.startActivity(Intent(context, SampleActivity::class.java))
        }
    }
}