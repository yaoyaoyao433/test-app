package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.xiaomi.push.fd;
import com.xiaomi.push.jj;
import com.xiaomi.push.jr;
import com.xiaomi.push.js;
import com.xiaomi.push.service.ag;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class cm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public cm(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    private ag.b a(ag.b bVar, Context context, ce ceVar, String str) {
        bVar.a = context.getPackageName();
        bVar.b = this.a;
        bVar.i = this.c;
        bVar.c = this.b;
        bVar.h = "5";
        bVar.d = "XMPUSH-PASS";
        bVar.e = false;
        if (a(context)) {
            fd.b(context);
        }
        js.a aVar = new js.a();
        aVar.a("sdk_ver", 47).a("cpvn", "4_8_2").a("cpvc", 40082).a("country_code", b.a(context).b()).a("region", b.a(context).a()).a("miui_vn", jj.g()).a("miui_vc", Integer.valueOf(jj.b(context))).a("xmsf_vc", Integer.valueOf(fd.b(context, "com.xiaomi.xmsf"))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(w.a(context))).a("systemui_vc", Integer.valueOf(fd.a(context)));
        String c = c(context);
        if (!TextUtils.isEmpty(c)) {
            aVar.a("latest_country_code", c);
        }
        String h = jj.h();
        if (!TextUtils.isEmpty(h)) {
            aVar.a("device_ch", h);
        }
        String i = jj.i();
        if (!TextUtils.isEmpty(i)) {
            aVar.a("device_mfr", i);
        }
        bVar.f = aVar.toString();
        String str2 = a(context) ? "1000271" : this.d;
        js.a aVar2 = new js.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a("miid", jr.c(context)).a(BaseJavaModule.METHOD_TYPE_SYNC, 1);
        if (b(context)) {
            aVar2.a("ab", str);
        }
        bVar.g = aVar2.toString();
        bVar.k = ceVar;
        return bVar;
    }

    private static boolean a() {
        try {
            return jr.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    private static boolean b(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && a();
    }

    private static String c(Context context) {
        if ("com.xiaomi.xmsf".equals(context)) {
            if (TextUtils.isEmpty(null)) {
                String a = jj.a("ro.miui.region");
                return TextUtils.isEmpty(a) ? jj.a("ro.product.locale.region") : a;
            }
            return null;
        }
        return jj.e();
    }

    public final ag.b a(XMPushService xMPushService) {
        ag.b bVar = new ag.b(xMPushService);
        a(bVar, xMPushService, xMPushService.d, com.huawei.hms.opendevice.c.a);
        return bVar;
    }
}
