package com.sarang.viewpagermodule.sample.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarang.viewpagermodule.ViewPagerAdapterProviderImpl
import com.sarang.viewpagermodule.databinding.ActivityViewPagerIndicatorBinding

class ViewPagerIndicatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityViewPagerIndicatorBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val urls = ArrayList<String>().apply {
            add("a")
            add("b")
            add("c")
        }

        ViewPagerAdapterProviderImpl().attachImageAdapter(viewBinding.vp, urls)

        ViewPagerAdapterProviderImpl().setIndicator(viewBinding.vp, viewBinding.tl)
    }

    companion object {
        fun go(context: Context){
            context.startActivity(Intent(context, ViewPagerIndicatorActivity::class.java))
        }
    }
}