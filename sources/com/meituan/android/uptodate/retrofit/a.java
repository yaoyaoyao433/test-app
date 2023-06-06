package com.meituan.android.uptodate.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static i.a b;

    public static i.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9985ae69a5072fa0a6468b72d660e5dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9985ae69a5072fa0a6468b72d660e5dd");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = com.sankuai.meituan.retrofit2.converter.gson.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c50756cb61645145119b50316b82dbcf", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c50756cb61645145119b50316b82dbcf") : new GsonBuilder().create());
                }
            }
        }
        return b;
    }
}
