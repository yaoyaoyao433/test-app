package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest;
import com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t;
import com.tencent.mapsdk.internal.sh;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qu extends Thread {
    public static final String b = "UTF-8";
    private static final String h = "rttserverex";
    private static final String i = "getRtt";
    private static final String j = "info";
    private static final String k = "req";
    private static final int l = 30000;
    public List<qs> a;
    private mn c;
    private le d;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;

    public qu(mn mnVar, le leVar) {
        this.c = null;
        this.d = null;
        setName("tms-traffic-refresh");
        this.c = mnVar;
        this.d = leVar;
        this.a = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[Catch: Throwable -> 0x013d, TryCatch #3 {Throwable -> 0x013d, blocks: (B:12:0x0016, B:31:0x0121, B:33:0x0124, B:15:0x007c, B:29:0x00e5, B:18:0x0082, B:20:0x0093, B:23:0x0097, B:25:0x00a5, B:26:0x00d7), top: B:52:0x0016 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qu.run():void");
    }

    public final void a() {
        this.f = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        this.f = false;
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        this.g = true;
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    private void a(qs qsVar) {
        if (this.a == null || qsVar == null) {
            return;
        }
        this.a.add(qsVar);
    }

    private void b(qs qsVar) {
        if (this.a == null || qsVar == null) {
            return;
        }
        this.a.remove(qsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[Catch: Throwable -> 0x012e, TryCatch #0 {Throwable -> 0x012e, blocks: (B:5:0x0005, B:24:0x0112, B:26:0x0115, B:8:0x006b, B:22:0x00d6, B:11:0x0072, B:13:0x0083, B:16:0x0087, B:18:0x0095, B:19:0x00c7), top: B:31:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qu.d():void");
    }

    private void e() {
        int i2 = this.c.i.A.b.q;
        Rect q = this.c.i.q();
        a a2 = a(q.left / 1000000.0f, q.bottom / 1000000.0f);
        a a3 = a(q.right / 1000000.0f, q.top / 1000000.0f);
        sh shVar = this.c.g;
        shVar.b(new sh.AnonymousClass2(i2, Math.min(a2.a, a3.a), Math.min(a2.b, a3.b), Math.max(a3.a, a2.a), Math.max(a3.b, a2.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] f() {
        /*
            r9 = this;
            com.tencent.mapsdk.internal.mn r0 = r9.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.tencent.mapsdk.internal.mn r0 = r9.c
            r2 = 0
            if (r0 != 0) goto Ld
        Lb:
            r3 = r1
            goto L6e
        Ld:
            com.tencent.mapsdk.internal.mn r0 = r9.c
            com.tencent.mapsdk.internal.sh r0 = r0.g
            com.tencent.mapsdk.internal.sh$24 r3 = new com.tencent.mapsdk.internal.sh$24
            r3.<init>()
            java.lang.Object r0 = r0.a(r3, r1)
            com.tencent.mapsdk.internal.qt[] r0 = (com.tencent.mapsdk.internal.qt[]) r0
            if (r0 == 0) goto Lb
            int r3 = r0.length
            if (r3 != 0) goto L22
            goto Lb
        L22:
            com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest r3 = new com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.length
            r6 = 0
        L2e:
            if (r6 >= r5) goto L62
            r7 = r0[r6]
            int r8 = r7.d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r7 = r7.g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L2e
        L62:
            r3.bounds = r4
            r4 = 1
            r3.zip = r4
            r0 = r0[r2]
            int r0 = r0.a
            short r0 = (short) r0
            r3.zoom = r0
        L6e:
            if (r3 != 0) goto L71
            return r1
        L71:
            com.tencent.mapsdk.internal.le r0 = r9.d
            com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t r1 = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t
            r1.<init>()
            java.lang.String r4 = "android_sdk"
            r1.pf = r4
            r1.is_login = r2
            java.lang.String r2 = com.tencent.mapsdk.internal.gy.l()
            r1.channel = r2
            java.lang.String r2 = com.tencent.mapsdk.internal.gy.d()
            r1.imei = r2
            com.tencent.mapsdk.internal.f r2 = new com.tencent.mapsdk.internal.f
            r2.<init>()
            java.lang.String r4 = "rttserverex"
            r2.c(r4)
            java.lang.String r4 = "getRtt"
            r2.d(r4)
            java.lang.String r4 = "info"
            r2.a(r4, r1)
            java.lang.String r1 = "req"
            r2.a(r1, r3)
            byte[] r1 = r2.f()
            byte[] r0 = r0.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qu.f():byte[]");
    }

    private static byte[] a(RttRequest rttRequest) {
        user_login_t user_login_tVar = new user_login_t();
        user_login_tVar.pf = "android_sdk";
        user_login_tVar.is_login = false;
        user_login_tVar.channel = gy.l();
        user_login_tVar.imei = gy.d();
        f fVar = new f();
        fVar.c(h);
        fVar.d(i);
        fVar.a("info", (String) user_login_tVar);
        fVar.a("req", (String) rttRequest);
        return fVar.f();
    }

    private RttRequest g() {
        if (this.c == null) {
            return null;
        }
        sh shVar = this.c.g;
        qt[] qtVarArr = (qt[]) shVar.a(new sh.AnonymousClass24(), (sh.AnonymousClass24) null);
        if (qtVarArr == null || qtVarArr.length == 0) {
            return null;
        }
        RttRequest rttRequest = new RttRequest();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (qt qtVar : qtVarArr) {
            arrayList.add(Integer.valueOf(qtVar.d));
            arrayList.add(Integer.valueOf(qtVar.c));
            arrayList.add(Integer.valueOf(qtVar.f));
            arrayList.add(Integer.valueOf(qtVar.e));
            arrayList.add(Integer.valueOf(qtVar.g));
        }
        rttRequest.bounds = arrayList;
        rttRequest.zip = (short) 1;
        rttRequest.zoom = (short) qtVarArr[0].a;
        return rttRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a {
        public int a;
        public int b;

        private a() {
        }

        /* synthetic */ a(qu quVar, byte b) {
            this();
        }
    }

    private a a(double d, double d2) {
        double sin = Math.sin((d2 * 3.1415926d) / 180.0d);
        a aVar = new a(this, (byte) 0);
        aVar.a = (int) ((((d + 180.0d) / 360.0d) * 2.68435456E8d) + 0.5d);
        aVar.b = (int) ((((180.0d - ((Math.log((sin + 1.0d) / (1.0d - sin)) * 180.0d) / 6.2831852d)) / 360.0d) * 2.68435456E8d) + 0.5d);
        return aVar;
    }
}
