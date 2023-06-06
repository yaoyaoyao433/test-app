package com.huawei.appgallery.serviceverifykit.b.d;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static final b a = new b();
    private boolean b;

    private b() {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.b = true;
        } catch (ClassNotFoundException unused) {
            this.b = false;
        }
    }

    public final void a(String str, String str2) {
        if (this.b) {
            a.a.w(str, str2);
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (this.b) {
            a.a.e(str, str2, th);
        } else {
            Log.e(str, str2, th);
        }
    }

    public final void b(String str, String str2) {
        if (this.b) {
            a.a.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }
}
