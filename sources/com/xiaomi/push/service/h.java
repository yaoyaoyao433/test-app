package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.push.fb;
import com.xiaomi.push.fn;
import com.xiaomi.push.fy;
import com.xiaomi.push.gf;
import com.xiaomi.push.ha;
import com.xiaomi.push.hq;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
import com.xiaomi.push.iq;
import com.xiaomi.push.service.ag;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public final class h {
    private static fb a(XMPushService xMPushService, byte[] bArr) {
        hx hxVar = new hx();
        try {
            ik.a(hxVar, bArr);
            return a(cn.a(xMPushService), xMPushService, hxVar);
        } catch (iq e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends il<T, ?>> hx a(String str, String str2, T t, ha haVar) {
        return a(str, str2, t, haVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, ag.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new k(xMPushService));
    }

    private static fb a(cm cmVar, Context context, hx hxVar) {
        String str;
        try {
            fb fbVar = new fb();
            fbVar.a(5);
            fbVar.b(cmVar.a);
            if (hxVar.h != null && hxVar.h.k != null) {
                str = hxVar.h.k.get("ext_traffic_source_pkg");
                if (!TextUtils.isEmpty(str)) {
                    fbVar.b = str;
                    fbVar.a("SECMSG", "message");
                    String str2 = cmVar.a;
                    hxVar.g.b = str2.substring(0, str2.indexOf("@"));
                    hxVar.g.d = str2.substring(str2.indexOf("/") + 1);
                    fbVar.a(ik.a(hxVar), cmVar.c);
                    fbVar.a = (short) 1;
                    com.xiaomi.channel.commonutils.logger.c.a("try send mi push message. packagename:" + hxVar.f + " action:" + hxVar.a);
                    return fbVar;
                }
            }
            str = hxVar.f;
            fbVar.b = str;
            fbVar.a("SECMSG", "message");
            String str22 = cmVar.a;
            hxVar.g.b = str22.substring(0, str22.indexOf("@"));
            hxVar.g.d = str22.substring(str22.indexOf("/") + 1);
            fbVar.a(ik.a(hxVar), cmVar.c);
            fbVar.a = (short) 1;
            com.xiaomi.channel.commonutils.logger.c.a("try send mi push message. packagename:" + hxVar.f + " action:" + hxVar.a);
            return fbVar;
        } catch (NullPointerException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends il<T, ?>> hx a(String str, String str2, T t, ha haVar, boolean z) {
        byte[] a = ik.a(t);
        hx hxVar = new hx();
        hq hqVar = new hq();
        hqVar.a = 5L;
        hqVar.b = "fakeid";
        hxVar.g = hqVar;
        hxVar.d = ByteBuffer.wrap(a);
        hxVar.a = haVar;
        hxVar.b(z);
        hxVar.f = str;
        hxVar.a(false);
        hxVar.e = str2;
        return hxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hx a(String str, String str2) {
        ia iaVar = new ia();
        iaVar.d = str2;
        iaVar.e = "package uninstalled";
        iaVar.c = gf.c();
        iaVar.a(false);
        return a(str, str2, iaVar, ha.Notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, String str, byte[] bArr) {
        Context applicationContext = xMPushService.getApplicationContext();
        if (applicationContext != null && bArr != null && bArr.length > 0) {
            hx hxVar = new hx();
            try {
                ik.a(hxVar, bArr);
                com.xiaomi.push.cf.a(str, applicationContext, hxVar, bArr.length);
            } catch (iq unused) {
                com.xiaomi.channel.commonutils.logger.c.a("fail to convert bytes to container");
            }
        }
        fn fnVar = xMPushService.c;
        if (fnVar == null) {
            throw new fy("try send msg while connection is null.");
        }
        if (!fnVar.b()) {
            throw new fy("Don't support XMPP connection.");
        }
        fb a = a(xMPushService, bArr);
        if (a != null) {
            fnVar.b(a);
        } else {
            cq.a(xMPushService, str, bArr, 70000003, "not a valid message");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, hx hxVar) {
        com.xiaomi.push.cf.a(hxVar.f, xMPushService.getApplicationContext(), hxVar, -1);
        fn fnVar = xMPushService.c;
        if (fnVar == null) {
            throw new fy("try send msg while connection is null.");
        }
        if (!fnVar.b()) {
            throw new fy("Don't support XMPP connection.");
        }
        fb a = a(cn.a(xMPushService), xMPushService, hxVar);
        if (a != null) {
            fnVar.b(a);
        }
    }
}
