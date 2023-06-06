package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.mapsdk.internal.eh;
import com.xiaomi.push.hx;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class aw {
    private static HashMap<String, String> a = new HashMap<>();

    private static int a() {
        Integer num = (Integer) com.xiaomi.push.am.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static synchronized String a(Context context, String str) {
        String str2;
        synchronized (aw.class) {
            str2 = a.get(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
        }
        return str2;
    }

    private static String a(as asVar) {
        switch (ay.a[asVar.ordinal()]) {
            case 1:
                return "hms_push_token";
            case 2:
                return "fcm_push_token_v2";
            case 3:
                return "cos_push_token";
            case 4:
                return "ftos_push_token";
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r6 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> b(android.content.Context r5, com.xiaomi.mipush.sdk.as r6) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.aw.b(android.content.Context, com.xiaomi.mipush.sdk.as):java.util.HashMap");
    }

    public static void b(Context context) {
        at.a(context).a();
    }

    public static void c(Context context) {
        at.a(context).b();
    }

    public static byte[] a(Context context, hx hxVar, as asVar) {
        boolean z;
        if (hxVar == null || hxVar.h == null || hxVar.h.j == null) {
            z = false;
        } else {
            z = (asVar == as.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(hxVar.h.j.get("assemble_push_type"));
        }
        if (z) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            String a2 = a(asVar);
            return com.xiaomi.push.aq.c(TextUtils.isEmpty(a2) ? null : sharedPreferences.getString(a2, ""));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a2 = a(as.ASSEMBLE_PUSH_HUAWEI);
        String a3 = a(as.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(a2, "")) && TextUtils.isEmpty(sharedPreferences.getString(a3, ""))) {
            z = true;
        }
        if (z) {
            ag a4 = ag.a(context);
            Intent b = a4.b();
            b.setAction("com.xiaomi.mipush.thirdparty");
            b.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", 2);
            b.putExtra("com.xiaomi.mipush.thirdparty_DESC", a2);
            a4.b(b);
        }
    }

    public static boolean a(Context context, as asVar) {
        if (az.b(asVar) != null) {
            return com.xiaomi.push.service.z.a(context).a(az.b(asVar).by, true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, as asVar, String str) {
        synchronized (aw.class) {
            String a2 = a(asVar);
            if (TextUtils.isEmpty(a2)) {
                com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            boolean z = false;
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a2, str).putString("last_check_token", ap.a(context).b.c);
            if ((asVar == as.ASSEMBLE_PUSH_FTOS || asVar == as.ASSEMBLE_PUSH_FCM) ? true : true) {
                edit.putInt(a(asVar) + eh.t, a());
            }
            edit.apply();
            com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }

    public static void a(Context context, as asVar, String str) {
        com.xiaomi.push.m.a(context).a(new ax(str, context, asVar), 0);
    }
}
