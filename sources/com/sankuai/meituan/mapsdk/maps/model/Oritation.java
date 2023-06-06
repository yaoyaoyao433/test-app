package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum Oritation {
    NONE,
    TOP,
    LEFT,
    BOTTOM,
    RIGHT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    Oritation() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96f03b6e5ad66986005d89b207cd7fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96f03b6e5ad66986005d89b207cd7fa0");
        }
    }

    public static Oritation valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19fa287c52e4453242e02314711344be", RobustBitConfig.DEFAULT_VALUE) ? (Oritation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19fa287c52e4453242e02314711344be") : (Oritation) Enum.valueOf(Oritation.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Oritation[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df70f7d2e9216e77f29fb1d091513927", RobustBitConfig.DEFAULT_VALUE) ? (Oritation[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df70f7d2e9216e77f29fb1d091513927") : (Oritation[]) values().clone();
    }
}
