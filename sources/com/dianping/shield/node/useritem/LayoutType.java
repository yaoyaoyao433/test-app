package com.dianping.shield.node.useritem;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum LayoutType {
    LINEAR_FULL_FILL,
    GRID,
    STAGGERED_GRID,
    HORIZONTAL_SCROLL,
    TAB,
    FLIPPER,
    VIEWPAGER;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    LayoutType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d5023e8a12d9e8d633c007ee3e43fd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d5023e8a12d9e8d633c007ee3e43fd7");
        }
    }

    public static LayoutType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8979c08e7fc7f003bfeda427fc880a90", RobustBitConfig.DEFAULT_VALUE) ? (LayoutType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8979c08e7fc7f003bfeda427fc880a90") : (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LayoutType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "352f93d08b32681ade7e605809101b65", RobustBitConfig.DEFAULT_VALUE) ? (LayoutType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "352f93d08b32681ade7e605809101b65") : (LayoutType[]) values().clone();
    }
}
