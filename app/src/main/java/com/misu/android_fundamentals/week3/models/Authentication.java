package com.misu.android_fundamentals.week3.models;

public class Authentication {

    private String mEmail;
    private String mPhone;
    private boolean mIsAccepted;

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public boolean ismIsAccepted() {
        return mIsAccepted;
    }

    public void setmIsAccepted(boolean mIsAccepted) {
        this.mIsAccepted = mIsAccepted;
    }

    @Override
    public String toString() {
        return "Email: " + mEmail + "\n" + "Phone: " + mPhone;
    }
}
