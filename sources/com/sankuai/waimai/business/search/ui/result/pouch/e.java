package com.sankuai.waimai.business.search.ui.result.pouch;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.business.search.common.util.h;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private String b;
    private final String c;
    private HashSet<String> d;
    private HashSet<String> e;

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00617cd13ff366437689ca88c72fb0b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00617cd13ff366437689ca88c72fb0b1");
            return;
        }
        this.c = "c_nfqbfvw";
        this.d = new HashSet<>();
        this.e = new HashSet<>();
        this.b = str;
    }

    private void c(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef6a09a34868b21ed08efedca4ccd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef6a09a34868b21ed08efedca4ccd7d");
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        String optString = jSONObject.optString("eventId");
        String optString2 = jSONObject.optString("adChargeInfo");
        int optInt = jSONObject.optInt("adType");
        if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString)) {
            return;
        }
        switch (i) {
            case 1:
                com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString2, 2).a(str));
                return;
            case 2:
                com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString2, 3).a(str));
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "526732621365cd632a8a68faba422d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "526732621365cd632a8a68faba422d90");
        } else if (i != 2) {
            if (i == 1) {
                if ("lx".equals(str2)) {
                    b(str, str2, i, map, aVar);
                } else if ("sh".equals(str2)) {
                    c(str, str2, i, map, aVar);
                }
            }
        } else {
            String str3 = aVar.i;
            if ("lx".equals(str2)) {
                if (this.d.contains(str3)) {
                    return;
                }
                this.d.add(str3);
                b(str, str2, i, map, aVar);
            } else if (!"sh".equals(str2) || this.e.contains(str3)) {
            } else {
                this.e.add(str3);
                c(str, str2, i, map, aVar);
            }
        }
    }

    private void b(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14808e15b109f3d93eebec99e88bd3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14808e15b109f3d93eebec99e88bd3ce");
            return;
        }
        String str3 = "mach_template_exception_id";
        if (aVar != null && aVar.f != null && !TextUtils.isEmpty(aVar.f.getTemplateId())) {
            str3 = aVar.f.getTemplateId();
        }
        String str4 = str3;
        JSONObject jSONObject = new JSONObject(map);
        String optString = jSONObject.optString("bid");
        JSONObject optJSONObject = jSONObject.optJSONObject("lab");
        if (optJSONObject == null || TextUtils.isEmpty(optString)) {
            return;
        }
        Map<String, Object> jsonObjectToMap = JsonUtil.jsonObjectToMap(optJSONObject);
        switch (i) {
            case 1:
                jsonObjectToMap.put("adlog_identifier", str);
                h.a(aVar.b, 1, "c_nfqbfvw", optString, this.b, jsonObjectToMap, str4);
                return;
            case 2:
                jsonObjectToMap.put("adlog_identifier", str);
                h.a(aVar.b, 2, "c_nfqbfvw", optString, this.b, jsonObjectToMap, str4);
                return;
            default:
                return;
        }
    }
}
