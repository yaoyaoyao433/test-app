package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.os.Bundle;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.e;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PremiumDiscountShopCartHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Activity activity;
        JSONArray jSONArray;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc1435fe33c5d35688b555e94cae3f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc1435fe33c5d35688b555e94cae3f6c");
        } else if (validateArgs() && (activity = jsHost().getActivity()) != null) {
            JSONObject jSONObject = jsBean().argsJson;
            Object[] objArr2 = {activity, jSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "89fe0753f8f46befad1e1609850dd52a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "89fe0753f8f46befad1e1609850dd52a");
                return;
            }
            Gson a = k.a();
            long j = 0;
            if (jSONObject != null) {
                j = jSONObject.optLong("poi_id");
                str = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
                jSONArray = jSONObject.optJSONArray("foods");
            } else {
                jSONArray = null;
                str = null;
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                return;
            }
            GlobalCartManager.getInstance().clearOrder(b.a(j), 15);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    GoodsSpu goodsSpu = (GoodsSpu) a.fromJson(jSONObject2.toString(), (Class<Object>) GoodsSpu.class);
                    if (goodsSpu != null && d.a(goodsSpu.getSkuList())) {
                        goodsSpu.skus = new ArrayList();
                        goodsSpu.skus.add(goodsSpu.getSku());
                    }
                    JSONArray optJSONArray = jSONObject2.optJSONObject("sku") != null ? jSONObject2.optJSONObject("sku").optJSONArray("attrs") : null;
                    arrayList.add(new OrderedFood(goodsSpu, goodsSpu.getSku(), (optJSONArray == null || optJSONArray.length() <= 0) ? null : (GoodsAttr[]) a.fromJson(optJSONArray.toString(), (Class<Object>) GoodsAttr[].class), goodsSpu.getSku().count));
                } catch (Exception e) {
                    a.a("PremiumDiscountShopCartHandler", " 超值优惠/交互式推荐Native解析失败", e);
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", j);
            bundle.putString("poiName", str);
            bundle.putString("from", "");
            bundle.putBoolean("isopenshopcart", true);
            bundle.putSerializable("food_list", arrayList);
            com.sankuai.waimai.platform.shop.helper.a.a(activity, c.b, bundle);
        }
    }
}
