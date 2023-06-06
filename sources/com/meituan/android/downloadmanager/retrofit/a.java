package com.meituan.android.downloadmanager.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static i.a b;

    public static i.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3cf3f634c00fdfd22d50ebc73438323", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3cf3f634c00fdfd22d50ebc73438323");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = com.sankuai.meituan.retrofit2.converter.gson.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "da936e0f6c9bf590bd7d77b1cc33b357", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "da936e0f6c9bf590bd7d77b1cc33b357") : new GsonBuilder().create());
                }
            }
        }
        return b;
    }
}
