package com.sankuai.waimai.bussiness.order.confirm.collect.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodResponse;
import com.sankuai.waimai.bussiness.order.confirm.service.AddCollectOrderFoodService;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(CollectOrderFoodParams collectOrderFoodParams, final com.sankuai.waimai.bussiness.order.confirm.submit.a aVar, String str) {
        int i;
        Object[] objArr = {collectOrderFoodParams, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fe89fe37ff12b4a4ef0ea947b1ba755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fe89fe37ff12b4a4ef0ea947b1ba755");
            return;
        }
        AddCollectOrderFoodService addCollectOrderFoodService = (AddCollectOrderFoodService) b.a((Class<Object>) AddCollectOrderFoodService.class);
        double d = collectOrderFoodParams.c;
        double d2 = collectOrderFoodParams.d;
        double d3 = collectOrderFoodParams.e;
        long j = collectOrderFoodParams.h;
        String str2 = collectOrderFoodParams.i;
        int i2 = collectOrderFoodParams.b;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = CollectOrderFoodParams.a;
        if (!PatchProxy.isSupport(objArr2, collectOrderFoodParams, changeQuickRedirect2, false, "215528c383af299d91b7bdcbccd72844", RobustBitConfig.DEFAULT_VALUE)) {
            switch (i2) {
                case 1:
                    i = 1;
                    break;
                case 2:
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                default:
                    i = i2;
                    break;
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, collectOrderFoodParams, changeQuickRedirect2, false, "215528c383af299d91b7bdcbccd72844")).intValue();
        }
        b.a(addCollectOrderFoodService.getOrderFoodList(d, d2, d3, j, str2, i, collectOrderFoodParams.f, collectOrderFoodParams.j, collectOrderFoodParams.o), new b.AbstractC1042b<BaseResponse<CollectOrderFoodResponse>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.collect.request.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr3 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63f39a15375ad982c4794ced8297fd7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63f39a15375ad982c4794ced8297fd7d");
                } else if (com.sankuai.waimai.bussiness.order.confirm.submit.a.this != null) {
                    com.sankuai.waimai.bussiness.order.confirm.submit.a.this.a(baseResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2273f078d1f4028060d67deaf0bcf451", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2273f078d1f4028060d67deaf0bcf451");
                } else if (com.sankuai.waimai.bussiness.order.confirm.submit.a.this == null) {
                } else {
                    com.sankuai.waimai.bussiness.order.confirm.submit.a.this.a(th);
                }
            }
        }, str);
    }
}
