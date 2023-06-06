package com.dianping.sdk.pike;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum g {
    Enable(0, ""),
    NeedStart(-69, "client is not started, please start client first"),
    AuthFail(-60, "client is auth failed, please new client");
    
    public static ChangeQuickRedirect a;
    int e;
    String f;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5348ccc71d05af895dce9e130a8c1226", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5348ccc71d05af895dce9e130a8c1226") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a96d01d0a5e04f99e98770c13ef55f4", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a96d01d0a5e04f99e98770c13ef55f4") : (g[]) values().clone();
    }

    g(int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeae3d90d7c82f0015b520b083cac6cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeae3d90d7c82f0015b520b083cac6cb");
            return;
        }
        this.e = i;
        this.f = str;
    }
}
