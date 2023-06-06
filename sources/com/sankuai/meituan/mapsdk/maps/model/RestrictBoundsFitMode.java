package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum RestrictBoundsFitMode {
    FIT_WIDTH,
    FIT_HEIGHT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    RestrictBoundsFitMode() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39d5463fc33ee5328a8f851e4d9e5c18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39d5463fc33ee5328a8f851e4d9e5c18");
        }
    }

    public static RestrictBoundsFitMode valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58e49db88bb49eed0dcc2963f5613069", RobustBitConfig.DEFAULT_VALUE) ? (RestrictBoundsFitMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58e49db88bb49eed0dcc2963f5613069") : (RestrictBoundsFitMode) Enum.valueOf(RestrictBoundsFitMode.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RestrictBoundsFitMode[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5ab27925bf2536211ab460d983c62c0", RobustBitConfig.DEFAULT_VALUE) ? (RestrictBoundsFitMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5ab27925bf2536211ab460d983c62c0") : (RestrictBoundsFitMode[]) values().clone();
    }
}
