package com.alibaba.android.bindingx.core.internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Handler;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r implements q {
    private final MtSensorManager a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(MtSensorManager mtSensorManager) {
        this.a = mtSensorManager;
    }

    @Override // com.alibaba.android.bindingx.core.internal.q
    public final boolean a(SensorEventListener sensorEventListener, int i, int i2, Handler handler) {
        List<Sensor> sensorList = this.a.getSensorList(i);
        if (sensorList.isEmpty()) {
            return false;
        }
        return this.a.registerListener(sensorEventListener, sensorList.get(0), i2, handler);
    }

    @Override // com.alibaba.android.bindingx.core.internal.q
    public final void a(SensorEventListener sensorEventListener, int i) {
        List<Sensor> sensorList = this.a.getSensorList(i);
        if (sensorList.isEmpty()) {
            return;
        }
        try {
            this.a.unregisterListener(sensorEventListener, sensorList.get(0));
        } catch (Throwable unused) {
            com.alibaba.android.bindingx.core.d.b("Failed to unregister device sensor " + sensorList.get(0).getName());
        }
    }
}
