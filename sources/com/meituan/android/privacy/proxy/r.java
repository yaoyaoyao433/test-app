package com.meituan.android.privacy.proxy;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r implements MtSensorManager {
    public static ChangeQuickRedirect a;
    private SensorManager b;
    private u c;
    private String d;
    private Map<Integer, String> e;
    private Context f;

    public r(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c785e19f121384abdb05e0ce337cd91c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c785e19f121384abdb05e0ce337cd91c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3719421e0cd81a32ce75e3b08941d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3719421e0cd81a32ce75e3b08941d9d");
        } else {
            this.e = new HashMap();
            this.e.put(19, PermissionGuard.PERMISSION_MOTION);
            this.e.put(18, PermissionGuard.PERMISSION_MOTION);
            if (Build.VERSION.SDK_INT >= 24) {
                this.e.put(31, PermissionGuard.PERMISSION_BODY_SENSORS);
            }
            if (Build.VERSION.SDK_INT >= 20) {
                this.e.put(21, PermissionGuard.PERMISSION_BODY_SENSORS);
            }
        }
        this.d = str;
        this.f = context;
        this.c = new u();
        try {
            this.b = (SensorManager) context.getSystemService("sensor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final Sensor getDefaultSensor(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fcba6349fccd4a2983e176066357ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fcba6349fccd4a2983e176066357ae");
        }
        if (this.b == null || Privacy.createPermissionGuard().a(this.f)) {
            return null;
        }
        return !this.e.containsKey(Integer.valueOf(i)) ? this.b.getDefaultSensor(i) : (Sensor) this.c.a("sensormgr.getDefSensor", this.d, new String[]{this.e.get(Integer.valueOf(i))}, new u.a<Sensor>() { // from class: com.meituan.android.privacy.proxy.r.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Sensor a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd0e361cda1a1a0af56fb6945dbf5b1b", RobustBitConfig.DEFAULT_VALUE) ? (Sensor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd0e361cda1a1a0af56fb6945dbf5b1b") : r.this.b.getDefaultSensor(i);
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    @RequiresApi(api = 21)
    public final Sensor getDefaultSensor(final int i, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa9fac11f8331e6fffa772e27fd735e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa9fac11f8331e6fffa772e27fd735e");
        }
        if (this.b == null || Privacy.createPermissionGuard().a(this.f)) {
            return null;
        }
        return !this.e.containsKey(Integer.valueOf(i)) ? this.b.getDefaultSensor(i) : (Sensor) this.c.a("sensormgr.getDefSensor", this.d, new String[]{this.e.get(Integer.valueOf(i))}, new u.a<Sensor>() { // from class: com.meituan.android.privacy.proxy.r.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Sensor a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "256c628fb4fb85096148d874d2edddbb", RobustBitConfig.DEFAULT_VALUE) ? (Sensor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "256c628fb4fb85096148d874d2edddbb") : r.this.b.getDefaultSensor(i, z);
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(final SensorEventListener sensorEventListener, final Sensor sensor, final int i) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d9074bdf34227f7172a34083049168", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d9074bdf34227f7172a34083049168")).booleanValue();
        }
        if (this.b == null || sensor == null || Privacy.createPermissionGuard().a(this.f)) {
            return false;
        }
        int type = sensor.getType();
        if (this.e.containsKey(Integer.valueOf(type))) {
            Boolean bool = (Boolean) this.c.a("sensormgr.regListener", this.d, new String[]{this.e.get(Integer.valueOf(type))}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.r.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8a7d186504433e22ea600e27cecd32d", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8a7d186504433e22ea600e27cecd32d") : Boolean.valueOf(r.this.b.registerListener(sensorEventListener, sensor, i));
                }
            }, false);
            return bool != null && bool.booleanValue();
        }
        return this.b.registerListener(sensorEventListener, sensor, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(final SensorEventListener sensorEventListener, final Sensor sensor, final int i, final Handler handler) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6acc047d6ba7b6d563b397c1747f9046", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6acc047d6ba7b6d563b397c1747f9046")).booleanValue();
        }
        if (this.b == null || sensor == null || Privacy.createPermissionGuard().a(this.f)) {
            return false;
        }
        int type = sensor.getType();
        if (this.e.containsKey(Integer.valueOf(type))) {
            Boolean bool = (Boolean) this.c.a("sensormgr.regListener", this.d, new String[]{this.e.get(Integer.valueOf(type))}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.r.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d0447c4d7c420a4ab08758d3755d789", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d0447c4d7c420a4ab08758d3755d789") : Boolean.valueOf(r.this.b.registerListener(sensorEventListener, sensor, i, handler));
                }
            }, false);
            return bool != null && bool.booleanValue();
        }
        return this.b.registerListener(sensorEventListener, sensor, i, handler);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(final SensorEventListener sensorEventListener, final Sensor sensor, final int i, final int i2) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a5258ade8d77bebe14b3a08f63b4344", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a5258ade8d77bebe14b3a08f63b4344")).booleanValue();
        }
        if (this.b == null || sensor == null || Privacy.createPermissionGuard().a(this.f)) {
            return false;
        }
        int type = sensor.getType();
        if (this.e.containsKey(Integer.valueOf(type))) {
            Boolean bool = (Boolean) this.c.a("sensormgr.regListener", this.d, new String[]{this.e.get(Integer.valueOf(type))}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.r.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b425b31994e76a1e21145e7c31a7754c", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b425b31994e76a1e21145e7c31a7754c") : Boolean.valueOf(r.this.b.registerListener(sensorEventListener, sensor, i, i2));
                }
            }, false);
            return bool != null && bool.booleanValue();
        }
        return this.b.registerListener(sensorEventListener, sensor, i, i2);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final boolean registerListener(final SensorEventListener sensorEventListener, final Sensor sensor, final int i, final int i2, final Handler handler) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf(i), Integer.valueOf(i2), handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0ee0ed74a486e8cfdca3ff76588f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0ee0ed74a486e8cfdca3ff76588f68")).booleanValue();
        }
        if (this.b == null || sensor == null || Privacy.createPermissionGuard().a(this.f)) {
            return false;
        }
        int type = sensor.getType();
        if (this.e.containsKey(Integer.valueOf(type))) {
            Boolean bool = (Boolean) this.c.a("sensormgr.regListener", this.d, new String[]{this.e.get(Integer.valueOf(type))}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.r.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "335abb84d49901d6dbf898428e10f203", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "335abb84d49901d6dbf898428e10f203") : Boolean.valueOf(r.this.b.registerListener(sensorEventListener, sensor, i, i2, handler));
                }
            }, false);
            return bool != null && bool.booleanValue();
        }
        return this.b.registerListener(sensorEventListener, sensor, i, i2, handler);
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final void unregisterListener(SensorEventListener sensorEventListener) {
        Object[] objArr = {sensorEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bb65d3e5e2a57dcc0a1c1d25f9d71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bb65d3e5e2a57dcc0a1c1d25f9d71c");
        } else if (this.b != null) {
            this.b.unregisterListener(sensorEventListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final void unregisterListener(SensorEventListener sensorEventListener, Sensor sensor) {
        Object[] objArr = {sensorEventListener, sensor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93473e21b92338ce53aa57bc7c92f785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93473e21b92338ce53aa57bc7c92f785");
        } else if (this.b != null) {
            this.b.unregisterListener(sensorEventListener, sensor);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtSensorManager
    public final List<Sensor> getSensorList(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a73210b2acf4b769f8ed1cfd86247e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a73210b2acf4b769f8ed1cfd86247e5");
        }
        if (this.b != null && !Privacy.createPermissionGuard().a(this.f)) {
            return this.b.getSensorList(i);
        }
        return new ArrayList();
    }
}
