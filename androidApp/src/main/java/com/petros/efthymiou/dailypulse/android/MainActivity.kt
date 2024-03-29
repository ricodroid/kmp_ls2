package com.petros.efthymiou.dailypulse.android

import android.os.Bundle
import androidx.activity.viewModels

import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petros.efthymiou.dailypulse.articles.application.Article
import com.petros.efthymiou.dailypulse.articles.presentation.ArticlesViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    val articlesViewModel: ArticlesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val articleList = articlesViewModel.articlesState.value.articles


        recyclerView = findViewById(R.id.RecyclerList)
        recyclerView.adapter = RecyclerAdapter(articleList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
