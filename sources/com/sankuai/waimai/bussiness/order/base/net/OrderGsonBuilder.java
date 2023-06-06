package com.sankuai.waimai.bussiness.order.base.net;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.bussiness.order.confirm.preview.model.DeliveryListResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.submit.SubmitOrderResponse;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.CrossOrderResponse;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderBaseRocksResponse;
import com.sankuai.waimai.bussiness.order.list.model.OrderDetailEntity;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.bussiness.order.rocks.n;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ab83d205c542855552d87b1ab1777cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ab83d205c542855552d87b1ab1777cc");
        } else {
            gsonBuilder.registerTypeAdapter(Order.class, new Order.Deserializer()).registerTypeAdapter(OrderListResponse.class, new OrderListResponse.Deserializer()).registerTypeAdapter(DeliveryListResponse.class, new DeliveryListResponse.Deserializer()).registerTypeAdapter(SubmitOrderResponse.class, new SubmitOrderResponse.Deserializer()).registerTypeAdapter(OrderDetailEntity.class, new OrderDetailEntity.Deserializer()).registerTypeAdapter(CrossOrderResponse.class, new CrossOrderResponse.Deserializer()).registerTypeAdapter(CrossOrderSubmitResponse.class, new CrossOrderSubmitResponse.Deserializer()).registerTypeAdapter(OrderResponse.class, new OrderResponse.Deserializer()).registerTypeAdapter(OrderBaseRocksResponse.class, new OrderBaseRocksResponse.Deserializer()).registerTypeAdapter(OrderRocksServerModel.class, new OrderRocksServerModel.Deserializer()).registerTypeAdapter(n.class, new OrderRocksServerModel.Deserializer());
        }
    }
}
