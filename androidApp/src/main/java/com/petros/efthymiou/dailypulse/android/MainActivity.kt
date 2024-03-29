package com.petros.efthymiou.dailypulse.android

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.petros.efthymiou.dailypulse.articles.application.Article
import com.petros.efthymiou.dailypulse.articles.presentation.ArticlesViewModel
import com.petros.efthymiou.dailypulse.sources.presentation.SourcesViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val articlesViewModel: ArticlesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val articlesState = articlesViewModel.articlesState.value
        if (articlesState.error != null) {
            // ここにステータスの色々を入れる
        }

        val articleList = articlesState.articles

        recyclerView = findViewById(R.id.RecyclerList)
        recyclerView.adapter = RecyclerAdapter(articleList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
