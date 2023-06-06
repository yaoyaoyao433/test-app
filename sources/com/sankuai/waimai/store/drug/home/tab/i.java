package com.sankuai.waimai.store.drug.home.tab;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum i {
    INITIALED,
    CREATED,
    SHOWING,
    HIDDEN,
    DESTROY;
    
    public static ChangeQuickRedirect a;

    i() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f290159917534830cafb175dfc84cc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f290159917534830cafb175dfc84cc1");
        }
    }

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9db3603e880dc7f704dbd2828052cdbb", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9db3603e880dc7f704dbd2828052cdbb") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70dce03f87a7ba886d50e242ff2ce607", RobustBitConfig.DEFAULT_VALUE) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70dce03f87a7ba886d50e242ff2ce607") : (i[]) values().clone();
    }
}
