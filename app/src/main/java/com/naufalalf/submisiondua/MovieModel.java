package com.naufalalf.submisiondua;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {
    private String judulmovie;
    private String gambarmovie;
    private String sinopsismovie;
    private String rilismovie;
    private String ratingmovie;

    public MovieModel() {
    }

    public String getJudulmovie() {
        return judulmovie;
    }

    public void setJudulmovie(String judulmovie) {
        this.judulmovie = judulmovie;
    }

    public String getGambarmovie() {
        return gambarmovie;
    }

    public void setGambarmovie(String gambarmovie) {
        this.gambarmovie = gambarmovie;
    }

    public String getSinopsismovie() {
        return sinopsismovie;
    }

    public void setSinopsismovie(String sinopsismovie) {
        this.sinopsismovie = sinopsismovie;
    }

    public String getRilismovie() {
        return rilismovie;
    }

    public void setRilismovie(String rilismovie) {
        this.rilismovie = rilismovie;
    }

    public String getRatingmovie() {
        return ratingmovie;
    }

    public void setRatingmovie(String ratingmovie) {
        this.ratingmovie = ratingmovie;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judulmovie);
        dest.writeString(this.gambarmovie);
        dest.writeString(this.sinopsismovie);
        dest.writeString(this.rilismovie);
        dest.writeString(this.ratingmovie);
    }

    protected MovieModel(Parcel in) {
        this.judulmovie = in.readString();
        this.gambarmovie = in.readString();
        this.sinopsismovie = in.readString();
        this.rilismovie = in.readString();
        this.ratingmovie = in.readString();
    }

    public static final Parcelable.Creator<MovieModel> CREATOR = new Parcelable.Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel source) {
            return new MovieModel(source);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };
}
