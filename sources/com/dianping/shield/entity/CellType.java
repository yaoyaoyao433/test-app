package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum CellType {
    NORMAL,
    HEADER,
    FOOTER,
    LOADING_MORE,
    LOADING;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    CellType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31e5607f5aa3d01abef186d420c3889", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31e5607f5aa3d01abef186d420c3889");
        }
    }

    public static CellType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5319d39cc96d76e3bbedfccd2e56daa6", RobustBitConfig.DEFAULT_VALUE) ? (CellType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5319d39cc96d76e3bbedfccd2e56daa6") : (CellType) Enum.valueOf(CellType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CellType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b4682aa7c5d0065eeada2f7a2af546a", RobustBitConfig.DEFAULT_VALUE) ? (CellType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b4682aa7c5d0065eeada2f7a2af546a") : (CellType[]) values().clone();
    }
}
