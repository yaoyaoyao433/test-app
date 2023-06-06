package com.sankuai.waimai.addrsdk.mvp.model.impl;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.api.AddressApi;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressListResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.model.d;
import com.sankuai.waimai.addrsdk.retrofit.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.addrsdk.mvp.model.a {
    public static ChangeQuickRedirect a;

    public final void a(int i, String str, final d<BaseResponse<AddressListResponse>, String> dVar) {
        Object[] objArr = {Integer.valueOf(i), str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835176b0822b352424d63d7d9a227d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835176b0822b352424d63d7d9a227d9e");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = "";
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        if (b != null) {
            String k = b.k();
            String l = b.l();
            if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                str2 = k + CommonConstant.Symbol.MINUS + l + "-1";
            }
        }
        try {
            jSONObject.put("address_type", i);
            jSONObject.put("extra", str);
        } catch (Exception unused) {
        }
        com.sankuai.waimai.addrsdk.retrofit.c.a(((AddressApi) com.sankuai.waimai.addrsdk.retrofit.c.a(AddressApi.class)).fetchAddressList(str2, jSONObject.toString(), com.sankuai.waimai.addrsdk.manager.a.a().c()), new c.b<BaseResponse<AddressListResponse>>() { // from class: com.sankuai.waimai.addrsdk.mvp.model.impl.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b559cc1a326351d3340330a44b6b9c47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b559cc1a326351d3340330a44b6b9c47");
                } else if (dVar != null) {
                    dVar.b(baseResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95c753d60b2e275849e0d51226984469", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95c753d60b2e275849e0d51226984469");
                } else if (dVar != null) {
                    dVar.a(th.getMessage());
                }
            }
        });
    }
}
