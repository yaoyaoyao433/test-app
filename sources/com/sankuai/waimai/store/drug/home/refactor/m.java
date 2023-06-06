package com.sankuai.waimai.store.drug.home.refactor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum m {
    STATE_ON_START,
    STATE_ON_RESUME,
    STATE_ON_PAUSE,
    STATE_ON_STOP,
    STATE_ON_DESTROY;
    
    public static ChangeQuickRedirect a;

    m() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc46653b2f257f6942ef59696fe6124", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc46653b2f257f6942ef59696fe6124");
        }
    }

    public static m valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fac49ed752f4faaddfb7490c1347eb1e", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fac49ed752f4faaddfb7490c1347eb1e") : (m) Enum.valueOf(m.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71fd2696653a6d511a6732753d01bb15", RobustBitConfig.DEFAULT_VALUE) ? (m[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71fd2696653a6d511a6732753d01bb15") : (m[]) values().clone();
    }
}
