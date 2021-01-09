package com.sarang.viewpagermodule.adapter

import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide


/**
 * 이미지 페이지 아답터
 */
class ImageUrlPagerAdapter : PagerAdapter() {
    var urls = ArrayList<String>()

    /**
     * Return the number of views available.
     * 사용 가능한보기 수를 반환합니다.
     */
    override fun getCount(): Int {
        return urls.size
    }

    /**
     * Determines whether a page View is associated with a specific key object
     * as returned by {@link #instantiateItem(ViewGroup, int)}. This method is
     * required for a PagerAdapter to function properly.
     *
     * 페이지보기가 {@link #instantiateItem (ViewGroup, int)}
     * 에서 반환 된 특정 키 개체와 연결되는지 여부를 결정합니다.
     * 이 메서드는 PagerAdapter가 제대로 작동하는 데 필요합니다.
     *
     * @param view Page View to check for association with <code>object</code>
     * @param object Object to check for association with <code>view</code>
     * @return true if <code>view</code> is associated with the key object <code>object</code>
     */
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as View
    }

    /**
     * Create the page for the given position.  The adapter is responsible
     * for adding the view to the container given here, although it only
     * must ensure this is done by the time it returns from
     * {@link #finishUpdate(ViewGroup)}.
     *
     * 주어진 위치에 대한 페이지를 만듭니다.
     * 어댑터는 여기에 제공된 컨테이너에보기를 추가해야하지만
     * {@link #finishUpdate (ViewGroup)}에서 반환 될 때까지이
     * 작업이 완료되도록해야합니다.
     *
     * @param container The containing View in which the page will be shown.
     * @param position The page position to be instantiated.
     * @return Returns an Object representing the new page.  This does not
     * need to be a View, but can be some other container of the page.
     */
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = ImageView(container.context)
        Glide.with(container.context)
            .load(/*urls[position]*/"https://i.expansys.net/i/b/b316097-1.jpg")
            .into(view)
        container.addView(view)
        return view
    }

    /**
     * Remove a page for the given position.  The adapter is responsible
     * for removing the view from its container, although it only must ensure
     * this is done by the time it returns from {@link #finishUpdate(ViewGroup)}.
     *
     * 주어진 위치에 대한 페이지를 제거하십시오.
     * 어댑터는 컨테이너에서 뷰를 제거해야하지만
     * {@link #finishUpdate (ViewGroup)에서 반환 될 때까지만이
     * 작업이 수행되도록해야합니다.
     * 
     * @param container The containing View from which the page will be removed.
     * @param position The page position to be removed.
     * @param object The same object that was returned by
     * {@link #instantiateItem(View, int)}.
     */
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        Log.d("__sarang", "destroyItem $position")
        //container.removeView(`object` as View)
    }
}