package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private String b;
    private Activity c;

    public k(Map<String, String> map, String str, Activity activity) {
        Object[] objArr = {map, str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d36630bd1ff99a2776d329b38957ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d36630bd1ff99a2776d329b38957ed");
            return;
        }
        try {
            this.b = map.get("data");
            this.c = activity;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
        }
    }

    public final void a(String str, final a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c2d4846d74b9e2a3e27831ed4e162a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c2d4846d74b9e2a3e27831ed4e162a");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((SubmitOrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) SubmitOrderService.class)).orderSubmit(this.b), new b.AbstractC1042b<BaseResponse<SubmitOrderResponse>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.k.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc47131913b25bd778c569518a66264b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc47131913b25bd778c569518a66264b");
                        return;
                    }
                    try {
                        aVar.a(baseResponse);
                    } catch (Throwable th) {
                        com.sankuai.waimai.foundation.utils.log.a.a(th);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37b39c4947e90e597dd646de09e4a434", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37b39c4947e90e597dd646de09e4a434");
                        return;
                    }
                    try {
                        aVar.a(th);
                    } catch (Throwable th2) {
                        com.sankuai.waimai.foundation.utils.log.a.a(th2);
                    }
                }
            }, str);
        }
    }
}
