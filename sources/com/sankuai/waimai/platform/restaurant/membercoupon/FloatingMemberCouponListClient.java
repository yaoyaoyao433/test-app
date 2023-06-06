package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FloatingMemberCouponListClient {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface Service {
        @POST("v4/member/order/common_submit")
        @FormUrlEncoded
        rx.d<BaseResponse<k>> memberCommonSubmit(@Field("sku_id") String str, @Field("order_token") String str2, @Field("vp_coupon_view_id") String str3, @Field("source") String str4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(com.sankuai.waimai.platform.modular.network.error.a aVar);

        void a(T t);
    }

    public FloatingMemberCouponListClient(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408dcdb8efd09e38cf180f9da67761c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408dcdb8efd09e38cf180f9da67761c9");
            return;
        }
        this.b = context;
        this.c = str;
    }

    public final void a(String str, String str2, String str3, String str4, final a<k> aVar) {
        Object[] objArr = {str, str2, str3, str4, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41ae86dc33e1a2af44a3e7ef4a896fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41ae86dc33e1a2af44a3e7ef4a896fc");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((Service) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) Service.class)).memberCommonSubmit(str, str2, str3, str4).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.b)), new com.sankuai.waimai.platform.capacity.network.rxsupport.b<k>() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.FloatingMemberCouponListClient.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(k kVar) {
                    k kVar2 = kVar;
                    Object[] objArr2 = {kVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35c46d549172287d79f2ec824ab416be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35c46d549172287d79f2ec824ab416be");
                    } else if (aVar != null) {
                        aVar.a((a) kVar2);
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4b23c9d27c38d21df7af6517ab304d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4b23c9d27c38d21df7af6517ab304d5");
                    } else if (aVar != null) {
                        aVar.a(aVar2);
                    }
                }
            }, this.c);
        }
    }
}
