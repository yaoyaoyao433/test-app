package com.dianping.titans.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GsonProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Gson sGson;

    public static synchronized Gson getGson() {
        synchronized (GsonProvider.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b954efad4a4b6be9de47751f38254c9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b954efad4a4b6be9de47751f38254c9");
            }
            if (sGson == null) {
                sGson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            }
            return sGson;
        }
    }
}
