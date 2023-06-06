package com.meituan.msc.uimanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum m {
    PARENT,
    LEAF,
    NONE;
    
    public static ChangeQuickRedirect a;

    m() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b0afb53882cdc7ffa1b3a0541a187d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b0afb53882cdc7ffa1b3a0541a187d");
        }
    }

    public static m valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5d373be1182455d4f8906ee153caea4", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5d373be1182455d4f8906ee153caea4") : (m) Enum.valueOf(m.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "428b272c3e4adbd98769267b9befb959", RobustBitConfig.DEFAULT_VALUE) ? (m[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "428b272c3e4adbd98769267b9befb959") : (m[]) values().clone();
    }
}
