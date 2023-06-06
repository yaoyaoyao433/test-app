package com.sankuai.waimai.store.poi.list.logreport;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.util.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private String b;

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078640def1cf23f16504b2d0db2a385f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078640def1cf23f16504b2d0db2a385f");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c956d7f5fa30c70245a0631bba8f485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c956d7f5fa30c70245a0631bba8f485");
        } else if (map == null) {
        } else {
            if (o.g()) {
                b(str, str2, i, map, aVar);
                return;
            }
            Object[] objArr2 = {str, str2, Integer.valueOf(i), map, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dfa244ebdb5e916d1fb000f705be54f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dfa244ebdb5e916d1fb000f705be54f");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(map);
                com.sankuai.shangou.stone.util.log.a.b("MachNormalLogReporter,%s", "source = " + str2 + ",mode = " + i + ",map= " + jSONObject.toString());
                String optString = jSONObject.optString("bid");
                JSONObject optJSONObject = jSONObject.optJSONObject("lab");
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
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf31bf46b3cc5827dc4015addc71abda", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf31bf46b3cc5827dc4015addc71abda");
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

    private void b(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7b6a864a636a409cf122a859fd34df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7b6a864a636a409cf122a859fd34df");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(map);
            com.sankuai.shangou.stone.util.log.a.b("MachNormalLogReporter,%s", "source = " + str2 + ",mode = " + i + ",map= " + jSONObject2.toString());
            String optString = jSONObject2.optString("bid");
            JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
            Map<String, Object> a2 = n.a(optJSONObject);
            String str4 = "";
            if (aVar != null) {
                try {
                    if (aVar.f != null && "supermarket-search-down-searchtext".equals(aVar.f.getTemplateId()) && i == 2 && "lx".equals(str2) && (optJSONObject.get("word_info") instanceof JSONArray) && aVar.h() != null && aVar.h().get("id") != null && aVar.h().get("id").equals("view_single_line") && !com.sankuai.shangou.stone.util.a.b(aVar.b())) {
                        List<com.sankuai.waimai.mach.node.a> b = aVar.b();
                        if (((JSONArray) optJSONObject.get("word_info")).length() == com.sankuai.shangou.stone.util.a.a((List) b)) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i2 = 0; i2 < b.size(); i2++) {
                                if (com.sankuai.shangou.stone.util.a.a((List<Object>) b, i2) != null && ((JSONArray) optJSONObject.get("word_info")).get(i2) != null && ((com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, i2)).e() == 0.0f) {
                                    jSONArray.put(((JSONArray) optJSONObject.get("word_info")).get(i2));
                                }
                            }
                            optJSONObject.put("word_info", jSONArray);
                        }
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
            if (a2.containsKey("charge_info") && (a2.get("charge_info") instanceof String)) {
                str4 = (String) a2.get("charge_info");
            }
            boolean optBoolean = jSONObject2.optBoolean("sh");
            char c = 65535;
            int intValue = (a2.containsKey("ad_type") && (a2.get("ad_type") instanceof Number)) ? ((Number) a2.get("ad_type")).intValue() : -1;
            String str5 = null;
            if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
                str3 = null;
            } else {
                com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
                str5 = machBundle.j;
                str3 = machBundle.a();
            }
            if (optJSONObject == 0 || TextUtils.isEmpty(optString)) {
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
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("adType", intValue);
                                jSONObject3.put("adChargeInfo", n.a(str4));
                                jSONObject = jSONObject3.toString();
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
                    com.sankuai.waimai.ad.monitor.b.a(a2, str5, str3);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", intValue, str5, str3);
                    if (i == 2) {
                        com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_SEE " + optString);
                        com.sankuai.waimai.store.manager.judas.b.b(this.b, optString).a(a2).a();
                        return;
                    } else if (i == 1) {
                        com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_CLICK " + optString);
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("tag_lab");
                        if (optJSONObject2 != null) {
                            com.sankuai.waimai.store.manager.judas.b.a(this.b, n.a(optJSONObject2));
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(this.b, optString).a(a2).a();
                        return;
                    } else {
                        return;
                    }
                case 1:
                    String a3 = com.sankuai.waimai.ad.monitor.b.a(str4, str5, str3);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue, str5, str3);
                    if (i == 2) {
                        com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a3, 3));
                        return;
                    } else if (i == 1) {
                        com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a3, 2));
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
