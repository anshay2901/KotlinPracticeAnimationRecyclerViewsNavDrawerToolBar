package com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.viewholders

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.R
import com.example.kotlinpracticeanimationrecyclerviewsnavdrawertoolbar.models.People
import xyz.schwaab.avvylib.AvatarView
import java.util.zip.Inflater

class PeopleViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.r_view_item_layout, parent, false)) {

    private var mPersonName: TextView? = null
    private var mPersonAdress: TextView? = null
    private var mPersonImage: AvatarView? = null

    init {
        mPersonName = itemView.findViewById(R.id.person_name)
        mPersonAdress = itemView.findViewById(R.id.person_address)
        mPersonImage = itemView.findViewById(R.id.circleView)
    }

    fun bind(people: People) {
        mPersonName?.text = people.name
        mPersonAdress?.text = people.address
        
    }

}