package com.petros.efthymiou.dailypulse.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.petros.efthymiou.dailypulse.articles.application.Article
import com.petros.efthymiou.dailypulse.sources.presentation.SourcesState
import kotlinx.coroutines.flow.StateFlow

class RecyclerAdapter(val articleList: List<Article>) : RecyclerView.Adapter<ViewHolderList>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_list, parent, false)
        return ViewHolderList(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        val article = articleList[position]
        holder.characterList.text = article.title
    }

    override fun getItemCount(): Int = articleList.size
}
