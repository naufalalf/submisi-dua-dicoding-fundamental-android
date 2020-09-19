package com.naufalalf.submisiondua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMovie extends AppCompatActivity {

    ImageView gambarDetail;
    TextView judulDetail, ratingDetail, rilisDetail, sinopsisDetail;
    public static final String KEY = "movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        judulDetail = findViewById(R.id.tvjuduldetil);
        ratingDetail = findViewById(R.id.tv_rating_detail);
        rilisDetail = findViewById(R.id.tv_rilis_detail);
        sinopsisDetail = findViewById(R.id.sinopsis_detail);
        gambarDetail = findViewById(R.id.gambar_detil);

        MovieModel movieModel= getIntent().getParcelableExtra(KEY);

        Picasso.get().load(movieModel.getGambarmovie()).into(gambarDetail);
        judulDetail.setText(movieModel.getJudulmovie());
        rilisDetail.setText(movieModel.getRilismovie());
        ratingDetail.setText(movieModel.getRatingmovie());
        sinopsisDetail.setText(movieModel.getSinopsismovie());

    }
}
