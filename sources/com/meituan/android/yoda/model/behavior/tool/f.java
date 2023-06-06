package com.meituan.android.yoda.model.behavior.tool;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a = null;
    public static String b = "SensorProbeCollector";
    private static volatile f j;
    public MtSensorManager c;
    public b d;
    public int e;
    public String f;
    public List<a> g;
    public List<a> h;
    public List<a> i;
    private int k;

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a30a4917c4e450172d9677e6e635685", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a30a4917c4e450172d9677e6e635685");
        }
        if (j == null) {
            synchronized (f.class) {
                if (j == null) {
                    j = new f();
                }
            }
        }
        return j;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48a593f1549cb62c814c5eaea80f5ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48a593f1549cb62c814c5eaea80f5ca");
            return;
        }
        this.k = 3000;
        this.e = 18;
        this.g = new ArrayList(1024);
        this.h = new ArrayList(1024);
        this.i = new ArrayList(1024);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements SensorEventListener {
        public static ChangeQuickRedirect a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        private b() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239d8eeba4faf637e16b315d674d8e02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239d8eeba4faf637e16b315d674d8e02");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978c12d4586ce7e3992823a449a21b7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978c12d4586ce7e3992823a449a21b7b");
                return;
            }
            try {
                int type = sensorEvent.sensor.getType();
                long j = sensorEvent.timestamp / 1000000;
                if (this.e == 0) {
                    this.e = System.currentTimeMillis();
                    this.f = j;
                }
                if (type != 1 || j < this.b + f.this.e) {
                    if (type != 4 || j < this.c + f.this.e) {
                        if (type != 2 || j < this.d + f.this.e) {
                            return;
                        }
                        a aVar = new a();
                        if (f.this.i.size() == 0) {
                            aVar.b = this.e + (j - this.f);
                        } else {
                            aVar.b = j - this.d;
                        }
                        this.d = j;
                        float[] fArr = sensorEvent.values;
                        if (fArr != null) {
                            switch (fArr.length) {
                                case 3:
                                    aVar.e = fArr[2];
                                case 2:
                                    aVar.d = fArr[1];
                                case 1:
                                    aVar.c = fArr[0];
                                    break;
                            }
                        }
                        f.this.i.add(aVar);
                        if (f.this.i.size() >= f.this.k) {
                            f.this.b();
                            return;
                        }
                        return;
                    }
                    a aVar2 = new a();
                    if (f.this.h.size() == 0) {
                        aVar2.b = this.e + (j - this.f);
                    } else {
                        aVar2.b = j - this.c;
                    }
                    this.c = j;
                    float[] fArr2 = sensorEvent.values;
                    if (fArr2 != null) {
                        switch (fArr2.length) {
                            case 3:
                                aVar2.e = fArr2[2];
                            case 2:
                                aVar2.d = fArr2[1];
                            case 1:
                                aVar2.c = fArr2[0];
                                break;
                        }
                    }
                    f.this.h.add(aVar2);
                    if (f.this.h.size() >= f.this.k) {
                        f.this.b();
                        return;
                    }
                    return;
                }
                a aVar3 = new a();
                if (f.this.g.size() == 0) {
                    aVar3.b = this.e + (j - this.f);
                } else {
                    aVar3.b = j - this.b;
                }
                this.b = j;
                float[] fArr3 = sensorEvent.values;
                if (fArr3 != null) {
                    switch (fArr3.length) {
                        case 3:
                            aVar3.e = fArr3[2];
                        case 2:
                            aVar3.d = fArr3[1];
                        case 1:
                            aVar3.c = fArr3[0];
                            break;
                    }
                }
                f.this.g.add(aVar3);
                if (f.this.g.size() >= f.this.k) {
                    f.this.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febcee5dd599742702de388346e54469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febcee5dd599742702de388346e54469");
        } else if (this.c == null || this.d == null) {
        } else {
            try {
                this.c.unregisterListener(this.d);
                String str = b;
                com.meituan.android.yoda.monitor.log.a.a(str, "stop collect probe, acc:" + this.g.size() + ", gyr:" + this.h.size() + ", mag:" + this.i.size(), true);
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
            this.d = null;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c2bffe4210ef078758d756e77ac88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c2bffe4210ef078758d756e77ac88f");
            return;
        }
        try {
            if (this.g.size() == 0 && this.h.size() == 0 && this.i.size() == 0) {
                return;
            }
            this.g.clear();
            this.h.clear();
            this.i.clear();
            com.meituan.android.yoda.monitor.log.a.a(b, "clear probe sensor info", true);
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876d81ce702496e805760276fb4b421e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876d81ce702496e805760276fb4b421e");
            return;
        }
        b();
        c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public long b;
        public float c;
        public float d;
        public float e;

        private a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff0549ca190dd6216a2a975d93d52dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff0549ca190dd6216a2a975d93d52dd");
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e67b2808b9dbd285a60573b220f078", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e67b2808b9dbd285a60573b220f078");
            }
            return "[" + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + this.e + ']';
        }
    }
}
