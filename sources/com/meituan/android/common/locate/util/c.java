package com.meituan.android.common.locate.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 14;
            case 3:
                return 13;
            default:
                return 0;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4d6097c299079954862c5c83578cd92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4d6097c299079954862c5c83578cd92")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return s.a(context, "pt-c140c5921e4d3392");
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c932300545f1cf26a248e10f1a4502a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c932300545f1cf26a248e10f1a4502a5")).intValue();
        }
        boolean j = LocationUtils.j(context);
        boolean e = LocationUtils.e(context);
        if (j && e) {
            return 0;
        }
        if (j || e) {
            if (j) {
                return 2;
            }
            return LocationUtils.a(context, i.a) ? 4 : 1;
        }
        return 3;
    }
}
