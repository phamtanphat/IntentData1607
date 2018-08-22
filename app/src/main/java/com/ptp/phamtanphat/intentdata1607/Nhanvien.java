package com.ptp.phamtanphat.intentdata1607;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

    public class Nhanvien implements Parcelable {
    String ten;
    String tuoi;

    public Nhanvien(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    protected Nhanvien(Parcel in) {
        ten = in.readString();
        tuoi = in.readString();
    }

    public static final Creator<Nhanvien> CREATOR = new Creator<Nhanvien>() {
        @Override
        public Nhanvien createFromParcel(Parcel in) {
            return new Nhanvien(in);
        }

        @Override
        public Nhanvien[] newArray(int size) {
            return new Nhanvien[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ten);
        parcel.writeString(tuoi);
    }
}
