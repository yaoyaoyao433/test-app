package com.meituan.android.common.locate.provider;

import android.hardware.Sensor;
import com.meituan.android.common.locate.sensor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class o extends com.meituan.android.common.locate.util.r {
    private static volatile o a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private double b;
    private volatile boolean c;
    private long d;
    private a.InterfaceC0223a e;
    private com.meituan.android.common.locate.posdrift.b f;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4111ba9432afcc826cc845e33f82886", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4111ba9432afcc826cc845e33f82886");
            return;
        }
        this.b = 50.0d;
        this.d = 0L;
        this.e = new a.InterfaceC0223a() { // from class: com.meituan.android.common.locate.provider.o.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public int a() {
                return 257;
            }

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public long b() {
                return 1000L;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // android.hardware.SensorEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSensorChanged(android.hardware.SensorEvent r13) {
                /*
                    r12 = this;
                    r0 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    r9 = 0
                    r8[r9] = r13
                    com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.locate.provider.o.AnonymousClass1.changeQuickRedirect
                    java.lang.String r11 = "4b6988c8a700ea85521c9c81610ee30d"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r12
                    r3 = r10
                    r5 = r11
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L1b
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                    return
                L1b:
                    com.meituan.android.common.locate.provider.o r1 = com.meituan.android.common.locate.provider.o.this
                    com.meituan.android.common.locate.posdrift.b r1 = com.meituan.android.common.locate.provider.o.a(r1)
                    if (r1 != 0) goto L24
                    return
                L24:
                    r1 = 3
                    android.hardware.Sensor r2 = r13.sensor     // Catch: java.lang.Exception -> L72
                    int r2 = r2.getType()     // Catch: java.lang.Exception -> L72
                    r3 = 4
                    if (r2 != r3) goto L41
                    com.meituan.android.common.locate.provider.o r2 = com.meituan.android.common.locate.provider.o.this     // Catch: java.lang.Exception -> L3d
                    com.meituan.android.common.locate.posdrift.b r2 = com.meituan.android.common.locate.provider.o.a(r2)     // Catch: java.lang.Exception -> L3d
                    long r3 = r13.timestamp     // Catch: java.lang.Exception -> L3d
                    float[] r5 = r13.values     // Catch: java.lang.Exception -> L3d
                    r2.b(r3, r5)     // Catch: java.lang.Exception -> L3d
                    r2 = 1
                    goto L42
                L3d:
                    r13 = move-exception
                    r0 = 0
                    r2 = 1
                    goto L75
                L41:
                    r2 = 0
                L42:
                    android.hardware.Sensor r3 = r13.sensor     // Catch: java.lang.Exception -> L6f
                    int r3 = r3.getType()     // Catch: java.lang.Exception -> L6f
                    if (r3 != r0) goto L6d
                    float[] r3 = new float[r1]     // Catch: java.lang.Exception -> L6b
                    float[] r4 = r13.values     // Catch: java.lang.Exception -> L6b
                    r4 = r4[r9]     // Catch: java.lang.Exception -> L6b
                    r3[r9] = r4     // Catch: java.lang.Exception -> L6b
                    float[] r4 = r13.values     // Catch: java.lang.Exception -> L6b
                    r4 = r4[r0]     // Catch: java.lang.Exception -> L6b
                    r3[r0] = r4     // Catch: java.lang.Exception -> L6b
                    float[] r4 = r13.values     // Catch: java.lang.Exception -> L6b
                    r5 = 2
                    r4 = r4[r5]     // Catch: java.lang.Exception -> L6b
                    r3[r5] = r4     // Catch: java.lang.Exception -> L6b
                    com.meituan.android.common.locate.provider.o r4 = com.meituan.android.common.locate.provider.o.this     // Catch: java.lang.Exception -> L6b
                    com.meituan.android.common.locate.posdrift.b r4 = com.meituan.android.common.locate.provider.o.a(r4)     // Catch: java.lang.Exception -> L6b
                    long r5 = r13.timestamp     // Catch: java.lang.Exception -> L6b
                    r4.a(r5, r3)     // Catch: java.lang.Exception -> L6b
                    goto L8a
                L6b:
                    r13 = move-exception
                    goto L75
                L6d:
                    r0 = 0
                    goto L8a
                L6f:
                    r13 = move-exception
                    r0 = 0
                    goto L75
                L72:
                    r13 = move-exception
                    r0 = 0
                    r2 = 0
                L75:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "MotionStateAppender-onSensorChanged:"
                    r3.<init>(r4)
                    java.lang.String r13 = r13.getMessage()
                    r3.append(r13)
                    java.lang.String r13 = r3.toString()
                    com.meituan.android.common.locate.platform.logs.c.a(r13, r1)
                L8a:
                    long r3 = android.os.SystemClock.elapsedRealtime()
                    com.meituan.android.common.locate.provider.o r13 = com.meituan.android.common.locate.provider.o.this
                    long r5 = com.meituan.android.common.locate.provider.o.b(r13)
                    long r5 = r3 - r5
                    r7 = 1000(0x3e8, double:4.94E-321)
                    int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r13 < 0) goto Lcd
                    com.meituan.android.common.locate.provider.o r13 = com.meituan.android.common.locate.provider.o.this
                    com.meituan.android.common.locate.provider.o.a(r13, r3)
                    com.meituan.android.common.locate.fusionlocation.a r13 = com.meituan.android.common.locate.fusionlocation.a.a()
                    android.util.Pair r1 = new android.util.Pair
                    android.util.Pair r3 = new android.util.Pair
                    long r4 = java.lang.System.currentTimeMillis()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    android.util.Pair r5 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r5.<init>(r2, r0)
                    r3.<init>(r4, r5)
                    com.meituan.android.common.locate.provider.o r0 = com.meituan.android.common.locate.provider.o.this
                    double[] r0 = r0.g()
                    r1.<init>(r3, r0)
                    r13.e(r1)
                Lcd:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.o.AnonymousClass1.onSensorChanged(android.hardware.SensorEvent):void");
            }
        };
    }

    public static o d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc5c740f98f1c03b425edc77f57984ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc5c740f98f1c03b425edc77f57984ca");
        }
        if (a == null) {
            synchronized (o.class) {
                if (a == null) {
                    a = new o();
                }
            }
        }
        return a;
    }

    @Override // com.meituan.android.common.locate.util.r
    public String a() {
        return "MotionStateAppender";
    }

    @Override // com.meituan.android.common.locate.util.r
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1447c81312ca7a3738aabf341697280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1447c81312ca7a3738aabf341697280");
        } else if (this.c) {
            this.c = false;
            com.meituan.android.common.locate.sensor.a.a(g.a()).b(this.e);
            this.f = null;
            com.meituan.android.common.locate.platform.logs.c.a("MotionStateAppender_onStop", 3);
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a894e34630b9e5da2aac0c9dd0db9c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a894e34630b9e5da2aac0c9dd0db9c8");
        } else if (this.c) {
        } else {
            this.c = true;
            this.f = new com.meituan.android.common.locate.posdrift.b(this.b);
            com.meituan.android.common.locate.sensor.a.a(g.a()).a(this.e);
            com.meituan.android.common.locate.platform.logs.c.a("MotionStateAppender_onStart", 3);
        }
    }

    public synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ca99c82abc98fb85ebd767706e7fab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ca99c82abc98fb85ebd767706e7fab5");
        } else {
            super.h();
        }
    }

    public synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107b0601f0f2e422e2fd4ff99e9aee2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107b0601f0f2e422e2fd4ff99e9aee2a");
        } else {
            super.i();
        }
    }

    public double[] g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77cfdf02e5f4740707006e8c2a4a71a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77cfdf02e5f4740707006e8c2a4a71a5");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.b();
    }
}
