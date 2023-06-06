package com.sankuai.waimai.store.goods.list.mach;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.store.util.n;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;

    public b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c4a096ebe75200b142afa814a9b888", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c4a096ebe75200b142afa814a9b888");
            return;
        }
        this.b = context;
        this.c = str;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a74a58bf11324d7a4a74532ca30214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a74a58bf11324d7a4a74532ca30214");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(map);
        String optString = jSONObject2.optString("bid");
        boolean optBoolean = jSONObject2.optBoolean("sh");
        JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
        String a2 = TextUtils.isEmpty(this.c) ? com.sankuai.waimai.store.manager.judas.b.a(this.b) : this.c;
        String a3 = com.sankuai.waimai.store.manager.judas.b.a((Object) this.b);
        Map<String, Object> a4 = n.a(optJSONObject);
        String str3 = a4.get("charge_info") instanceof String ? (String) a4.get("charge_info") : "";
        int intValue = a4.get("ad_type") instanceof Number ? ((Number) a4.get("ad_type")).intValue() : -1;
        if (!"lx".equals(str2)) {
            if (!"sh".equals(str2) || t.a(optString)) {
                return;
            }
            if (i == 2) {
                com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, str3, 3));
                return;
            } else if (i == 1) {
                com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, str3, 2));
                return;
            } else {
                return;
            }
        }
        if (optBoolean) {
            if (intValue > 0) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("adType", intValue);
                    jSONObject3.put("adChargeInfo", n.a(str3));
                    jSONObject = jSONObject3.toString();
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
                a4.remove("ad_type");
                a4.remove("charge_info");
                a4.put("ad", jSONObject);
            }
            jSONObject = "";
            a4.remove("ad_type");
            a4.remove("charge_info");
            a4.put("ad", jSONObject);
        }
        if (i == 2) {
            com.sankuai.waimai.store.manager.judas.b.b(a2, a3, optString).a(a4).a();
        } else if (i == 1) {
            com.sankuai.waimai.store.manager.judas.b.a(a2, a3, optString).a(a4).a();
        }
    }
}
