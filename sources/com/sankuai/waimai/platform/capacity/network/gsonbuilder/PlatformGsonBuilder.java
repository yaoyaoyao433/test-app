package com.sankuai.waimai.platform.capacity.network.gsonbuilder;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.LocationBaseResponse;
import com.sankuai.waimai.foundation.location.model.LocationHistoryAddressResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import com.sankuai.waimai.platform.domain.manager.againstcheat.AgainstCheatingResponseData;
import com.sankuai.waimai.platform.domain.manager.location.model.MtAddressSearchResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.SaveCategoryResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.SelfDeliveryRouteResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PlatformGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5a3628c2f06be1ef39b85be12145d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5a3628c2f06be1ef39b85be12145d0f");
        } else {
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).registerTypeAdapter(Poi.class, new Poi.PoiDeserializer()).registerTypeAdapter(RestRecommendPoi.class, new RestRecommendPoi.Deserializer()).registerTypeAdapter(NewHistoryAddressResponse.class, new NewHistoryAddressResponse.Deserializer()).registerTypeAdapter(LocationHistoryAddressResponse.class, new LocationHistoryAddressResponse.Deserializer()).registerTypeAdapter(SaveCategoryResponse.class, new SaveCategoryResponse.Deserializer()).registerTypeAdapter(PoiShoppingCartAndPoi.class, new PoiShoppingCartAndPoi.Deserializer()).registerTypeAdapter(ShareInfo.class, new ShareInfo.Deserializer());
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerMafApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8a919a9baf8cd121f270bb991884852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8a919a9baf8cd121f270bb991884852");
        } else {
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).registerTypeAdapter(MtAddressSearchResponse.class, new MtAddressSearchResponse.Deserializer()).registerTypeAdapter(SelfDeliveryRouteResponse.class, new SelfDeliveryRouteResponse.Deserializer());
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerDeliveryApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c564eed81ced7a4546321ef9fe984a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c564eed81ced7a4546321ef9fe984a");
        } else {
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).registerTypeAdapter(MtAddressSearchResponse.class, new MtAddressSearchResponse.Deserializer());
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerMtMobileApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f655bf84aa3915962530575f10473a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f655bf84aa3915962530575f10473a6b");
        } else {
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).registerTypeAdapter(LocationBaseResponse.class, new LocationBaseResponse.LocationBaseResponseDeserializer());
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmWebRnApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c8085c0f75c5b619212b55d358f9fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c8085c0f75c5b619212b55d358f9fa");
        } else {
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer());
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmAgainstCheatingApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6253971792a07aa8aeca41535005082b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6253971792a07aa8aeca41535005082b");
        } else {
            gsonBuilder.registerTypeAdapter(AgainstCheatingResponseData.class, new AgainstCheatingResponseData.Deserializer());
        }
    }
}
