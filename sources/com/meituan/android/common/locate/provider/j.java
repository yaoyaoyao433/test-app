package com.meituan.android.common.locate.provider;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.sensor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class j extends com.meituan.android.common.locate.util.r {
    private static j c;
    public static ChangeQuickRedirect changeQuickRedirect;
    private MtLocation a;
    private boolean b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private a.InterfaceC0223a h;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a634ce3ae01c8e67bed155c466babc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a634ce3ae01c8e67bed155c466babc8");
            return;
        }
        this.a = null;
        this.b = false;
        this.f = new float[16];
        this.g = new float[3];
        this.h = new a.InterfaceC0223a() { // from class: com.meituan.android.common.locate.provider.j.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public int a() {
                return 17;
            }

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public long b() {
                return 0L;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6fd32edf03df2005a0ced78ebcbbcdfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6fd32edf03df2005a0ced78ebcbbcdfc");
                } else if (sensorEvent == null) {
                } else {
                    if (sensorEvent.sensor.getType() == 1) {
                        j.this.d = (float[]) sensorEvent.values.clone();
                    } else if (sensorEvent.sensor.getType() == 2) {
                        j.this.e = (float[]) sensorEvent.values.clone();
                    }
                }
            }
        };
    }

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b77ac706d6e75697e167022c6d89d6f4", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b77ac706d6e75697e167022c6d89d6f4")).floatValue() : (float) ((f * 180.0f) / 3.141592653589793d);
    }

    public static synchronized j d() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2b52a6496e2f84938e3a79bec6d3308", RobustBitConfig.DEFAULT_VALUE)) {
                return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2b52a6496e2f84938e3a79bec6d3308");
            }
            if (c == null) {
                c = new j();
            }
            return c;
        }
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7063fa4cbadbbedb62a9c2db2260be10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7063fa4cbadbbedb62a9c2db2260be10")).booleanValue();
        }
        if (this.d == null || this.e == null || !SensorManager.getRotationMatrix(this.f, null, this.d, this.e)) {
            return false;
        }
        SensorManager.getOrientation(this.f, this.g);
        return true;
    }

    @Override // com.meituan.android.common.locate.util.r
    public String a() {
        return "GearsHeadingForceAppender ";
    }

    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b131b0c5259cec60eb3801b2751c4b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b131b0c5259cec60eb3801b2751c4b02");
        } else if (mtLocation == null) {
        } else {
            Bundle extras = mtLocation.getExtras();
            if (extras == null) {
                extras = new Bundle();
                mtLocation.setExtras(extras);
            }
            extras.putFloat("heading", f());
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02d26d935ea3f7528a75b5ddd9ea9d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02d26d935ea3f7528a75b5ddd9ea9d98");
        } else {
            com.meituan.android.common.locate.sensor.a.a(g.a()).b(this.h);
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72a95c99dfba46f6f6f247a08b78be25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72a95c99dfba46f6f6f247a08b78be25");
        } else {
            com.meituan.android.common.locate.sensor.a.a(g.a()).a(this.h);
        }
    }

    public synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d695a2fda9d4acfe0a31990db2c9202a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d695a2fda9d4acfe0a31990db2c9202a");
        } else {
            super.h();
        }
    }

    public synchronized float f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f26e1fb872be2a34e9a0965906134036", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f26e1fb872be2a34e9a0965906134036")).floatValue();
        }
        j();
        if (this.g == null) {
            return 0.0f;
        }
        return a(this.g[0]);
    }

    public synchronized void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d394d2097c72353abd7e45377284d508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d394d2097c72353abd7e45377284d508");
        } else {
            super.i();
        }
    }
}
