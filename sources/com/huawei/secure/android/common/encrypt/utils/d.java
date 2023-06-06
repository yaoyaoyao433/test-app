package com.huawei.secure.android.common.encrypt.utils;

import android.annotation.SuppressLint;
import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    private static final String a = "d";
    private byte[] b = null;

    private d() {
    }

    public static d a(String str, String str2, String str3, String str4) {
        d dVar = new d();
        dVar.b(str, str2, str3, c.a(str4));
        return dVar;
    }

    public static d a(String str, String str2, String str3, byte[] bArr) {
        d dVar = new d();
        dVar.b(str, str2, str3, bArr);
        return dVar;
    }

    public final byte[] a() {
        return (byte[]) this.b.clone();
    }

    @SuppressLint({"NewApi"})
    private void b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            e.a(a);
            this.b = a.a(str, str2, str3, bArr, false);
            return;
        }
        e.a(a);
        this.b = a.a(str, str2, str3, bArr, true);
    }
}
