package com.meituan.msc.modules.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    Unknown,
    Launching,
    Launched,
    Released;
    
    public static ChangeQuickRedirect a;

    a() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84ed77c4e1798ac239282c89f48e986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84ed77c4e1798ac239282c89f48e986");
        }
    }

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a79a28a9d4a065e0705dfb720021ccdb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a79a28a9d4a065e0705dfb720021ccdb") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5de83baeefd3ffbd045d65d873f3639", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5de83baeefd3ffbd045d65d873f3639") : (a[]) values().clone();
    }
}
