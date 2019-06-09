package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        }, 6000)

        Handler().postDelayed({     //show
            showHide(hv_a_look)
        }, 3000)

        Handler().postDelayed({     //hide
            showHide(hv_a_look)
        }, 7000)

        Handler().postDelayed({     //show
            showHide(images)
        }, 4000)

        Handler().postDelayed({     //hide
            showHide(images)
        }, 8000)
    }

    fun showHide(view: View) = if (view.visibility == View.VISIBLE) {
        view.setVisibility(View.INVISIBLE)
    } else {
        view.setVisibility(View.VISIBLE)
    }
}
