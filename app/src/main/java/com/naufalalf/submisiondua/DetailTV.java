package com.naufalalf.submisiondua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailTV extends AppCompatActivity {
    ImageView gambarTVDetail;
    TextView judulTVDetail, ratingTVDetail, rilisTVDetail, sinopsisTVDetail;
    public static final String KEY_TV = "tv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);

        gambarTVDetail = findViewById(R.id.gambar_detilTV);
        judulTVDetail =findViewById(R.id.tvjuduldetilTV);
        ratingTVDetail = findViewById(R.id.tv_rating_detailTV);
        rilisTVDetail = findViewById(R.id.tv_rilis_detailTV);
        sinopsisTVDetail = findViewById(R.id.sinopsis_detailTV);

        TVModel tvModel = getIntent().getParcelableExtra(KEY_TV);

        Picasso.get().load(tvModel.getGambartv()).into(gambarTVDetail);
        judulTVDetail.setText(tvModel.getJudultv());
        rilisTVDetail.setText(tvModel.getRilistv());
        ratingTVDetail.setText(tvModel.getRatingtv());
        sinopsisTVDetail.setText(tvModel.getSinopsistv());
    }
}
