package com.sankuai.waimai.business.search.common.util;

import android.content.Context;
import android.support.v4.provider.FontsContractCompat;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.monitor.horn.WMSearchHornConfigModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(Context context, int i, String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {context, Integer.valueOf(i), str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "911741ea5f727497638dc0ce70ce9647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "911741ea5f727497638dc0ce70ce9647");
        } else {
            a(context, i, str, str2, str3, map, "nativeModule");
        }
    }

    public static void a(Context context, int i, String str, String str2, String str3, Map<String, Object> map, String str4) {
        Map<String, Object> hashMap;
        Object[] objArr = {context, Integer.valueOf(i), str, str2, str3, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        JudasManualManager.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a939c57849b042902f563156e22d6062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a939c57849b042902f563156e22d6062");
            return;
        }
        String generatePageInfoKey = (!TextUtils.isEmpty(str3) || context == null) ? str3 : AppUtil.generatePageInfoKey(context);
        if (i == 1) {
            if (TextUtils.isEmpty(generatePageInfoKey)) {
                generatePageInfoKey = "";
            }
            aVar = JudasManualManager.a(str2, str, generatePageInfoKey);
        } else if (i == 2) {
            if (TextUtils.isEmpty(generatePageInfoKey)) {
                generatePageInfoKey = "";
            }
            aVar = JudasManualManager.b(str2, str, generatePageInfoKey);
        }
        if (aVar == null) {
            return;
        }
        if (map != null && !map.isEmpty()) {
            aVar.a(map);
            hashMap = map;
        } else {
            hashMap = new HashMap<>();
        }
        aVar.a();
        com.sankuai.waimai.business.search.monitor.horn.a a2 = com.sankuai.waimai.business.search.monitor.horn.a.a();
        a(str2, hashMap, str4, a2);
        a2.a(str2);
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, str4, str5, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "170119713d89e6551f7ee684512cf24c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "170119713d89e6551f7ee684512cf24c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("templateId", str2);
            jSONObject.put("bid", str3);
            jSONObject.put("val_key", str4);
            jSONObject.put("val_value", str5);
            jSONObject.put("val_lab", com.sankuai.waimai.pouch.util.c.a(map));
            com.sankuai.waimai.platform.capacity.log.b.b(new m().a("wm_search_statistics").b(str).d(jSONObject.toString()).b());
        } catch (Exception e) {
            com.dianping.util.h.d("errorReportSniffer", e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private static void a(String str, Map<String, Object> map, String str2, com.sankuai.waimai.business.search.monitor.horn.a aVar) {
        Map<String, List<WMSearchHornConfigModel.Rule>> bidValidateRules;
        char c;
        int i;
        boolean z;
        int i2;
        Map<String, Object> map2;
        Object[] objArr = {str, map, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b74f9ef5de0e00583ad7179021894f68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b74f9ef5de0e00583ad7179021894f68");
        } else if (aVar.e && aVar.f) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.monitor.horn.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8d2fb860baff7703714bfedfad2c27cc", RobustBitConfig.DEFAULT_VALUE)) {
                bidValidateRules = (Map) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8d2fb860baff7703714bfedfad2c27cc");
            } else {
                bidValidateRules = aVar.b != null ? aVar.b.getBidValidateRules() : null;
            }
            if (bidValidateRules == null || bidValidateRules.isEmpty() || !bidValidateRules.containsKey(str)) {
                return;
            }
            List<WMSearchHornConfigModel.Rule> list = bidValidateRules.get(str);
            if (com.sankuai.waimai.modular.utils.a.a(list)) {
                c = 0;
                i = 3;
                z = true;
                i2 = 0;
            } else if (map.isEmpty()) {
                i = 3;
                z = true;
                c = 0;
                a("wm_search_statistics_empty", str2, str, StringUtil.NULL, StringUtil.NULL, map);
                i2 = 1;
            } else {
                c = 0;
                i = 3;
                int i3 = 2;
                z = true;
                i2 = 0;
                for (WMSearchHornConfigModel.Rule rule : list) {
                    if (!TextUtils.isEmpty(rule.key) && map.containsKey(rule.key)) {
                        String valueOf = String.valueOf(map.get(rule.key));
                        if (TextUtils.isEmpty(valueOf)) {
                            if (rule.ruleType != 0) {
                                a("wm_search_statistics_invalid_length", str2, str, rule.key, StringUtil.NULL, map);
                            }
                        } else if (rule.ruleType == i3) {
                            Map<String, Object> map3 = rule.rules;
                            if (map3 == null || map3.isEmpty() || !map3.containsKey(valueOf)) {
                                a("wm_search_statistics_invalid_value", str2, str, rule.key, valueOf, map);
                            }
                        } else {
                            if (rule.ruleType == 3 && TextUtils.equals(rule.type, "Number")) {
                                try {
                                    double parseDouble = Double.parseDouble(valueOf);
                                    Map<String, Object> map4 = rule.rules;
                                    if (map4.containsKey("min") && (map4.get("min") instanceof Double) && parseDouble < ((Double) map4.get("min")).doubleValue()) {
                                        map2 = map4;
                                        a("wm_search_statistics_invalid_value", str2, str, rule.key, valueOf, map);
                                        i2 = 2;
                                    } else {
                                        map2 = map4;
                                    }
                                    if (map2.containsKey("max") && (map2.get("max") instanceof Double) && parseDouble > ((Double) map2.get("max")).doubleValue()) {
                                        a("wm_search_statistics_invalid_value", str2, str, rule.key, valueOf, map);
                                    }
                                } catch (Exception unused) {
                                    a("wm_search_statistics_invalid_value", str2, str, rule.key, valueOf, map);
                                }
                            }
                            i3 = 2;
                        }
                        i2 = 0;
                        i3 = 2;
                    } else {
                        a("wm_search_statistics_null", str2, str, rule.key, StringUtil.NULL, map);
                    }
                    i2 = 2;
                    i3 = 2;
                }
            }
            Object[] objArr3 = new Object[i];
            objArr3[c] = str;
            objArr3[z ? 1 : 0] = Integer.valueOf(i2);
            objArr3[2] = str2;
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b62c1263c2aca59afd0577c95544dccc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, z, "b62c1263c2aca59afd0577c95544dccc");
                return;
            }
            HashMap hashMap = new HashMap();
            ?? r12 = z;
            if (i2 != 0) {
                r12 = 0;
            }
            if (com.sankuai.waimai.mach.common.i.a().h()) {
                hashMap.put("WMSearchRaptorStatistics_Test", Integer.valueOf((int) r12));
            } else {
                hashMap.put("WMSearchRaptorStatistics", Integer.valueOf((int) r12));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(FontsContractCompat.Columns.RESULT_CODE, String.valueOf(i2));
            hashMap2.put("template_id", str2);
            hashMap2.put("bid", str);
            com.sankuai.waimai.business.search.monitor.horn.a.a().a(hashMap, hashMap2);
        }
    }
}
