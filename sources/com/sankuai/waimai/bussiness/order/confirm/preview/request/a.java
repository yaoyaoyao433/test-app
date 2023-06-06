package com.sankuai.waimai.bussiness.order.confirm.preview.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.preview.model.DeliveryListResponse;
import com.sankuai.waimai.bussiness.order.confirm.service.GetPreDeliveryTimeService;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private HashMap<String, String> b;

    public a(String str, String str2, String str3, String str4, int i, AddressItem addressItem, int i2, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), addressItem, Integer.valueOf(i2), str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823256965d944b1825b552656c7aeb59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823256965d944b1825b552656c7aeb59");
            return;
        }
        this.b = new HashMap<>();
        this.b.put("wm_poi_id", str2);
        this.b.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str3);
        this.b.put("order_token", str4);
        if (addressItem != null) {
            this.b.put("addr_longitude", String.valueOf(addressItem.lng));
            this.b.put("addr_latitude", String.valueOf(addressItem.lat));
        }
        this.b.put("business_type", str);
        this.b.put("wm_order_pay_type", Integer.toString(i));
        this.b.put("wm_order_tag_type", Integer.toString(i2));
        this.b.put("preview_order_callback_info", str5);
        this.b.put("food_list", str6);
        this.b.put("cycle_purchase_info", str7);
    }

    public final void a(String str, final com.sankuai.waimai.bussiness.order.confirm.submit.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c74c029e823fe610b1853801cd7890c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c74c029e823fe610b1853801cd7890c");
        } else {
            b.a(((GetPreDeliveryTimeService) b.a((Class<Object>) GetPreDeliveryTimeService.class)).deliveryTimePre(this.b.get("wm_poi_id"), this.b.get(FoodDetailNetWorkPreLoader.URI_POI_STR), this.b.get("order_token"), this.b.get("addr_longitude"), this.b.get("addr_latitude"), this.b.get("business_type"), this.b.get("wm_order_pay_type"), this.b.get("preview_order_callback_info"), this.b.get("wm_order_tag_type"), this.b.get("food_list"), this.b.get("cycle_purchase_info")), new b.AbstractC1042b<BaseResponse<DeliveryListResponse>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.preview.request.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e46f0aae465111237037dd572bb993f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e46f0aae465111237037dd572bb993f");
                    } else {
                        aVar.a(baseResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f98a0abbeae34b83828e3aacc1796fdc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f98a0abbeae34b83828e3aacc1796fdc");
                    } else {
                        aVar.a(th);
                    }
                }
            }, str);
        }
    }
}
