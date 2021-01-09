package com.sarang.viewpagermodule

import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

/**
 * 뷰페이저 아답터 제공자
 */
interface ViewPagerAdapterProvider {
    /**
     * 이미지 url 리스트와 viewpager을 넘겨주면 이미지를 자동으로 로드하는
     * 페이지 아답터를 제공합니다.
     */
    fun attachImageAdapter(vp: ViewPager, urls: ArrayList<String>)

    fun setIndicator(vp: ViewPager, tabLayout: TabLayout)
}