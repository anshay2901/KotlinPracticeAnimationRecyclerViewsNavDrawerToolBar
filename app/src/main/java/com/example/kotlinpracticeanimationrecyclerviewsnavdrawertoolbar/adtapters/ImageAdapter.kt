package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.adtapters

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.R

class ImageAdapter(private val context : Context) : PagerAdapter() {
    private var layoutInflater : LayoutInflater? = null
    val Image = arrayOf(R.drawable.bgone, R.drawable.bgtwo, R.drawable.bgthree,  R.drawable.bgfour,
    R.drawable.bgfive,  R.drawable.bgsix, R.drawable.bgseven, R.drawable.bgeight,
    R.drawable.bgnine, R.drawable.bgten)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ===  `object`
    }

    override fun getCount(): Int {
        return Image.size
    }

    @SuppressLint("InflateParams")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.view_pager_layout , null)
        val image = v.findViewById<View>(R.id.imageView) as ImageView


        image.setImageResource(Image[position])
        val vp = container as ViewPager
        vp.addView(v , 0)


        return v

    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

/*
R.drawable.bgone; R.drawable.bgtwo; R.drawable.bgthree; R.drawable.bgfour;
        R.drawable.bgfive; R.drawable.bgsix; R.drawable.bgseven; R.drawable.bgeight;
        R.drawable.bgnine; R.drawable.bgten
 */