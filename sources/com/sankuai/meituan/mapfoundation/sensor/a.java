package com.sankuai.meituan.mapfoundation.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private MtSensorManager b;

    public a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ab5fdeb5f4d3f69b37724b4baf8326", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ab5fdeb5f4d3f69b37724b4baf8326");
        } else if (context == null) {
        } else {
            this.b = Privacy.createSensorManager(context, str);
        }
    }

    public final Sensor a(int i) {
        Object[] objArr = {11};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c77e06694e1aa345e36e015cc79ca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c77e06694e1aa345e36e015cc79ca4");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getDefaultSensor(11);
    }

    public final boolean a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Object[] objArr = {sensorEventListener, sensor, Integer.valueOf((int) BlankConfig.MAX_SAMPLE)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcc69835c9a8bbaee7958e07693207c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcc69835c9a8bbaee7958e07693207c")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.registerListener(sensorEventListener, sensor, BlankConfig.MAX_SAMPLE);
    }

    public final void a(SensorEventListener sensorEventListener) {
        Object[] objArr = {sensorEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05b7209bee1bb4d2b0d4cc81fce0ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05b7209bee1bb4d2b0d4cc81fce0ca6");
        } else if (this.b == null) {
        } else {
            this.b.unregisterListener(sensorEventListener);
        }
    }
}
