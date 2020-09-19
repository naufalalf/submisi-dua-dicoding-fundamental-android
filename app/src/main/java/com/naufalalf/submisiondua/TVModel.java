package com.naufalalf.submisiondua;

import android.os.Parcel;
import android.os.Parcelable;

public class TVModel implements Parcelable {
    private String judultv;
    private String gambartv;
    private String sinopsistv;
    private String rilistv;
    private String ratingtv;

    public TVModel() {
    }
    public String getJudultv() {
        return judultv;
    }

    public void setJudultv(String judultv) {
        this.judultv = judultv;
    }

    public String getGambartv() {
        return gambartv;
    }

    public void setGambartv(String gambartv) {
        this.gambartv = gambartv;
    }

    public String getSinopsistv() {
        return sinopsistv;
    }

    public void setSinopsistv(String sinopsistv) {
        this.sinopsistv = sinopsistv;
    }

    public String getRilistv() {
        return rilistv;
    }

    public void setRilistv(String rilistv) {
        this.rilistv = rilistv;
    }

    public String getRatingtv() {
        return ratingtv;
    }

    public void setRatingtv(String ratingtv) {
        this.ratingtv = ratingtv;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judultv);
        dest.writeString(this.gambartv);
        dest.writeString(this.sinopsistv);
        dest.writeString(this.rilistv);
        dest.writeString(this.ratingtv);
    }

    protected TVModel(Parcel in) {
        this.judultv = in.readString();
        this.gambartv = in.readString();
        this.sinopsistv = in.readString();
        this.rilistv = in.readString();
        this.ratingtv = in.readString();
    }

    public static final Parcelable.Creator<TVModel> CREATOR = new Parcelable.Creator<TVModel>() {
        @Override
        public TVModel createFromParcel(Parcel source) {
            return new TVModel(source);
        }

        @Override
        public TVModel[] newArray(int size) {
            return new TVModel[size];
        }
    };
}
