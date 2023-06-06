package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.xiaomi.push.cf;
import com.xiaomi.push.ds;
import com.xiaomi.push.ha;
import com.xiaomi.push.hb;
import com.xiaomi.push.hg;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ib;
import com.xiaomi.push.ih;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.cd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ag {
    private static ag c = null;
    private static boolean f = false;
    private static final ArrayList<a> g = new ArrayList<>();
    Context a;
    private boolean b;
    private Messenger e;
    private Handler h;
    private List<Message> i = new ArrayList();
    private boolean j = false;
    private Intent k = null;
    private Integer l = null;
    private String d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class a<T extends il<T, ?>> {
        T a;
        ha b;
        boolean c;

        a() {
        }
    }

    public static synchronized ag a(Context context) {
        ag agVar;
        synchronized (ag.class) {
            if (c == null) {
                c = new ag(context);
            }
            agVar = c;
        }
        return agVar;
    }

    private synchronized void a(int i) {
        this.a.getSharedPreferences("mipush_extra", 0).edit().putInt("service_boot_mode", i).commit();
    }

    private static <T extends il<T, ?>> void a(T t, ha haVar, boolean z) {
        a aVar = new a();
        aVar.a = t;
        aVar.b = haVar;
        aVar.c = z;
        synchronized (g) {
            g.add(aVar);
            if (g.size() > 10) {
                g.remove(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(ag agVar, boolean z) {
        agVar.j = false;
        return false;
    }

    private synchronized void d(Intent intent) {
        if (this.j) {
            Message e = e(intent);
            if (this.i.size() >= 50) {
                this.i.remove(0);
            }
            this.i.add(e);
        } else if (this.e == null) {
            this.a.bindService(intent, new ak(this), 1);
            this.j = true;
            this.i.clear();
            this.i.add(e(intent));
        } else {
            try {
                this.e.send(e(intent));
            } catch (RemoteException unused) {
                this.e = null;
                this.j = false;
            }
        }
    }

    private static Message e(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    private synchronized int g() {
        return this.a.getSharedPreferences("mipush_extra", 0).getInt("service_boot_mode", -1);
    }

    private boolean h() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Intent i() {
        Intent intent = new Intent();
        String packageName = this.a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", k());
        intent.putExtra("mipush_app_package", packageName);
        l();
        return intent;
    }

    private Intent j() {
        Intent intent = new Intent();
        String packageName = this.a.getPackageName();
        m();
        intent.setComponent(new ComponentName(this.a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    private String k() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private void l() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            ComponentName componentName = new ComponentName(this.a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void m() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            ComponentName componentName = new ComponentName(this.a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    private boolean n() {
        if (c()) {
            try {
                return this.a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private boolean o() {
        String packageName = this.a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.a.getApplicationInfo().flags & 1) != 0;
    }

    public final void a() {
        b(b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        Intent b = b();
        b.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        b.putExtra(com.xiaomi.push.service.ak.C, this.a.getPackageName());
        b.putExtra(com.xiaomi.push.service.ak.D, i);
        b.putExtra(com.xiaomi.push.service.ak.E, i2);
        c(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Intent intent) {
        intent.fillIn(b(), 24);
        c(intent);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, ho hoVar) {
        a((ag) t, haVar, !haVar.equals(ha.Registration), hoVar);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, boolean z, ho hoVar) {
        a(t, haVar, z, true, hoVar, true);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, boolean z, ho hoVar, boolean z2) {
        a(t, haVar, z, true, null, z2);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, boolean z, boolean z2, ho hoVar, boolean z3, String str, String str2) {
        a(t, haVar, z, z2, hoVar, z3, str, str2, true);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, boolean z, boolean z2, ho hoVar, boolean z3, String str, String str2, boolean z4) {
        a(t, haVar, z, z2, hoVar, z3, str, str2, z4, true);
    }

    public final void a(String str, am amVar, as asVar) {
        x.a(this.a).a(amVar, "syncing");
        a(str, amVar, false, aw.b(this.a, asVar));
    }

    public final void a(boolean z, String str) {
        am amVar;
        if (z) {
            x.a(this.a).a(am.DISABLE_PUSH, "syncing");
            x.a(this.a).a(am.ENABLE_PUSH, "");
            amVar = am.DISABLE_PUSH;
        } else {
            x.a(this.a).a(am.ENABLE_PUSH, "syncing");
            x.a(this.a).a(am.DISABLE_PUSH, "");
            amVar = am.ENABLE_PUSH;
        }
        a(str, amVar, true, (HashMap<String, String>) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent b() {
        return (!c() || "com.xiaomi.xmsf".equals(this.a.getPackageName())) ? j() : i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Intent intent) {
        try {
            if (jj.a() || Build.VERSION.SDK_INT < 26) {
                this.a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }

    public final void d() {
        if (this.k != null) {
            c(this.k);
            this.k = null;
        }
    }

    public final void e() {
        synchronized (g) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<a> it = g.iterator();
            while (it.hasNext()) {
                a next = it.next();
                a(next.a, next.b, next.c, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            g.clear();
        }
    }

    private ag(Context context) {
        Intent j;
        this.b = false;
        this.h = null;
        this.a = context.getApplicationContext();
        this.b = h();
        f = n();
        this.h = new ah(this, Looper.getMainLooper());
        if (jj.a(context)) {
            cd.a = new ai(this);
        }
        if ("com.xiaomi.xmsf".equals(this.a.getPackageName())) {
            com.xiaomi.channel.commonutils.logger.c.c("pushChannel xmsf create own channel");
            j = j();
        } else if (c()) {
            com.xiaomi.channel.commonutils.logger.c.c("pushChannel app start miui china channel");
            j = i();
        } else {
            com.xiaomi.channel.commonutils.logger.c.c("pushChannel app start  own channel");
            j = j();
        }
        if (j != null) {
            b(j);
        }
    }

    public final void a(ib ibVar, boolean z) {
        ds.a(this.a.getApplicationContext()).a(this.a.getPackageName(), "E100003", ibVar.c, 6001, null);
        this.k = null;
        ap.a(this.a).d = ibVar.c;
        Intent b = b();
        byte[] a2 = ik.a(z.a(this.a, ibVar, ha.Registration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.a("register fail, because msgBytes is null.");
            return;
        }
        b.setAction("com.xiaomi.mipush.REGISTER_APP");
        b.putExtra("mipush_app_id", ap.a(this.a).b.a);
        b.putExtra("mipush_payload", a2);
        b.putExtra("mipush_session", this.d);
        b.putExtra("mipush_env_chanage", z);
        b.putExtra("mipush_env_type", ap.a(this.a).b.k);
        if (com.xiaomi.push.al.a(this.a) && f()) {
            c(b);
        } else {
            this.k = b;
        }
    }

    public final void a(ih ihVar) {
        byte[] a2 = ik.a(z.a(this.a, ihVar, ha.UnRegistration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent b = b();
        b.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        b.putExtra("mipush_app_id", ap.a(this.a).b.a);
        b.putExtra("mipush_payload", a2);
        c(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, am amVar, boolean z, HashMap<String, String> hashMap) {
        ia iaVar;
        if (ap.a(this.a).a() && com.xiaomi.push.al.a(this.a)) {
            ia iaVar2 = new ia();
            iaVar2.a(true);
            Intent b = b();
            if (TextUtils.isEmpty(str)) {
                str = com.xiaomi.push.service.ad.a();
                iaVar2.c = str;
                iaVar = z ? new ia(str, true) : null;
                synchronized (x.class) {
                    x.a(this.a).a(str);
                }
            } else {
                iaVar2.c = str;
                iaVar = z ? new ia(str, true) : null;
            }
            switch (al.a[amVar.ordinal()]) {
                case 1:
                    iaVar2.e = hl.DisablePushMessage.ah;
                    iaVar.e = hl.DisablePushMessage.ah;
                    if (hashMap != null) {
                        iaVar2.h = hashMap;
                        iaVar.h = hashMap;
                    }
                    b.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    iaVar2.e = hl.EnablePushMessage.ah;
                    iaVar.e = hl.EnablePushMessage.ah;
                    if (hashMap != null) {
                        iaVar2.h = hashMap;
                        iaVar.h = hashMap;
                    }
                    b.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    iaVar2.e = hl.ThirdPartyRegUpdate.ah;
                    if (hashMap != null) {
                        iaVar2.h = hashMap;
                        break;
                    }
                    break;
            }
            com.xiaomi.channel.commonutils.logger.c.f("type:" + amVar + ", " + str);
            iaVar2.d = ap.a(this.a).b.a;
            iaVar2.i = this.a.getPackageName();
            a((ag) iaVar2, ha.Notification, false, (ho) null);
            if (z) {
                iaVar.d = ap.a(this.a).b.a;
                iaVar.i = this.a.getPackageName();
                byte[] a2 = ik.a(z.a(this.a, iaVar, ha.Notification, false, this.a.getPackageName(), ap.a(this.a).b.a));
                if (a2 != null) {
                    cf.a(this.a.getPackageName(), this.a, iaVar, ha.Notification, a2.length);
                    b.putExtra("mipush_payload", a2);
                    b.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    b.putExtra("mipush_app_id", ap.a(this.a).b.a);
                    b.putExtra("mipush_app_token", ap.a(this.a).b.b);
                    c(b);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = amVar.ordinal();
            obtain.obj = str;
            obtain.arg1 = ordinal;
            this.h.sendMessageDelayed(obtain, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    private <T extends il<T, ?>> void a(T t, ha haVar, boolean z, boolean z2, ho hoVar, boolean z3) {
        a(t, haVar, z, z2, hoVar, z3, this.a.getPackageName(), ap.a(this.a).b.a);
    }

    public final <T extends il<T, ?>> void a(T t, ha haVar, boolean z, boolean z2, ho hoVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !ap.a(this.a).b.a()) {
            if (z2) {
                a(t, haVar, z);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.c.a("drop the message before initialization.");
                return;
            }
        }
        hx a2 = z4 ? z.a(this.a, t, haVar, z, str, str2) : z.b(this.a, t, haVar, z, str, str2);
        if (hoVar != null) {
            a2.h = hoVar;
        }
        byte[] a3 = ik.a(a2);
        if (a3 == null) {
            com.xiaomi.channel.commonutils.logger.c.a("send message fail, because msgBytes is null.");
            return;
        }
        cf.a(this.a.getPackageName(), this.a, t, haVar, a3.length);
        Intent b = b();
        b.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        b.putExtra("mipush_payload", a3);
        b.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        c(b);
    }

    public final boolean c() {
        return this.b && 1 == ap.a(this.a).b.k;
    }

    public final boolean f() {
        if (c() && o()) {
            if (this.l == null) {
                this.l = Integer.valueOf(com.xiaomi.push.service.an.a(this.a).a());
                if (this.l.intValue() == 0) {
                    aj ajVar = new aj(this, new Handler(Looper.getMainLooper()));
                    ContentResolver contentResolver = this.a.getContentResolver();
                    com.xiaomi.push.service.an.a(this.a);
                    contentResolver.registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, ajVar);
                }
            }
            return this.l.intValue() != 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Intent intent) {
        int i;
        int a2 = com.xiaomi.push.service.z.a(this.a).a(hg.ServiceBootMode.by, hb.START.c);
        int g2 = g();
        boolean z = a2 == hb.BIND.c && f;
        if (z) {
            i = hb.BIND.c;
        } else {
            i = hb.START.c;
        }
        if (i != g2) {
            b(i);
        }
        if (z) {
            d(intent);
        } else {
            b(intent);
        }
    }

    private boolean b(int i) {
        if (ap.a(this.a).a()) {
            a(i);
            ia iaVar = new ia();
            iaVar.c = com.xiaomi.push.service.ad.a();
            iaVar.d = ap.a(this.a).b.a;
            iaVar.i = this.a.getPackageName();
            iaVar.e = hl.ClientABTest.ah;
            iaVar.h = new HashMap();
            Map<String, String> map = iaVar.h;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            map.put("boot_mode", sb.toString());
            a(this.a).a((ag) iaVar, ha.Notification, false, (ho) null);
            return true;
        }
        return false;
    }
}
