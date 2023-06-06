package com.meituan.android.neohybrid.v2.neo.http;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum d {
    GET("GET"),
    POST("POST"),
    PUT(OneIdNetworkTool.PUT),
    DELETE("DELETE");
    
    public static ChangeQuickRedirect a;
    private String f;

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9d891a7103f7466932c2fd463eaa879", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9d891a7103f7466932c2fd463eaa879") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d34f104f032c93a067563af04501f003", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d34f104f032c93a067563af04501f003") : (d[]) values().clone();
    }

    d(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b1abadfe9af888c4dbfb970f38f4a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b1abadfe9af888c4dbfb970f38f4a9");
        } else {
            this.f = str;
        }
    }
}
