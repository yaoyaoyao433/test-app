package com.sankuai.waimai.drug.mrn;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public GoodsSpu d;
    public GoodsSku e;
    public GoodsAttr[] f;
    public int g;
    public long h;
    public long i;
    public String j;

    @Nullable
    public static b a(ReadableMap readableMap) {
        JSONObject a2;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        GoodsAttr[] goodsAttrArr = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a604d30e86d1c29e5b2e2d2cd0f36f80", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a604d30e86d1c29e5b2e2d2cd0f36f80");
        }
        if (readableMap == null || (a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap)) == null) {
            return null;
        }
        b bVar = new b();
        bVar.b = r.a(a2.optString("poiId"), -1L);
        bVar.g = r.a(a2.optString("count"), 0);
        bVar.h = r.a(a2.optString("spuId"), -1L);
        bVar.i = r.a(a2.optString("skuId"), -1L);
        bVar.c = a2.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSpu.parseJson(a2.optJSONObject("spu"));
        bVar.d = goodsSpu;
        GoodsSku goodsSku = new GoodsSku();
        goodsSku.parseJson(a2.optJSONObject("sku"));
        bVar.e = goodsSku;
        JSONArray optJSONArray = a2.optJSONArray("attrs");
        if (optJSONArray != null) {
            goodsAttrArr = new GoodsAttr[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    GoodsAttr goodsAttr = new GoodsAttr();
                    goodsAttr.parseJson(optJSONObject);
                    goodsAttrArr[i] = goodsAttr;
                }
            }
        }
        bVar.f = goodsAttrArr;
        bVar.j = a2.optString("volleyTAG");
        return bVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00dcf2eb277b1588a04435db1992fa4e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00dcf2eb277b1588a04435db1992fa4e")).booleanValue() : !TextUtils.isEmpty(this.c) || this.b > 0;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93efdd59fd615bd78f446ac764613b31", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93efdd59fd615bd78f446ac764613b31") : com.sankuai.waimai.store.platform.domain.manager.poi.a.b(this.c, this.b);
    }
}
