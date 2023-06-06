package com.sankuai.meituan.mapsdk.core.utils;

import android.app.ActivityManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48eb5327ef945d83a9a6ee383b3b0d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48eb5327ef945d83a9a6ee383b3b0d3d")).floatValue();
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static int a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f811572e8c2eb95f15f7379ee1eb1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f811572e8c2eb95f15f7379ee1eb1d")).intValue();
        }
        double d = f;
        int i = (d > 0.25d ? 1 : (d == 0.25d ? 0 : -1));
        if (i > 0 || f2 > 0.25d) {
            int i2 = (d > 0.75d ? 1 : (d == 0.75d ? 0 : -1));
            if (i2 > 0 || f2 > 0.25d) {
                int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i3 > 0 || f2 > 0.25d) {
                    if (i > 0 || f2 > 0.75d) {
                        if (i2 > 0 || f2 > 0.75d) {
                            if (i3 > 0 || f2 > 0.75d) {
                                if (i > 0 || f2 > 1.0f) {
                                    return (i2 > 0 || f2 > 1.0f) ? 8 : 4;
                                }
                                return 7;
                            }
                            return 2;
                        }
                        return 0;
                    }
                    return 1;
                }
                return 6;
            }
            return 3;
        }
        return 5;
    }

    public static float b(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    public static float c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c29681fce6173667e666cc31975e752e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c29681fce6173667e666cc31975e752e")).floatValue();
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static float d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edcd47a3e16581564cbbc33182788473", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edcd47a3e16581564cbbc33182788473")).floatValue();
        }
        if (f <= 0.0f) {
            f = Math.abs(f);
        }
        return f + 1000.0f;
    }

    public static float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef253792eaf2c8a7ca4d1b4de6d5e2a2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef253792eaf2c8a7ca4d1b4de6d5e2a2")).floatValue() : Math.max(f2, Math.min(f3, f));
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f31c58d03386d02a31e2ea8a298d82e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f31c58d03386d02a31e2ea8a298d82e8");
        }
        try {
            return ((ActivityManager) com.sankuai.meituan.mapsdk.mapcore.a.a().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo().getGlEsVersion();
        } catch (Exception unused) {
            return "";
        }
    }
}
