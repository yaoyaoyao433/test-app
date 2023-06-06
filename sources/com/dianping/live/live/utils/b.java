package com.dianping.live.live.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        boolean z;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a28909bf981457174aba0eb363df5306", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a28909bf981457174aba0eb363df5306")).booleanValue();
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (m.a() == 8) {
            z = true;
            if (Build.VERSION.SDK_INT < 23 && !Settings.canDrawOverlays(context)) {
                return Build.VERSION.SDK_INT <= 24 || z;
            }
            return false;
        }
        z = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 24) {
            return true;
        }
    }
}
