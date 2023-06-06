package com.xiaomi.push;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class dm implements dk {
    @Override // com.xiaomi.push.dk
    public final void a(Context context, dg dgVar) {
        String str;
        String str2;
        if (dgVar == null) {
            dc.a(context, "provider", 1008, "A receive incorrect message");
            return;
        }
        String str3 = dgVar.b;
        String str4 = dgVar.d;
        int i = dgVar.e;
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (TextUtils.isEmpty(str4)) {
                dc.a(context, "provider", 1008, "argument error");
                return;
            }
            str = "argument error";
        } else if (!com.xiaomi.push.service.cg.b(context, str3)) {
            dc.a(context, str4, 1003, "B is not ready");
            return;
        } else {
            dc.a(context, str4, 1002, "B is ready");
            dc.a(context, str4, 1004, "A is ready");
            String a = db.a(str4);
            try {
                if (TextUtils.isEmpty(a)) {
                    str2 = "info is empty";
                } else if (i != 1 || dh.b(context)) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String type = contentResolver.getType(Uri.parse("content://" + str3).buildUpon().appendPath(a).build());
                    if (!TextUtils.isEmpty(type) && "success".equals(type)) {
                        dc.a(context, str4, 1005, "A is successful");
                        dc.a(context, str4, 1006, "The job is finished");
                        return;
                    }
                    str2 = "A is fail to help B's provider";
                } else {
                    str2 = "A not in foreground";
                }
                dc.a(context, str4, 1008, str2);
                return;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
                str = "A meet a exception when help B's provider";
            }
        }
        dc.a(context, str4, 1008, str);
    }

    @Override // com.xiaomi.push.dk
    public final void a(Context context, Intent intent, String str) {
        String str2;
        String str3;
        try {
            if (TextUtils.isEmpty(str) || context == null) {
                str2 = "provider";
                str3 = "B get a incorrect message";
            } else {
                String[] split = str.split("/");
                if (split.length <= 0 || TextUtils.isEmpty(split[split.length - 1])) {
                    dc.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String str4 = split[split.length - 1];
                if (TextUtils.isEmpty(str4)) {
                    dc.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String decode = Uri.decode(str4);
                if (TextUtils.isEmpty(decode)) {
                    dc.a(context, "provider", 1008, "B get a incorrect message");
                    return;
                }
                String b = db.b(decode);
                if (!TextUtils.isEmpty(b)) {
                    dc.a(context, b, 1007, "play with provider successfully");
                    return;
                } else {
                    str2 = "provider";
                    str3 = "B get a incorrect message";
                }
            }
            dc.a(context, str2, 1008, str3);
        } catch (Exception e) {
            dc.a(context, "provider", 1008, "B meet a exception" + e.getMessage());
        }
    }
}
