package com.sarang.viewpagermodule

import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.sarang.viewpagermodule.adapter.ImageUrlPagerAdapter

/**
 * 뷰페이저 제공자 구현
 */
class ViewPagerAdapterProviderImpl : ViewPagerAdapterProvider {

    override fun attachImageAdapter(vp: ViewPager, urls: ArrayList<String>) {
        vp.adapter = ImageUrlPagerAdapter().apply {
            this.urls = urls
        }
    }

    override fun setIndicator(vp: ViewPager, tabLayout: TabLayout) {
        tabLayout.setupWithViewPager(vp)
    }
}