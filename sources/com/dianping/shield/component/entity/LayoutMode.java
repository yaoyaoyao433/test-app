package com.dianping.shield.component.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum LayoutMode {
    LINEAR_LAYOUT_MANAGER,
    STAGGERED_GRID_LAYOUT_MANAGER;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    LayoutMode() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a71972c80d03064b5f84b8b44e6515fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a71972c80d03064b5f84b8b44e6515fb");
        }
    }

    public static LayoutMode valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57c0affbccfa3d561100f72f0e42476a", RobustBitConfig.DEFAULT_VALUE) ? (LayoutMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57c0affbccfa3d561100f72f0e42476a") : (LayoutMode) Enum.valueOf(LayoutMode.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LayoutMode[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39b78acaf31eb711eb43d966c6e4e80d", RobustBitConfig.DEFAULT_VALUE) ? (LayoutMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39b78acaf31eb711eb43d966c6e4e80d") : (LayoutMode[]) values().clone();
    }
}
