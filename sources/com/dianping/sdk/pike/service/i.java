package com.dianping.sdk.pike.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum i {
    OK,
    Invalid,
    Repeat,
    Message_NULL;
    
    public static ChangeQuickRedirect a;

    i() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667fc9b72f8655ecb0ea2a4195cb58a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667fc9b72f8655ecb0ea2a4195cb58a4");
        }
    }

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d825f04ea1a79dcc87b313e17a7dc542", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d825f04ea1a79dcc87b313e17a7dc542") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8831834ceb26ef9df4b3b3d72e411b3b", RobustBitConfig.DEFAULT_VALUE) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8831834ceb26ef9df4b3b3d72e411b3b") : (i[]) values().clone();
    }
}
