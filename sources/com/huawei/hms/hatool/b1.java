package com.huawei.hms.hatool;

import android.util.Pair;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b1 extends v {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = new int[w0.values().length];

        static {
            try {
                a[w0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[w0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static c1 a(String str, String str2) {
        c1 a2 = v.a(str, str2);
        v0 c = x0.a().c(str, str2);
        a2.g(x0.a().a(c.c(str, str2)));
        a2.f(c.o(str, str2));
        a2.c(x0.a().f(str, str2));
        int i = a.a[c.a().ordinal()];
        if (i == 1) {
            a2.d(c.b());
        } else if (i == 2) {
            a2.b(c.b());
        } else if (i == 3) {
            a2.e(c.b());
        }
        return a2;
    }

    public static d1 a(String str, String str2, String str3, String str4) {
        d1 a2 = v.a(str, str2, str3, str4);
        String a3 = x0.a().a(c.c(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String a4 = com.huawei.secure.android.common.encrypt.hash.b.a(b.c() + a3 + currentTimeMillis);
        a2.f(String.valueOf(currentTimeMillis));
        a2.g(a4);
        return a2;
    }

    public static e1 a(String str, String str2, String str3) {
        e1 a2 = v.a(str, str2, str3);
        Pair<String, String> e = x0.a().e(str2, str);
        a2.f((String) e.first);
        a2.g((String) e.second);
        a2.h(f.b());
        a2.d(x0.a().d(str2, str));
        return a2;
    }

    public static r a(List<q> list, String str, String str2, String str3, String str4) {
        y.c("hmsSdk", "generate UploadData");
        r a2 = v.a();
        if (a2 == null) {
            return null;
        }
        a2.a(a(x.f().a(), str, str2, str3));
        a2.a(a(str, str2));
        a2.a(a(str2, str, str4));
        a2.a(c.g(str, str2));
        a2.a(list);
        return a2;
    }

    public static Map<String, String> b(String str, String str2, String str3) {
        Map<String, String> b = v.b(str, str3);
        Map<String, String> i = c.i(str, str2);
        if (i == null) {
            return b;
        }
        b.putAll(i);
        return b;
    }
}
