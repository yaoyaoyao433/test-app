package com.hhmedic.android.sdk.base.utils;

import android.app.Activity;
import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHActivityCompat {
    public static boolean isDead(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return activity.isFinishing() || activity.isDestroyed();
        }
        return false;
    }
}
