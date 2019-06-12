package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.view.ViewPager
import android.view.View
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.adapters.ImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.images) as ViewPager
        val adapter = ImageAdapter(this)
        viewpager.adapter = adapter



        Handler().postDelayed({     //Show
            showHide(hi)
        }, 1000)

        Handler().postDelayed({     //hide
            showHide(hi)
        }, 5000)

        Handler().postDelayed({     //show
            showHide(jst_prac)
        }, 2000)

        Handler().postDelayed({     //hide
            showHide(jst_prac)
        }, 5000)

        Handler().postDelayed({     //show
            showHide(hv_a_look)
        }, 3000)

        Handler().postDelayed({     //hide
            showHide(hv_a_look)
        }, 5000)

        Handler().postDelayed({     //show
            showHide(images)
        }, 5000)

        Handler().postDelayed({     //show
            showHide(swipe_to_see)
        }, 5000)

        rv_button.setOnClickListener {
            val intent = Intent(this@MainActivity, RvActivity::class.java)
            startActivity(intent)
        }

    }

    fun showHide(view: View) = if (view.visibility == View.VISIBLE) {
        view.setVisibility(View.INVISIBLE)
    } else {
        view.setVisibility(View.VISIBLE)
    }
}
