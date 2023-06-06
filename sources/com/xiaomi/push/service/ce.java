package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.fb;
import com.xiaomi.push.service.ag;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class ce {
    private cr a = new cr();

    private static ag.b a(fb fbVar) {
        Collection<ag.b> c = ag.a().c(Integer.toString(fbVar.c()));
        if (c.isEmpty()) {
            return null;
        }
        Iterator<ag.b> it = c.iterator();
        if (c.size() == 1) {
            return it.next();
        }
        String h = fbVar.h();
        while (it.hasNext()) {
            ag.b next = it.next();
            if (TextUtils.equals(h, next.b)) {
                return next;
            }
        }
        return null;
    }

    private static String a(ag.b bVar) {
        StringBuilder sb;
        String str;
        if ("9".equals(bVar.h)) {
            sb = new StringBuilder();
            sb.append(bVar.a);
            str = ".permission.MIMC_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.a);
            str = ".permission.MIPUSH_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, Intent intent, ag.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
        } else {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent, a(bVar));
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static void a(Context context, ag.b bVar, int i) {
        if ("5".equalsIgnoreCase(bVar.h)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.a);
        intent.putExtra(ak.u, bVar.h);
        intent.putExtra("ext_reason", i);
        intent.putExtra(ak.r, bVar.b);
        intent.putExtra(ak.G, bVar.j);
        if (bVar.r == null || !"9".equals(bVar.h)) {
            com.xiaomi.channel.commonutils.logger.c.a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.h, bVar.a, Integer.valueOf(i)));
            a(context, intent, bVar);
            return;
        }
        try {
            bVar.r.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            bVar.r = null;
            com.xiaomi.channel.commonutils.logger.c.a("peer may died: " + bVar.b.substring(bVar.b.lastIndexOf(64)));
        }
    }

    public static void a(Context context, ag.b bVar, String str, String str2) {
        if ("5".equalsIgnoreCase(bVar.h)) {
            com.xiaomi.channel.commonutils.logger.c.d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.h);
        intent.putExtra(ak.r, bVar.b);
        intent.putExtra(ak.G, bVar.j);
        com.xiaomi.channel.commonutils.logger.c.a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.h, bVar.a, str2));
        a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public final void a(Context context, ag.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.h)) {
            cr.a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.h);
        intent.putExtra(ak.r, bVar.b);
        intent.putExtra(ak.G, bVar.j);
        com.xiaomi.channel.commonutils.logger.c.a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.h, bVar.a, Boolean.valueOf(z), Integer.valueOf(i)));
        a(context, intent, bVar);
    }

    public final void a(XMPushService xMPushService, String str, fb fbVar) {
        ag.b a = a(fbVar);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            cr.a(xMPushService, fbVar, a);
        } else {
            String str2 = a.a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", fbVar.c(a.i));
            intent.putExtra(ak.G, a.j);
            intent.putExtra(ak.y, a.i);
            if (a.r != null) {
                try {
                    a.r.send(Message.obtain(null, 17, intent));
                    com.xiaomi.channel.commonutils.logger.c.a("message was sent by messenger for chid=" + str);
                    return;
                } catch (RemoteException unused) {
                    a.r = null;
                    com.xiaomi.channel.commonutils.logger.c.a("peer may died: " + a.b.substring(a.b.lastIndexOf(64)));
                }
            }
            if ("com.xiaomi.xmsf".equals(str2)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", a.h, a.a, fbVar.g()));
            a(xMPushService, intent, a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.xiaomi.push.service.ag.b a(com.xiaomi.push.gf r5) {
        /*
            com.xiaomi.push.service.ag r0 = com.xiaomi.push.service.ag.a()
            java.lang.String r1 = r5.t
            java.util.Collection r0 = r0.c(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L12
            return r2
        L12:
            java.util.Iterator r1 = r0.iterator()
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L24
            java.lang.Object r5 = r1.next()
            com.xiaomi.push.service.ag$b r5 = (com.xiaomi.push.service.ag.b) r5
            return r5
        L24:
            java.lang.String r0 = r5.s
            java.lang.String r5 = r5.r
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.ag$b r3 = (com.xiaomi.push.service.ag.b) r3
            java.lang.String r4 = r3.b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L44
            java.lang.String r4 = r3.b
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L28
        L44:
            return r3
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ce.a(com.xiaomi.push.gf):com.xiaomi.push.service.ag$b");
    }
}
