package com.sankuai.meituan.mapsdk.core.render.egl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca33f9692ff297751c78998cdd17a522", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca33f9692ff297751c78998cdd17a522")).intValue();
        }
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int a(Boolean bool, Boolean bool2) {
        Object[] objArr = {bool, bool2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18539d2e3ac892125c0d894ef886a094", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18539d2e3ac892125c0d894ef886a094")).intValue();
        }
        if (bool == bool2) {
            return 0;
        }
        return bool.booleanValue() ? 1 : -1;
    }
}
