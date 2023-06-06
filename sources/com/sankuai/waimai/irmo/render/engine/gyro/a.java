package com.sankuai.waimai.irmo.render.engine.gyro;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements SensorEventListener {
    public static ChangeQuickRedirect a;
    double b;
    double c;
    private final float d;
    private final double e;
    private long f;
    private final InterfaceC0975a g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.render.engine.gyro.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0975a {
        void a(float f, float f2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public a(InterfaceC0975a interfaceC0975a) {
        Object[] objArr = {interfaceC0975a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6d238b28af660c2a26492a6dfa93b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6d238b28af660c2a26492a6dfa93b0");
            return;
        }
        this.d = 1.0E-9f;
        this.e = 0.39269908169872414d;
        this.g = interfaceC0975a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975f6b765c6da281f98030c49aecdd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975f6b765c6da281f98030c49aecdd1d");
        } else if (sensorEvent.sensor.getType() == 4) {
            Object[] objArr2 = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30314942a2ade075a45c1f9779f4cb3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30314942a2ade075a45c1f9779f4cb3f");
                return;
            }
            if (this.f != 0) {
                float abs = Math.abs(sensorEvent.values[0]);
                float abs2 = Math.abs(sensorEvent.values[1]);
                float f = ((float) (sensorEvent.timestamp - this.f)) * 1.0E-9f;
                if (abs >= 0.01f) {
                    this.b += sensorEvent.values[0] * f;
                    if (this.b > 0.39269908169872414d) {
                        this.b = 0.39269908169872414d;
                    } else if (this.b < -0.39269908169872414d) {
                        this.b = -0.39269908169872414d;
                    }
                }
                if (abs2 >= 0.01f) {
                    this.c += sensorEvent.values[1] * f;
                    if (this.c > 0.39269908169872414d) {
                        this.c = 0.39269908169872414d;
                    } else if (this.c < -0.39269908169872414d) {
                        this.c = -0.39269908169872414d;
                    }
                }
                if (this.g != null) {
                    this.g.a((float) (this.b / 0.39269908169872414d), (float) (this.c / 0.39269908169872414d));
                }
            }
            this.f = sensorEvent.timestamp;
        }
    }
}
