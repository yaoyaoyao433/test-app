package com.hhmedic.android.sdk.module.video.viewModel;

import android.content.Context;
import android.content.SharedPreferences;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.config.NetEnvironmental;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChangeDoctorCache {
    private static final String HHChangeDoctorSpace = "com.hh.change.doctor";
    private static final String HHChangeTime = "com.hh.change.time";
    private static final long ONE = 86400000;
    private static final long TEST = 60000;

    public static void setChange(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getSharedPreferences(HHChangeDoctorSpace, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putLong(getKey(context), System.currentTimeMillis()).apply();
    }

    private static String getKey(Context context) {
        return HHChangeTime + Caches.getUUID(context);
    }

    public static boolean isChangeDoctorInOneDay(Context context) {
        SharedPreferences sharedPreferences;
        if (context != null && (sharedPreferences = context.getSharedPreferences(HHChangeDoctorSpace, 0)) != null) {
            long j = sharedPreferences.getLong(getKey(context), 0L);
            if (j > 0) {
                return NetEnvironmental.isTest() ? System.currentTimeMillis() - j < 60000 : System.currentTimeMillis() - j < 86400000;
            }
        }
        return false;
    }
}
