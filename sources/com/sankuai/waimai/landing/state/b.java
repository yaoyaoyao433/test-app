package com.sankuai.waimai.landing.state;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum b {
    IDLE(0),
    ROUTE_START(1),
    ROUTE_SUCCESS(2),
    ROUTE_FAILED(2),
    PAGE_CREATED(3),
    PAGE_DATA_SUCCESS(4),
    PAGE_DATA_FAILED(4),
    PAGE_MRN_OR_H5_FAILED(4),
    PAGE_SHOWN(5);
    
    public static ChangeQuickRedirect a;
    int k;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10ed2f3b04d0c4a3b881f5d2a1333822", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10ed2f3b04d0c4a3b881f5d2a1333822") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b993e996580e2e8d41cb33f9585d607", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b993e996580e2e8d41cb33f9585d607") : (b[]) values().clone();
    }

    b(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c79fae23349b4cc61fe2766a642a6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c79fae23349b4cc61fe2766a642a6d8");
        } else {
            this.k = i;
        }
    }
}
