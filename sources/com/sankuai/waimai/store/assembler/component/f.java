package com.sankuai.waimai.store.assembler.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum f {
    Normal,
    Sticky,
    FloatTitle,
    MultiList,
    Background,
    Float;
    
    public static ChangeQuickRedirect a;

    f() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba885100c1c2f41b48fef02b5d53e16c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba885100c1c2f41b48fef02b5d53e16c");
        }
    }

    public static f valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31eb244242ddfc5666951d067b596757", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31eb244242ddfc5666951d067b596757") : (f) Enum.valueOf(f.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1139233b2cdd2d7dc08bda5550b8b82", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1139233b2cdd2d7dc08bda5550b8b82") : (f[]) values().clone();
    }
}
