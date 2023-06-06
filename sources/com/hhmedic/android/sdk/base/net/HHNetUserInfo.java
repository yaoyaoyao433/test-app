package com.hhmedic.android.sdk.base.net;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHNetUserInfo {
    private static long mCacheUUID;
    private static String mUserToken;

    public static void staticToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mUserToken = str;
    }

    public static String getUserToken() {
        return mUserToken;
    }

    public static void cacheUUID(long j) {
        mCacheUUID = j;
    }

    public static void clear() {
        mCacheUUID = 0L;
        mUserToken = null;
    }

    public static long uuid() {
        return mCacheUUID;
    }
}
