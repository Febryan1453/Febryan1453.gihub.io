package com.febryan.intentactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class Mobil  implements Parcelable {

    String merk;
    int tahun;
    boolean kondisi;
    double kilometer;
    String platNomor;
    char kodePlat;

    public Mobil() {

    }

    protected Mobil(Parcel in) {
        merk = in.readString();
        tahun = in.readInt();
        kondisi = in.readByte() != 0;
        kilometer = in.readDouble();
        platNomor = in.readString();
        kodePlat = (char) in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(merk);
        dest.writeInt(tahun);
        dest.writeByte((byte) (kondisi ? 1 : 0));
        dest.writeDouble(kilometer);
        dest.writeString(platNomor);
        dest.writeInt((int) kodePlat);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Mobil> CREATOR = new Creator<Mobil>() {
        @Override
        public Mobil createFromParcel(Parcel in) {
            return new Mobil(in);
        }

        @Override
        public Mobil[] newArray(int size) {
            return new Mobil[size];
        }
    };

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public boolean isKondisi() {
        return kondisi;
    }

    public void setKondisi(boolean kondisi) {
        this.kondisi = kondisi;
    }

    public double getKilometer() {
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public char getKodePlat() {
        return kodePlat;
    }

    public void setKodePlat(char kodePlat) {
        this.kodePlat = kodePlat;
    }

    public static Creator<Mobil> getCREATOR() {
        return CREATOR;
    }
}
