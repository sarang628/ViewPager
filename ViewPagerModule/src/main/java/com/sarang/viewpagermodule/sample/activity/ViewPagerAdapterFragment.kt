package com.sarang.viewpagermodule.sample.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.sarang.viewpagermodule.R
import com.sarang.viewpagermodule.ViewPagerAdapterProviderImpl

/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerAdapterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerAdapterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager_adapter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vp = view.findViewById<ViewPager>(R.id.vp)

        ViewPagerAdapterProviderImpl().attachImageAdapter(vp, ArrayList<String>().apply {
            add("asd")
            add("")
            add("")
            add("")
            add("")
            add("")
            add("")
            add("")
            add("")
            add("")
        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */
        @JvmStatic
        fun newInstance() = ViewPagerAdapterFragment()

        fun attach(containerId : Int, fragmentManager: FragmentManager){
            fragmentManager.beginTransaction()
                .replace(containerId, newInstance())
                .commitAllowingStateLoss()
        }
    }
}