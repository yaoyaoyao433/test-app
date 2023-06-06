package com.alibaba.android.bindingx.core;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static boolean a = true;

    public static void a(String str) {
    }

    public static void b(String str) {
    }

    public static void c(String str) {
        if (a) {
            Log.e("BindingX", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a) {
            Log.e("BindingX", str, th);
        }
    }
}
