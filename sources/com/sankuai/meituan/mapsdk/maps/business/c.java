package com.sankuai.meituan.mapsdk.maps.business;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements SensorEventListener {
    public static ChangeQuickRedirect a;
    private final com.sankuai.meituan.mapfoundation.sensor.a b;
    private b c;
    private Sensor d;
    private int e;
    private long f;

    public c(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1f6e7b202ef78894a76322126f08bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1f6e7b202ef78894a76322126f08bf");
            return;
        }
        this.f = 0L;
        this.c = bVar;
        this.b = new com.sankuai.meituan.mapfoundation.sensor.a(context, str);
        this.d = this.b.a(11);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c17579f375b8701dd9eb671c97b09127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c17579f375b8701dd9eb671c97b09127");
            return;
        }
        try {
            this.b.a(this, this.d, BlankConfig.MAX_SAMPLE);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e(e.getMessage());
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae6eb29770580e9488e5065eda3f84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae6eb29770580e9488e5065eda3f84a");
        } else {
            this.b.a(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float degrees;
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8422fe8651dedb7c00e8e675984426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8422fe8651dedb7c00e8e675984426");
        } else if (this.c != null && SystemClock.elapsedRealtime() >= this.f) {
            if (this.e == 0) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Compass sensor is unreliable, device calibration is needed.");
            }
            Object[] objArr2 = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39ea1bb218724cf709b1e46875f2e6e4", RobustBitConfig.DEFAULT_VALUE)) {
                degrees = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39ea1bb218724cf709b1e46875f2e6e4")).floatValue();
            } else {
                float[] fArr = new float[3];
                float[] fArr2 = new float[9];
                SensorManager.getRotationMatrixFromVector(fArr2, sensorEvent.values);
                SensorManager.getOrientation(fArr2, fArr);
                degrees = (float) Math.toDegrees(fArr[0]);
                if (degrees < 0.0f) {
                    degrees += 360.0f;
                }
            }
            Object[] objArr3 = {Float.valueOf(degrees)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af6499229fb71edb8b6be2693f6d206a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af6499229fb71edb8b6be2693f6d206a");
            } else {
                this.c.onCompassChanged(degrees);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        Object[] objArr = {sensor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347ac9fbae139a63636e7c1acc8c36ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347ac9fbae139a63636e7c1acc8c36ce");
        } else if (this.e != i) {
            this.c.onCompassAccuracyChange(i);
            this.e = i;
        }
    }
}
