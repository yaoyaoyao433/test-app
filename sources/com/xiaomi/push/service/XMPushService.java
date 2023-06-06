package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import com.xiaomi.push.da;
import com.xiaomi.push.ds;
import com.xiaomi.push.dy;
import com.xiaomi.push.em;
import com.xiaomi.push.eq;
import com.xiaomi.push.ey;
import com.xiaomi.push.fa;
import com.xiaomi.push.fb;
import com.xiaomi.push.fd;
import com.xiaomi.push.fj;
import com.xiaomi.push.fn;
import com.xiaomi.push.fo;
import com.xiaomi.push.fq;
import com.xiaomi.push.fs;
import com.xiaomi.push.ft;
import com.xiaomi.push.fy;
import com.xiaomi.push.gb;
import com.xiaomi.push.gc;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gh;
import com.xiaomi.push.gm;
import com.xiaomi.push.gt;
import com.xiaomi.push.gv;
import com.xiaomi.push.gy;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hx;
import com.xiaomi.push.ib;
import com.xiaomi.push.ik;
import com.xiaomi.push.iq;
import com.xiaomi.push.jj;
import com.xiaomi.push.jn;
import com.xiaomi.push.jr;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.ci;
import com.xiaomi.push.service.receivers.BatteryReceiver;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public class XMPushService extends Service implements fq {
    private static boolean q = false;
    private ContentObserver A;
    public fn c;
    ce d;
    private n h;
    private fo i;
    private aq j;
    private String k;
    private f l;
    private u m;
    private k n;
    private BatteryReceiver o;
    private a p;
    private s r;
    private fj u;
    private ContentObserver z;
    private boolean g = false;
    private int s = 0;
    private int t = 0;
    long a = 0;
    protected Class b = XMJobService.class;
    private ae v = null;
    private ci w = null;
    Messenger e = null;
    private Collection<com.xiaomi.push.service.q> x = Collections.synchronizedCollection(new ArrayList());
    ArrayList<o> f = new ArrayList<>();
    private fs y = new bj(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b extends j {
        ag.b a;

        public b(ag.b bVar) {
            super(9);
            this.a = null;
            this.a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            try {
                if (XMPushService.this.b()) {
                    ag.b b = ag.a().b(this.a.h, this.a.b);
                    if (b == null) {
                        com.xiaomi.channel.commonutils.logger.c.a("ignore bind because the channel " + this.a.h + " is removed ");
                    } else if (b.m == ag.c.unbind) {
                        b.a(ag.c.binding, 0, 0, null, null);
                        XMPushService.this.c.a(b);
                        fa.a(XMPushService.this, b);
                    } else {
                        com.xiaomi.channel.commonutils.logger.c.a("trying duplicate bind, ingore! " + b.m);
                    }
                } else {
                    com.xiaomi.channel.commonutils.logger.c.d("trying bind while the connection is not created, quit!");
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("Meet error when trying to bind. " + e);
                XMPushService.this.a(10, e);
            } catch (Throwable unused) {
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "bind the client. " + this.a.h;
        }
    }

    /* loaded from: classes6.dex */
    static class c extends j {
        private final ag.b a;

        public c(ag.b bVar) {
            super(12);
            this.a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            this.a.a(ag.c.unbind, 1, 21, null, null);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "bind time out. chid=" + this.a.h;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).a.h, this.a.h);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.h.hashCode();
        }
    }

    /* loaded from: classes6.dex */
    public class e extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            if (XMPushService.this.a() && XMPushService.a(XMPushService.this, XMPushService.this.getApplicationContext())) {
                XMPushService.j(XMPushService.this);
            } else {
                com.xiaomi.channel.commonutils.logger.c.a("should not connect. quit the job.");
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "do reconnect..";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.c.a("network changed, " + jj.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* loaded from: classes6.dex */
    public class g extends j {
        public int a;
        public Exception b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i, Exception exc) {
            super(2);
            this.a = i;
            this.b = null;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            XMPushService.this.a(this.a, this.b);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "disconnect the connection.";
        }
    }

    /* loaded from: classes6.dex */
    class h extends j {
        h() {
            super(SupportMenu.USER_MASK);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            XMPushService.g(XMPushService.this);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "Init Job";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class i extends j {
        private Intent b;

        public i(Intent intent) {
            super(15);
            this.b = null;
            this.b = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            XMPushService.a(XMPushService.this, this.b);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "Handle intent action = " + this.b.getAction();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class j extends ci.b {
        public j(int i) {
            super(i);
        }

        public abstract void a();

        public abstract String b();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f != 4 && this.f != 8) {
                com.xiaomi.channel.commonutils.logger.c.a(com.xiaomi.channel.commonutils.logger.b.a, b());
            }
            a();
        }
    }

    /* loaded from: classes6.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.c.a("[HB] hold short heartbeat, " + jj.a(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* loaded from: classes6.dex */
    class n extends BroadcastReceiver {
        private n() {
        }

        /* synthetic */ n(XMPushService xMPushService, bj bjVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.c.a("[Guardian] parents guardian receiver ");
            XMPushService.this.p();
        }
    }

    /* loaded from: classes6.dex */
    public interface o {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class p extends j {
        boolean a;

        public p(boolean z) {
            super(4);
            this.a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            if (XMPushService.this.b()) {
                try {
                    if (!this.a) {
                        fa.a();
                    }
                    XMPushService.this.c.b(this.a);
                } catch (fy e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    XMPushService.this.a(10, e);
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "send ping..";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class q extends j {
        ag.b a;

        public q(ag.b bVar) {
            super(4);
            this.a = null;
            this.a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            try {
                this.a.a(ag.c.unbind, 1, 16, null, null);
                XMPushService.this.c.a(this.a.h, this.a.b);
                XMPushService.this.a(new b(this.a), 300L);
            } catch (fy e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
                XMPushService.this.a(10, e);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "rebind the client. " + this.a.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class r extends j {
        r() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.a() && XMPushService.a(XMPushService.this, XMPushService.this.getApplicationContext())) {
                XMPushService.j(XMPushService.this);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "reset the connection.";
        }
    }

    /* loaded from: classes6.dex */
    class s extends BroadcastReceiver {
        s() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class t extends j {
        ag.b a;
        int b;
        String c;
        String d;

        public t(ag.b bVar, int i, String str, String str2) {
            super(9);
            this.a = null;
            this.a = bVar;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            if (this.a.m != ag.c.unbind && XMPushService.this.c != null) {
                try {
                    XMPushService.this.c.a(this.a.h, this.a.b);
                } catch (fy e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    XMPushService.this.a(10, e);
                }
            }
            this.a.a(ag.c.unbind, this.b, 0, this.d, this.c);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "unbind the channel. " + this.a.h;
        }
    }

    /* loaded from: classes6.dex */
    class u extends BroadcastReceiver {
        u() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.g) {
                XMPushService.a(XMPushService.this, true);
            }
            com.xiaomi.channel.commonutils.logger.c.a("[HB] wifi changed, " + jj.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ fn a(XMPushService xMPushService, fn fnVar) {
        xMPushService.c = null;
        return null;
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.c.a(e2);
            }
        }
    }

    private void a(o oVar) {
        synchronized (this.f) {
            this.f.add(oVar);
        }
    }

    private static boolean a(Context context) {
        try {
            com.xiaomi.push.s.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (com.xiaomi.push.al.b(context)) {
                    com.xiaomi.channel.commonutils.logger.c.a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    static /* synthetic */ boolean a(XMPushService xMPushService, Context context) {
        return a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(XMPushService xMPushService, boolean z) {
        xMPushService.g = true;
        return true;
    }

    private void b(j jVar) {
        this.w.a(jVar);
    }

    private void c(boolean z) {
        try {
            if (jr.c()) {
                if (!z) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                    return;
                }
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (com.xiaomi.push.service.q qVar : (com.xiaomi.push.service.q[]) this.x.toArray(new com.xiaomi.push.service.q[0])) {
                    qVar.a();
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a(e2);
        }
    }

    public static boolean c() {
        return q;
    }

    private static String e() {
        String a2 = jj.a("ro.miui.region");
        return TextUtils.isEmpty(a2) ? jj.a("ro.product.locale.region") : a2;
    }

    private String f() {
        String e2;
        com.xiaomi.push.s.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String str = null;
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            an a2 = an.a(this);
            String str2 = null;
            int i3 = 0;
            while (true) {
                if (!TextUtils.isEmpty(str2) && a2.a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = e();
                }
                try {
                    synchronized (obj) {
                        if (i3 < 30) {
                            obj.wait(1000L);
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i3++;
            }
            e2 = str2;
            i2 = i3;
        } else {
            e2 = jj.e();
        }
        if (!TextUtils.isEmpty(e2)) {
            com.xiaomi.push.service.b.a(getApplicationContext()).a(e2);
            str = jj.b(e2).name();
        }
        com.xiaomi.channel.commonutils.logger.c.a("wait region :" + str + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " , count = " + i2);
        return str;
    }

    private boolean g() {
        if (SystemClock.elapsedRealtime() - this.a < 30000) {
            return false;
        }
        return com.xiaomi.push.al.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.Secure.getInt(getContentResolver(), "EXTREME_POWER_MODE_ENABLE", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    private boolean j() {
        return "com.xiaomi.xmsf".equals(getPackageName()) || !co.a(this).b(getPackageName());
    }

    private boolean k() {
        try {
            Class<?> a2 = jr.a(this, "miui.os.Build");
            Field field = a2.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = a2.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = a2.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!a()) {
            em.a();
        } else if (em.b()) {
        } else {
            em.a(true);
        }
    }

    private boolean m() {
        return this.c != null && this.c.j();
    }

    private boolean n() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && o() && !hf.j(this) && !hf.i(getApplicationContext());
    }

    private boolean o() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        if (this.s > this.t) {
            if (intValue >= this.s || intValue < this.t) {
                return true;
            }
        } else if (this.s < this.t && intValue >= this.s && intValue < this.t) {
            return true;
        }
        return false;
    }

    public final void a(int i2) {
        this.w.b(i2);
    }

    public final void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        sb.append(this.c == null ? null : Integer.valueOf(this.c.hashCode()));
        com.xiaomi.channel.commonutils.logger.c.a(sb.toString());
        if (this.c != null) {
            this.c.b(i2, exc);
            this.c = null;
        }
        a(7);
        a(4);
        ag.a().a(this, i2);
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar) {
        com.xiaomi.channel.commonutils.logger.c.c("begin to connect...");
        ey.a().a(fnVar);
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, int i2, Exception exc) {
        ey.a().a(fnVar, i2, exc);
        if (n()) {
            return;
        }
        b(false);
    }

    @Override // com.xiaomi.push.fq
    public final void a(fn fnVar, Exception exc) {
        ey.a().a(fnVar, exc);
        c(false);
        if (n()) {
            return;
        }
        b(false);
    }

    public final void a(j jVar, long j2) {
        try {
            this.w.a(jVar, j2);
        } catch (IllegalStateException e2) {
            com.xiaomi.channel.commonutils.logger.c.a("can't execute job err = " + e2.getMessage());
        }
    }

    void a(boolean z) {
        this.a = SystemClock.elapsedRealtime();
        if (!b()) {
            b(true);
        } else if (com.xiaomi.push.al.a(this)) {
            b(new p(z));
        } else {
            b(new g(17, null));
            b(true);
        }
    }

    public final boolean a() {
        boolean a2 = com.xiaomi.push.al.a(this);
        boolean z = ag.a().c() > 0;
        boolean z2 = !k();
        boolean j2 = j();
        boolean z3 = !i();
        boolean z4 = !h();
        boolean z5 = a2 && z && z2 && j2 && z3 && z4;
        if (!z5) {
            com.xiaomi.channel.commonutils.logger.c.f(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;!eps=%s", Boolean.valueOf(a2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(j2), Boolean.valueOf(z3), Boolean.valueOf(z4)));
        }
        return z5;
    }

    public final void b(boolean z) {
        this.j.a(z);
    }

    public final boolean b() {
        return this.c != null && this.c.k();
    }

    public final boolean b(int i2) {
        return this.w.a(1);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.e.getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends BroadcastReceiver {
        private final Object b;

        private a() {
            this.b = new Object();
        }

        /* synthetic */ a(XMPushService xMPushService, bj bjVar) {
            this();
        }

        private void a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.c.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.b) {
                try {
                    this.b.wait(PayTask.j);
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.c.a("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.c.c("[Alarm] heartbeat alarm has been triggered.");
            if (!ak.q.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.c.a("[Alarm] cancel the old ping timer");
                em.a();
            } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.c.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.putExtra(AtMeInfo.TIME_STAMP, System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    com.xiaomi.push.service.a.a(context).a(intent2);
                    a(PayTask.j);
                    com.xiaomi.channel.commonutils.logger.c.a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        static /* synthetic */ void a(a aVar) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.c.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (aVar.b) {
                try {
                    aVar.b.notifyAll();
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a("[Alarm] notify lock. " + e);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    class d extends j {
        private fb b;

        public d(fb fbVar) {
            super(8);
            this.b = null;
            this.b = fbVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            String str;
            ag a;
            ag.b b;
            ae aeVar = XMPushService.this.v;
            fb fbVar = this.b;
            if (5 != fbVar.c()) {
                String h = fbVar.h();
                String num = Integer.toString(fbVar.c());
                if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(num) && (b = ag.a().b(num, h)) != null) {
                    gt.a(aeVar.a, b.a, fbVar.j(), true, true, System.currentTimeMillis());
                }
            }
            try {
                String a2 = fbVar.a();
                if (fbVar.c() != 0) {
                    String num2 = Integer.toString(fbVar.c());
                    if ("SECMSG".equals(fbVar.a())) {
                        if (!fbVar.d()) {
                            aeVar.a.d.a(aeVar.a, num2, fbVar);
                            return;
                        }
                        str = "Recv SECMSG errCode = " + fbVar.e() + " errStr = " + fbVar.f();
                    } else if (!"BIND".equals(a2)) {
                        if ("KICK".equals(a2)) {
                            da.g gVar = (da.g) new da.g().b(fbVar.i());
                            String h2 = fbVar.h();
                            String str2 = gVar.a;
                            String str3 = gVar.b;
                            com.xiaomi.channel.commonutils.logger.c.a("kicked by server, chid=" + num2 + " res= " + ag.b.a(h2) + " type=" + str2 + " reason=" + str3);
                            if (!"wait".equals(str2)) {
                                aeVar.a.a(num2, h2, 3, str3, str2);
                                ag.a().a(num2, h2);
                                return;
                            }
                            ag.b b2 = ag.a().b(num2, h2);
                            if (b2 != null) {
                                aeVar.a.a(b2);
                                b2.a(ag.c.unbind, 3, 0, str3, str2);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        da.d dVar = (da.d) new da.d().b(fbVar.i());
                        String h3 = fbVar.h();
                        ag.b b3 = ag.a().b(num2, h3);
                        if (b3 == null) {
                            return;
                        }
                        if (dVar.a) {
                            com.xiaomi.channel.commonutils.logger.c.a("SMACK: channel bind succeeded, chid=" + fbVar.c());
                            b3.a(ag.c.binded, 1, 0, null, null);
                            return;
                        }
                        String str4 = dVar.b;
                        if ("auth".equals(str4)) {
                            if ("invalid-sig".equals(dVar.c)) {
                                com.xiaomi.channel.commonutils.logger.c.a("SMACK: bind error invalid-sig token = " + b3.c + " sec = " + b3.i);
                                fa.a(0, eq.BIND_INVALID_SIG.af, 1, null, 0);
                            }
                            b3.a(ag.c.unbind, 1, 5, dVar.c, str4);
                            a = ag.a();
                        } else if ("cancel".equals(str4)) {
                            b3.a(ag.c.unbind, 1, 7, dVar.c, str4);
                            a = ag.a();
                        } else {
                            if ("wait".equals(str4)) {
                                aeVar.a.a(b3);
                                b3.a(ag.c.unbind, 1, 7, dVar.c, str4);
                            }
                            str = "SMACK: channel bind failed, chid=" + num2 + " reason=" + dVar.c;
                        }
                        a.a(num2, h3);
                        str = "SMACK: channel bind failed, chid=" + num2 + " reason=" + dVar.c;
                    }
                } else if (CSCallUris.SVID_CALL_PING.equals(a2)) {
                    byte[] i = fbVar.i();
                    if (i != null && i.length > 0) {
                        da.j jVar = (da.j) new da.j().b(i);
                        if (jVar.a) {
                            av.a().a(jVar.b);
                        }
                    }
                    if (!"com.xiaomi.xmsf".equals(aeVar.a.getPackageName())) {
                        XMPushService xMPushService = aeVar.a;
                        if (SystemClock.elapsedRealtime() - xMPushService.a >= ft.b() && com.xiaomi.push.al.c(xMPushService)) {
                            xMPushService.a(true);
                        }
                    }
                    if ("1".equals(fbVar.g())) {
                        com.xiaomi.channel.commonutils.logger.c.a("received a server ping");
                    } else {
                        fa.b();
                    }
                    XMPushService xMPushService2 = aeVar.a;
                    dy.a(xMPushService2.getApplicationContext()).a.e();
                    Iterator it = new ArrayList(xMPushService2.f).iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).a();
                    }
                    return;
                } else if ("SYNC".equals(a2)) {
                    if ("CONF".equals(fbVar.b())) {
                        av.a().a(da.b.a(fbVar.i()));
                        return;
                    } else if (TextUtils.equals("U", fbVar.b())) {
                        da.k kVar = (da.k) new da.k().b(fbVar.i());
                        com.xiaomi.push.cj a3 = com.xiaomi.push.cj.a(aeVar.a);
                        a3.a.add(new com.xiaomi.push.ck(a3, kVar.f * 1024, new Date(kVar.c), new Date(kVar.d), kVar.a, kVar.b, kVar.e));
                        a3.a(0L);
                        fb fbVar2 = new fb();
                        fbVar2.a(0);
                        fbVar2.a(fbVar.a(), "UCA");
                        fbVar2.a(fbVar.g());
                        aeVar.a.a(new at(aeVar.a, fbVar2), 0L);
                        return;
                    } else if (!TextUtils.equals("P", fbVar.b())) {
                        return;
                    } else {
                        da.i iVar = (da.i) new da.i().b(fbVar.i());
                        fb fbVar3 = new fb();
                        fbVar3.a(0);
                        fbVar3.a(fbVar.a(), "PCA");
                        fbVar3.a(fbVar.g());
                        da.i iVar2 = new da.i();
                        if (iVar.a) {
                            iVar2.a(iVar.b);
                        }
                        fbVar3.a(iVar2.d(), (String) null);
                        aeVar.a.a(new at(aeVar.a, fbVar3), 0L);
                        str = "ACK msgP: id = " + fbVar.g();
                    }
                } else if (!CSCallUris.SVID_CALL_NOTIFY.equals(fbVar.a())) {
                    return;
                } else {
                    da.h hVar = (da.h) new da.h().b(fbVar.i());
                    str = "notify by server err = " + hVar.a + " desc = " + hVar.b;
                }
                com.xiaomi.channel.commonutils.logger.c.a(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a("handle Blob chid = " + fbVar.c() + " cmd = " + fbVar.a() + " packetid = " + fbVar.g() + " failure ", e);
            }
        }
    }

    /* loaded from: classes6.dex */
    class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            ci ciVar = XMPushService.this.w;
            com.xiaomi.channel.commonutils.logger.c.a("quit. finalizer:" + ciVar.b);
            ciVar.a.a();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] split;
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.c.a(getApplicationContext());
        jr.a(this);
        cm a2 = cn.a(this);
        if (a2 != null) {
            com.xiaomi.push.e.a(a2.g);
        }
        if (jj.a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.p = new a(this, null);
            registerReceiver(this.p, new IntentFilter(ak.q), null, handler);
            q = true;
            handler.post(new bq(this));
        }
        this.e = new Messenger(new br(this));
        al alVar = new al(this);
        av.a().a(alVar);
        synchronized (com.xiaomi.push.by.class) {
            com.xiaomi.push.by.a(alVar);
            com.xiaomi.push.by.a(this, null, new al.a(), "0", "push", "2.2");
        }
        this.i = new bs(this, null, 5222, "xiaomi.com", null);
        this.i.f = true;
        this.u = new fj(this, this.i);
        this.d = new ce();
        em.a(this);
        fj fjVar = this.u;
        if (!fjVar.g.contains(this)) {
            fjVar.g.add(this);
        }
        this.v = new ae(this);
        this.j = new aq(this);
        gm.a().a.put(gm.b("all", "xm:chat"), new cf());
        ey.a.a.a(this);
        this.w = new ci("Connection Controller Thread");
        ag a3 = ag.a();
        a3.e();
        a3.a(new bt(this));
        if (!TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            z.a(this).a(hg.ForegroundServiceSwitch.by, false);
        }
        gy a4 = gy.a(this);
        ck ckVar = new ck(this);
        if (TextUtils.isEmpty("UPLOADER_PUSH_CHANNEL")) {
            com.xiaomi.channel.commonutils.logger.c.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            a4.b.put("UPLOADER_PUSH_CHANNEL", ckVar);
        }
        a(new gv(this));
        a(new bh(this));
        if (jj.a(this)) {
            a(new af());
        }
        a(new h(), 0L);
        this.x.add(ax.a(this));
        if (j()) {
            this.l = new f();
            registerReceiver(this.l, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (jj.a(getApplicationContext())) {
            this.m = new u();
            registerReceiver(this.m, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null);
            this.n = new k();
            registerReceiver(this.n, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null);
            HandlerThread handlerThread2 = new HandlerThread("battery_thread");
            handlerThread2.start();
            Handler handler2 = new Handler(handlerThread2.getLooper());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            registerReceiver(this.o, intentFilter, null, handler2);
            HandlerThread handlerThread3 = new HandlerThread("guardian_thread");
            handlerThread3.start();
            Handler handler3 = new Handler(handlerThread3.getLooper());
            this.h = new n(this, null);
            registerReceiver(this.h, new IntentFilter(ak.p), "com.miui.greenguard.permission.RECV_PARENTS_GUARDIAN", handler3);
            p();
        }
        dy.a(getApplicationContext());
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.Secure.getUriFor("EXTREME_POWER_MODE_ENABLE");
            if (uriFor != null) {
                this.z = new bu(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.z);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.a("register observer err:" + th.getMessage());
                }
            }
            Uri uriFor2 = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor2 != null) {
                this.A = new bv(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor2, false, this.A);
                } catch (Throwable th2) {
                    com.xiaomi.channel.commonutils.logger.c.d("register super-power-mode observer err:" + th2.getMessage());
                }
            }
            int[] d2 = d();
            if (d2 != null) {
                this.r = new s();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.SCREEN_ON");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.r, intentFilter2);
                this.s = d2[0];
                this.t = d2[1];
                com.xiaomi.channel.commonutils.logger.c.a("falldown initialized: " + this.s + CommonConstant.Symbol.COMMA + this.t);
            }
        }
        String str = "";
        if (a2 != null) {
            try {
                if (!TextUtils.isEmpty(a2.a) && (split = a2.a.split("@")) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        com.xiaomi.push.ch.a(this);
        com.xiaomi.channel.commonutils.logger.c.f("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + fd.b(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    /* loaded from: classes6.dex */
    class m extends j {
        private gf b;

        public m(gf gfVar) {
            super(8);
            this.b = null;
            this.b = gfVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final String b() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public final void a() {
            String str;
            String str2;
            ag.b b;
            ae aeVar = XMPushService.this.v;
            gf gfVar = this.b;
            if (!"5".equals(gfVar.t)) {
                String str3 = gfVar.r;
                String str4 = gfVar.t;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && (b = ag.a().b(str4, str3)) != null) {
                    gt.a(aeVar.a, b.a, gt.b(gfVar.b()), true, true, System.currentTimeMillis());
                }
            }
            String str5 = gfVar.t;
            if (TextUtils.isEmpty(str5)) {
                str5 = "1";
                gfVar.t = "1";
            }
            if (str5.equals("0")) {
                com.xiaomi.channel.commonutils.logger.c.a("Received wrong packet with chid = 0 : " + gfVar.b());
            }
            boolean z = gfVar instanceof gc;
            if (z) {
                gb a = gfVar.a("kick");
                if (a != null) {
                    String str6 = gfVar.r;
                    String a2 = a.a("type");
                    String a3 = a.a("reason");
                    com.xiaomi.channel.commonutils.logger.c.a("kicked by server, chid=" + str5 + " res=" + ag.b.a(str6) + " type=" + a2 + " reason=" + a3);
                    if (!"wait".equals(a2)) {
                        aeVar.a.a(str5, str6, 3, a3, a2);
                        ag.a().a(str5, str6);
                        return;
                    }
                    ag.b b2 = ag.a().b(str5, str6);
                    if (b2 != null) {
                        aeVar.a.a(b2);
                        b2.a(ag.c.unbind, 3, 0, a3, a2);
                        return;
                    }
                    return;
                }
            } else if (gfVar instanceof gd) {
                gd gdVar = (gd) gfVar;
                if ("redir".equals(gdVar.a)) {
                    gb a4 = gdVar.a("hosts");
                    if (a4 != null) {
                        String a5 = a4.a();
                        if (TextUtils.isEmpty(a5)) {
                            return;
                        }
                        String[] split = a5.split(";");
                        com.xiaomi.push.bu a6 = com.xiaomi.push.by.a().a(fo.a(), false);
                        if (a6 == null || split.length <= 0) {
                            return;
                        }
                        a6.a(split);
                        aeVar.a.a(20, (Exception) null);
                        aeVar.a.b(true);
                        return;
                    }
                    return;
                }
            }
            ce ceVar = aeVar.a.d;
            XMPushService xMPushService = aeVar.a;
            ag.b a7 = ce.a(gfVar);
            if (a7 != null) {
                if ("5".equalsIgnoreCase(str5)) {
                    cr.a(xMPushService, gfVar, a7);
                    return;
                }
                String str7 = a7.a;
                if (gfVar instanceof gd) {
                    str2 = "com.xiaomi.push.new_msg";
                } else if (z) {
                    str2 = "com.xiaomi.push.new_iq";
                } else if (gfVar instanceof gh) {
                    str2 = "com.xiaomi.push.new_pres";
                } else {
                    str = "unknown packet type, drop it";
                }
                Intent intent = new Intent();
                intent.setAction(str2);
                intent.setPackage(str7);
                intent.putExtra("ext_chid", str5);
                intent.putExtra("ext_packet", gfVar.a());
                intent.putExtra(ak.G, a7.j);
                intent.putExtra(ak.y, a7.i);
                com.xiaomi.channel.commonutils.logger.c.a(String.format("[Bcst] notify packet arrival. %s,%s,%s", a7.h, a7.a, gfVar.d()));
                ce.a(xMPushService, intent, a7);
                return;
            }
            str = "error while notify channel closed! channel " + str5 + " not registered";
            com.xiaomi.channel.commonutils.logger.c.d(str);
        }
    }

    private int[] d() {
        String[] split;
        String a2 = z.a(getApplicationContext()).a(hg.FallDownTimeRange.by, "");
        if (!TextUtils.isEmpty(a2) && (split = a2.split(CommonConstant.Symbol.COMMA)) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                iArr[1] = Integer.valueOf(split[1]).intValue();
                if (iArr[0] >= 0 && iArr[0] <= 23 && iArr[1] >= 0 && iArr[1] <= 23) {
                    if (iArr[0] != iArr[1]) {
                        return iArr;
                    }
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.c.d("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.c.d("onStart() with intent NULL");
        } else {
            com.xiaomi.channel.commonutils.logger.c.a(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), com.sankuai.waimai.platform.utils.f.a(intent, ak.u), com.sankuai.waimai.platform.utils.f.a(intent, ak.C), com.sankuai.waimai.platform.utils.f.a(intent, "mipush_app_package")));
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                ci.c cVar = this.w.a;
                if ((!cVar.b || SystemClock.uptimeMillis() - cVar.a <= 600000) ? false : false) {
                    com.xiaomi.channel.commonutils.logger.c.d("ERROR, the job controller is blocked.");
                    ag.a().a(this, 14);
                    stopSelf();
                } else {
                    a(new i(intent), 0L);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                a(new i(intent), 0L);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.c.c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    private void a(Intent intent) {
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, ak.C);
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, ak.G);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        gd[] gdVarArr = new gd[parcelableArrayExtra.length];
        com.sankuai.waimai.platform.utils.f.a(intent, "ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            gdVarArr[i2] = new gd((Bundle) parcelableArrayExtra[i2]);
            gdVarArr[i2] = (gd) a(gdVarArr[i2], a2, a3);
            if (gdVarArr[i2] == null) {
                return;
            }
        }
        ag a4 = ag.a();
        fb[] fbVarArr = new fb[gdVarArr.length];
        for (int i3 = 0; i3 < gdVarArr.length; i3++) {
            gd gdVar = gdVarArr[i3];
            fbVarArr[i3] = fb.a(gdVar, a4.b(gdVar.t, gdVar.s).i);
        }
        b(new bd(this, fbVarArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, byte[] bArr, boolean z) {
        Collection<ag.b> c2 = ag.a().c("5");
        if (c2.isEmpty()) {
            if (z) {
                cq.b(str, bArr);
            }
        } else if (c2.iterator().next().m == ag.c.binded) {
            a(new bl(this, 4, str, bArr), 0L);
        } else if (z) {
            cq.b(str, bArr);
        }
    }

    public final void a(byte[] bArr, String str) {
        if (bArr == null) {
            cq.a(this, str, bArr, 70000003, "null payload");
            com.xiaomi.channel.commonutils.logger.c.a("register request without payload");
            return;
        }
        hx hxVar = new hx();
        try {
            ik.a(hxVar, bArr);
            if (hxVar.a != ha.Registration) {
                cq.a(this, str, bArr, 70000003, " registration action required.");
                com.xiaomi.channel.commonutils.logger.c.a("register request with invalid payload");
                return;
            }
            ib ibVar = new ib();
            try {
                ik.a(ibVar, hxVar.a());
                a(new cp(this, hxVar.f, ibVar.d, ibVar.g, bArr), 0L);
                ds.a(getApplicationContext()).a(hxVar.f, "E100003", ibVar.c, 6002, null);
            } catch (iq e2) {
                com.xiaomi.channel.commonutils.logger.c.d("app register error. " + e2);
                cq.a(this, str, bArr, 70000003, " data action error.");
            }
        } catch (iq e3) {
            com.xiaomi.channel.commonutils.logger.c.d("app register fail. " + e3);
            cq.a(this, str, bArr, 70000003, " data container error.");
        }
    }

    private gf a(gf gfVar, String str, String str2) {
        StringBuilder sb;
        ag a2 = ag.a();
        List<String> b2 = a2.b(str);
        if (b2.isEmpty()) {
            com.xiaomi.channel.commonutils.logger.c.a("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        gfVar.u = str;
        String str3 = gfVar.t;
        if (TextUtils.isEmpty(str3)) {
            str3 = b2.get(0);
            gfVar.t = str3;
        }
        ag.b b3 = a2.b(str3, gfVar.s);
        if (!b()) {
            sb = new StringBuilder("drop a packet as the channel is not connected, chid=");
        } else if (b3 != null && b3.m == ag.c.binded) {
            if (TextUtils.equals(str2, b3.j)) {
                return gfVar;
            }
            sb = new StringBuilder("invalid session. ");
            sb.append(str2);
            com.xiaomi.channel.commonutils.logger.c.a(sb.toString());
            return null;
        } else {
            sb = new StringBuilder("drop a packet as the channel is not opened, chid=");
        }
        sb.append(str3);
        com.xiaomi.channel.commonutils.logger.c.a(sb.toString());
        return null;
    }

    public final void a(String str, String str2, int i2, String str3, String str4) {
        ag.b b2 = ag.a().b(str, str2);
        if (b2 != null) {
            a(new t(b2, i2, str4, str3), 0L);
        }
        ag.a().a(str, str2);
    }

    private void a(String str, int i2) {
        Collection<ag.b> c2 = ag.a().c(str);
        if (c2 != null) {
            for (ag.b bVar : c2) {
                if (bVar != null) {
                    a(new t(bVar, i2, null, null), 0L);
                }
            }
        }
        ag.a().a(str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        if (this.l != null) {
            a(this.l);
            this.l = null;
        }
        if (this.m != null) {
            a(this.m);
            this.m = null;
        }
        if (this.n != null) {
            a(this.n);
            this.n = null;
        }
        if (this.h != null) {
            a(this.h);
            this.h = null;
        }
        if (this.r != null) {
            a(this.r);
            this.r = null;
        }
        if (this.o != null) {
            a(this.o);
            this.o = null;
        }
        if (this.p != null) {
            a(this.p);
            this.p = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.z != null) {
            try {
                getContentResolver().unregisterContentObserver(this.z);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.a("unregister observer err:" + th.getMessage());
            }
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.A != null) {
            try {
                getContentResolver().unregisterContentObserver(this.A);
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.c.d("unregister super-power-mode err:" + th2.getMessage());
            }
        }
        this.x.clear();
        ci ciVar = this.w;
        synchronized (ciVar.a) {
            ciVar.a.f.a();
        }
        a(new bm(this, 2), 0L);
        a(new l(), 0L);
        ag.a().e();
        ag.a().a(this, 15);
        ag.a().d();
        this.u.g.remove(this);
        av.a().b();
        em.a();
        synchronized (this.f) {
            this.f.clear();
        }
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.c.a("Service destroyed");
    }

    public final void a(ag.b bVar) {
        if (bVar != null) {
            long random = (((long) ((Math.random() * 20.0d) - 10.0d)) + ((bVar.n + 1) * 15)) * 1000;
            com.xiaomi.channel.commonutils.logger.c.a("schedule rebind job in " + (random / 1000));
            a(new b(bVar), random);
        }
    }

    public final void a(j jVar) {
        ci ciVar = this.w;
        int i2 = jVar.f;
        synchronized (ciVar.a) {
            ci.c.a aVar = ciVar.a.f;
            for (int i3 = 0; i3 < aVar.b; i3++) {
                if (aVar.a[i3].d == jVar) {
                    aVar.a[i3].a();
                }
            }
            aVar.b();
        }
    }

    @Override // com.xiaomi.push.fq
    public final void b(fn fnVar) {
        ey.a().b(fnVar);
        c(true);
        aq aqVar = this.j;
        aqVar.b = System.currentTimeMillis();
        aqVar.a.a(1);
        aqVar.c = 0;
        if (!em.b() && !n()) {
            com.xiaomi.channel.commonutils.logger.c.a("reconnection successful, reactivate alarm.");
            em.a(true);
        }
        Iterator<ag.b> it = ag.a().b().iterator();
        while (it.hasNext()) {
            a(new b(it.next()), 0L);
        }
        if (this.g || !jj.a(getApplicationContext())) {
            return;
        }
        com.xiaomi.push.m.a(getApplicationContext()).a(new bo(this), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a(new bp(this, 17), 0L);
    }

    static /* synthetic */ void g(XMPushService xMPushService) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        com.xiaomi.push.service.b a2 = com.xiaomi.push.service.b.a(xMPushService.getApplicationContext());
        String a3 = a2.a();
        com.xiaomi.channel.commonutils.logger.c.a("region of cache is " + a3);
        if (TextUtils.isEmpty(a3)) {
            a3 = xMPushService.f();
        } else {
            if (a2 == null || !TextUtils.isEmpty(a2.b()) || TextUtils.isEmpty(a2.a())) {
                str = "no need to check country code";
            } else {
                String e2 = "com.xiaomi.xmsf".equals(xMPushService.getPackageName()) ? e() : jj.e();
                if (TextUtils.isEmpty(e2)) {
                    str = "check no country code";
                } else {
                    String name = jj.b(e2).name();
                    if (TextUtils.equals(name, a2.a())) {
                        a2.a(e2);
                        str2 = "update country code";
                    } else {
                        str2 = "not update country code, because not equals " + name;
                    }
                    com.xiaomi.channel.commonutils.logger.c.a(str2);
                }
            }
            com.xiaomi.channel.commonutils.logger.c.b(str);
        }
        if (TextUtils.isEmpty(a3)) {
            xMPushService.k = jn.China.name();
        } else {
            xMPushService.k = a3;
            if (!TextUtils.equals(a3, a2.b)) {
                a2.b = a3;
                com.xiaomi.push.service.b.a(a2.c, a2.b, "mipush_region", "mipush_region.lock", a2.a);
            }
            if (jn.Global.name().equals(xMPushService.k)) {
                str5 = "app.chat.global.xiaomi.net";
            } else if (jn.Europe.name().equals(xMPushService.k)) {
                str5 = "fr.app.chat.global.xiaomi.net";
            } else if (jn.Russia.name().equals(xMPushService.k)) {
                str5 = "ru.app.chat.global.xiaomi.net";
            } else if (jn.India.name().equals(xMPushService.k)) {
                str5 = "idmb.app.chat.global.xiaomi.net";
            }
            fo.a(str5);
        }
        if (jn.China.name().equals(xMPushService.k)) {
            fo.a("cn.app.chat.xiaomi.net");
        }
        if (jn.China.name().equals(xMPushService.k)) {
            com.xiaomi.push.by.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            com.xiaomi.push.by.a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            com.xiaomi.push.by.a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            com.xiaomi.push.by.a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            com.xiaomi.push.by.a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            com.xiaomi.push.by.a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            str3 = "resolver.msg.xiaomi.net";
            str4 = "111.202.1.252:443";
        } else {
            com.xiaomi.push.by.a("app.chat.global.xiaomi.net", "app.chat.global.xiaomi.net");
            com.xiaomi.push.by.a("resolver.msg.global.xiaomi.net", "161.117.97.14:443");
            str3 = "resolver.msg.global.xiaomi.net";
            str4 = "161.117.180.178:443";
        }
        com.xiaomi.push.by.a(str3, str4);
        if (xMPushService.j()) {
            bw bwVar = new bw(xMPushService, 11);
            xMPushService.a(bwVar, 0L);
            cn.b = new bx(xMPushService, bwVar);
        }
        try {
            if (jr.c()) {
                Intent intent = new Intent();
                intent.setAction("com.xiaomi.push.service_started");
                if (jj.d()) {
                    intent.addFlags(16777216);
                }
                com.xiaomi.channel.commonutils.logger.c.a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
                com.sankuai.meituan.takeoutnew.util.aop.b.a(xMPushService, intent);
            }
        } catch (Exception e3) {
            com.xiaomi.channel.commonutils.logger.c.a(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:579:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.xiaomi.push.service.XMPushService r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 3488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.a(com.xiaomi.push.service.XMPushService, android.content.Intent):void");
    }

    static /* synthetic */ void j(XMPushService xMPushService) {
        String str;
        if (xMPushService.c != null && xMPushService.c.j()) {
            str = "try to connect while connecting.";
        } else if (xMPushService.c == null || !xMPushService.c.k()) {
            xMPushService.i.g = com.xiaomi.push.al.i(xMPushService);
            try {
                xMPushService.u.a(xMPushService.y, new bn(xMPushService));
                xMPushService.u.o();
                xMPushService.c = xMPushService.u;
            } catch (fy e2) {
                com.xiaomi.channel.commonutils.logger.c.a("fail to create Slim connection", e2);
                xMPushService.u.b(3, e2);
            }
            if (xMPushService.c == null) {
                ag.a().a(xMPushService);
                xMPushService.c(false);
                return;
            }
            return;
        } else {
            str = "try to connect while is connected.";
        }
        com.xiaomi.channel.commonutils.logger.c.d(str);
    }
}
