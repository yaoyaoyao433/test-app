package com.hhmedic.android.sdk.uikit.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHUIUtils {
    private static long lastClickTime;

    public static boolean isFastClick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastClickTime < 300) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    public static void closeSoftKeyboard(Context context) {
        if (context == null || !(context instanceof Activity) || ((Activity) context).getCurrentFocus() == null) {
            return;
        }
        try {
            View currentFocus = ((Activity) context).getCurrentFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method");
            currentFocus.clearFocus();
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
