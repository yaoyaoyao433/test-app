package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.dfingerprint.collection.workers.AppInfoWorker;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class o implements com.meituan.android.common.mtguard.collect.c, com.meituan.android.common.mtguard.wtscore.plugin.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static o i = null;
    private static final int j = 323;
    private static final int p = 1;
    private static final int q = 3000;
    private static final int r = 18;
    private static final int s = 60;
    private static final int t = 180;
    public MtSensorManager a;
    public List<a> b;
    public List<a> c;
    public List<a> d;
    public String e;
    public String f;
    public String g;
    public String h;
    private int k;
    private b l;
    private c m;
    private d n;
    private final LinkedBlockingQueue<c> o;
    private int u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long a;
        public float b;
        public float c;
        public float d;

        public a() {
            Object[] objArr = {o.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5c521933cbc453aa132693c66d29a30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5c521933cbc453aa132693c66d29a30");
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c10f30a794abe84400ba3426b1049ffd", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c10f30a794abe84400ba3426b1049ffd");
            }
            return "[" + this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + ']';
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements SensorEventListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;

        public b() {
            Object[] objArr = {o.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c57d678861c28c550adb6e4d1d10af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c57d678861c28c550adb6e4d1d10af");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b259a6f8b49dcbda480944cbfdf8d54", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b259a6f8b49dcbda480944cbfdf8d54");
                return;
            }
            try {
                int type = sensorEvent.sensor.getType();
                long j = sensorEvent.timestamp / 1000000;
                if (this.d == 0) {
                    this.d = System.currentTimeMillis();
                    this.e = j;
                }
                if (type == 1 && j >= this.a + o.this.u) {
                    a aVar = new a();
                    if (o.this.b.size() == 0) {
                        aVar.a = this.d + (j - this.e);
                    } else {
                        aVar.a = j - this.a;
                    }
                    this.a = j;
                    float[] fArr = sensorEvent.values;
                    if (fArr != null) {
                        switch (fArr.length) {
                            case 3:
                                aVar.d = fArr[2];
                            case 2:
                                aVar.c = fArr[1];
                            case 1:
                                aVar.b = fArr[0];
                                break;
                        }
                    }
                    o.this.b.add(aVar);
                    if (o.this.b.size() >= o.this.k) {
                        o.this.d();
                    }
                } else if (type == 4 && j >= this.b + o.this.u) {
                    a aVar2 = new a();
                    if (o.this.c.size() == 0) {
                        aVar2.a = this.d + (j - this.e);
                    } else {
                        aVar2.a = j - this.b;
                    }
                    this.b = j;
                    float[] fArr2 = sensorEvent.values;
                    if (fArr2 != null) {
                        switch (fArr2.length) {
                            case 3:
                                aVar2.d = fArr2[2];
                            case 2:
                                aVar2.c = fArr2[1];
                            case 1:
                                aVar2.b = fArr2[0];
                                break;
                        }
                    }
                    o.this.c.add(aVar2);
                    if (o.this.c.size() >= o.this.k) {
                        o.this.d();
                    }
                } else if (type != 2 || j < this.c + o.this.u) {
                } else {
                    a aVar3 = new a();
                    if (o.this.d.size() == 0) {
                        aVar3.a = this.d + (j - this.e);
                    } else {
                        aVar3.a = j - this.c;
                    }
                    this.c = j;
                    float[] fArr3 = sensorEvent.values;
                    if (fArr3 != null) {
                        switch (fArr3.length) {
                            case 3:
                                aVar3.d = fArr3[2];
                            case 2:
                                aVar3.c = fArr3[1];
                            case 1:
                                aVar3.b = fArr3[0];
                                break;
                        }
                    }
                    o.this.d.add(aVar3);
                    if (o.this.d.size() >= o.this.k) {
                        o.this.d();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class c {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("name")
        public String a = null;
        @SerializedName("vendor")
        public String b = null;
        @SerializedName("data")
        public float[] c;

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public final class d implements SensorEventListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public d() {
            Object[] objArr = {o.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12fb5f085f3ed022f243076135d81869", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12fb5f085f3ed022f243076135d81869");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(final SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c009353fd8146fb9e0cb6847dbf8753", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c009353fd8146fb9e0cb6847dbf8753");
                return;
            }
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.o.d.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "874f16b999d0d8ca1a85556b4737f743", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "874f16b999d0d8ca1a85556b4737f743");
                            return;
                        }
                        try {
                            c cVar = new c();
                            cVar.c = sensorEvent.values;
                            cVar.a = sensorEvent.sensor.getName();
                            cVar.b = sensorEvent.sensor.getVendor();
                            o.this.o.offer(cVar, 1L, TimeUnit.SECONDS);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5ca049974aa114a79fb0090c809c813", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5ca049974aa114a79fb0090c809c813");
            return;
        }
        this.k = 750;
        this.b = new Vector(1024);
        this.c = new Vector(1024);
        this.d = new Vector(1024);
        this.o = new LinkedBlockingQueue<>(1);
        this.u = 18;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "789d1b0ad945b01469141e58e95e748e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "789d1b0ad945b01469141e58e95e748e");
            return;
        }
        try {
            this.a = Privacy.createSensorManager(context, AppInfoWorker.getBid());
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    public static o c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b48bdec465b19782ee50e25c6c1fb4ad", 6917529027641081856L)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b48bdec465b19782ee50e25c6c1fb4ad");
        }
        if (i == null) {
            synchronized (o.class) {
                if (i == null) {
                    i = new o();
                }
            }
        }
        return i;
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "091fa03335f47069e20f8085406c5b65", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "091fa03335f47069e20f8085406c5b65");
        }
        MTGuardLog.setLogan("get bio info in bio thread:".concat(String.valueOf(com.meituan.android.common.mtguard.collect.b.a())));
        return "{\"acc\":" + this.b.toString() + ",\"mag\":" + this.d.toString() + ",\"gyr\":" + this.c.toString() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e134f7cd2c7249f7d6091fd7d1e685a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e134f7cd2c7249f7d6091fd7d1e685a");
            return;
        }
        try {
            if (this.a == null) {
                i();
                return;
            }
            Sensor defaultSensor = this.a.getDefaultSensor(5);
            if (defaultSensor == null) {
                i();
                return;
            }
            this.n = new d();
            this.a.registerListener(this.n, defaultSensor, 3);
            this.m = this.o.poll(1L, TimeUnit.SECONDS);
            i();
        } catch (Throwable unused) {
            i();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a593649b742bb5b56f202731ace4189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a593649b742bb5b56f202731ace4189");
            return;
        }
        try {
            if (this.a == null || this.n == null) {
                return;
            }
            this.a.unregisterListener(this.n);
            this.n = null;
        } catch (Throwable unused) {
        }
    }

    private String j() {
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeaa1f908487a2b476d998dc31c1fbdc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeaa1f908487a2b476d998dc31c1fbdc");
        }
        if (TextUtils.isEmpty(this.e) && this.a != null && (defaultSensor = this.a.getDefaultSensor(1)) != null) {
            this.e = defaultSensor.getName();
            this.f = defaultSensor.getVendor();
        }
        return this.e;
    }

    private String k() {
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c3b396d8b9c151f9facb9067210874d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c3b396d8b9c151f9facb9067210874d");
        }
        if (TextUtils.isEmpty(this.f) && this.a != null && (defaultSensor = this.a.getDefaultSensor(1)) != null) {
            this.e = defaultSensor.getName();
            this.f = defaultSensor.getVendor();
        }
        return this.f;
    }

    private String l() {
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990bc7b84d9517bba0986a4b15536330", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990bc7b84d9517bba0986a4b15536330");
        }
        if (TextUtils.isEmpty(this.g) && this.a != null && (defaultSensor = this.a.getDefaultSensor(9)) != null) {
            this.g = defaultSensor.getName();
            this.h = defaultSensor.getVendor();
        }
        return this.g;
    }

    private String m() {
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77fd272970f5108e1621fb31622eba5a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77fd272970f5108e1621fb31622eba5a");
        }
        if (TextUtils.isEmpty(this.h) && this.a != null && (defaultSensor = this.a.getDefaultSensor(9)) != null) {
            this.g = defaultSensor.getName();
            this.h = defaultSensor.getVendor();
        }
        return this.h;
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.a
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: Throwable -> 0x0190, TryCatch #0 {Throwable -> 0x0190, blocks: (B:6:0x003e, B:9:0x004b, B:12:0x0050, B:14:0x0062, B:19:0x0070, B:22:0x0076, B:27:0x0082, B:28:0x00a7, B:30:0x00ab, B:33:0x00d1, B:35:0x00d7, B:36:0x00d9, B:38:0x00e1, B:40:0x00e4, B:43:0x00ea, B:45:0x00f6, B:46:0x00fd, B:57:0x011e, B:60:0x0124, B:62:0x012d, B:63:0x0143, B:65:0x014d, B:66:0x015f, B:67:0x0163, B:69:0x0170, B:71:0x0178, B:48:0x0101, B:51:0x010b, B:54:0x0115, B:31:0x00b8, B:32:0x00c5), top: B:78:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: Throwable -> 0x0190, TryCatch #0 {Throwable -> 0x0190, blocks: (B:6:0x003e, B:9:0x004b, B:12:0x0050, B:14:0x0062, B:19:0x0070, B:22:0x0076, B:27:0x0082, B:28:0x00a7, B:30:0x00ab, B:33:0x00d1, B:35:0x00d7, B:36:0x00d9, B:38:0x00e1, B:40:0x00e4, B:43:0x00ea, B:45:0x00f6, B:46:0x00fd, B:57:0x011e, B:60:0x0124, B:62:0x012d, B:63:0x0143, B:65:0x014d, B:66:0x015f, B:67:0x0163, B:69:0x0170, B:71:0x0178, B:48:0x0101, B:51:0x010b, B:54:0x0115, B:31:0x00b8, B:32:0x00c5), top: B:78:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[Catch: Throwable -> 0x0190, TryCatch #0 {Throwable -> 0x0190, blocks: (B:6:0x003e, B:9:0x004b, B:12:0x0050, B:14:0x0062, B:19:0x0070, B:22:0x0076, B:27:0x0082, B:28:0x00a7, B:30:0x00ab, B:33:0x00d1, B:35:0x00d7, B:36:0x00d9, B:38:0x00e1, B:40:0x00e4, B:43:0x00ea, B:45:0x00f6, B:46:0x00fd, B:57:0x011e, B:60:0x0124, B:62:0x012d, B:63:0x0143, B:65:0x014d, B:66:0x015f, B:67:0x0163, B:69:0x0170, B:71:0x0178, B:48:0x0101, B:51:0x010b, B:54:0x0115, B:31:0x00b8, B:32:0x00c5), top: B:78:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[Catch: Throwable -> 0x0190, TryCatch #0 {Throwable -> 0x0190, blocks: (B:6:0x003e, B:9:0x004b, B:12:0x0050, B:14:0x0062, B:19:0x0070, B:22:0x0076, B:27:0x0082, B:28:0x00a7, B:30:0x00ab, B:33:0x00d1, B:35:0x00d7, B:36:0x00d9, B:38:0x00e1, B:40:0x00e4, B:43:0x00ea, B:45:0x00f6, B:46:0x00fd, B:57:0x011e, B:60:0x0124, B:62:0x012d, B:63:0x0143, B:65:0x014d, B:66:0x015f, B:67:0x0163, B:69:0x0170, B:71:0x0178, B:48:0x0101, B:51:0x010b, B:54:0x0115, B:31:0x00b8, B:32:0x00c5), top: B:78:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6 A[Catch: Throwable -> 0x0190, TryCatch #0 {Throwable -> 0x0190, blocks: (B:6:0x003e, B:9:0x004b, B:12:0x0050, B:14:0x0062, B:19:0x0070, B:22:0x0076, B:27:0x0082, B:28:0x00a7, B:30:0x00ab, B:33:0x00d1, B:35:0x00d7, B:36:0x00d9, B:38:0x00e1, B:40:0x00e4, B:43:0x00ea, B:45:0x00f6, B:46:0x00fd, B:57:0x011e, B:60:0x0124, B:62:0x012d, B:63:0x0143, B:65:0x014d, B:66:0x015f, B:67:0x0163, B:69:0x0170, B:71:0x0178, B:48:0x0101, B:51:0x010b, B:54:0x0115, B:31:0x00b8, B:32:0x00c5), top: B:78:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.android.common.mtguard.collect.e r21, java.lang.String r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.collect.o.a(com.meituan.android.common.mtguard.collect.e, java.lang.String, int, int):void");
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da39ac84d31c5af457f5f35aa20f43f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da39ac84d31c5af457f5f35aa20f43f4");
        } else if (z) {
            d();
        }
    }

    @Override // com.meituan.android.common.mtguard.wtscore.plugin.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6522ab86807b404b4a3c21527b174b4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6522ab86807b404b4a3c21527b174b4c");
        } else {
            d();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "472335d70674094b68cfeafb09cb4b88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "472335d70674094b68cfeafb09cb4b88");
        } else if (this.a == null || this.l == null) {
        } else {
            try {
                this.a.unregisterListener(this.l);
                MTGuardLog.setLogan("stop collect bio probe, acc:" + this.b.size() + ", gyr:" + this.c.size() + ", mag:" + this.d.size());
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
            this.l = null;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbcebe19d75811196aa15179662556a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbcebe19d75811196aa15179662556a8");
            return;
        }
        try {
            if (this.b.size() == 0 && this.c.size() == 0 && this.d.size() == 0) {
                return;
            }
            this.b.clear();
            this.c.clear();
            this.d.clear();
            NBridge.main3(50, new Object[]{323});
            MTGuardLog.setLogan("clear bio probe sensor info");
        } catch (Throwable unused) {
        }
    }

    public final String f() {
        Sensor defaultSensor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2603a0791121d31210d96c650db86ef9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2603a0791121d31210d96c650db86ef9");
        }
        try {
            if (this.a != null && (defaultSensor = this.a.getDefaultSensor(5)) != null) {
                this.n = new d();
                this.a.registerListener(this.n, defaultSensor, 3);
                this.m = this.o.poll(1L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
        i();
        try {
            if (this.m == null) {
                this.m = new c();
            }
            return new GsonBuilder().serializeNulls().create().toJson(this.m);
        } catch (Exception unused2) {
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }
}
