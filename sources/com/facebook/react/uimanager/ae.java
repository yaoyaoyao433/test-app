package com.facebook.react.uimanager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ae {
    private static int a = 1;

    public static synchronized int a() {
        int i;
        synchronized (ae.class) {
            i = a;
            a += 10;
        }
        return i;
    }
}
