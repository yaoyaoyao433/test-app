package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.mipush.sdk.ap;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ep;
import com.xiaomi.push.fd;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.ho;
import com.xiaomi.push.hp;
import com.xiaomi.push.hv;
import com.xiaomi.push.ia;
import com.xiaomi.push.ib;
import com.xiaomi.push.ih;
import com.xiaomi.push.jl;
import com.xiaomi.push.jr;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class g {
    private static Context a;
    private static long b = System.currentTimeMillis();

    /* loaded from: classes6.dex */
    public interface a<R> {
    }

    @Deprecated
    /* loaded from: classes6.dex */
    public static abstract class b {
        String a;
    }

    /* loaded from: classes6.dex */
    public static class c {
        String a = null;
        long b = -1;
    }

    /* loaded from: classes6.dex */
    public interface d extends a<c> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void a(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (ep.COMMAND_SET_ALIAS.k.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - h(context, str2)) < 86400000) {
            if (1 == r.a(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
            } else {
                r.a(context, r.a(ep.COMMAND_SET_ALIAS.k, arrayList, 0L, null, str3));
            }
        } else if (ep.COMMAND_UNSET_ALIAS.k.equalsIgnoreCase(str) && h(context, str2) < 0) {
            com.xiaomi.channel.commonutils.logger.c.a("Don't cancel alias for " + com.xiaomi.push.ar.a(arrayList.toString(), 3) + " is unseted");
        } else if (ep.COMMAND_SET_ACCOUNT.k.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - i(context, str2)) < DDLoadConstants.TIME_HOURS_MILLIS) {
            if (1 == r.a(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
            } else {
                r.a(context, r.a(ep.COMMAND_SET_ACCOUNT.k, arrayList, 0L, null, str3));
            }
        } else if (!ep.COMMAND_UNSET_ACCOUNT.k.equalsIgnoreCase(str) || i(context, str2) >= 0) {
            a(context, str, arrayList, str3);
        } else {
            com.xiaomi.channel.commonutils.logger.c.a("Don't cancel account for " + com.xiaomi.push.ar.a(arrayList.toString(), 3) + " is unseted");
        }
    }

    private static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    public static boolean a(Context context) {
        return ag.a(context).c();
    }

    public static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("alias_" + str).commit();
        }
    }

    public static void b(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, ep.COMMAND_SET_ALIAS.k, str, (String) null);
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static void c(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, ep.COMMAND_SET_ACCOUNT.k, str, (String) null);
    }

    public static List<String> d(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("account_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void e(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void f(Context context, String str) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("topic_" + str).commit();
        }
    }

    public static long g(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("topic_" + str, -1L);
    }

    public static long h(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("alias_" + str, -1L);
    }

    private static long i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("account_" + str, -1L);
    }

    public static void j(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_HUAWEI_TOKEN, as.ASSEMBLE_PUSH_HUAWEI);
    }

    public static void k(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_FCM_TOKEN, as.ASSEMBLE_PUSH_FCM);
    }

    public static void l(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_COS_TOKEN, as.ASSEMBLE_PUSH_COS);
    }

    public static void m(Context context) {
        ag.a(context).a((String) null, am.UPLOAD_FTOS_TOKEN, as.ASSEMBLE_PUSH_FTOS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean p(Context context) {
        a((Object) context, "context");
        return at.a(context).b(as.ASSEMBLE_PUSH_HUAWEI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean q(Context context) {
        a((Object) context, "context");
        return at.a(context).b(as.ASSEMBLE_PUSH_FCM);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean r(Context context) {
        a((Object) context, "context");
        return at.a(context).b(as.ASSEMBLE_PUSH_COS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean s(Context context) {
        return at.a(context).b(as.ASSEMBLE_PUSH_FTOS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void t(Context context) {
        synchronized (g.class) {
            for (String str : b(context)) {
                b(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void u(Context context) {
        synchronized (g.class) {
            for (String str : d(context)) {
                d(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void v(Context context) {
        synchronized (g.class) {
            for (String str : c(context)) {
                f(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String x(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString("accept_time", "00:00-23:59");
    }

    private static void y(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            jl.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter);
            jl.a(context, NetworkStatusReceiver.class);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("dynamic register network status receiver failed:" + th);
        }
    }

    private static void z(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = b(context).iterator();
        while (it.hasNext()) {
            edit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = d(context).iterator();
        while (it2.hasNext()) {
            edit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = c(context).iterator();
        while (it3.hasNext()) {
            edit.remove("topic_" + it3.next());
        }
        edit.remove("accept_time");
        edit.commit();
    }

    public static void a(Context context, String str, String str2) {
        q qVar = new q();
        a((Object) context, "context");
        a(str, "appID");
        a(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        a = applicationContext;
        if (applicationContext == null) {
            a = context;
        }
        Context context2 = a;
        jr.a(context2);
        if (!NetworkStatusReceiver.a()) {
            y(a);
        }
        at a2 = at.a(a);
        a2.b = qVar;
        a2.c = com.xiaomi.push.service.z.a(a2.a).a(hg.AggregatePushSwitch.by, true);
        if (a2.b.a || a2.b.b || a2.b.c || a2.b.d) {
            com.xiaomi.push.service.z.a(a2.a).a(new au(a2, 101, "assemblePush"));
        }
        com.xiaomi.push.m.a(context2).a(new h(str, str2, null, null), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, hp hpVar) {
        com.xiaomi.channel.commonutils.logger.c.f("re-register reason: " + hpVar);
        String a2 = com.xiaomi.push.ar.a(6);
        String str = ap.a(context).b.a;
        String str2 = ap.a(context).b.b;
        ap.a(context).b.c();
        z(context);
        n(context);
        ap.a(context).a(com.xiaomi.mipush.sdk.c.a());
        ap.a(context).a(str, str2, a2);
        ib ibVar = new ib();
        ibVar.c = com.xiaomi.push.service.ad.a();
        ibVar.d = str;
        ibVar.g = str2;
        ibVar.h = a2;
        ibVar.f = context.getPackageName();
        ibVar.e = fd.a(context, context.getPackageName());
        ibVar.b(fd.b(context, context.getPackageName()));
        ibVar.l = "4_8_2";
        ibVar.a(40082);
        ibVar.t = hpVar;
        int a3 = hf.a();
        if (a3 >= 0) {
            ibVar.c(a3);
        }
        ag.a(context).a(ibVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, ho hoVar, String str2) {
        ia iaVar = new ia();
        if (!TextUtils.isEmpty(str2)) {
            iaVar.d = str2;
        } else if (!ap.a(context).a()) {
            com.xiaomi.channel.commonutils.logger.c.d("do not report clicked message");
            return;
        } else {
            iaVar.d = ap.a(context).b.a;
        }
        iaVar.e = "bar:click";
        iaVar.c = str;
        iaVar.a(false);
        ag.a(context).a((ag) iaVar, ha.Notification, false, hoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, ho hoVar, String str2, String str3) {
        ia iaVar = new ia();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.c.d("do not report clicked message");
            return;
        }
        iaVar.d = str3;
        iaVar.e = "bar:click";
        iaVar.c = str;
        iaVar.a(false);
        ag.a(context).a(iaVar, ha.Notification, false, true, hoVar, true, str2, str3);
    }

    public static void f(Context context) {
        ag a2 = ag.a(context);
        Intent b2 = a2.b();
        b2.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        b2.putExtra(com.xiaomi.push.service.ak.C, a2.a.getPackageName());
        b2.putExtra(com.xiaomi.push.service.ak.H, com.xiaomi.push.aq.b(a2.a.getPackageName()));
        a2.c(b2);
    }

    public static void g(Context context) {
        aw.c(context);
        com.xiaomi.push.service.z.a(context).a();
        if (ap.a(context).a()) {
            ih ihVar = new ih();
            ihVar.c = com.xiaomi.push.service.ad.a();
            ihVar.d = ap.a(context).b.a;
            ihVar.e = ap.a(context).b.c;
            ihVar.h = ap.a(context).b.b;
            ihVar.g = context.getPackageName();
            ag.a(context).a(ihVar);
            PushMessageHandler.b();
            PushMessageHandler.c();
            ap.a aVar = ap.a(context).b;
            aVar.i = false;
            ap.b(aVar.l).edit().putBoolean("valid", aVar.i).commit();
            f(context);
            n(context);
            e(context);
        }
    }

    public static void h(Context context) {
        ag.a(context).a(true, (String) null);
    }

    public static void i(Context context) {
        ag.a(context).a(false, (String) null);
    }

    public static void d(Context context, String str, String str2) {
        if (TextUtils.isEmpty(ap.a(context).b.a) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - g(context, str)) <= 86400000) {
            if (1 == r.a(context)) {
                PushMessageHandler.a(context, null, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            r.a(context, r.a(ep.COMMAND_SUBSCRIBE_TOPIC.k, arrayList, 0L, null, null));
            return;
        }
        Cif cif = new Cif();
        String a2 = com.xiaomi.push.service.ad.a();
        cif.c = a2;
        cif.d = ap.a(context).b.a;
        cif.e = str;
        cif.f = context.getPackageName();
        cif.g = null;
        com.xiaomi.channel.commonutils.logger.c.f("cmd:" + ep.COMMAND_SUBSCRIBE_TOPIC + ", " + a2);
        ag.a(context).a((ag) cif, ha.Subscription, (ho) null);
    }

    public static void a(Context context, int i) {
        ag.a(context).a(i, 0);
    }

    public static void e(Context context, String str, String str2) {
        ag a2 = ag.a(context);
        Intent b2 = a2.b();
        b2.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        b2.putExtra(com.xiaomi.push.service.ak.C, a2.a.getPackageName());
        b2.putExtra(com.xiaomi.push.service.ak.I, str);
        b2.putExtra(com.xiaomi.push.service.ak.J, str2);
        a2.c(b2);
    }

    public static void n(Context context) {
        ag.a(context).a(-1, 0);
    }

    public static String o(Context context) {
        if (ap.a(context).b.a()) {
            return ap.a(context).b.c;
        }
        return null;
    }

    private static void a(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(ap.a(context).b.a)) {
            return;
        }
        hv hvVar = new hv();
        String a2 = com.xiaomi.push.service.ad.a();
        hvVar.b = a2;
        hvVar.c = ap.a(context).b.a;
        hvVar.d = str;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (hvVar.e == null) {
                hvVar.e = new ArrayList();
            }
            hvVar.e.add(next);
        }
        hvVar.g = str2;
        hvVar.f = context.getPackageName();
        com.xiaomi.channel.commonutils.logger.c.f("cmd:" + str + ", " + a2);
        ag.a(context).a((ag) hvVar, ha.Command, (ho) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void f(Context context, String str, String str2) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString("accept_time", str + CommonConstant.Symbol.COMMA + str2);
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void w(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("accept_time");
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0425 A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x044c A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0465 A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x047e A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0497 A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b0 A[Catch: Throwable -> 0x04cb, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c7 A[Catch: Throwable -> 0x04cb, TRY_LEAVE, TryCatch #0 {Throwable -> 0x04cb, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0017, B:7:0x001f, B:8:0x002e, B:14:0x0047, B:19:0x006a, B:23:0x007e, B:25:0x008c, B:27:0x0098, B:29:0x00a1, B:31:0x00cf, B:33:0x00f5, B:35:0x0163, B:36:0x016a, B:37:0x0175, B:39:0x0183, B:40:0x01a3, B:42:0x01af, B:47:0x01d3, B:60:0x02e9, B:62:0x0339, B:63:0x0354, B:65:0x037c, B:66:0x03b7, B:68:0x03f0, B:69:0x03fa, B:73:0x0417, B:75:0x0425, B:77:0x042b, B:78:0x0434, B:79:0x0438, B:81:0x044c, B:82:0x0451, B:84:0x0465, B:85:0x046a, B:87:0x047e, B:88:0x0483, B:90:0x0497, B:91:0x049c, B:93:0x04b0, B:94:0x04b3, B:96:0x04c7, B:70:0x03fe, B:72:0x0409, B:30:0x00ac, B:48:0x021b, B:50:0x0295, B:51:0x0297, B:53:0x029d, B:55:0x02a9, B:56:0x02c9, B:58:0x02cf, B:59:0x02d2), top: B:101:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(android.content.Context r10, java.lang.String r11, java.lang.String r12, com.xiaomi.mipush.sdk.g.b r13, java.lang.String r14, com.xiaomi.mipush.sdk.g.a r15) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.g.a(android.content.Context, java.lang.String, java.lang.String, com.xiaomi.mipush.sdk.g$b, java.lang.String, com.xiaomi.mipush.sdk.g$a):void");
    }
}
