package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class y0 {
    public final v0 a(int i, Context context) {
        String str = "";
        if (i != 0) {
            str = f();
            if (!TextUtils.isEmpty(str)) {
                return new v0(w0.UDID, str);
            }
        }
        if ((i & 2) != 0) {
            str = b(context);
            if (!TextUtils.isEmpty(str)) {
                return new v0(w0.IMEI, str);
            }
        }
        if ((i & 1) != 0) {
            return new v0(w0.SN, c(context));
        }
        return new v0(w0.EMPTY, str);
    }

    public v0 a(Context context) {
        String c = c();
        if (TextUtils.isEmpty(c)) {
            String a = a();
            if (TextUtils.isEmpty(a)) {
                boolean e = e();
                String b = b();
                return !TextUtils.isEmpty(b) ? e ? new v0(w0.SN, b) : new v0(w0.UDID, a(b)) : e ? a(d(), context) : b(d(), context);
            }
            return new v0(w0.IMEI, a);
        }
        return new v0(w0.UDID, c);
    }

    public abstract String a();

    public abstract String a(String str);

    public final v0 b(int i, Context context) {
        String str = "";
        if ((i & 4) == 0 || (i & 1) == 0) {
            if ((i & 1) != 0) {
                str = c(context);
                if (!TextUtils.isEmpty(str)) {
                    return new v0(w0.SN, str);
                }
            }
            if ((i & 2) != 0) {
                return new v0(w0.IMEI, b(context));
            }
            return new v0(w0.EMPTY, str);
        }
        return new v0(w0.UDID, a(c(context)));
    }

    public abstract String b();

    public final String b(Context context) {
        l b = i.c().b();
        if (TextUtils.isEmpty(b.m())) {
            b.h(z0.f(context));
        }
        return b.m();
    }

    public abstract String c();

    public final String c(Context context) {
        l b = i.c().b();
        if (TextUtils.isEmpty(b.a())) {
            b.l(z0.h(context));
        }
        return b.a();
    }

    public abstract int d();

    public final boolean e() {
        l b = i.c().b();
        if (TextUtils.isEmpty(b.i())) {
            b.e(f.a());
        }
        return !TextUtils.isEmpty(b.i());
    }

    public final String f() {
        l b = i.c().b();
        if (TextUtils.isEmpty(b.c())) {
            b.m(z0.c());
        }
        return b.c();
    }
}
