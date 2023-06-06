package com.meituan.msc.mmpviews.csstypes;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum f {
    hidden,
    visible,
    scroll,
    auto;
    
    public static ChangeQuickRedirect a;

    f() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c588a6a80fe3c52e5826812e2b663560", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c588a6a80fe3c52e5826812e2b663560");
        }
    }

    public static f valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb1b5c4a1d531b8499ff1b1b02879458", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb1b5c4a1d531b8499ff1b1b02879458") : (f) Enum.valueOf(f.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf9343a4804e748a439f6fb771893fa0", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf9343a4804e748a439f6fb771893fa0") : (f[]) values().clone();
    }

    public static f a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffcc7492a67e17b2d514b8f46889cf8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffcc7492a67e17b2d514b8f46889cf8f");
        }
        if (str == null) {
            return visible;
        }
        f valueOf = valueOf(str);
        return valueOf != null ? valueOf : visible;
    }
}
