package com.meituan.android.common.locate.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile a g;
    private MtSensorManager a;
    private Sensor b;
    private Sensor c;
    private Sensor d;
    private int e;
    private volatile Set<InterfaceC0223a> f;
    private Sensor h;
    private Thread i;
    private Handler j;
    private volatile boolean k;
    private final SensorEventListener l;

    /* renamed from: com.meituan.android.common.locate.sensor.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0223a extends SensorEventListener {
        int a();

        long b();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b050c2763e36963008b331bd14f3cc3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b050c2763e36963008b331bd14f3cc3f");
            return;
        }
        this.e = 0;
        this.f = Collections.synchronizedSet(new HashSet());
        this.l = new SensorEventListener() { // from class: com.meituan.android.common.locate.sensor.a.2
            public static ChangeQuickRedirect changeQuickRedirect;
            private Map<InterfaceC0223a, SparseArray<Long>> b = new HashMap();
            private Map<InterfaceC0223a, SparseArray<Long>> c = new HashMap();

            private boolean a(Map<InterfaceC0223a, SparseArray<Long>> map, InterfaceC0223a interfaceC0223a, Sensor sensor) {
                Object[] objArr2 = {map, interfaceC0223a, sensor};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bd0e21f7aa1fa586c3b181a1e54bcea", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bd0e21f7aa1fa586c3b181a1e54bcea")).booleanValue();
                }
                long b = interfaceC0223a.b();
                if (b > 0 && sensor != null) {
                    SparseArray<Long> sparseArray = map.get(interfaceC0223a);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>();
                        map.put(interfaceC0223a, sparseArray);
                    }
                    Long l = sparseArray.get(sensor.getType());
                    if (l == null || SystemClock.elapsedRealtime() - l.longValue() > b) {
                        sparseArray.put(sensor.getType(), Long.valueOf(SystemClock.elapsedRealtime()));
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
                Object[] objArr2 = {sensor, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a7ad630debd15b336b6dffbeea2f2f44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a7ad630debd15b336b6dffbeea2f2f44");
                } else if (a.this.f != null && sensor != null) {
                    try {
                        synchronized (a.this.f) {
                            for (InterfaceC0223a interfaceC0223a : a.this.f) {
                                if (interfaceC0223a != null && !a(this.c, interfaceC0223a, sensor)) {
                                    interfaceC0223a.onAccuracyChanged(sensor, i);
                                }
                            }
                        }
                    } catch (Exception e) {
                        c.a("OrientalSensorManager-onAccuracyChanged:" + e.getMessage(), 3);
                    }
                }
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3deac13d1da6266d8d7f28a95bde5d43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3deac13d1da6266d8d7f28a95bde5d43");
                } else if (a.this.f != null && sensorEvent != null) {
                    try {
                        synchronized (a.this.f) {
                            for (InterfaceC0223a interfaceC0223a : a.this.f) {
                                if (interfaceC0223a != null && !a(this.b, interfaceC0223a, sensorEvent.sensor)) {
                                    interfaceC0223a.onSensorChanged(sensorEvent);
                                }
                            }
                        }
                    } catch (Exception e) {
                        c.a("OrientalSensorManager-onSensorChanged:" + e.getMessage(), 3);
                    }
                }
            }
        };
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd6b24e44672d084d1ddeff558ff9290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd6b24e44672d084d1ddeff558ff9290");
            return;
        }
        this.e = 0;
        this.f = Collections.synchronizedSet(new HashSet());
        this.l = new SensorEventListener() { // from class: com.meituan.android.common.locate.sensor.a.2
            public static ChangeQuickRedirect changeQuickRedirect;
            private Map<InterfaceC0223a, SparseArray<Long>> b = new HashMap();
            private Map<InterfaceC0223a, SparseArray<Long>> c = new HashMap();

            private boolean a(Map<InterfaceC0223a, SparseArray<Long>> map, InterfaceC0223a interfaceC0223a, Sensor sensor) {
                Object[] objArr2 = {map, interfaceC0223a, sensor};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bd0e21f7aa1fa586c3b181a1e54bcea", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bd0e21f7aa1fa586c3b181a1e54bcea")).booleanValue();
                }
                long b = interfaceC0223a.b();
                if (b > 0 && sensor != null) {
                    SparseArray<Long> sparseArray = map.get(interfaceC0223a);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>();
                        map.put(interfaceC0223a, sparseArray);
                    }
                    Long l = sparseArray.get(sensor.getType());
                    if (l == null || SystemClock.elapsedRealtime() - l.longValue() > b) {
                        sparseArray.put(sensor.getType(), Long.valueOf(SystemClock.elapsedRealtime()));
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
                Object[] objArr2 = {sensor, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a7ad630debd15b336b6dffbeea2f2f44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a7ad630debd15b336b6dffbeea2f2f44");
                } else if (a.this.f != null && sensor != null) {
                    try {
                        synchronized (a.this.f) {
                            for (InterfaceC0223a interfaceC0223a : a.this.f) {
                                if (interfaceC0223a != null && !a(this.c, interfaceC0223a, sensor)) {
                                    interfaceC0223a.onAccuracyChanged(sensor, i);
                                }
                            }
                        }
                    } catch (Exception e) {
                        c.a("OrientalSensorManager-onAccuracyChanged:" + e.getMessage(), 3);
                    }
                }
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3deac13d1da6266d8d7f28a95bde5d43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3deac13d1da6266d8d7f28a95bde5d43");
                } else if (a.this.f != null && sensorEvent != null) {
                    try {
                        synchronized (a.this.f) {
                            for (InterfaceC0223a interfaceC0223a : a.this.f) {
                                if (interfaceC0223a != null && !a(this.b, interfaceC0223a, sensorEvent.sensor)) {
                                    interfaceC0223a.onSensorChanged(sensorEvent);
                                }
                            }
                        }
                    } catch (Exception e) {
                        c.a("OrientalSensorManager-onSensorChanged:" + e.getMessage(), 3);
                    }
                }
            }
        };
        this.a = Privacy.createSensorManager(context, "pt-c140c5921e4d3392");
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e7c890afcde51a0f67fba491a4fa497", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e7c890afcde51a0f67fba491a4fa497");
        }
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a(context);
                }
            }
        }
        return g;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ad30cc3b8b5f42225a768de12fed73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ad30cc3b8b5f42225a768de12fed73");
        } else if (this.i == null || !this.i.isAlive()) {
            if (this.i == null) {
                this.i = com.sankuai.android.jarvis.c.a("sensor_thread", new Runnable() { // from class: com.meituan.android.common.locate.sensor.a.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e56f2cf08f4f81e5f647804b1319733", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e56f2cf08f4f81e5f647804b1319733");
                            return;
                        }
                        LogUtils.a("sensor_thread start");
                        Looper.prepare();
                        a.this.j = new Handler();
                        a.this.k = true;
                        Looper.loop();
                        a.this.k = false;
                        LogUtils.a("sensor_thread stop");
                    }
                });
            }
            this.i.start();
            if (this.i.isAlive()) {
                return;
            }
            this.i.start();
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2bf66477ec1b63cf15037b076bb2763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2bf66477ec1b63cf15037b076bb2763");
        } else if ((this.e & i) == i) {
        } else {
            if (this.b == null && a(i, 1)) {
                this.b = this.a.getDefaultSensor(1);
                this.e |= 1;
                if (this.j == null && this.k) {
                    this.a.registerListener(this.l, this.b, 1);
                } else {
                    this.a.registerListener(this.l, this.b, 1, this.j);
                }
            }
            if (this.c == null && a(i, 16)) {
                this.c = this.a.getDefaultSensor(2);
                this.e = 16 | this.e;
                if (this.j == null && this.k) {
                    this.a.registerListener(this.l, this.c, 1);
                } else {
                    this.a.registerListener(this.l, this.c, 1, this.j);
                }
            }
            if (this.d == null && a(i, 256)) {
                this.d = this.a.getDefaultSensor(4);
                this.e = 256 | this.e;
                if (this.j == null && this.k) {
                    this.a.registerListener(this.l, this.d, 1);
                } else {
                    this.a.registerListener(this.l, this.d, 1, this.j);
                }
            }
            if (this.h == null && a(i, 4096)) {
                this.h = this.a.getDefaultSensor(6);
                if (this.h != null) {
                    this.e |= 4096;
                    if (this.j == null && this.k) {
                        this.a.registerListener(this.l, this.h, 1000000);
                    } else {
                        this.a.registerListener(this.l, this.h, 1000000, this.j);
                    }
                }
            }
        }
    }

    private boolean a(int i, int i2) {
        return (i & i2) == i2 && (this.e & i2) != i2;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc01c6d3807af35c0920a82a6f9424e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc01c6d3807af35c0920a82a6f9424e7");
        } else if (this.i == null || !this.i.isAlive()) {
        } else {
            try {
                this.j.getLooper().quitSafely();
                this.j = null;
                this.i = null;
            } catch (Exception unused) {
            }
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ad83a9e74d9febd5ad37488bab2076b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ad83a9e74d9febd5ad37488bab2076b");
        } else if ((this.e & i) == 0) {
        } else {
            if (this.b != null && b(i, 1)) {
                this.a.unregisterListener(this.l, this.b);
                this.e &= -2;
                this.b = null;
            }
            if (this.c != null && b(i, 16)) {
                this.a.unregisterListener(this.l, this.c);
                this.e &= -17;
                this.c = null;
            }
            if (this.d != null && b(i, 256)) {
                this.a.unregisterListener(this.l, this.d);
                this.e &= -257;
                this.d = null;
            }
            if (this.h != null && b(i, 4096)) {
                this.a.unregisterListener(this.l, this.h);
                this.e &= -4097;
                this.h = null;
            }
            if (this.e == 0) {
                this.a.unregisterListener(this.l);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    private boolean b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        int i3 = this;
        if (PatchProxy.isSupport(objArr, i3, changeQuickRedirect2, false, "1924505e38dd1ab9836bb8189798e2ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1924505e38dd1ab9836bb8189798e2ca")).booleanValue();
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            i3 = 0;
        }
        synchronized (this.f) {
            try {
                i3 = 0;
                for (InterfaceC0223a interfaceC0223a : this.f) {
                    if (interfaceC0223a != null) {
                        i3 |= interfaceC0223a.a();
                    }
                }
                return (i3 & i2) == i2 && (i & i2) == i2 && (this.e & i2) == i2;
            } catch (Throwable th2) {
                th = th2;
                i3 = 0;
                try {
                    throw th;
                } catch (Exception e2) {
                    e = e2;
                    c.a("OrientalSensorManager-needCloseSensor:" + e.getMessage(), 3);
                    if ((i3 & i2) == i2) {
                        return false;
                    }
                }
            }
        }
    }

    public void a(InterfaceC0223a interfaceC0223a) {
        Object[] objArr = {interfaceC0223a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95fc2857ba83c461df9cb27422c388f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95fc2857ba83c461df9cb27422c388f5");
            return;
        }
        synchronized (this.f) {
            if (interfaceC0223a != null) {
                try {
                    if (interfaceC0223a.a() != 0) {
                        this.f.add(interfaceC0223a);
                        a();
                        a(interfaceC0223a.a());
                    }
                } finally {
                }
            }
        }
    }

    public void b(InterfaceC0223a interfaceC0223a) {
        Object[] objArr = {interfaceC0223a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39570da2ac3bca3a249808f323910ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39570da2ac3bca3a249808f323910ad7");
            return;
        }
        synchronized (this.f) {
            if (interfaceC0223a != null) {
                try {
                    if (interfaceC0223a.a() != 0) {
                        this.f.remove(interfaceC0223a);
                        if (this.f.size() == 0) {
                            b();
                        }
                        b(interfaceC0223a.a());
                    }
                } finally {
                }
            }
        }
    }
}
