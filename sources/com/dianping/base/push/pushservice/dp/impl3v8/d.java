package com.dianping.base.push.pushservice.dp.impl3v8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.dianping.base.push.pushservice.PushStartService;
import com.dianping.base.push.pushservice.dp.DPPushService;
import com.dianping.base.push.pushservice.e;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.h;
import com.dianping.base.push.pushservice.k;
import com.dianping.base.push.pushservice.l;
import com.dianping.base.push.pushservice.util.i;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d implements com.dianping.base.push.pushservice.dp.a {
    public static ChangeQuickRedirect a;
    private static final String[] c = {"101.236.9.44", "103.37.142.149", "101.236.12.16"};
    private static final int[] d = {80};
    private static int w = 0;
    private static boolean y;
    private Runnable A;
    private Object B;
    public final Handler b;
    private ConnectivityManager e;
    private c f;
    private volatile a g;
    private final b h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private Service n;
    private AlarmManager o;
    private PendingIntent p;
    private PendingIntent q;
    private ExecutorService r;
    private Random s;
    private String t;
    private Context u;
    private Random v;
    private ScheduledExecutorService x;
    private Runnable z;

    public static /* synthetic */ void a(String str) {
    }

    public static /* synthetic */ int a(d dVar, int i) {
        dVar.l = 0;
        return 0;
    }

    public static /* synthetic */ Service a(d dVar) {
        return dVar.n;
    }

    public static /* synthetic */ a a(d dVar, a aVar) {
        dVar.g = null;
        return null;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.m = z;
        return z;
    }

    public static /* synthetic */ int b(d dVar, int i) {
        dVar.i = 0;
        return 0;
    }

    public static /* synthetic */ void b(String str) {
        c(str);
    }

    public static /* synthetic */ int[] b() {
        return d;
    }

    public static /* synthetic */ String[] c() {
        return c;
    }

    public static /* synthetic */ void f(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "10346d5b445710055163772d422df25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "10346d5b445710055163772d422df25d");
            return;
        }
        try {
            if (e.a(dVar.u).a(GetUUID.REGISTER, -1) > 0) {
                dVar.e();
            }
            dVar.n.registerReceiver(dVar.h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            e.a(dVar.u).b(GetUUID.REGISTER, 1);
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", th.toString());
        }
    }

    public static /* synthetic */ void i(d dVar) {
        dVar.m();
    }

    public static /* synthetic */ c j(d dVar) {
        return dVar.f;
    }

    public static /* synthetic */ void k(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "bd12d1852b0e7916eef709073f54e089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "bd12d1852b0e7916eef709073f54e089");
            return;
        }
        c("Rescheduling connection to load balance.");
        int i = 120;
        try {
            if (dVar.n != null && com.dianping.base.push.pushservice.d.a(dVar.n).a("reconnectInterval", 0) > 0) {
                i = com.dianping.base.push.pushservice.d.a(dVar.n).a("reconnectInterval", 120);
            }
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e.toString());
        }
        if (!com.dianping.base.push.pushservice.util.d.a(dVar.n)) {
            if (dVar.l == 0) {
                dVar.k = i;
                dVar.j = 0;
            } else {
                dVar.k += dVar.j;
                dVar.j = dVar.k - dVar.j;
            }
            dVar.l++;
            if (dVar.l >= 9) {
                dVar.l = 9;
            }
            i = dVar.k;
        } else {
            dVar.l = 0;
        }
        StringBuilder sb = new StringBuilder("reconnect after : ");
        sb.append(i);
        sb.append("s");
        c("reconnect after : " + i + "s");
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                dVar.o.setAndAllowWhileIdle(0, System.currentTimeMillis() + (i * 1000), dVar.p);
            } else if (Build.VERSION.SDK_INT >= 19) {
                dVar.o.setExact(0, System.currentTimeMillis() + (i * 1000), dVar.p);
            } else {
                dVar.o.set(0, System.currentTimeMillis() + (i * 1000), dVar.p);
            }
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", th.toString());
        }
    }

    public static /* synthetic */ boolean l(d dVar) {
        return dVar.n();
    }

    public static /* synthetic */ Random m(d dVar) {
        return dVar.s;
    }

    public static /* synthetic */ Context n(d dVar) {
        return dVar.u;
    }

    public static /* synthetic */ int o(d dVar) {
        int i = dVar.i + 1;
        dVar.i = i;
        return i;
    }

    public static /* synthetic */ int p(d dVar) {
        return dVar.i;
    }

    public static /* synthetic */ void q(d dVar) {
        dVar.j();
    }

    public static /* synthetic */ void r(d dVar) {
        dVar.k();
    }

    public static /* synthetic */ boolean s(d dVar) {
        return dVar.m;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866f09bdb03d2d04b527447862fca668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866f09bdb03d2d04b527447862fca668");
            return;
        }
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.b = new Handler(Looper.getMainLooper());
        this.t = "";
        this.v = new Random(10L);
        this.z = new Runnable() { // from class: com.dianping.base.push.pushservice.dp.impl3v8.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2779933e8ccac89831893a0fde42325", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2779933e8ccac89831893a0fde42325");
                    return;
                }
                if (!DPPushService.a(1)) {
                    d.this.n.stopSelf();
                } else if (d.y) {
                    d.this.i();
                }
                h hVar = f.e;
            }
        };
        this.A = new Runnable() { // from class: com.dianping.base.push.pushservice.dp.impl3v8.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "040d35c5f23368233f085a381a34bd80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "040d35c5f23368233f085a381a34bd80");
                    return;
                }
                while (d.this.n != null) {
                    int a2 = DPPushService.a();
                    if ((a2 & 2) > 0) {
                        d.a("Attempt to start connection that is already active");
                        d.c("Attempt to start connection that is already active");
                        return;
                    } else if (DPPushService.a(a2, a2 | 2)) {
                        try {
                            com.dianping.base.push.pushservice.d.a(d.this.n).a("isConnectionStarted", true);
                        } catch (Exception e) {
                            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e.toString());
                        }
                        com.dianping.base.push.pushservice.c.b("PushServiceImpl", "pushservice started by: " + d.this.t);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("source", d.this.t);
                            jSONObject.put("brand", Build.BRAND);
                            jSONObject.put("model", Build.MODEL);
                            jSONObject.put("os", Build.VERSION.RELEASE);
                            k.a(d.this.n).a(l.a(d.this.n, 301, jSONObject));
                        } catch (Exception e2) {
                            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e2.toString());
                        }
                        d.this.t = "";
                        if (d.this.e != null) {
                            NetworkInfo networkInfo = null;
                            try {
                                networkInfo = d.this.e.getActiveNetworkInfo();
                            } catch (Exception e3) {
                                com.dianping.base.push.pushservice.c.d("PushServiceImpl", e3.toString());
                            }
                            if (networkInfo != null) {
                                try {
                                    com.dianping.base.push.pushservice.d.a(d.this.n).b("lastNetworkType", networkInfo.getType());
                                } catch (Exception e4) {
                                    com.dianping.base.push.pushservice.c.d("PushServiceImpl", e4.toString());
                                }
                            }
                        }
                        try {
                            d.this.e();
                            d.f(d.this);
                        } catch (Exception e5) {
                            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e5.toString());
                        }
                        d.a("Connecting...");
                        d.c("Connecting...");
                        i.b(d.this.n);
                        d.this.f();
                        return;
                    }
                }
                d.a("push service is stopped.");
                d.c("push service is stopped.");
            }
        };
        this.B = new Object();
        this.h = new b();
    }

    @Override // com.dianping.base.push.pushservice.dp.a
    public final void a(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f124106285c6728a090ad8cd6359f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f124106285c6728a090ad8cd6359f8");
            return;
        }
        this.n = service;
        this.u = service.getApplicationContext();
        this.s = new Random(System.currentTimeMillis());
        this.r = com.sankuai.android.jarvis.c.a("dppush-keepalive");
        this.x = com.sankuai.android.jarvis.c.b("dppush-heartbeat", 1);
        this.o = (AlarmManager) this.n.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent();
        Intent intent2 = new Intent();
        if (Build.VERSION.SDK_INT >= 26 && f.i) {
            intent.setClass(this.n, PushStartService.class);
            intent.setAction("com.dianping.action.PUSH_RECONNECT");
            intent2.setClass(this.n, PushStartService.class);
            intent2.setAction("com.dianping.action.PUSH_START");
        } else {
            intent.setClass(this.n, this.n.getClass());
            intent.setAction("com.dianping.push.RECONNECT");
            intent2.setClass(this.n, this.n.getClass());
            intent2.setAction("com.dianping.push.START");
        }
        intent.putExtra("source", "reconnect_pending_intent");
        intent2.putExtra("source", "check_alive_pending_intent");
        this.p = PendingIntent.getService(this.n, 0, intent, 0);
        this.q = PendingIntent.getService(this.n, 0, intent2, 0);
        try {
            this.e = (ConnectivityManager) service.getSystemService("connectivity");
        } catch (NullPointerException unused) {
            g();
            this.n.stopSelf();
        }
        this.f = new c(this.n);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "342de5e326a8e61c841acf896bf35668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "342de5e326a8e61c841acf896bf35668");
        } else if (d()) {
            k();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a386e2beb6b8ccf49d0dd54e0ea840a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a386e2beb6b8ccf49d0dd54e0ea840a5");
            return;
        }
        try {
            this.o.setRepeating(2, DDLoadConstants.TIME_HOURS_MILLIS + SystemClock.elapsedRealtime(), DDLoadConstants.TIME_HOURS_MILLIS, this.q);
        } catch (Exception unused2) {
        }
    }

    @Override // com.dianping.base.push.pushservice.dp.a
    public final int a(Service service, Intent intent, int i, int i2) {
        Object[] objArr = {service, intent, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2399dd97a7de645e1c45d493fb32180b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2399dd97a7de645e1c45d493fb32180b")).intValue();
        }
        new StringBuilder("Service started with intent=").append(intent);
        c("Service started with intent=" + intent);
        if (intent != null) {
            if ("com.dianping.push.STOP".equals(intent.getAction())) {
                g();
                this.n.stopSelf();
            } else if ("com.dianping.push.START".equals(intent.getAction()) || "com.dianping.action.PUSHSERVICE".equals(intent.getAction())) {
                d(com.sankuai.waimai.platform.utils.f.a(intent, "source"));
            } else if ("com.dianping.push.KEEP_ALIVE".equals(intent.getAction())) {
                j();
            } else if ("com.dianping.push.RECONNECT".equals(intent.getAction())) {
                if (!DPPushService.a(2) && f.i) {
                    service.stopSelf();
                } else {
                    m();
                }
            }
        }
        return 1;
    }

    @Override // com.dianping.base.push.pushservice.dp.a
    public final void b(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e7f4634f7a84ab7daa0f14c26493b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e7f4634f7a84ab7daa0f14c26493b2");
            return;
        }
        StringBuilder sb = new StringBuilder("Service onDestroy (started=");
        sb.append(DPPushService.a(2));
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        c("Service onDestroy (started=" + DPPushService.a(2) + CommonConstant.Symbol.BRACKET_RIGHT);
        if (DPPushService.a(2)) {
            g();
        }
        this.b.removeCallbacks(this.A);
        com.dianping.base.push.pushservice.util.d.a(this.n, 3);
        this.n = null;
        if (this.r != null) {
            this.r.shutdown();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6417a5d7a46f0958ed00ebea7ca281f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6417a5d7a46f0958ed00ebea7ca281f");
        } else {
            com.dianping.base.push.pushservice.c.b("PushServiceImpl", str);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2157c066660adccb8296a674238e473", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2157c066660adccb8296a674238e473")).booleanValue();
        }
        try {
            com.dianping.base.push.pushservice.d a2 = com.dianping.base.push.pushservice.d.a(this.n);
            Object[] objArr2 = {"isConnectionStarted", (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.base.push.pushservice.d.a;
            return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a5e935d5106d0cfc590b037c067d947f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a5e935d5106d0cfc590b037c067d947f")).booleanValue() : a2.b.b("isConnectionStarted", false);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e.toString());
            return false;
        }
    }

    private synchronized void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c1f31a71b6b120bd7e384022a7d356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c1f31a71b6b120bd7e384022a7d356");
            return;
        }
        c("source:" + str + " start pushservice");
        this.b.removeCallbacks(this.A);
        if (TextUtils.isEmpty(this.t)) {
            this.t = str;
        }
        this.b.post(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35eb7f8cdd544fdb4d484aacb9d89595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35eb7f8cdd544fdb4d484aacb9d89595");
            return;
        }
        try {
            this.n.unregisterReceiver(this.h);
            e.a(this.u).b(GetUUID.REGISTER, 0);
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f99cd5259edc6621df0c3efc9c97c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f99cd5259edc6621df0c3efc9c97c8f");
            return;
        }
        do {
            a2 = DPPushService.a();
            if ((a2 & 4) > 0) {
                return;
            }
        } while (!DPPushService.a(a2, a2 | 4));
        synchronized (this) {
            if (this.g == null) {
                this.g = new a();
            }
            com.sankuai.waimai.launcher.util.aop.b.a(com.dianping.base.push.pushservice.util.h.a(), this.g);
        }
    }

    private synchronized void g() {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eed5a2709f9f7ec0765c175f9585aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eed5a2709f9f7ec0765c175f9585aa4");
            return;
        }
        do {
            a2 = DPPushService.a();
            if ((a2 & 2) <= 0) {
                c("Attempt to stop connection not active.");
                return;
            }
        } while (!DPPushService.a(a2, a2 & (-3)));
        try {
            com.dianping.base.push.pushservice.d.a(this.n).a("isConnectionStarted", false);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e.toString());
        }
        try {
            e();
        } catch (Exception e2) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e2.toString());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c2aacbdb6faf679c08075fa1ab5f00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c2aacbdb6faf679c08075fa1ab5f00f");
        } else {
            try {
                this.o.cancel(this.p);
            } catch (Exception unused) {
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0c87bbee1aeaf7ec15bbea7a7cb0e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0c87bbee1aeaf7ec15bbea7a7cb0e46");
        } else {
            try {
                this.o.cancel(this.q);
            } catch (Exception unused2) {
            }
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a();
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a28c1bc89da46c9f6b5e868c3409c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a28c1bc89da46c9f6b5e868c3409c9");
            return;
        }
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e99c2ec9bdbfbbae6a6903afd8515a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e99c2ec9bdbfbbae6a6903afd8515a");
            return;
        }
        final a aVar = this.g;
        if (DPPushService.a(2) && aVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "932c339251563ee10836b919fca9fa42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "932c339251563ee10836b919fca9fa42");
                return;
            }
            if (d.this.r == null) {
                d.this.r = com.sankuai.android.jarvis.c.a("dppush-keepalive");
            }
            d.this.r.submit(new Runnable() { // from class: com.dianping.base.push.pushservice.dp.impl3v8.d.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "081228a5667804b235afba5c58602b6f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "081228a5667804b235afba5c58602b6f");
                        return;
                    }
                    Socket socket = a.this.b;
                    try {
                        String a2 = d.this.f.a(6);
                        d.a("start to send heartbeat, request string is " + a2);
                        d.c("start to send heartbeat, request string is " + a2);
                        a.this.d = SystemClock.elapsedRealtime();
                        com.dianping.base.push.pushservice.dp.impl3v8.b.a(socket.getOutputStream(), 1, a2);
                        socket.setSoTimeout(a.this.c);
                        d.a("Keep-alive sent.");
                        d.c("Keep-alive sent.");
                    } catch (Exception e) {
                        d.c(e.toString());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b775c314134afde1ff99fc205fca6cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b775c314134afde1ff99fc205fca6cd");
        } else if (y) {
        } else {
            y = true;
            long l = l();
            synchronized (this.B) {
                if (this.x == null) {
                    this.x = com.sankuai.android.jarvis.c.b("dppush-heartbeat", 1);
                }
                c("heartbeat executor start 3s later");
                this.x.scheduleAtFixedRate(this.z, PayTask.j, l, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da53957dbc642c1975a3c7c4675a993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da53957dbc642c1975a3c7c4675a993");
            return;
        }
        y = false;
        synchronized (this.B) {
            if (this.x != null) {
                this.x.shutdown();
                this.x = null;
                c("heartbeat executor shut down");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long l() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f28eb099376d1899cc69a95ed061ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f28eb099376d1899cc69a95ed061ef")).longValue();
        }
        try {
            j = com.dianping.base.push.pushservice.d.a(this.n).a("keepAliveInterval", 0) * 1000;
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushServiceImpl", e.toString());
            j = 0;
        }
        if (j == 0) {
            j = 240000;
        }
        c("heartbeat interval:" + j);
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbc04e64d69563ea250954b5970c5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbc04e64d69563ea250954b5970c5bb");
            return;
        }
        if (DPPushService.a(2) && this.g == null) {
            if (this.n != null) {
                i.b(this.n);
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private final WeakReference<d> b;

        private b(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8865fb9459751031e4e52064a032829f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8865fb9459751031e4e52064a032829f");
            } else {
                this.b = new WeakReference<>(dVar);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            int i;
            boolean z = true;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e58371f94fb43dc05e13af1dc018cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e58371f94fb43dc05e13af1dc018cf");
                return;
            }
            try {
                networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception e) {
                d.c(e.toString());
                networkInfo = null;
            }
            z = (networkInfo == null || !networkInfo.isConnected()) ? false : false;
            try {
                i = com.dianping.base.push.pushservice.d.a(context).a("lastNetworkType", -1);
            } catch (Exception e2) {
                d.c(e2.toString());
                i = 0;
            }
            d.a("Connecting changed: connected=" + z);
            d.c("Connecting changed: connected=" + z);
            d.a("Connecting changed: lastNetworkType=" + i);
            d.c("Connecting changed: lastNetworkType=" + i);
            if (z) {
                d.a("Connecting changed: activeNetworkType=" + networkInfo.getType());
                d.c("Connecting changed: activeNetworkType=" + networkInfo.getType());
                if (networkInfo.getType() != i || i == Integer.MAX_VALUE) {
                    d dVar = this.b.get();
                    if (dVar != null) {
                        dVar.h();
                    }
                    try {
                        com.dianping.base.push.pushservice.d.a(context).b("lastNetworkType", networkInfo.getType());
                    } catch (Exception e3) {
                        d.c(e3.toString());
                    }
                    if (Build.VERSION.SDK_INT < 24 || dVar == null) {
                        return;
                    }
                    dVar.m();
                    return;
                }
                return;
            }
            try {
                com.dianping.base.push.pushservice.d.a(context).b("lastNetworkType", Integer.MAX_VALUE);
            } catch (Exception e4) {
                d.c(e4.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b49d21a2c5a51afdc11b6d5739c5603", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b49d21a2c5a51afdc11b6d5739c5603")).booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = this.e.getActiveNetworkInfo();
        } catch (Exception e) {
            c(e.toString());
        }
        return networkInfo != null && networkInfo.getType() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        Socket b;
        volatile int c;
        volatile long d;
        private volatile boolean f;
        private volatile int g;
        private volatile String h;
        private volatile int i;
        private volatile long j;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce36acd4a343cfb476d21fb2fec1b0a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce36acd4a343cfb476d21fb2fec1b0a1");
                return;
            }
            this.f = false;
            this.c = 30000;
            this.g = 2;
            this.h = "";
            this.i = 0;
            this.d = 0L;
            this.j = 0L;
        }

        private boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d45595083e530fb52f45c226d67e358", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d45595083e530fb52f45c226d67e358")).booleanValue();
            }
            try {
                NetworkInfo activeNetworkInfo = d.this.e.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
                return false;
            } catch (Exception e) {
                d.c(e.toString());
                return false;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.lang.Runnable
        public final void run() {
            /*
                Method dump skipped, instructions count: 2438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.dp.impl3v8.d.a.run():void");
        }

        private void a(Socket socket) throws SocketException {
            Object[] objArr = {socket};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa7cddadb1977ab3281b132bc92ec04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa7cddadb1977ab3281b132bc92ec04");
                return;
            }
            long l = d.this.l();
            socket.setSoTimeout((int) (this.c + l));
            d.c("set read timeout =" + (l + this.c));
        }

        private void a(String str, int i, int i2, String str2, String str3) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0466fe69e79568f67c9584cb25047ef4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0466fe69e79568f67c9584cb25047ef4");
            } else if (f.a() != null) {
                f.a().pv4(0L, str, 0, 1, i, 0, 0, i2, str2, str3, 1);
            }
        }

        private void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af48f689c78b0d614b366008ace4c65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af48f689c78b0d614b366008ace4c65");
                return;
            }
            try {
                if (com.dianping.base.push.pushservice.d.a(d.this.n).a("serverTimeout", this.c) > 0) {
                    this.c = com.dianping.base.push.pushservice.d.a(d.this.n).a("serverTimeout", this.c);
                }
            } catch (Exception e) {
                d.c(e.toString());
            }
        }

        private ArrayList<String> d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6dee4d78954940443b7dc853e648090", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6dee4d78954940443b7dc853e648090");
            }
            ArrayList<String> arrayList = new ArrayList<>();
            if (d.this.n != null) {
                String str = null;
                try {
                    str = com.dianping.base.push.pushservice.d.a(d.this.n).a("pushServerList", "");
                } catch (Exception e) {
                    d.c(e.toString());
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.addAll(Arrays.asList(str.split(";")));
                }
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.net.Socket a(java.lang.String r22, int r23, boolean r24) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.dp.impl3v8.d.a.a(java.lang.String, int, boolean):java.net.Socket");
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6fdd499d079a3a8e2568ec6c340b8a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6fdd499d079a3a8e2568ec6c340b8a5");
                return;
            }
            d.a("Connection aborting.");
            d.c("Connection aborting.");
            this.f = true;
            try {
                this.b.shutdownOutput();
                this.b.shutdownInput();
                this.b.close();
            } catch (Exception e) {
                d.c(e.toString());
            }
        }

        private void e() {
            int a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bbc0aa21f95f1455483fd03fc70bb09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bbc0aa21f95f1455483fd03fc70bb09");
                return;
            }
            do {
                a2 = DPPushService.a();
                if ((a2 & 4) <= 0 && (a2 & 8) <= 0) {
                    return;
                }
            } while (!DPPushService.a(a2, a2 & (-5) & (-9)));
            synchronized (d.this) {
                d.a(d.this, (a) null);
            }
        }
    }
}
