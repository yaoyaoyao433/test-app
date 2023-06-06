package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum ScrollScope {
    PAGE,
    AGENT,
    SECTION,
    ROW,
    HEADER,
    FOOTER;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ScrollScope() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16261a7c5d65f461c62f7e41b73c4376", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16261a7c5d65f461c62f7e41b73c4376");
        }
    }

    public static ScrollScope valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d75e8005de2596b6dade81d79b9d4678", RobustBitConfig.DEFAULT_VALUE) ? (ScrollScope) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d75e8005de2596b6dade81d79b9d4678") : (ScrollScope) Enum.valueOf(ScrollScope.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ScrollScope[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5eb2d2356467f43141a9cdd2cf339ebf", RobustBitConfig.DEFAULT_VALUE) ? (ScrollScope[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5eb2d2356467f43141a9cdd2cf339ebf") : (ScrollScope[]) values().clone();
    }
}
