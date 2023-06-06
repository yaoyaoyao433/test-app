package com.meituan.android.edfu.mvex.netservice;

import android.content.Context;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.BaseResult;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.Config;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.ImageRetrievalRequest;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.MedicineRetrievalResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static Context b = null;
    private static ar c = null;
    private static ImageRetrievalService d = null;
    private static boolean e = false;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91682c111b037ab511b1b2fe6e84db9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91682c111b037ab511b1b2fe6e84db9d");
            return;
        }
        b = context;
        ar a2 = new ar.a().a(e ? "https://ar2.test.meituan.com" : "https://ar.meituan.com").a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(b.a(context)).a(new a()).a(f.a()).a();
        c = a2;
        d = (ImageRetrievalService) a2.a(ImageRetrievalService.class);
    }

    public static rx.d<BaseResult<MedicineRetrievalResult>> a(ImageRetrievalRequest imageRetrievalRequest) {
        Object[] objArr = {imageRetrievalRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a46ec1e742ecb72e229a80e4438f1974", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a46ec1e742ecb72e229a80e4438f1974") : d.retrievalImage(imageRetrievalRequest).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
    }

    public static rx.d<BaseResult<Config>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "133b645304a6a1eba7e195ec2fa58e0f", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "133b645304a6a1eba7e195ec2fa58e0f") : d.getConfig().b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
    }
}
