package com.meituan.msc.jse.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum LifecycleState {
    BEFORE_CREATE,
    BEFORE_RESUME,
    RESUMED;
    
    public static ChangeQuickRedirect a;

    LifecycleState() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d751f94b66c934368fad713187bfbe9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d751f94b66c934368fad713187bfbe9e");
        }
    }

    public static LifecycleState valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e0383fceca7bf9ed93a59aaf7f7002b", RobustBitConfig.DEFAULT_VALUE) ? (LifecycleState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e0383fceca7bf9ed93a59aaf7f7002b") : (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LifecycleState[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bf71bffe42e63de7d96f1264d42ffd3", RobustBitConfig.DEFAULT_VALUE) ? (LifecycleState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bf71bffe42e63de7d96f1264d42ffd3") : (LifecycleState[]) values().clone();
    }
}
