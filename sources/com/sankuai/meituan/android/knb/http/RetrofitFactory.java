package com.sankuai.meituan.android.knb.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.converter.gson.a;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RetrofitFactory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a sGsonConverterFactory;
    private static a.InterfaceC0637a sOkCallFactory;

    public static ar getInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c54b3d16f97c70edb25121949dd69624", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c54b3d16f97c70edb25121949dd69624");
        }
        if (sOkCallFactory == null) {
            sOkCallFactory = com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a();
        }
        checkConverterFactory();
        return new ar.a().a(str).a(sOkCallFactory).a(sGsonConverterFactory).a();
    }

    private static void checkConverterFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebc42f4ff247d2edbd27ea276fe25131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebc42f4ff247d2edbd27ea276fe25131");
        } else if (sGsonConverterFactory == null) {
            sGsonConverterFactory = com.sankuai.meituan.retrofit2.converter.gson.a.a(KNBGsonProvider.getInstance().get());
        }
    }
}
