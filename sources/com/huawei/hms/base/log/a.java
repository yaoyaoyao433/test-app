package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static final b c = new d();
    public int a = 4;
    public String b;

    public void a(Context context, int i, String str) {
        this.a = i;
        this.b = str;
        c.a(context, "HMSCore");
    }

    public void b(int i, String str, String str2, Throwable th) {
        if (a(i)) {
            c a = a(i, str, str2, th);
            b bVar = c;
            bVar.a(a.c() + a.a(), i, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    public boolean a(int i) {
        return i >= this.a;
    }

    public void a(int i, String str, String str2) {
        if (a(i)) {
            c a = a(i, str, str2, null);
            c.a(a.c() + a.a(), i, str, str2);
        }
    }

    public void a(String str, String str2) {
        c a = a(4, str, str2, null);
        c.a(a.c() + '\n' + a.a(), 4, str, str2);
    }

    public final c a(int i, String str, String str2, Throwable th) {
        c cVar = new c(8, this.b, i, str);
        cVar.a((c) str2);
        cVar.a(th);
        return cVar;
    }
}
