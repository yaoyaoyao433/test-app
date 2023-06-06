package com.sankuai.titans.adapter.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.converter.gson.a;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.titans.protocol.utils.JsonUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RetrofitFactory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a sGsonConverterFactory;
    private static a.InterfaceC0637a sOkCallFactory;

    public static ar getInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70ed73e48082750ab0f074be23c02a11", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70ed73e48082750ab0f074be23c02a11");
        }
        if (sOkCallFactory == null) {
            sOkCallFactory = com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a();
        }
        if (sGsonConverterFactory == null) {
            sGsonConverterFactory = com.sankuai.meituan.retrofit2.converter.gson.a.a(JsonUtils.getExcludeGson());
        }
        return new ar.a().a(str).a(sOkCallFactory).a(sGsonConverterFactory).a();
    }
}
