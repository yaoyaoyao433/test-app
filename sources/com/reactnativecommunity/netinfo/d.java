package com.reactnativecommunity.netinfo;

import android.content.Context;
import android.support.v4.content.ContextCompat;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }

    public static boolean a(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }
}
