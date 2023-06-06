package com.meituan.android.mrn.utils.worker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum d {
    IN_QUEUE,
    EXECUTING,
    FINISHED,
    FAILED,
    CANCELED,
    PAUSED;
    
    public static ChangeQuickRedirect a;

    d() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52640e5818eefd415880cee673395c1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52640e5818eefd415880cee673395c1a");
        }
    }

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8760df7f52293f9ce8f47e97ba9629fb", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8760df7f52293f9ce8f47e97ba9629fb") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e50433a80337e99b4dce655bbe2c3d72", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e50433a80337e99b4dce655bbe2c3d72") : (d[]) values().clone();
    }
}
