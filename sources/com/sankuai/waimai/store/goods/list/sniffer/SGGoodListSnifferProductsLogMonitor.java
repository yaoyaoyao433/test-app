package com.sankuai.waimai.store.goods.list.sniffer;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.a;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.an;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGGoodListSnifferProductsLogMonitor extends AbstractSnifferNetMonitor<SpuProductsResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.monitor.b
    public void collect(String str, String str2, String str3, @NonNull BaseResponse<SpuProductsResponse> baseResponse) {
        Object[] objArr = {str, str2, str3, baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f9a9c9c682e6155acc6787e11e9d275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f9a9c9c682e6155acc6787e11e9d275");
        } else if (baseResponse.code != 0) {
            Poi poi = getPoi(str2);
            SGStoreContentRender sGStoreContentRender = getBuzType(poi) == 9 ? SGStoreContentRender.ProductDrugReturnCodeException : SGStoreContentRender.ProductReturnCodeException;
            String a = i.a(new SGGoodListSnifferProductsLogModel(str, str2, str3, poi));
            c.a(sGStoreContentRender, a, "sputag接口:errorCode" + baseResponse.code);
        } else if (baseResponse.data == null || a.b(baseResponse.data.productSpuList)) {
            Poi poi2 = getPoi(str2);
            c.a(getBuzType(poi2) == 9 ? SGStoreContentRender.ProductDrugReturnEmptyData : SGStoreContentRender.ProductReturnEmptyData, i.a(new SGGoodListSnifferProductsLogModel(str, str2, str3, poi2)), "sputag接口:dataEmpty");
        }
    }

    private int getBuzType(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d20317d857ebabbb19f31d0791716a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d20317d857ebabbb19f31d0791716a5")).intValue();
        }
        if (poi != null) {
            return poi.getBuzType();
        }
        return 0;
    }

    private Poi getPoi(String str) {
        com.sankuai.waimai.store.platform.domain.manager.poi.a l;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fccecb4c52b2305f0cadc125351bbf3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fccecb4c52b2305f0cadc125351bbf3b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, String> a = an.a(str);
        String str2 = a.get("wm_poi_id");
        String str3 = a.get(FoodDetailNetWorkPreLoader.URI_POI_STR);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return null;
        }
        String a2 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str2, f.a((Object) str2, -1L));
        if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(a2) && (l = com.sankuai.waimai.store.order.a.e().l(a2)) != null) {
            return l.b;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor
    public SpuProductsResponse convertBean(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "222c58e69349f3358bedd1f52e983baa", RobustBitConfig.DEFAULT_VALUE) ? (SpuProductsResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "222c58e69349f3358bedd1f52e983baa") : (SpuProductsResponse) i.a(jSONObject.toString(), SpuProductsResponse.class);
    }
}
