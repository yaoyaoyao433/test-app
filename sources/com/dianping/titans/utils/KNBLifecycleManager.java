package com.dianping.titans.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class KNBLifecycleManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean sForeground = false;

    public static void onForeground() {
        sForeground = true;
    }

    public static void onBackground() {
        sForeground = false;
    }

    public static boolean isForeground() {
        return sForeground;
    }
}
