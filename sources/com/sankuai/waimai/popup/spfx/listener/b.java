package com.sankuai.waimai.popup.spfx.listener;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements SensorEventListener {
    public static ChangeQuickRedirect a;
    private long b;
    private float c;
    private float d;
    private float e;
    private int f;
    private a g;
    private boolean h;
    private float i;
    private Handler j;
    private Runnable k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(float f);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public static /* synthetic */ float a(b bVar, float f) {
        bVar.i = 0.0f;
        return 0.0f;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.h = false;
        return false;
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9776b5dad0d1376425f84bb9816042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9776b5dad0d1376425f84bb9816042");
            return;
        }
        this.f = 2000;
        this.h = false;
        this.i = 0.0f;
        this.j = new Handler();
        this.k = new Runnable() { // from class: com.sankuai.waimai.popup.spfx.listener.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "195d9239b8e8528b4a0911d65cfc11f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "195d9239b8e8528b4a0911d65cfc11f2");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("onShake", "-------------:" + b.this.i, new Object[0]);
                if (b.this.g != null) {
                    b.this.g.a(b.this.i + 2.0f);
                }
                b.a(b.this, 0.0f);
                b.a(b.this, false);
            }
        };
        this.g = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d359f586f864f5cab484a510db564f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d359f586f864f5cab484a510db564f7c");
        } else if (sensorEvent.sensor.getType() != 1) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.b;
            if (j < 100) {
                return;
            }
            this.b = currentTimeMillis;
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            float f4 = f - this.c;
            float f5 = f2 - this.d;
            float f6 = f3 - this.e;
            this.c = f;
            this.d = f2;
            this.e = f3;
            double sqrt = (Math.sqrt(((f4 * f4) + (f5 * f5)) + (f6 * f6)) / j) * 10000.0d;
            if (sqrt > this.f) {
                float f7 = (float) (sqrt / 1000.0d);
                com.sankuai.waimai.foundation.utils.log.a.b("onSensorChanged", "delta---" + sqrt + ", shakeDegrees=" + f7, new Object[0]);
                if (f7 > 10.0f) {
                    f7 = 10.0f;
                }
                this.i = Math.max(this.i, f7);
                if (this.h) {
                    return;
                }
                this.h = true;
                this.j.postDelayed(this.k, 500L);
            }
        }
    }
}
