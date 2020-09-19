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

public class AdapterTVShow extends RecyclerView.Adapter<AdapterTVShow.ItemViewHolder> {

    private Context context;
    private ArrayList<TVModel> listTV;

    public ArrayList<TVModel> getListTV() {
        return listTV;
    }

    public void setListTV(ArrayList<TVModel> listTV) {
        this.listTV = listTV;
    }


    public AdapterTVShow(Context context) {
        this.context = context;
    }



    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv, parent,false);
        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        TVModel tvModel = getListTV().get(position);

        Picasso.get().load(tvModel.getGambartv()).into(holder.viewgambarTV);
        holder.viewjudulTV.setText(tvModel.getJudultv());
//        holder.viewrilisTV.setText(tvModel.getRilistv());
        holder.viewratingTV.setText(tvModel.getRatingtv());
  //      holder.viewsinopsisTV.setText(tvModel.getSinopsistv());
    }

    @Override
    public int getItemCount() {
        return getListTV().size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView viewjudulTV;
        private ImageView viewgambarTV;
        private TextView viewsinopsisTV;
        private TextView viewrilisTV;
        private TextView viewratingTV;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            viewjudulTV = itemView.findViewById(R.id.tvJudultv);
            viewgambarTV = itemView.findViewById(R.id.gambartv);
            viewratingTV = itemView.findViewById(R.id.tv_ratingTv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            TVModel tvModel = getListTV().get(position);
            tvModel.setJudultv(tvModel.getJudultv());
            tvModel.setRatingtv(tvModel.getRatingtv());

            Intent intent = new Intent(itemView.getContext(),DetailTV.class);
            intent.putExtra(DetailTV.KEY_TV, tvModel);
            context.startActivity(intent);
        }
    }
}
