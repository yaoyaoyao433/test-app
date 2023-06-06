package com.hhmedic.android.sdk.uikit.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.view.Window;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHStatusBarHelper {
    public static void translucent(Activity activity) {
        try {
            translucent(activity, 1073741824);
        } catch (Exception unused) {
        }
    }

    private static boolean supportTranslucent() {
        return Build.VERSION.SDK_INT >= 19 && !Build.BRAND.toLowerCase().contains("essential");
    }

    @TargetApi(19)
    public static void translucent(Activity activity, @ColorInt int i) {
        if (supportTranslucent()) {
            if (HHDeviceHelper.isMeizu() || HHDeviceHelper.isMIUI()) {
                activity.getWindow().setFlags(67108864, 67108864);
            } else if (Build.VERSION.SDK_INT >= 21) {
                Window window = activity.getWindow();
                window.getDecorView().setSystemUiVisibility(1280);
                if (Build.VERSION.SDK_INT >= 23 && supportTransclentStatusBar6()) {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                    return;
                }
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
            }
        }
    }

    public static boolean supportTransclentStatusBar6() {
        return (HHDeviceHelper.isZUKZ1() || HHDeviceHelper.isZTKC2016()) ? false : true;
    }
}
