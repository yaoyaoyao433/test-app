package com.meituan.android.edfu.mbar.camera.decode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements SensorEventListener {
    public static ChangeQuickRedirect a;
    public e b;
    private Context c;
    private Sensor d;
    private MtSensorManager e;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d697afdc4e44571e27f03ddda7c688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d697afdc4e44571e27f03ddda7c688");
            return;
        }
        this.c = context;
        this.e = Privacy.createSensorManager(context, "com.meituan.android.edfu:mbar");
        if (this.e != null) {
            this.d = this.e.getDefaultSensor(4);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ca2712e965f898dfc79ad35804eb1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ca2712e965f898dfc79ad35804eb1f");
        } else if (this.d != null) {
            try {
                this.e.registerListener(this, this.d, 3);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c851384ca0be0f29f427860632d6b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c851384ca0be0f29f427860632d6b9b");
        } else if (this.d != null) {
            this.e.unregisterListener(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421eccc1fb45b22e7e6864d8880d7674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421eccc1fb45b22e7e6864d8880d7674");
            return;
        }
        if (4 == sensorEvent.sensor.getType() && this.b != null) {
            this.b.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
        }
        if (9 == sensorEvent.sensor.getType() && this.b != null) {
            this.b.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
        }
        if (1 != sensorEvent.sensor.getType() || this.b == null) {
            return;
        }
        this.b.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
    }
}
