package com.petros.efthymiou.dailypulse.android

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList (item: View) : RecyclerView.ViewHolder(item) {
    val characterList: TextView = item.findViewById(R.id.Text1)
}