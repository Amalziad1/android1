package com.example.myapplication;

import java.util.ArrayList;

public class Customer {
    public static ArrayList<Customer> customersArrayList=new ArrayList<Customer>();
    private long mCustomerId;
    private String mName;
    private String mPhone;
    private String mGender;
    public Customer() {
    }
    public Customer(long mCustomerId, String mName, String mPhone, String mGender) {
        this.mCustomerId = mCustomerId;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mGender = mGender;
        customersArrayList.add(this);
    }
    public void setmCustomerID(long mCustomerId) {
        this.mCustomerId = mCustomerId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public long getmCustomerID() {
        return mCustomerId;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmGender() {
        return mGender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mCustomerID=" + mCustomerId +
                ", mName='" + mName + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mGender='" + mGender + '\'' +
                '}';
    }
}
