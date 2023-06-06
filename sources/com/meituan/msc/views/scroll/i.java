package com.meituan.msc.views.scroll;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum i {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;
    
    public static ChangeQuickRedirect a;

    i() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5ff4ecc7a0d7efb32788cc90b2eb9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5ff4ecc7a0d7efb32788cc90b2eb9f");
        }
    }

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fe14d1046ebcc031faa621674baab5", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fe14d1046ebcc031faa621674baab5") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2fdd1e7c5f74e4e10461f44188fa463", RobustBitConfig.DEFAULT_VALUE) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2fdd1e7c5f74e4e10461f44188fa463") : (i[]) values().clone();
    }

    public static String a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6065d0dd1f2993a560799d5e95124c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6065d0dd1f2993a560799d5e95124c9");
        }
        switch (iVar) {
            case BEGIN_DRAG:
                return "topScrollBeginDrag";
            case END_DRAG:
                return "topScrollEndDrag";
            case SCROLL:
                return "topScroll";
            case MOMENTUM_BEGIN:
                return "topMomentumScrollBegin";
            case MOMENTUM_END:
                return "topMomentumScrollEnd";
            default:
                throw new IllegalArgumentException("Unsupported ScrollEventType: " + iVar);
        }
    }
}
