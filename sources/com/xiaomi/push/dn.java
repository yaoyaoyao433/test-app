package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class dn implements dk {
    @Override // com.xiaomi.push.dk
    public final void a(Context context, dg dgVar) {
        String str;
        String str2;
        if (dgVar == null) {
            dc.a(context, "service", 1008, "A receive incorrect message");
            return;
        }
        String str3 = dgVar.a;
        String str4 = dgVar.b;
        String str5 = dgVar.d;
        int i = dgVar.e;
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            if (TextUtils.isEmpty(str5)) {
                dc.a(context, "service", 1008, "argument error");
                return;
            }
            str = "argument error";
        } else if (!com.xiaomi.push.service.cg.a(context, str3, str4)) {
            dc.a(context, str5, 1003, "B is not ready");
            return;
        } else {
            dc.a(context, str5, 1002, "B is ready");
            dc.a(context, str5, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setAction(str4);
                intent.setPackage(str3);
                intent.putExtra("awake_info", db.a(str5));
                if (i == 1 && !dh.b(context)) {
                    str2 = "A not in foreground";
                } else if (context.startService(intent) != null) {
                    dc.a(context, str5, 1005, "A is successful");
                    dc.a(context, str5, 1006, "The job is finished");
                    return;
                } else {
                    str2 = "A is fail to help B's service";
                }
                dc.a(context, str5, 1008, str2);
                return;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
                str = "A meet a exception when help B's service";
            }
        }
        dc.a(context, str5, 1008, str);
    }

    @Override // com.xiaomi.push.dk
    public final void a(Context context, Intent intent, String str) {
        String str2;
        String str3;
        int i = 1008;
        if (context == null || !(context instanceof Service)) {
            str2 = "service";
            str3 = "A receive incorrect message";
        } else {
            Service service = (Service) context;
            String a = com.sankuai.waimai.platform.utils.f.a(intent, "awake_info");
            if (TextUtils.isEmpty(a)) {
                dc.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
                return;
            }
            str2 = db.b(a);
            if (TextUtils.isEmpty(str2)) {
                context = service.getApplicationContext();
                str2 = "service";
                str3 = "B get a incorrect message";
            } else {
                context = service.getApplicationContext();
                i = 1007;
                str3 = "play with service successfully";
            }
        }
        dc.a(context, str2, i, str3);
    }
}
