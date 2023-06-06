package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum Orientation {
    NONE,
    TOP,
    LEFT,
    BOTTOM,
    RIGHT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    Orientation() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2aaecc127f03a4b3c516364d1c3e8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2aaecc127f03a4b3c516364d1c3e8f");
        }
    }

    public static Orientation valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58e3daef306bba99732ffadfbe6b75f5", RobustBitConfig.DEFAULT_VALUE) ? (Orientation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58e3daef306bba99732ffadfbe6b75f5") : (Orientation) Enum.valueOf(Orientation.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Orientation[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52ef1890152f906c147907c345f18273", RobustBitConfig.DEFAULT_VALUE) ? (Orientation[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52ef1890152f906c147907c345f18273") : (Orientation[]) values().clone();
    }
}
