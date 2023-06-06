package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.updatesdk.service.otaupdate.f;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    private String a(Context context, String str) {
        String str2;
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            grsBaseInfo.setSerCountry(str);
            str2 = new GrsClient(context, grsBaseInfo).synGetGrsUrl(a(), "ROOT");
        } catch (Throwable th) {
            com.huawei.updatesdk.a.a.a.c("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK error: " + th.toString());
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url is default url");
            return a(context);
        }
        com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK Get url from GRS_SDK Success!" + a(str2));
        return str2;
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("AbstractTaskInit", e.toString());
            return null;
        }
    }

    private boolean b(Context context, String str) {
        if (com.huawei.updatesdk.b.h.b.d(context, str)) {
            if (Math.abs(System.currentTimeMillis() - com.huawei.updatesdk.b.b.a.d().b(str)) < 86400000) {
                f.f().a(com.huawei.updatesdk.b.b.a.d().a(str));
                return false;
            }
            return true;
        }
        return false;
    }

    abstract String a();

    abstract String a(Context context);

    public abstract String b();

    public String b(Context context) {
        String a = f.f().a();
        if (TextUtils.isEmpty(a)) {
            com.huawei.updatesdk.a.a.a.b("AbstractTaskInit", "UpdateSDK accoutZone is empty, so url is default");
            return a(context);
        }
        return a(context, a);
    }

    public void c() {
        Context a = com.huawei.updatesdk.a.b.a.a.c().a();
        String b = b();
        if (b(a, b)) {
            d dVar = new d(String.format(Locale.ROOT, "content://%s.commondata/item/1", b), b);
            com.sankuai.waimai.launcher.util.aop.b.a(dVar, Executors.newSingleThreadExecutor(), new Void[0]);
            try {
                dVar.get(1000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                com.huawei.updatesdk.a.a.a.a("AbstractTaskInit", "init AccountZone error: " + e.toString());
            }
        }
    }

    public abstract void d();
}
