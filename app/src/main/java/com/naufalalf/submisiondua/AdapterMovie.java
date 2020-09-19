package com.naufalalf.submisiondua;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.ItemViewHolder> {

    private Context context;
    private ArrayList<MovieModel> listMovie;

    public ArrayList<MovieModel> getListMovie() {
        return listMovie;
    }


    public AdapterMovie(Context context) {
        this.context = context;
    }

    public void setListMovie(ArrayList<MovieModel> listMovie) {
        this.listMovie = listMovie;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMovie.ItemViewHolder holder, int position) {
        MovieModel movieModel = getListMovie().get(position);

        Picasso.get().load(movieModel.getGambarmovie()).into(holder.viewgambar);
        holder.viewjudul.setText(movieModel.getJudulmovie());
//        holder.viewrilis.setText(movieModel.getRilismovie());
        holder.viewrating.setText(movieModel.getRatingmovie());
//        holder.viewsinopsis.setText(movieModel.getSinopsismovie());
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView viewjudul;
        private ImageView viewgambar;
        private TextView viewsinopsis;
        private TextView viewrilis;
        private TextView viewrating;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            viewjudul = itemView.findViewById(R.id.tvJudulfilm);
            viewgambar = itemView.findViewById(R.id.gambarMovie);
            viewrating = itemView.findViewById(R.id.tv_ratingMovie);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            MovieModel movieModel = getListMovie().get(position);
            movieModel.setJudulmovie(movieModel.getJudulmovie());
            movieModel.setRatingmovie(movieModel.getRatingmovie());

            Intent i = new Intent(itemView.getContext(),DetailMovie.class);
            i.putExtra(DetailMovie.KEY, movieModel);
            context.startActivity(i);
        }
    }
}
