package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.View;
import android.view.animation.RotateAnimation;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i implements SensorEventListener {
    public static ChangeQuickRedirect a;
    public View b;
    public MtSensorManager c;
    public Marker d;
    private Sensor e;
    private float f;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20045fecbad9dec98af26e058a0b18fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20045fecbad9dec98af26e058a0b18fc");
            return;
        }
        this.b = null;
        this.d = null;
        if (this.c == null) {
            this.c = Privacy.createSensorManager(context, "com.sankuai.waimai:order-mt");
            this.e = this.c.getDefaultSensor(3);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2eb1cdbb0f891cb8a0a28dae3dd251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2eb1cdbb0f891cb8a0a28dae3dd251");
        } else if (this.c != null) {
            this.c.registerListener(this, this.e, 1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84b1d1ef221400bf7f6fd1d047f89ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84b1d1ef221400bf7f6fd1d047f89ef");
            return;
        }
        float f = sensorEvent.values[0];
        if (this.b != null) {
            this.b.clearAnimation();
            RotateAnimation rotateAnimation = new RotateAnimation(this.f, f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(200L);
            this.b.startAnimation(rotateAnimation);
            this.f = f;
        } else if (this.d != null) {
            Marker marker = this.d;
            float f2 = 360.0f - f;
            Object[] objArr2 = {Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            float f3 = 0.0f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50c6c16b3c6db4b6765284bd50cc99a9", RobustBitConfig.DEFAULT_VALUE)) {
                f3 = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50c6c16b3c6db4b6765284bd50cc99a9")).floatValue();
            } else if (f2 != 0.0f) {
                f3 = 360.0f - f2;
            }
            marker.setRotateAngle(f3);
        }
    }
}
