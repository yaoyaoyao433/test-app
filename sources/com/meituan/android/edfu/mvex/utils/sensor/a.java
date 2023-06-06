package com.meituan.android.edfu.mvex.utils.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements SensorEventListener {
    public static ChangeQuickRedirect a;
    public float[] b;
    public float c;
    public c d;
    public Sensor e;
    public Sensor f;
    public MtSensorManager g;
    private final String h;
    private List<b> i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e341452ef95e16d9d56d8c616021974", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e341452ef95e16d9d56d8c616021974");
            return;
        }
        this.h = "TodayStepDetector";
        this.b = new float[3];
        this.c = 0.0f;
        this.j = 0;
        this.k = 0;
        this.i = new ArrayList(4);
        this.g = Privacy.createSensorManager(context, "com.meituan.android.edfu:mvex");
        if (this.g != null) {
            this.e = this.g.getDefaultSensor(4);
            this.f = this.g.getDefaultSensor(1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b bVar;
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57197f565d5ae5dd5708b14fd75a9e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57197f565d5ae5dd5708b14fd75a9e2b");
        } else if (4 == sensorEvent.sensor.getType()) {
            for (int i = 0; i < 3; i++) {
                this.b[i] = sensorEvent.values[i];
            }
            this.c = (float) Math.sqrt((this.b[0] * this.b[0]) + (this.b[1] * this.b[1]) + (this.b[2] * this.b[2]));
            float f = this.c;
            Object[] objArr2 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee2298701e8e6cd7e21afa64042331af", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee2298701e8e6cd7e21afa64042331af");
            } else {
                bVar = new b();
                bVar.b = f;
                bVar.c = System.currentTimeMillis();
                double d = f;
                if (d < 0.1d) {
                    bVar.a = 1;
                } else if (d < 0.5d) {
                    bVar.a = 2;
                } else if (f < 1.0f) {
                    bVar.a = 3;
                } else {
                    bVar.a = 4;
                }
            }
            int a2 = a(bVar);
            if (this.d != null) {
                this.d.a(a2);
            }
        } else if (1 == sensorEvent.sensor.getType()) {
            float f2 = sensorEvent.values[0];
            float f3 = sensorEvent.values[1];
            float f4 = sensorEvent.values[2];
            b bVar2 = new b();
            if (Math.abs(f2 - this.l) > 0.6f || Math.abs(f3 - this.m) > 0.6f || Math.abs(f4 - this.n) > 0.6f) {
                bVar2.a = 3;
            } else {
                bVar2.a = 1;
            }
            int a3 = a(bVar2);
            if (this.d != null) {
                this.d.a(a3);
            }
            this.l = f2;
            this.m = f3;
            this.n = f4;
        }
    }

    private int a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a29058dff6087f6238c3d86e9eadcdf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a29058dff6087f6238c3d86e9eadcdf")).intValue();
        }
        if (this.i.size() < 4) {
            this.i.add(bVar);
            if (bVar.a == 1) {
                this.j++;
            } else {
                this.k++;
            }
        } else {
            if (bVar.a != this.i.get(0).a) {
                if (this.i.get(0).a == 1) {
                    this.j--;
                    this.k++;
                } else if (bVar.a == 1) {
                    this.j++;
                    this.k--;
                }
            }
            this.i.remove(0);
            this.i.add(bVar);
        }
        return this.j > 2 ? 100 : 101;
    }
}
