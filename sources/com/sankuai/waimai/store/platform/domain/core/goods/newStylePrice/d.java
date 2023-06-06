package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum d {
    FONT_STYLE_28,
    FONT_STYLE_32,
    FONT_STYLE_36,
    FONT_STYLE_40,
    FONT_STYLE_48,
    FONT_STYLE_DETAIL;
    
    public static ChangeQuickRedirect a;

    d() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6058bf47de31d64b254798946826be4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6058bf47de31d64b254798946826be4");
        }
    }

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "594c5cedfa6204cafe745933b43b108f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "594c5cedfa6204cafe745933b43b108f") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d446d26451e0b2edf0f18e71896bb766", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d446d26451e0b2edf0f18e71896bb766") : (d[]) values().clone();
    }
}
