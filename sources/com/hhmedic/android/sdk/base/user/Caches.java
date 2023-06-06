package com.hhmedic.android.sdk.base.user;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.net.HHNetUserInfo;
import com.hhmedic.android.sdk.base.utils.cache.HHSharedPreferences;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Caches {
    private static final String HH_TOKEN = "HH.USER.CACHE.HH.TOKEN";
    private static final String USER_INFO = "SDK_USER_INFO";
    private static final String UUID = "HH.USER.CACHE.UUID";
    private static UserExtension mCacheUser;

    public static void setUserToken(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HHSharedPreferences.check(context);
        HHSharedPreferences.putString(HH_TOKEN, str);
        HHNetUserInfo.staticToken(str);
    }

    public static boolean checkLogin(Context context) {
        HHSharedPreferences.check(context);
        return !TextUtils.isEmpty(HHSharedPreferences.getValue(UUID));
    }

    public static String getUUID(Context context) {
        HHSharedPreferences.check(context);
        return HHSharedPreferences.getValue(UUID);
    }

    public static String getUserToken(Context context) {
        HHSharedPreferences.check(context);
        return HHSharedPreferences.getValue(HH_TOKEN);
    }

    public static void setUUID(Context context, long j) {
        HHSharedPreferences.check(context);
        HHSharedPreferences.putString(UUID, String.valueOf(j));
        HHNetUserInfo.cacheUUID(j);
    }

    public static void protectedCache(Context context) {
        HHSharedPreferences.check(context);
        if (HHNetUserInfo.uuid() <= 0) {
            init(context);
        }
    }

    public static void init(Context context) {
        try {
            HHSharedPreferences.init(context);
            HHSharedPreferences.check(context);
            String value = HHSharedPreferences.getValue(UUID);
            if (!TextUtils.isEmpty(value)) {
                HHNetUserInfo.cacheUUID(Long.parseLong(value));
            }
            HHNetUserInfo.staticToken(HHSharedPreferences.getValue(HH_TOKEN));
        } catch (Exception unused) {
            release();
        }
    }

    public static void release() {
        mCacheUser = null;
        HHSharedPreferences.clear();
        HHNetUserInfo.clear();
    }

    public static void cacheInfo(UserExtension userExtension, Context context) {
        HHSharedPreferences.check(context);
        if (userExtension == null) {
            return;
        }
        mCacheUser = userExtension;
        HHNetUserInfo.cacheUUID(userExtension.uuid);
        setUUID(context, userExtension.uuid);
        HHSharedPreferences.putString(USER_INFO, new Gson().toJson(userExtension));
    }

    public static UserExtension getUserInfo(Context context) {
        HHSharedPreferences.check(context);
        String value = HHSharedPreferences.getValue(USER_INFO);
        if (!TextUtils.isEmpty(value)) {
            return (UserExtension) new Gson().fromJson(value, (Class<Object>) UserExtension.class);
        }
        return mCacheUser;
    }

    public static String getCompanyLogo(Context context) {
        if (mCacheUser != null) {
            return mCacheUser.companyLogo;
        }
        UserExtension userInfo = getUserInfo(context);
        if (userInfo != null) {
            return userInfo.companyLogo;
        }
        return null;
    }

    public static boolean staticUser() {
        return mCacheUser != null;
    }
}
