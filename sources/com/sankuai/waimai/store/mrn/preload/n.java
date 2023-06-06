package com.sankuai.waimai.store.mrn.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum n {
    PROCESSING,
    SUCCESS,
    FAILED;
    
    public static ChangeQuickRedirect a;

    n() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1aa41056aa5f4ef3f572d3d2515cd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1aa41056aa5f4ef3f572d3d2515cd0");
        }
    }

    public static n valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e4ac5508934bf4fc012e8d227d918dc", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e4ac5508934bf4fc012e8d227d918dc") : (n) Enum.valueOf(n.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7a95b73912a9f1b4e1d702856d14fde", RobustBitConfig.DEFAULT_VALUE) ? (n[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7a95b73912a9f1b4e1d702856d14fde") : (n[]) values().clone();
    }
}
