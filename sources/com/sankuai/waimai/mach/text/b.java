package com.sankuai.waimai.mach.text;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum b {
    TEXT_START,
    TEXT_END,
    CENTER,
    LAYOUT_START,
    LAYOUT_END,
    LEFT,
    RIGHT;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df43c5cd06c7178ff6d1e541f71fd36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df43c5cd06c7178ff6d1e541f71fd36");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "550e787211f66e2b48c844580da27774", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "550e787211f66e2b48c844580da27774") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "953e0161f658051c355cc7196ab7d9ab", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "953e0161f658051c355cc7196ab7d9ab") : (b[]) values().clone();
    }
}
