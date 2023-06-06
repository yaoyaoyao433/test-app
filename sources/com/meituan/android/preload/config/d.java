package com.meituan.android.preload.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static g b = g.PROD;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f49daa5335715ee33b74b68378bd84", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f49daa5335715ee33b74b68378bd84");
        }
        if (com.meituan.android.preload.util.a.b) {
            switch (b) {
                case PROD:
                    return "enlight_config";
                case STAGE:
                    return "enlight_config_st";
                case TEST:
                    return "enlight_config_test";
                default:
                    return "enlight_config";
            }
        }
        return "enlight_config";
    }
}
