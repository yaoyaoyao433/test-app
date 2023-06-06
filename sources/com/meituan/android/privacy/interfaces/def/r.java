package com.meituan.android.privacy.interfaces.def;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r implements MtSensorManager {
    public static ChangeQuickRedirect a;
    private SensorManager b;

    public r(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a552a68f2f01385ee330713869ed852c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a552a68f2f01385ee330713869ed852c");
            return;
        }
        try {
            this.b = (SensorManager) context.getSystemService("sensor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final Sensor getDefaultSensor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68e10d62b4d232a474d750cd356a94a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68e10d62b4d232a474d750cd356a94a");
        }
        if (this.b == null) {
            return null;
        }
        return com.sankuai.meituan.takeoutnew.util.aop.e.a(this.b, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    @RequiresApi(api = 21)
    public final Sensor getDefaultSensor(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462e0fabf0785b1acb0d4d2fa628032a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462e0fabf0785b1acb0d4d2fa628032a");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getDefaultSensor(i, z);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0909a25655f35c9fa331cffe0c394d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0909a25655f35c9fa331cffe0c394d4")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.registerListener(sensorEventListener, sensor, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec97c2cc531e481eb32111c221b894b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec97c2cc531e481eb32111c221b894b")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.registerListener(sensorEventListener, sensor, i, handler);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, int i2) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4df2c057ace2fa234d4f317a1409297", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4df2c057ace2fa234d4f317a1409297")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.registerListener(sensorEventListener, sensor, i, i2);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, int i2, Handler handler) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), Integer.valueOf(i2), handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b53b895161d206f5aeac78bcd4524f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b53b895161d206f5aeac78bcd4524f")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.registerListener(sensorEventListener, sensor, i, i2, handler);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final void unregisterListener(SensorEventListener sensorEventListener) {
        Object[] objArr = {sensorEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82fb00ef65fc85047fb25db55852c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82fb00ef65fc85047fb25db55852c11");
        } else if (this.b != null) {
            this.b.unregisterListener(sensorEventListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final void unregisterListener(SensorEventListener sensorEventListener, Sensor sensor) {
        Object[] objArr = {sensorEventListener, sensor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d774fb9b17afb8eca1a1afe31bdf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d774fb9b17afb8eca1a1afe31bdf01");
        } else if (this.b != null) {
            this.b.unregisterListener(sensorEventListener, sensor);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final List<Sensor> getSensorList(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eef7bca107314d03da08bfbef761382", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eef7bca107314d03da08bfbef761382");
        }
        if (this.b != null) {
            return this.b.getSensorList(i);
        }
        return new ArrayList();
    }
}
