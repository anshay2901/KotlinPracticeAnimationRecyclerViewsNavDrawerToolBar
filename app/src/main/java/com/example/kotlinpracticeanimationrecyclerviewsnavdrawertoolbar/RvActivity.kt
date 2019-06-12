package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.adapters.PeopleAdapter
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.models.People
import kotlinx.android.synthetic.main.activity_rview.*

class RvActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rview)

        //Data for rv
        val mPeople = listOf<People>(
            People("Anshay Singh", "Bangalore, IND", R.drawable.face),
            People("Balram", "Bangalore, IND", R.drawable.face),
            People("Abhi", "Bangalore, IND", R.drawable.face),
            People("Harshit", "Bangalore, IND", R.drawable.face),
            People("Aman", "Bangalore, IND", R.drawable.face),
            People("Adarsh", "Bangalore, IND", R.drawable.face),
            People("Abhnav", "Bangalore, IND", R.drawable.face),
            People("Ankit", "Bangalore, IND", R.drawable.face),
            People("Nabil", "Bangalore, IND", R.drawable.face),
            People("Modi", "Bangalore, IND", R.drawable.face),
            People("Donald Trump", "Bangalore, IND", R.drawable.face),
            People("Sadguru", "Bangalore, IND", R.drawable.face)

        )

        //Creating a vertical layout
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Setting the adapter
        recyclerView.apply {
            adapter = PeopleAdapter(mPeople)
        }

    }


}
