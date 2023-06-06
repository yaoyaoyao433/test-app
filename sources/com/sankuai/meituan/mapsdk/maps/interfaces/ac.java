package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum ac {
    MEITUAN,
    TENCENT,
    AMAP;
    
    public static ChangeQuickRedirect a;

    ac() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a7a8dcf9daa7ca1c85469992acb8f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a7a8dcf9daa7ca1c85469992acb8f1");
        }
    }

    public static ac valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de0997705607a20634fe801db4deb61a", RobustBitConfig.DEFAULT_VALUE) ? (ac) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de0997705607a20634fe801db4deb61a") : (ac) Enum.valueOf(ac.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ac[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c24c4a5573f52838e3eaa47dc72eb16", RobustBitConfig.DEFAULT_VALUE) ? (ac[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c24c4a5573f52838e3eaa47dc72eb16") : (ac[]) values().clone();
    }
}
