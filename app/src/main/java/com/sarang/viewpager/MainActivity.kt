package com.sarang.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarang.viewpagermodule.sample.activity.SampleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleActivity.go(this)
    }
}