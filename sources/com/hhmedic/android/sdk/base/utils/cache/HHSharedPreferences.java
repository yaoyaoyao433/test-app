package com.hhmedic.android.sdk.base.utils.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.secret.HHSecretUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHSharedPreferences {
    private static final String COMMON = "hh_common";
    private static SharedPreferences mSharedPre;

    public static void init(Context context) {
        initShared(context, COMMON);
    }

    public static void check(Context context) {
        if (mSharedPre == null) {
            init(context);
        }
    }

    public static void putString(String str, String str2) {
        try {
            mSharedPre.edit().putString(HHSecretUtils.getSHA1(str), HHDes.encode(str2)).apply();
        } catch (Exception e) {
            Logger.e(e.toString());
        }
    }

    private static void initShared(Context context, String str) {
        mSharedPre = context.getSharedPreferences(HHSecretUtils.getSHA1(str), 0);
    }

    public static String getValue(String str) {
        return getValue(COMMON, str);
    }

    public static String getValue(String str, String str2) {
        try {
            String string = mSharedPre.getString(HHSecretUtils.getSHA1(str2), "");
            return TextUtils.isEmpty(string) ? "" : HHDes.decode(string);
        } catch (Exception e) {
            Logger.e(e.toString());
            return "";
        }
    }

    public static void clear() {
        if (mSharedPre != null) {
            mSharedPre.edit().clear().apply();
        }
    }
}
