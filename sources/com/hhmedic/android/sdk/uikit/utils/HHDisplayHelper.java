package com.hhmedic.android.sdk.uikit.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDisplayHelper {
    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getScreenHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    public static int dp2px(Context context, int i) {
        return (int) ((getDensity(context) * i) + 0.5d);
    }
}
