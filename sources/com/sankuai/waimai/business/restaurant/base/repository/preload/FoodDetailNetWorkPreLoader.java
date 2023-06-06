package com.sankuai.waimai.business.restaurant.base.repository.preload;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailHelper;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.RestaurantSchemeParams;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.capacity.network.rxsupport.c;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.goods.a;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.sankuai.waimai.platform.preload.d;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FoodDetailNetWorkPreLoader implements PreloadRunnable<String> {
    public static final String GOOD_DETAIL_ITEMS = GoodDetailActivity.b;
    public static final String INTENT_IS_SELFDELIVERY_SHOP = "intent_is_selfdeliveryshop";
    public static final String INTENT_POI = "intent_poi";
    public static final String INTENT_REFERER_SOURCE = "referer_source";
    public static final String INTENT_SAFE_PRE_LOAD = "safe_pre_load";
    public static final String URI_POI = "wmpoiid";
    public static final String URI_POI_STR = "poi_id_str";
    public static final String URI_SKU = "skuid";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public void run(Bundle bundle, Uri uri, final d<String> dVar) {
        Poi poi;
        Poi poi2;
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33d3fb3e2c3f4996b544b89b1b1e7eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33d3fb3e2c3f4996b544b89b1b1e7eef");
        } else if (bundle == null || bundle.getInt(INTENT_SAFE_PRE_LOAD, 1) != 1) {
            dVar.cancel();
        } else {
            GoodsSpu goodsSpu = (GoodsSpu) f.a(bundle, GOOD_DETAIL_ITEMS);
            if (goodsSpu == null) {
                goodsSpu = a.a().c;
            }
            if (goodsSpu == null || (goodsSpu.getId() == 0 && TextUtils.isEmpty(goodsSpu.getTag()))) {
                dVar.cancel();
                return;
            }
            long a = af.a(uri, URI_POI, -1);
            String b = af.b(uri, URI_POI_STR, "");
            if (a == -1 && (poi2 = (Poi) f.a(bundle, INTENT_POI)) != null) {
                a = poi2.id;
            }
            if (TextUtils.isEmpty(b) && (poi = (Poi) f.a(bundle, INTENT_POI)) != null) {
                b = poi.poiIDStr;
            }
            if (a == -1 && TextUtils.isEmpty(b)) {
                dVar.cancel();
                return;
            }
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(goodsSpu.getId());
            String valueOf3 = String.valueOf(getSkuId(uri, goodsSpu));
            String goodsCouponViewId = getGoodsCouponViewId(goodsSpu);
            int i = bundle.getInt(INTENT_REFERER_SOURCE, -1);
            if (i == -1) {
                i = af.a(uri, INTENT_REFERER_SOURCE, 0);
            }
            String a2 = ListIDHelper.a.a.a();
            HashMap hashMap = new HashMap();
            hashMap.put("wm_poi_id", valueOf);
            hashMap.put(URI_POI_STR, b);
            hashMap.put("spu_id", valueOf2);
            hashMap.put("sku_id", valueOf3);
            if (!aa.a(goodsCouponViewId)) {
                hashMap.put("goods_coupon_view_id", goodsCouponViewId);
            }
            hashMap.put("card_info", GoodDetailHelper.a(b));
            hashMap.put(INTENT_REFERER_SOURCE, bundle.getBoolean(INTENT_IS_SELFDELIVERY_SHOP) ? "2" : String.valueOf(i));
            hashMap.put("rank_list_id", a2);
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.business.restaurant.composeorder.a.b);
            hashMap.put("share_bill_mode", sb.toString());
            if ("group_zhuanxiang_discount".equals(goodsSpu.activityTag)) {
                hashMap.put("group_chat_share", "POI_IM");
            }
            if (RestaurantSchemeParams.seckillTag == 1) {
                hashMap.put("request_mark", RestaurantSchemeParams.getRequestMark(1, 0L));
            }
            try {
                if (!TextUtils.isEmpty(goodsSpu.mpTransparentData)) {
                    JSONObject jSONObject = new JSONObject(goodsSpu.mpTransparentData);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jSONObject.optInt("show_health_food", -1));
                    hashMap.put("show_health_food", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(jSONObject.optLong("only_sku_id", -1L));
                    hashMap.put("only_sku_id", sb3.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String string = bundle.getString("linkIdentifierInfo", "");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put("link_identifier_info", string);
            }
            b.a(((ShopApiService) b.a((Class<Object>) ShopApiService.class)).getGoodDetail(hashMap).a(c.a(com.meituan.android.singleton.b.a)), new b.AbstractC1042b<String>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    String str = (String) obj;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc24271123b9abdcd406e2afcfd52170", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc24271123b9abdcd406e2afcfd52170");
                    } else {
                        dVar.a(str);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    String valueOf4;
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a919559f76041b5a30bd9854d04f7ff7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a919559f76041b5a30bd9854d04f7ff7");
                        return;
                    }
                    if (th instanceof com.sankuai.waimai.platform.modular.network.error.a) {
                        valueOf4 = String.valueOf((com.sankuai.waimai.platform.modular.network.error.a) th);
                    } else {
                        valueOf4 = String.valueOf(new com.sankuai.waimai.platform.modular.network.error.a(th));
                    }
                    dVar.a(valueOf4);
                }
            }, b.b);
        }
    }

    private long getSkuId(Uri uri, GoodsSpu goodsSpu) {
        Object[] objArr = {uri, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9362fb196c163144d0c115c3330733a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9362fb196c163144d0c115c3330733a3")).longValue();
        }
        long a = af.a(uri, URI_SKU, -1L);
        if (a != -1) {
            return a;
        }
        GoodsSku fromSpu = getFromSpu(goodsSpu);
        if (fromSpu != null) {
            return fromSpu.id;
        }
        return 0L;
    }

    private String getGoodsCouponViewId(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25e9e5d5adc7345dabc10d7cf23f34aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25e9e5d5adc7345dabc10d7cf23f34aa");
        }
        GoodsSku fromSpu = getFromSpu(goodsSpu);
        if (fromSpu != null) {
            return fromSpu.goodsCouponViewId;
        }
        return null;
    }

    private GoodsSku getFromSpu(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f86a2927356f0dad6c27878abd65a22e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f86a2927356f0dad6c27878abd65a22e");
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (skuList == null || skuList.isEmpty()) {
            return null;
        }
        return skuList.get(0);
    }
}
