package com.sankuai.waimai.store.im.base.mach;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.util.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private String b;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35a550510916ce2eea64564b707cfdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35a550510916ce2eea64564b707cfdd");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404487583c61eac883c0881abf62d0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404487583c61eac883c0881abf62d0e7");
        } else if (map == null) {
        } else {
            if (!o.g()) {
                Object[] objArr2 = {str, str2, Integer.valueOf(i), map, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06b861d8291d797872b165d51a12f554", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06b861d8291d797872b165d51a12f554");
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(map);
                    com.sankuai.shangou.stone.util.log.a.b("MachNormalLogReporter,%s", "source = " + str2 + ",mode = " + i + ",map= " + jSONObject2.toString());
                    String optString = jSONObject2.optString("bid");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
                    if (optJSONObject == null || TextUtils.isEmpty(optString)) {
                        return;
                    }
                    switch (i) {
                        case 1:
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_CLICK " + optString);
                            com.sankuai.waimai.store.manager.judas.b.a(this.b, optString).a(a(optJSONObject)).a();
                            break;
                        case 2:
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_SEE " + optString);
                            com.sankuai.waimai.store.manager.judas.b.b(this.b, optString).a(a(optJSONObject)).a();
                            break;
                        default:
                            return;
                    }
                    return;
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return;
                }
            }
            Object[] objArr3 = {str, str2, Integer.valueOf(i), map, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "abf4a7608d0e7bca1e317d37fb7e1850", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "abf4a7608d0e7bca1e317d37fb7e1850");
                return;
            }
            try {
                JSONObject jSONObject3 = new JSONObject(map);
                com.sankuai.shangou.stone.util.log.a.b("MachNormalLogReporter,%s", "source = " + str2 + ",mode = " + i + ",map= " + jSONObject3.toString());
                String optString2 = jSONObject3.optString("bid");
                JSONObject optJSONObject2 = jSONObject3.optJSONObject("lab");
                Map<String, Object> a2 = n.a(optJSONObject2);
                String str3 = "";
                if (a2.containsKey("charge_info") && (a2.get("charge_info") instanceof String)) {
                    str3 = (String) a2.get("charge_info");
                }
                boolean optBoolean = jSONObject3.optBoolean("sh");
                char c = 65535;
                int intValue = (a2.containsKey("ad_type") && (a2.get("ad_type") instanceof Number)) ? ((Number) a2.get("ad_type")).intValue() : -1;
                if (optJSONObject2 == null || TextUtils.isEmpty(optString2)) {
                    return;
                }
                int hashCode = str2.hashCode();
                if (hashCode != 3468) {
                    if (hashCode == 3669 && str2.equals("sh")) {
                        c = 1;
                    }
                } else if (str2.equals("lx")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        if (optBoolean) {
                            if (intValue > 0) {
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("adType", intValue);
                                    jSONObject4.put("adChargeInfo", n.a(str3));
                                    jSONObject = jSONObject4.toString();
                                } catch (JSONException e2) {
                                    com.sankuai.shangou.stone.util.log.a.a(e2);
                                }
                                a2.remove("ad_type");
                                a2.remove("charge_info");
                                a2.put("ad", jSONObject);
                            }
                            jSONObject = "";
                            a2.remove("ad_type");
                            a2.remove("charge_info");
                            a2.put("ad", jSONObject);
                        }
                        if (i == 2) {
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_SEE " + optString2);
                            com.sankuai.waimai.store.manager.judas.b.b(this.b, optString2).a(a2).a();
                            return;
                        } else if (i == 1) {
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_CLICK " + optString2);
                            com.sankuai.waimai.store.manager.judas.b.a(this.b, optString2).a(a2).a();
                            return;
                        } else {
                            return;
                        }
                    case 1:
                        if (i == 2) {
                            com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString2, str3, 3));
                            return;
                        } else if (i == 1) {
                            com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString2, str3, 2));
                            return;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            } catch (Exception e3) {
                com.sankuai.shangou.stone.util.log.a.a(e3);
            }
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4adff85f651abc85ef0338dd89d73e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4adff85f651abc85ef0338dd89d73e3f");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }
}
