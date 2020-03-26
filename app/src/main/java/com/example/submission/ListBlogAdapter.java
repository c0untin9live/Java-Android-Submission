package com.example.submission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBlogAdapter extends RecyclerView.Adapter<ListBlogAdapter.ListViewBlog> {
    private ArrayList<Blog> listHero;

    public ListBlogAdapter(ArrayList<Blog> list) {
        this.listHero = list;
    }


    @NonNull
    @Override
    public ListViewBlog onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ListViewBlog(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewBlog holder, int position) {
        Blog hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getJudul());
        holder.tvDetail.setText(hero.getDetail());
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class ListViewBlog extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewBlog(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_image);
            tvName = itemView.findViewById(R.id.tv_item_judul);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}