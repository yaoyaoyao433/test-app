package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum ExposeScope {
    PX,
    COMPLETE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ExposeScope() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ae7cbdcec80df6d6183430d70e4ffbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ae7cbdcec80df6d6183430d70e4ffbb");
        }
    }

    public static ExposeScope valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cfbd813f792401b577b320a1facfd45", RobustBitConfig.DEFAULT_VALUE) ? (ExposeScope) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cfbd813f792401b577b320a1facfd45") : (ExposeScope) Enum.valueOf(ExposeScope.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ExposeScope[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c884f07d0ef7c456fcb9749616ea972b", RobustBitConfig.DEFAULT_VALUE) ? (ExposeScope[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c884f07d0ef7c456fcb9749616ea972b") : (ExposeScope[]) values().clone();
    }
}
