package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* renamed from: com.xiaomi.push.do  reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cdo implements dk {
    @Override // com.xiaomi.push.dk
    public final void a(Context context, dg dgVar) {
        if (dgVar != null) {
            String str = dgVar.a;
            String str2 = dgVar.c;
            String str3 = dgVar.d;
            if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str3)) {
                    dc.a(context, "service", 1008, "argument error");
                } else {
                    dc.a(context, str3, 1008, "argument error");
                }
            } else if (!com.xiaomi.push.service.cg.a(context, str)) {
                dc.a(context, str3, 1003, "B is not ready");
            } else {
                dc.a(context, str3, 1002, "B is ready");
                dc.a(context, str3, 1004, "A is ready");
                try {
                    Intent intent = new Intent();
                    intent.setClassName(str, str2);
                    intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                    intent.putExtra("waker_pkgname", context.getPackageName());
                    intent.putExtra("awake_info", db.a(str3));
                    if (context.startService(intent) == null) {
                        dc.a(context, str3, 1008, "A is fail to help B's service");
                        return;
                    }
                    dc.a(context, str3, 1005, "A is successful");
                    dc.a(context, str3, 1006, "The job is finished");
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    dc.a(context, str3, 1008, "A meet a exception when help B's service");
                }
            }
        }
    }

    @Override // com.xiaomi.push.dk
    public final void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            return;
        }
        Service service = (Service) context;
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String a = com.sankuai.waimai.platform.utils.f.a(intent, "waker_pkgname");
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "awake_info");
            if (TextUtils.isEmpty(a)) {
                dc.a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (TextUtils.isEmpty(a2)) {
                dc.a(service.getApplicationContext(), a, 1007, "play with service ");
            } else {
                String b = db.b(a2);
                if (TextUtils.isEmpty(b)) {
                    dc.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
                } else {
                    dc.a(service.getApplicationContext(), b, 1007, "old version message ");
                }
            }
        }
    }
}
