package com.meituan.msc.mmpviews.scroll;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum e {
    SCROLL,
    SCROLL_TO_UPPER,
    SCROLL_TO_LOWER;
    
    public static ChangeQuickRedirect a;

    e() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fb5ee6001d5504b814c2362f5bee9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fb5ee6001d5504b814c2362f5bee9c");
        }
    }

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2433a48584c7ec5ff0d3460567a9d3fa", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2433a48584c7ec5ff0d3460567a9d3fa") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a231a51fe5dcfd43eee6d0a4b6b04335", RobustBitConfig.DEFAULT_VALUE) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a231a51fe5dcfd43eee6d0a4b6b04335") : (e[]) values().clone();
    }

    public static String a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06d2426ba9a16a12730fb4e39d9be33c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06d2426ba9a16a12730fb4e39d9be33c");
        }
        switch (eVar) {
            case SCROLL:
                return "onScroll";
            case SCROLL_TO_UPPER:
                return "onScrollToUpper";
            case SCROLL_TO_LOWER:
                return "onScrollToLower";
            default:
                throw new IllegalArgumentException("Unsupported ScrollEventType: " + eVar);
        }
    }
}
