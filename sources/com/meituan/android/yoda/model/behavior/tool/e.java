package com.meituan.android.yoda.model.behavior.tool;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public String b;
    MtSensorManager c;
    Sensor d;
    SensorEventListener e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbac82b27c23a30e1a36255ecafd46a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbac82b27c23a30e1a36255ecafd46a");
        } else {
            this.e = new SensorEventListener() { // from class: com.meituan.android.yoda.model.behavior.tool.e.1
                public static ChangeQuickRedirect a;

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    Object[] objArr2 = {sensorEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c0608ae1545f9a4060bae8eea4f9c47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c0608ae1545f9a4060bae8eea4f9c47");
                    } else if (sensorEvent == null || sensorEvent.sensor == null || sensorEvent.sensor.getType() != 1 || sensorEvent.values == null || sensorEvent.values.length < 3) {
                    } else {
                        com.meituan.android.yoda.model.behavior.collection.b a2 = com.meituan.android.yoda.model.behavior.collection.b.a();
                        float f = sensorEvent.values[0];
                        float f2 = sensorEvent.values[1];
                        float f3 = sensorEvent.values[2];
                        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.model.behavior.collection.b.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "add6242a9304e334adf281fe51e360f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "add6242a9304e334adf281fe51e360f0");
                        } else if (a2.c) {
                            a2.h.a((com.meituan.android.yoda.model.behavior.collection.c<com.meituan.android.yoda.model.behavior.entry.a>) com.meituan.android.yoda.model.behavior.entry.a.a(f, f2, f3, a2.b()));
                        }
                    }
                }
            };
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9550abdc56690be6172abae0eabdbdb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9550abdc56690be6172abae0eabdbdb9");
        } else if (this.c != null) {
            if (this.d != null) {
                this.c.unregisterListener(this.e, this.d);
            }
            this.c = null;
        }
    }
}
