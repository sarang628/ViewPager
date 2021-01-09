package com.sarang.viewpagermodule.sample.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarang.viewpagermodule.R

class ImageLoadViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_load_view_pager)

        ViewPagerAdapterFragment.attach(R.id.container, supportFragmentManager)
    }

    companion object {
        fun go(context: Context){
            context.startActivity(Intent(context, ImageLoadViewPagerActivity::class.java))
        }
    }
}