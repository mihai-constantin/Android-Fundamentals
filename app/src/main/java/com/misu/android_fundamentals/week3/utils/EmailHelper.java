package com.misu.android_fundamentals.week3.utils;

import android.text.TextUtils;
import android.util.Patterns;

public class EmailHelper {

    public static boolean isEmailAddressPattern(final String email) {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public static boolean isEmailValid(final String email) {
        if (email != null && isEmailAddressPattern(email)) {
            return true;
        }

        return false;
    }
}
