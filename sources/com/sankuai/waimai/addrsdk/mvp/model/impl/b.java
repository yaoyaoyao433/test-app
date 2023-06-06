package com.sankuai.waimai.addrsdk.mvp.model.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.api.CitySearchApi;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.addrsdk.mvp.bean.CitySearchListBean;
import com.sankuai.waimai.addrsdk.mvp.model.d;
import com.sankuai.waimai.addrsdk.retrofit.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.addrsdk.mvp.model.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.addrsdk.mvp.model.b
    public final void a(final d<CityListBean, String> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d87c544a1549a357ec6b2e90a37fb1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d87c544a1549a357ec6b2e90a37fb1f");
        } else {
            com.sankuai.waimai.addrsdk.retrofit.c.a(((CitySearchApi) com.sankuai.waimai.addrsdk.retrofit.c.a(CitySearchApi.class)).list(com.sankuai.waimai.addrsdk.manager.a.a().c()), new c.b<BaseResponse<CityListBean>>() { // from class: com.sankuai.waimai.addrsdk.mvp.model.impl.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e68d608a305635690e73d67ce5f368b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e68d608a305635690e73d67ce5f368b6");
                    } else if (dVar != null) {
                        dVar.b(baseResponse.getData());
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "943504d633e2d4201a52693922a80d41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "943504d633e2d4201a52693922a80d41");
                    } else if (dVar != null) {
                        dVar.a(th.getMessage());
                    }
                }
            }, this);
        }
    }

    @Override // com.sankuai.waimai.addrsdk.mvp.model.b
    public final void a(String str, final d<CitySearchListBean, String> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639d629f4e30395ea514ea9ff1f271e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639d629f4e30395ea514ea9ff1f271e3");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("city_name", str);
        } catch (Exception unused) {
        }
        com.sankuai.waimai.addrsdk.retrofit.c.a(((CitySearchApi) com.sankuai.waimai.addrsdk.retrofit.c.a(CitySearchApi.class)).recommend(jSONObject.toString(), com.sankuai.waimai.addrsdk.manager.a.a().c()), new c.b<BaseResponse<CitySearchListBean>>() { // from class: com.sankuai.waimai.addrsdk.mvp.model.impl.b.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "102f5d84c447b72fb8cea9f27c7ed8f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "102f5d84c447b72fb8cea9f27c7ed8f8");
                } else if (dVar != null) {
                    dVar.b(baseResponse.getData());
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "573aaa14a8d2510a9402e57fd2018139", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "573aaa14a8d2510a9402e57fd2018139");
                } else if (dVar != null) {
                    dVar.a(th.getMessage());
                }
            }
        }, this);
    }
}
