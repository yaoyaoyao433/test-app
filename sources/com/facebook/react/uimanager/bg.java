package com.facebook.react.uimanager;

import com.facebook.react.common.ClearableSynchronizedPool;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class bg {
    private static final Object a = new Object();
    private static ClearableSynchronizedPool<com.facebook.yoga.d> b;

    public static ClearableSynchronizedPool<com.facebook.yoga.d> a() {
        ClearableSynchronizedPool<com.facebook.yoga.d> clearableSynchronizedPool;
        if (b != null) {
            return b;
        }
        synchronized (a) {
            if (b == null) {
                b = new ClearableSynchronizedPool<>(1024);
            }
            clearableSynchronizedPool = b;
        }
        return clearableSynchronizedPool;
    }
}
