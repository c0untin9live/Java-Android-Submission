package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvHeroes;
    private ArrayList<Blog> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.v_list);
        rvHeroes.setHasFixedSize(true);
        list.addAll(BlogData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList()
    {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListBlogAdapter listHeroAdapter = new ListBlogAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
    }
}