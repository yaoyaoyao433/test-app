package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ds;
import com.xiaomi.push.fb;
import com.xiaomi.push.fd;
import com.xiaomi.push.fy;
import com.xiaomi.push.gb;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gt;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.hr;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.jj;
import com.xiaomi.push.jr;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class cr {
    private static Intent a(byte[] bArr, long j) {
        hx a = a(bArr);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a.f);
        return intent;
    }

    public static hx a(byte[] bArr) {
        hx hxVar = new hx();
        try {
            ik.a(hxVar, bArr);
            return hxVar;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a(th);
            return null;
        }
    }

    private static void a(Context context, hx hxVar, byte[] bArr) {
        try {
            l.a(hxVar);
            l.c a = l.a(context, hxVar, bArr);
            if (a.b > 0 && !TextUtils.isEmpty(a.a)) {
                gt.a(context, a.a, a.b, true, false, System.currentTimeMillis());
            }
            if (!jj.a(context) || !g.a(context, hxVar, a.c)) {
                b(context, hxVar, bArr);
                return;
            }
            g.a(context, hxVar);
            com.xiaomi.channel.commonutils.logger.c.a("consume this broadcast by tts");
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    public static void a(Context context, ag.b bVar, boolean z, int i, String str) {
        cm a;
        if (z || (a = cn.a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        cn.a(context, a.f, a.d, a.e);
    }

    public static void a(XMPushService xMPushService, fb fbVar, ag.b bVar) {
        try {
            a(xMPushService, fbVar.c(bVar.i), fbVar.j());
        } catch (IllegalArgumentException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }

    public static void a(XMPushService xMPushService, gf gfVar, ag.b bVar) {
        if (!(gfVar instanceof gd)) {
            com.xiaomi.channel.commonutils.logger.c.a("not a mipush message");
            return;
        }
        gd gdVar = (gd) gfVar;
        gb a = gdVar.a("s");
        if (a != null) {
            try {
                a(xMPushService, ap.a(ap.a(bVar.i, gdVar.d()), a.a()), gt.b(gfVar.b()));
            } catch (IllegalArgumentException e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
        }
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                return !queryBroadcastReceivers.isEmpty();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryBroadcastReceivers.isEmpty()) {
                return !queryIntentServices.isEmpty();
            }
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return false;
        }
    }

    private static boolean a(Context context, String str, byte[] bArr) {
        if (fd.c(context, str)) {
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
            intent.putExtra("mipush_payload", bArr);
            intent.setPackage(str);
            try {
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    return false;
                }
                com.xiaomi.channel.commonutils.logger.c.a("broadcast message arrived.");
                com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent, h.a(str));
                return true;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a("meet error when broadcast message arrived. " + e);
                return false;
            }
        }
        return false;
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j) {
        Map<String, String> map;
        hx a = a(bArr);
        if (a == null) {
            return;
        }
        if (TextUtils.isEmpty(a.f)) {
            com.xiaomi.channel.commonutils.logger.c.a("receive a mipush message without package name");
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Intent a2 = a(bArr, valueOf.longValue());
        String a3 = l.a(a);
        gt.a(xMPushService, a3, j, true, true, System.currentTimeMillis());
        ho hoVar = a.h;
        if (hoVar != null && hoVar.a != null) {
            com.xiaomi.channel.commonutils.logger.c.f(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", a.e, hoVar.a, a.a));
        }
        if (hoVar != null) {
            hoVar.a("mrt", Long.toString(valueOf.longValue()));
        }
        if (ha.SendMessage == a.a && co.a(xMPushService).a(a.f) && !l.b(a)) {
            String str = "";
            if (hoVar != null) {
                str = hoVar.a;
                if (l.f(a)) {
                    ds.a(xMPushService.getApplicationContext()).a(a.f, l.g(a), str, "1");
                }
            }
            com.xiaomi.channel.commonutils.logger.c.a("Drop a message for unregistered, msgid=" + str);
            a(xMPushService, a, a.f);
        } else if (ha.SendMessage == a.a && co.a(xMPushService).c(a.f) && !l.b(a)) {
            String str2 = "";
            if (hoVar != null) {
                str2 = hoVar.a;
                if (l.f(a)) {
                    ds.a(xMPushService.getApplicationContext()).a(a.f, l.g(a), str2, "2");
                }
            }
            com.xiaomi.channel.commonutils.logger.c.a("Drop a message for push closed, msgid=" + str2);
            a(xMPushService, a, a.f);
        } else if (ha.SendMessage == a.a && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), a.f)) {
            com.xiaomi.channel.commonutils.logger.c.a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a.f);
            a(xMPushService, a, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a.f);
            if (hoVar == null || !l.f(a)) {
                return;
            }
            ds.a(xMPushService.getApplicationContext()).a(a.f, l.g(a), hoVar.a, "3");
        } else if (ha.SendMessage == a.a && hf.a() == 999 && hf.a(xMPushService, a3)) {
            com.xiaomi.channel.commonutils.logger.c.a("Receive the uninstalled dual app message");
            try {
                h.a(xMPushService, h.a(a3, a.e));
                com.xiaomi.channel.commonutils.logger.c.a("uninstall " + a3 + " msg sent");
            } catch (fy e) {
                com.xiaomi.channel.commonutils.logger.c.d("Fail to send Message: " + e.getMessage());
                xMPushService.a(10, e);
            }
            l.b(xMPushService, a3);
        } else if (hoVar != null && (map = hoVar.j) != null && map.containsKey("hide") && "true".equalsIgnoreCase(map.get("hide"))) {
            b(xMPushService, a);
        } else {
            if (hoVar != null && hoVar.j != null && hoVar.j.containsKey("__miid")) {
                String str3 = hoVar.j.get("__miid");
                String c = jr.c(xMPushService.getApplicationContext());
                if (TextUtils.isEmpty(c) || !TextUtils.equals(str3, c)) {
                    if (l.f(a)) {
                        ds.a(xMPushService.getApplicationContext()).a(a.f, l.g(a), hoVar.a, "4");
                    }
                    com.xiaomi.channel.commonutils.logger.c.a(str3 + " should be login, but got " + c);
                    a(xMPushService, a, "miid already logout or anther already login", str3 + " should be login, but got " + c);
                    return;
                }
            }
            a(xMPushService, a3, bArr, a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x034c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.xiaomi.push.service.XMPushService r17, java.lang.String r18, byte[] r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.cr.a(com.xiaomi.push.service.XMPushService, java.lang.String, byte[], android.content.Intent):void");
    }

    private static void b(Context context, hx hxVar, byte[] bArr) {
        if (l.b(hxVar)) {
            return;
        }
        String a = l.a(hxVar);
        if (TextUtils.isEmpty(a) || a(context, a, bArr)) {
            return;
        }
        ds.a(context).b(a, l.g(hxVar), hxVar.h.a, "1");
    }

    private static boolean a(XMPushService xMPushService, String str, hx hxVar, ho hoVar) {
        boolean z = true;
        if (hoVar != null && hoVar.j != null && hoVar.j.containsKey("__check_alive") && hoVar.j.containsKey("__awake")) {
            ia iaVar = new ia();
            iaVar.d = hxVar.e;
            iaVar.i = str;
            iaVar.e = hl.AwakeSystemApp.ah;
            iaVar.c = hoVar.a;
            iaVar.h = new HashMap();
            boolean c = fd.c(xMPushService.getApplicationContext(), str);
            iaVar.h.put("app_running", Boolean.toString(c));
            if (!c) {
                boolean parseBoolean = Boolean.parseBoolean(hoVar.j.get("__awake"));
                iaVar.h.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                h.a(xMPushService, h.a(hxVar.f, hxVar.e, iaVar, ha.Notification));
            } catch (fy e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
        }
        return z;
    }

    private static void a(XMPushService xMPushService, hx hxVar) {
        xMPushService.a(new cs(4, xMPushService, hxVar), 0L);
    }

    private static boolean a(hx hxVar) {
        return "com.xiaomi.xmsf".equals(hxVar.f) && hxVar.h != null && hxVar.h.j != null && hxVar.h.j.containsKey("miui_package_name");
    }

    private static boolean b(hx hxVar) {
        Map<String, String> map = hxVar.h.j;
        return map != null && map.containsKey("notify_effect");
    }

    private static boolean c(hx hxVar) {
        if (hxVar.h == null || hxVar.h.j == null) {
            return false;
        }
        return "1".equals(hxVar.h.j.get("obslete_ads_message"));
    }

    private static void b(XMPushService xMPushService, hx hxVar) {
        xMPushService.a(new ct(4, xMPushService, hxVar), 0L);
    }

    private static void c(XMPushService xMPushService, hx hxVar) {
        xMPushService.a(new cu(4, xMPushService, hxVar), 0L);
    }

    private static void d(XMPushService xMPushService, hx hxVar) {
        xMPushService.a(new c(4, xMPushService, hxVar), 0L);
    }

    private static void a(XMPushService xMPushService, hx hxVar, String str) {
        xMPushService.a(new d(4, xMPushService, hxVar, str), 0L);
    }

    private static void a(XMPushService xMPushService, hx hxVar, String str, String str2) {
        xMPushService.a(new e(4, xMPushService, hxVar, str, str2), 0L);
    }

    private static void a(XMPushService xMPushService, hx hxVar, ia iaVar) {
        xMPushService.a(new f(4, iaVar, hxVar, xMPushService), 0L);
    }

    public static hx a(Context context, hx hxVar, Map<String, String> map) {
        hr hrVar = new hr();
        hrVar.d = hxVar.e;
        ho hoVar = hxVar.h;
        if (hoVar != null) {
            hrVar.c = hoVar.a;
            hrVar.a(hoVar.b);
            if (!TextUtils.isEmpty(hoVar.c)) {
                hrVar.f = hoVar.c;
            }
        }
        hrVar.a(ik.a(context, hxVar));
        hx a = h.a(hxVar.f, hxVar.e, hrVar, ha.AckMessage);
        ho hoVar2 = hxVar.h;
        if (hoVar2 != null) {
            hoVar2 = ar.a(hoVar2.a());
        }
        hoVar2.a("mat", Long.toString(System.currentTimeMillis()));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        hoVar2.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        a.h = hoVar2;
        return a;
    }
}
