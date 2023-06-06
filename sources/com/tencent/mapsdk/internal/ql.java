package com.tencent.mapsdk.internal;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ql {
    private static final int a = 0;
    private static int b;

    public static void a(Context context) {
        synchronized (ql.class) {
            b = mh.a(context).b(ej.z);
        }
    }

    public static void a(Context context, int i) {
        synchronized (ql.class) {
            b = i;
            mh.a(context).a(ej.z, i);
        }
    }

    public static int a() {
        int i;
        synchronized (ql.class) {
            i = b;
        }
        return i;
    }
}
