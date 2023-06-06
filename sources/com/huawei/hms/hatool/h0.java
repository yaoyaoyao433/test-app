package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h0 {
    public static h0 b;
    public Context a;

    static {
        new HashMap();
    }

    public static h0 a() {
        return b();
    }

    public static synchronized h0 b() {
        h0 h0Var;
        synchronized (h0.class) {
            if (b == null) {
                b = new h0();
            }
            h0Var = b;
        }
        return h0Var;
    }

    public void a(Context context) {
        this.a = context;
        b(context);
        i.c().b().e(f.a());
    }

    public void a(String str, int i) {
        if (this.a == null) {
            y.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        y.c("hmsSdk", "onReport: Before calling runtaskhandler()");
        a(str, s0.a(i), b.d());
    }

    public void a(String str, int i, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = s0.a("yyyy-MM-dd", currentTimeMillis);
        }
        n0.b().a(new j0(str2, jSONObject, str, s0.a(i), currentTimeMillis));
    }

    public void a(String str, String str2) {
        if (!c.a(str, str2)) {
            y.c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long j = c.j(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j <= 30000) {
            y.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        y.a("hmsSdk", "begin to call onReport!");
        c.a(str, str2, currentTimeMillis);
        a(str, str2, b.d());
    }

    public void a(String str, String str2, String str3) {
        Context context = this.a;
        if (context == null) {
            y.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String a = h.a(context);
        if (c.e(str, str2) && !"WIFI".equals(a)) {
            y.c("hmsSdk", "strNetworkType is :" + a);
        } else if (TextUtils.isEmpty(a) || "2G".equals(a)) {
            y.e("hmsSdk", "The network is bad.");
        } else {
            n0.b().a(new k0(str, str2, str3));
        }
    }

    public final void b(Context context) {
        String d = f.d(context);
        b.a(d);
        if (!u0.b().a()) {
            y.c("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String a = g0.a(context, "global_v2", Constants.PARAM_APP_VER, "");
        g0.b(context, "global_v2", Constants.PARAM_APP_VER, d);
        b.b(a);
        if (TextUtils.isEmpty(a)) {
            y.c("hmsSdk", "app ver is first save!");
        } else if (a.equals(d)) {
        } else {
            y.c("hmsSdk", "the appVers are different!");
            a().a("", "alltype", a);
        }
    }
}
