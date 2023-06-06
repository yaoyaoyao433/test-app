package com.sankuai.android.share.keymodule.shortURL.request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static i.a b;

    public static i.a a() {
        Gson create;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea1a4346eca292a0006694c9fad522ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea1a4346eca292a0006694c9fad522ef");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cd7d3cafbe8b31a57ccb8f0281fa386d", RobustBitConfig.DEFAULT_VALUE)) {
                        create = (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cd7d3cafbe8b31a57ccb8f0281fa386d");
                    } else {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gsonBuilder.registerTypeAdapter(ShareShortUrlBean.class, new ShareShortUrlDeserializer());
                        create = gsonBuilder.create();
                    }
                    b = com.sankuai.meituan.retrofit2.converter.gson.a.a(create);
                }
            }
        }
        return b;
    }
}
