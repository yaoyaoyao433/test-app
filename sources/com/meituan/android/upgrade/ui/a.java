package com.meituan.android.upgrade.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    REMIND_UPGRADE,
    REMIND_INSTALL,
    REMIND_MARKET,
    DOWNLOADING,
    DOWNLOAD_SUCCESS,
    DOWNLOAD_FAIL;
    
    public static ChangeQuickRedirect a;

    a() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67767b7b9b5f375d31baf9c5b508d2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67767b7b9b5f375d31baf9c5b508d2d");
        }
    }

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51956d949644b73cd6bab400992608ba", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51956d949644b73cd6bab400992608ba") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "423b4d9864e15fc3720d6199a6c840c3", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "423b4d9864e15fc3720d6199a6c840c3") : (a[]) values().clone();
    }
}
