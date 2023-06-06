package com.meituan.msc.common.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a574090ec9e6df19452838cccdc2646", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a574090ec9e6df19452838cccdc2646")).booleanValue();
        }
        try {
            if (activity.getResources().getConfiguration().toString().contains("hwMultiwindow-magic")) {
                return true;
            }
            Class<?> cls = Class.forName("com.huawei.android.magicwin.HwMagicWindowManagerEx");
            return Boolean.parseBoolean(String.valueOf(cls.getMethod("getHwMagicWinEnabled", String.class).invoke(cls, activity.getPackageName())));
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.b("DeviceUtil", e, "isMagicEnable");
            return false;
        }
    }
}
