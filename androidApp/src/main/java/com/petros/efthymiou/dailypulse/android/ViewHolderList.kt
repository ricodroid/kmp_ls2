package com.petros.efthymiou.dailypulse.android

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList (item: View) : RecyclerView.ViewHolder(item) {
    val characterList: TextView = item.findViewById(R.id.articleDate)
    val characterImage: ImageView = item.findViewById(R.id.articleImage)
    val characterText1: TextView = item.findViewById(R.id.articleTitle)
    val characterText2: TextView = item.findViewById(R.id.articleDesc)
}