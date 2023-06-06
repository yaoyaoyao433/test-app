package com.sankuai.waimai.irmo.mach.effect.gyro;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public final class b implements SensorEventListener {
    public static ChangeQuickRedirect a;
    public double b;
    public double c;
    public double d;
    ScheduledFuture<?> e;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private InterfaceC0971b j;
    private Handler k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.mach.effect.gyro.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0971b {
        void a(double d, double d2, double d3);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afa4ec6aec1656c715d7e1c42b84ade", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afa4ec6aec1656c715d7e1c42b84ade");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7573a9ac11cec43b06ea50ac4ed06a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7573a9ac11cec43b06ea50ac4ed06a8");
            } else {
                b.this.k.post(new Runnable() { // from class: com.sankuai.waimai.irmo.mach.effect.gyro.b.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beabd56917375f316464345d1239987e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beabd56917375f316464345d1239987e");
                        } else if (b.this.j != null) {
                            b.this.j.a(b.this.c, b.this.d, b.this.b);
                        }
                    }
                });
            }
        }
    }

    public b(InterfaceC0971b interfaceC0971b) {
        Object[] objArr = {interfaceC0971b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b058904e21d23c81e9aab152f23497af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b058904e21d23c81e9aab152f23497af");
            return;
        }
        this.k = new Handler(Looper.getMainLooper());
        this.j = interfaceC0971b;
        this.f = new float[3];
        this.g = new float[9];
        this.h = new float[3];
        this.i = new float[3];
        this.e = c.c("GyroSensorThread").scheduleAtFixedRate(new a(), 0L, 16L, TimeUnit.MILLISECONDS);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533af6fdb0e53c95576c3882d4a15e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533af6fdb0e53c95576c3882d4a15e4e");
        } else if (sensorEvent.sensor.getType() == 2) {
            this.h = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 1) {
            this.f = sensorEvent.values;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0b3f1360519439b85058f90a860217e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0b3f1360519439b85058f90a860217e");
                return;
            }
            SensorManager.getRotationMatrix(this.g, null, this.f, this.h);
            SensorManager.getOrientation(this.g, this.i);
            this.b = Math.toDegrees(this.i[0]);
            this.c = Math.toDegrees(this.i[1]);
            this.d = Math.toDegrees(this.i[2]);
        }
    }
}
