package com.sankuai.ehcore.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcf7f68e5786a69e523bf607d44e052f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcf7f68e5786a69e523bf607d44e052f") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getUserId() : "";
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "005e5120e3c6fc4b16a1677247569155", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "005e5120e3c6fc4b16a1677247569155");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }
}
