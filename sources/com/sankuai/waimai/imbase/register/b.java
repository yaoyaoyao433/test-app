package com.sankuai.waimai.imbase.register;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum b {
    WM_RIDER(0),
    WM_POI(1),
    RED_BUBBLE(2),
    UNREAD_BUBBLE(3);
    
    public static ChangeQuickRedirect a;
    public int f;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93647a6729a73cc5a9154d4c81227fc1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93647a6729a73cc5a9154d4c81227fc1") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "857ca5a5a66be6cafb9210b0b50fc939", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "857ca5a5a66be6cafb9210b0b50fc939") : (b[]) values().clone();
    }

    b(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4511d3f958a0eeb0d08800edf9f1b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4511d3f958a0eeb0d08800edf9f1b6");
        } else {
            this.f = i;
        }
    }
}
