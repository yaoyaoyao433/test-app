package com.sankuai.waimai.store.poilist.mach;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.search.ui.result.mach.h;
import com.sankuai.waimai.store.util.n;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;

    public e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc7c1cf1d6ca385bbb8b91bfdaad9c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc7c1cf1d6ca385bbb8b91bfdaad9c7");
            return;
        }
        this.b = context;
        this.c = str;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        int intValue;
        Map<String, Object> map2;
        String str3;
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3274568d1fd5457103fe28adf477d297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3274568d1fd5457103fe28adf477d297");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(map);
        String optString = jSONObject2.optString("bid");
        boolean optBoolean = jSONObject2.optBoolean("sh");
        JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
        String a2 = TextUtils.isEmpty(this.c) ? com.sankuai.waimai.store.manager.judas.b.a(this.b) : this.c;
        String a3 = com.sankuai.waimai.store.manager.judas.b.a((Object) this.b);
        Map<String, Object> a4 = n.a(optJSONObject);
        String str4 = a4.get("charge_info") instanceof String ? (String) a4.get("charge_info") : "";
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27f26acbccd3056d5a50c5994024a5e1", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27f26acbccd3056d5a50c5994024a5e1")).intValue();
        } else {
            intValue = (aVar == null || !(aVar.b("index") instanceof Integer)) ? -1 : ((Integer) aVar.b("index")).intValue();
        }
        if (intValue >= 0) {
            map2 = a4;
            map2.put(DataConstants.INDEX, Integer.valueOf(intValue));
        } else {
            map2 = a4;
        }
        int intValue2 = map2.get("ad_type") instanceof Number ? ((Number) map2.get("ad_type")).intValue() : -1;
        String str5 = null;
        if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
            str3 = null;
        } else {
            com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
            String str6 = machBundle.j;
            str3 = machBundle.a();
            str5 = str6;
        }
        if ("lx".equals(str2)) {
            if (optBoolean) {
                if (intValue2 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("adType", intValue2);
                        jSONObject3.put("adChargeInfo", n.a(str4));
                        jSONObject = jSONObject3.toString();
                    } catch (JSONException e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                    map2.remove("ad_type");
                    map2.remove("charge_info");
                    map2.put("ad", jSONObject);
                }
                jSONObject = "";
                map2.remove("ad_type");
                map2.remove("charge_info");
                map2.put("ad", jSONObject);
            }
            com.sankuai.waimai.ad.monitor.b.a(map2, str5, str3);
            if (i != 2) {
                if (i == 1) {
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("tag_lab");
                    if (optJSONObject2 != null) {
                        com.sankuai.waimai.store.manager.judas.b.a(a2, n.a(optJSONObject2));
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a2, a3, optString).a(map2).a();
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(map2), str5, str3);
                }
            } else if ("b_waimai_h1jvy7cd_mv".equals(optString) || "b_waimai_4kp20v9q_mv".equals(optString)) {
                Object obj = map2.get("index");
                String valueOf = obj == null ? "" : String.valueOf(obj);
                Object obj2 = map2.get("shelf_id");
                String valueOf2 = obj2 == null ? "" : String.valueOf(obj2);
                Object obj3 = map2.get("sku_id");
                String str7 = optString + valueOf + valueOf2 + (obj3 == null ? "" : String.valueOf(obj3)) + "lx_expose";
                if (h.a(str7)) {
                    return;
                }
                h.b(str7);
                com.sankuai.waimai.store.manager.judas.b.b(a2, a3, optString).a(map2).a();
                com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(map2), str5, str3);
            } else {
                com.sankuai.waimai.store.manager.judas.b.b(a2, a3, optString).a(map2).a();
                com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(map2), str5, str3);
            }
        } else if (!"sh".equals(str2) || t.a(optString)) {
        } else {
            String a5 = com.sankuai.waimai.ad.monitor.b.a(str4, str5, str3);
            if (i == 2) {
                com.sankuai.waimai.ad.mads.a.a(intValue2, new b.a(optString, a5, 3));
                com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue2, str5, str3);
            } else if (i == 1) {
                com.sankuai.waimai.ad.mads.a.a(intValue2, new b.a(optString, a5, 2));
                com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue2, str5, str3);
            }
        }
    }
}
