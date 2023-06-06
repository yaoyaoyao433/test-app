package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    private static SharedPreferences a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (h.class) {
            if (a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                } else {
                    a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                }
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
