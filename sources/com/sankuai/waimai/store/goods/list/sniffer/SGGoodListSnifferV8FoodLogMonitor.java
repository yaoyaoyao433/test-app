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
public class SGGoodListSnifferV8FoodLogMonitor extends a<RestMenuResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public SGGoodListSnifferV8FoodLogMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad5e44156146e29faf5c8e0dada073f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad5e44156146e29faf5c8e0dada073f2");
        } else {
            addSnifferCollect(new b());
        }
    }

    @Override // com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor
    public RestMenuResponse convertBean(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50b577467d6455cbad83b10741349abc", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50b577467d6455cbad83b10741349abc");
        }
        try {
            return RestMenuResponse.fromJson(jSONObject, "");
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }
}
