package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.common.CommonConstant;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class x0 {
    public static x0 b;
    public Context a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends y0 {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.y0
        public String a() {
            return com.huawei.hms.hatool.a.d(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.y0
        public String a(String str) {
            return com.huawei.secure.android.common.encrypt.hash.b.a(str);
        }

        @Override // com.huawei.hms.hatool.y0
        public String b() {
            return com.huawei.hms.hatool.a.g(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.y0
        public String c() {
            return com.huawei.hms.hatool.a.j(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.y0
        public int d() {
            return (com.huawei.hms.hatool.a.k(this.a, this.b) ? 4 : 0) | 0 | (com.huawei.hms.hatool.a.e(this.a, this.b) ? 2 : 0) | (com.huawei.hms.hatool.a.h(this.a, this.b) ? 1 : 0);
        }
    }

    public static x0 a() {
        x0 x0Var;
        synchronized (x0.class) {
            if (b == null) {
                b = new x0();
            }
            x0Var = b;
        }
        return x0Var;
    }

    public String a(String str, String str2) {
        return g.a(this.a, str, str2);
    }

    public String a(boolean z) {
        if (z) {
            String j = b.j();
            if (TextUtils.isEmpty(j)) {
                j = g0.a(this.a, "global_v2", "uuid", "");
                if (TextUtils.isEmpty(j)) {
                    j = UUID.randomUUID().toString().replace(CommonConstant.Symbol.MINUS, "");
                    g0.b(this.a, "global_v2", "uuid", j);
                }
                b.c(j);
            }
            return j;
        }
        return "";
    }

    public void a(Context context) {
        if (this.a == null) {
            this.a = context;
        }
    }

    public String b(String str, String str2) {
        return g.b(this.a, str, str2);
    }

    public v0 c(String str, String str2) {
        return new a(str, str2).a(this.a);
    }

    public String d(String str, String str2) {
        return a1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (com.huawei.hms.hatool.a.f(str, str2)) {
            String n = i.c().b().n();
            String o = i.c().b().o();
            if (TextUtils.isEmpty(n) || TextUtils.isEmpty(o)) {
                Pair<String, String> e = z0.e(this.a);
                i.c().b().i((String) e.first);
                i.c().b().j((String) e.second);
                return e;
            }
            return new Pair<>(n, o);
        }
        return new Pair<>("", "");
    }

    public String f(String str, String str2) {
        return a1.a(str, str2);
    }
}
