package com.sankuai.waimai.store.goods.list.sniffer;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.sniffer.a;
import com.sankuai.waimai.store.goods.list.sniffer.collect.b;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGRestaurantV9FoodLogMonitor extends a<RestMenuResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public SGRestaurantV9FoodLogMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886dd34136e2ba7403622898575d87a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886dd34136e2ba7403622898575d87a8");
            return;
        }
        addSnifferCollect(new b());
        addSnifferCollect(new com.sankuai.waimai.store.goods.list.sniffer.collect.a());
    }

    @Override // com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor
    public RestMenuResponse convertBean(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cd8184b20d27df8e9b85117b417d6a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cd8184b20d27df8e9b85117b417d6a1");
        }
        try {
            return RestMenuResponse.fromJson(jSONObject, "");
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }
}
