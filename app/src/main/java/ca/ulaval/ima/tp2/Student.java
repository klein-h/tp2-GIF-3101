package ca.ulaval.ima.tp2;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Calendar;
import java.util.Date;

public class Student implements Parcelable {

    String date;
    String name;
    String surName;
    String sexe;
    String prg;

    protected Student(Parcel in) {
        date = in.readString();
        name = in.readString();
        surName = in.readString();
        sexe = in.readString();
        prg = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public Student() {
        this.date = "1995-05-26";
        this.name = "Klein";
        this.surName = "Arthur";
        this.sexe = "Masculin";
        this.prg = "GEL";
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(date);
        dest.writeString(name);
        dest.writeString(surName);
        dest.writeString(sexe);
        dest.writeString(prg);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}