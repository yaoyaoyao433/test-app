package com.sankuai.waimai.platform.dynamic.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Gson b;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0bba1d1f8e4231bd1e6111908df420c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0bba1d1f8e4231bd1e6111908df420c");
        }
        if (b == null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Integer.class, new IntegerDefaultAdapter());
            gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntegerDefaultAdapter());
            b = gsonBuilder.create();
        }
        return b;
    }
}
