package com.meituan.android.edfu.mbar.util;

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
public final class e implements SensorEventListener {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public a c;
    public b d;
    private Context e;
    private Sensor f;
    private MtSensorManager g;
    private float h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(float f);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public e(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(5.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfce1a7d4832ed2560ff6fdf3ef88404", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfce1a7d4832ed2560ff6fdf3ef88404");
            return;
        }
        this.h = -1.0f;
        this.e = context;
        this.h = 5.0f;
        this.g = Privacy.createSensorManager(context, "com.meituan.android.edfu:mbar");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98e3a087a6ce5b9d40ee04dbe038291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98e3a087a6ce5b9d40ee04dbe038291");
        } else if (this.g == null) {
        } else {
            this.f = this.g.getDefaultSensor(5);
            if (this.f != null) {
                try {
                    this.g.registerListener(this, this.f, 3);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a6c5ec29e15ce03d062691cc21f7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a6c5ec29e15ce03d062691cc21f7cf");
        } else if (this.f != null) {
            this.g.unregisterListener(this);
            this.f = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df65bd54ce096b1e2ea35e032f0abd9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df65bd54ce096b1e2ea35e032f0abd9f");
            return;
        }
        float f = sensorEvent.values[0];
        if (this.d != null) {
            this.d.a(f);
        }
        if (this.c != null) {
            if (this.h < 0.0f) {
                if (f <= 45.0f) {
                    b = true;
                    this.c.a(true);
                    return;
                } else if (f < 450.0f) {
                    return;
                }
            } else if (f < this.h) {
                b = true;
                this.c.a(true);
                return;
            }
            b = false;
            this.c.a(false);
        }
    }
}
