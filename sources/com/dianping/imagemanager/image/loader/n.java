package com.dianping.imagemanager.image.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum n {
    INIT,
    PENDING,
    CACHE_CHECKING,
    HTTP_REQUIRING,
    DECODING,
    FINISHED;
    
    public static ChangeQuickRedirect a;

    n() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a68d41a7fcbfefd6b9e43951e36858e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a68d41a7fcbfefd6b9e43951e36858e");
        }
    }

    public static n valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a21e04932f0917c384537c1f5cbea2c8", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a21e04932f0917c384537c1f5cbea2c8") : (n) Enum.valueOf(n.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cb99c1488efd60fc8eaa01a466e9904", RobustBitConfig.DEFAULT_VALUE) ? (n[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cb99c1488efd60fc8eaa01a466e9904") : (n[]) values().clone();
    }
}
