package ru.example.mycalculator;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

class Logic implements Parcelable {

    private double num1;
    private double num2;

    public Logic() {
        num1 = 0;
        num2 = 0;
    }

    protected Logic(Parcel in) {
        num1 = in.readDouble();
        num2 = in.readDouble();
    }

    public static final Creator<Logic> CREATOR = new Creator<Logic>() {
        @Override
        public Logic createFromParcel(Parcel in) {
            return new Logic(in);
        }

        @Override
        public Logic[] newArray(int size) {
            return new Logic[size];
        }
    };

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public double div() {
        return num1 / num2;
    }

    public double mul() {
        return num1 * num2;
    }

    public double procent() {
        return num1 / 100 * num2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(num1);
        dest.writeDouble(num2);
    }
}
