package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum ScrollDirection {
    UP,
    DOWN,
    STATIC,
    LEFT,
    RIGHT,
    OUT_UP,
    OUT_DOWN,
    OUT_STATIC,
    OUT_LEFT,
    OUT_RIGHT,
    GO_AHEAD,
    PAGE_BACK,
    GO_BACK,
    BECOME_ACTIVE,
    RESIGN_ACTIVE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ScrollDirection() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3cd5cc1bb4c74a89634aadc08d920f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3cd5cc1bb4c74a89634aadc08d920f0");
        }
    }

    public static ScrollDirection valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "787d8fb10582e704bfd60a329e70f2eb", RobustBitConfig.DEFAULT_VALUE) ? (ScrollDirection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "787d8fb10582e704bfd60a329e70f2eb") : (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ScrollDirection[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76e6df13e7ca97b1178fa90b5777caa4", RobustBitConfig.DEFAULT_VALUE) ? (ScrollDirection[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76e6df13e7ca97b1178fa90b5777caa4") : (ScrollDirection[]) values().clone();
    }

    public static ScrollDirection addOuterPrefix(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04777847c3da844ca149c1d7e507335a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollDirection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04777847c3da844ca149c1d7e507335a");
        }
        switch (scrollDirection) {
            case STATIC:
                return OUT_STATIC;
            case UP:
                return OUT_UP;
            case DOWN:
                return OUT_DOWN;
            case LEFT:
                return OUT_LEFT;
            case RIGHT:
                return OUT_RIGHT;
            default:
                return scrollDirection;
        }
    }
}
