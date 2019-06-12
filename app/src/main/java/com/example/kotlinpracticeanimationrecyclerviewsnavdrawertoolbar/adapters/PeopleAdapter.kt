package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.models.People
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.viewholders.PeopleViewHolder

class PeopleAdapter(private val list: List<People>) : RecyclerView.Adapter<PeopleViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PeopleViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        return PeopleViewHolder(inflater, p0)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(p0: PeopleViewHolder, p1: Int) {
        val people: People = list[p1]
        p0.bind(people)
    }
}