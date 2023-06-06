package com.meituan.android.neohybrid.neo.http;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum e {
    GET("GET"),
    POST("POST"),
    PUT(OneIdNetworkTool.PUT),
    DELETE("DELETE");
    
    public static ChangeQuickRedirect a;
    private String f;

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5617d979838fd2ea1ee618ccbf61e220", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5617d979838fd2ea1ee618ccbf61e220") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b891d9769676dbd38bfad031c68fddb2", RobustBitConfig.DEFAULT_VALUE) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b891d9769676dbd38bfad031c68fddb2") : (e[]) values().clone();
    }

    e(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febe1396ecab68c36ce7753d0bb76348", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febe1396ecab68c36ce7753d0bb76348");
        } else {
            this.f = str;
        }
    }
}
