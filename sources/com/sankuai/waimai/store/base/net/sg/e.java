package com.sankuai.waimai.store.base.net.sg;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer;
import com.sankuai.waimai.store.repository.deserializer.BaseTileDeserializer;
import com.sankuai.waimai.store.repository.deserializer.BaseTileDeserializer2;
import com.sankuai.waimai.store.repository.deserializer.BaseTileDeserializer3;
import com.sankuai.waimai.store.repository.deserializer.BaseTileDeserializer4;
import com.sankuai.waimai.store.repository.deserializer.BaseTileDeserializer5;
import com.sankuai.waimai.store.repository.deserializer.BaseTileNewDeserializer;
import com.sankuai.waimai.store.repository.deserializer.HashMapAdapter;
import com.sankuai.waimai.store.repository.deserializer.StringBeanAdapter;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.SimpleTile;
import com.sankuai.waimai.store.repository.model.VerticalityHeaderResponse;
import com.sankuai.waimai.store.repository.model.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends com.sankuai.waimai.store.base.net.e {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.store.base.net.b
    public final GsonBuilder d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8da34458d847297bd8d8c23ba8463d", RobustBitConfig.DEFAULT_VALUE) ? (GsonBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8da34458d847297bd8d8c23ba8463d") : super.d().registerTypeAdapter(PoiShoppingCartAndPoi.class, new PoiShoppingCartAndPoi.Deserializer()).registerTypeAdapter(NetPriceCalculatorResult.class, new NetPriceCalculatorResult.Deserializer()).registerTypeAdapter(RestMenuResponse.class, new RestMenuResponse.Deserializer()).registerTypeAdapter(GoodDetailResponse.class, new GoodDetailResponse.Deserializer()).registerTypeAdapter(GoodsDetailResponse.class, new GoodsDetailResponse.Deserializer()).registerTypeAdapter(MarketGuessResponse.class, new MarketGuessResponse.Deserializer()).registerTypeAdapter(MarketGuessTagResponse.class, new MarketGuessTagResponse.Deserializer()).registerTypeAdapter(VerticalityHeaderResponse.class, new VerticalityHeaderResponse.Deserializer()).registerTypeAdapter(OrderListResponse.class, new OrderListResponse.Deserializer()).registerTypeAdapter(j.class, new StringBeanAdapter()).registerTypeAdapter(new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.6
        }.getType(), new HashMapAdapter()).registerTypeAdapter(BaseModuleDesc.class, new BaseModuleDescDeserializer()).registerTypeAdapter(new TypeToken<BaseTile<BaseModuleDesc, PoiChannelBackgroundConfig>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.5
        }.getType(), new BaseTileDeserializer()).registerTypeAdapter(new TypeToken<BaseTileNew<BaseModuleDesc, Object>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.4
        }.getType(), new BaseTileNewDeserializer()).registerTypeAdapter(new TypeToken<SimpleTile<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.3
        }.getType(), new BaseTileDeserializer2()).registerTypeAdapter(new TypeToken<BaseTile<BaseModuleDesc, NavigationTileConfig>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.2
        }.getType(), new BaseTileDeserializer3()).registerTypeAdapter(new TypeToken<BaseTile<PoiVerticalityDataResponse.BackgroundData, PoiChannelBackgroundConfig>>() { // from class: com.sankuai.waimai.store.base.net.sg.e.1
        }.getType(), new BaseTileDeserializer5()).registerTypeAdapter(PoiVerticalityDataResponse.PageConfig.class, new BaseTileDeserializer4()).registerTypeAdapter(PoiVerticalityDataResponse.FloatingEntranceItem.class, new PoiVerticalityDataResponse.FloatingEntranceItem.Deserializer()).registerTypeAdapter(GoodsSpu.GoodPropertyLabel.class, new GoodsSpu.GoodPropertyLabel());
    }

    @Override // com.sankuai.waimai.store.base.net.b
    public final List<Class<?>> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419754c04be3a14418e1b822bbb9f21c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419754c04be3a14418e1b822bbb9f21c");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiVerticalityDataResponse.class);
        return arrayList;
    }
}
