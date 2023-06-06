package com.meituan.msc.uimanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum t {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;
    
    public static ChangeQuickRedirect a;

    t() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dddcef16604613b706bb716a68bc499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dddcef16604613b706bb716a68bc499");
        }
    }

    public static t valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba31e2d0057f67f29e28209377bc151d", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba31e2d0057f67f29e28209377bc151d") : (t) Enum.valueOf(t.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7606e8d183a52793c8b9461adc3bdae1", RobustBitConfig.DEFAULT_VALUE) ? (t[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7606e8d183a52793c8b9461adc3bdae1") : (t[]) values().clone();
    }
}
