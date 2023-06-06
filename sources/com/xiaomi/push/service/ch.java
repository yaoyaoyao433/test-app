package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ge;
import com.xiaomi.push.hx;
import com.xiaomi.push.ic;
import com.xiaomi.push.ik;
import com.xiaomi.push.iq;
/* loaded from: classes6.dex */
public final class ch {
    public static ic a(hx hxVar) {
        byte[] a = hxVar.a();
        ic icVar = new ic();
        try {
            ik.a(icVar, a);
            return icVar;
        } catch (iq unused) {
            return null;
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }

    public static byte[] a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.a("secret is empty, return null");
            return null;
        }
        try {
            return ge.a(com.xiaomi.push.ao.b(str), bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("dencryption error. ", e);
            return null;
        }
    }
}
