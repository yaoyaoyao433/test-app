package com.meituan.android.customerservice.kit.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.PowerManager;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public MtSensorManager b;
    PowerManager.WakeLock c;
    public a d;
    private String e;

    public g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbe79be95bdbd6af4275481cb1a58bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbe79be95bdbd6af4275481cb1a58bb");
            return;
        }
        this.c = null;
        this.e = "";
        this.b = Privacy.createSensorManager(context, this.e);
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            Object[] objArr2 = {powerManager};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caa6dbb0d10cc62d8bd9dc435ee1e4c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caa6dbb0d10cc62d8bd9dc435ee1e4c6");
            } else {
                this.c = powerManager.newWakeLock(32, "SensorScreenManager");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements SensorEventListener {
        public static ChangeQuickRedirect a;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4197bea41f19fa18681a2c14db265866", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4197bea41f19fa18681a2c14db265866");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2d247b129dff5e739f82a55e661eae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2d247b129dff5e739f82a55e661eae");
            } else if (sensorEvent.sensor.getType() == 8) {
                if (c.a(sensorEvent.values[0], 0.0f)) {
                    g gVar = g.this;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = g.a;
                    if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "34a19fbeb0e269c8bcbbcf48089fcb97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "34a19fbeb0e269c8bcbbcf48089fcb97");
                        return;
                    } else if (gVar.c == null || gVar.c.isHeld()) {
                        return;
                    } else {
                        gVar.c.acquire(1800000L);
                        return;
                    }
                }
                g.this.a();
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51cee1e6d8bc5a5db972d639f191925f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51cee1e6d8bc5a5db972d639f191925f");
        } else if (this.c != null && this.c.isHeld()) {
            this.c.setReferenceCounted(false);
            this.c.release();
        }
    }
}
