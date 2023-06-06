package com.sankuai.meituan.takeoutnew.util.aop;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Sensor a(SensorManager sensorManager, int i) {
        Object[] objArr = {sensorManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "348afcdb5c25b8e887dbd5d8465dc975", RobustBitConfig.DEFAULT_VALUE)) {
            return (Sensor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "348afcdb5c25b8e887dbd5d8465dc975");
        }
        if (i != 1 || a()) {
            return sensorManager.getDefaultSensor(i);
        }
        return null;
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "469854a8948d10cc622c572d0daedf97", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "469854a8948d10cc622c572d0daedf97")).booleanValue() : Build.VERSION.SDK_INT >= 26 || Build.VERSION.SDK_INT < 23 || !"huawei".equalsIgnoreCase(Build.BRAND);
    }
}
