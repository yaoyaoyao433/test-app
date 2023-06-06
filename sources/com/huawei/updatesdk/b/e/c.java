package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.appgallery.serviceverifykit.api.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends a {
    private static String a;

    private void f() {
        com.huawei.updatesdk.a.b.c.c.c.c(a(com.huawei.updatesdk.a.b.a.a.c().a()));
        com.huawei.updatesdk.a.b.c.c.d c = new com.huawei.updatesdk.a.b.c.b(new com.huawei.updatesdk.service.appmgr.bean.a(null), null).c();
        if (c.f()) {
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) c;
            if (bVar.g() == null) {
                com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "getPackageName from store: error" + bVar.toString());
                return;
            }
            a = bVar.g().d();
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "getPackageName from store: " + a);
        }
    }

    @Override // com.huawei.updatesdk.b.e.a
    String a() {
        return "com.huawei.updatesdk";
    }

    @Override // com.huawei.updatesdk.b.e.a
    String a(Context context) {
        return com.huawei.updatesdk.b.h.c.d(context, "upsdk_store_url");
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String b() {
        return a;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void d() {
        if (TextUtils.isEmpty(a)) {
            String e = e();
            a = e;
            if (TextUtils.isEmpty(e)) {
                f();
            }
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "UpdateSDK genVerifiedPackageName is: " + a);
        }
    }

    private String e() {
        String str = null;
        try {
            Context a2 = com.huawei.updatesdk.a.b.a.a.c().a();
            a.C0168a c0168a = new a.C0168a();
            Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
            c0168a.a = a2.getApplicationContext();
            int i = a.C0168a.EnumC0169a.a;
            c0168a.b = intent;
            if (i == 0) {
                com.huawei.appgallery.serviceverifykit.b.d.b.a.b("ServiceVerifyKit", "error input type");
            } else {
                c0168a.c = i;
            }
            com.huawei.updatesdk.b.c.c a3 = com.huawei.updatesdk.b.c.b.a();
            for (String str2 : a3.g()) {
                c0168a.a(a3.a(), str2);
            }
            String a4 = c0168a.a();
            try {
                com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "UpdateSDK get market packagename from verify kit is: " + a4);
                return a4;
            } catch (Throwable th) {
                th = th;
                str = a4;
                com.huawei.updatesdk.a.a.a.c("DefaultTaskInit", "UpdateSDK genVerifiedPackageName error: " + th.toString());
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
