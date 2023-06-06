package com.sankuai.waimai.business.search.ui.result.rank;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends d {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.business.search.ui.result.mach.d
    public final void a(String str, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar, Object obj) {
        Object[] objArr = {str, map, aVar, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acc73402212bda712fc4e44ffb847ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acc73402212bda712fc4e44ffb847ac");
            return;
        }
        Map<String, Object> attrs = aVar.g.getAttrs();
        if (!"b_pwqttfwu".equals(str) || attrs.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", attrs.get("poi-id")).put("index", attrs.get("poi-index"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        map.put("item_info", jSONObject);
    }
}
