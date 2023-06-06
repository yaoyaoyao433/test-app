package com.sankuai.waimai.store.search.ui.result.mach;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.util.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    String b;
    com.sankuai.waimai.mach.recycler.c c;
    Map<String, Object> d;
    private BaseProductPoi e;

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032e0951b162b1c333b20fa44af8de29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032e0951b162b1c333b20fa44af8de29");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            String optString2 = jSONObject.optString("cache_sub_index");
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            int i2 = -1;
            int optInt = jSONObject.optInt("type", -1);
            Map<String, Object> attrs = aVar.g.getAttrs();
            int indexOf = optInt == 2 ? aVar.e.b().indexOf(aVar) : -1;
            if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                return;
            }
            Object a2 = this.c.a("mach_extra_key_biz_data");
            Object a3 = this.c.a("mach_extra_key_index");
            if (a2 instanceof String) {
                String str4 = (String) a2;
                if (!TextUtils.isEmpty(str4)) {
                    this.e = (BaseProductPoi) com.sankuai.waimai.store.util.i.a(str4, BaseProductPoi.class);
                }
            }
            String str5 = null;
            if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
                str3 = null;
            } else {
                com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
                str5 = machBundle.j;
                str3 = machBundle.a();
            }
            if ("lx".equals(str2)) {
                if (i == 1) {
                    HashMap hashMap = new HashMap();
                    if (this.d != null) {
                        hashMap.putAll(this.d);
                    }
                    hashMap.putAll(a(optJSONObject, a3, attrs, optInt, indexOf));
                    com.sankuai.waimai.ad.monitor.b.a(hashMap, str5, str3);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(hashMap), str5, str3);
                    a(i, optString, hashMap);
                } else if (i != 2 || a2 == null) {
                } else {
                    String str6 = optString + a2.hashCode() + optString2 + "lx_expose";
                    if (h.a(str6)) {
                        return;
                    }
                    h.b(str6);
                    HashMap hashMap2 = new HashMap();
                    if (this.d != null) {
                        hashMap2.putAll(this.d);
                    }
                    hashMap2.putAll(a(optJSONObject, a3, attrs, optInt, indexOf));
                    com.sankuai.waimai.ad.monitor.b.a(hashMap2, str5, str3);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(hashMap2), str5, str3);
                    a(i, optString, hashMap2);
                }
            } else if ("sh".equals(str2)) {
                Map<String, Object> a4 = n.a(optJSONObject);
                String str7 = a4.get("charge_info") instanceof String ? (String) a4.get("charge_info") : "";
                if (t.a(str7)) {
                    return;
                }
                try {
                    if (a4.get("ad_type") instanceof Number) {
                        i2 = ((Number) a4.get("ad_type")).intValue();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String a5 = com.sankuai.waimai.ad.monitor.b.a(str7, str5, str3);
                if (i != 2) {
                    if (i == 1) {
                        String str8 = "";
                        if ("supermarket-search-product".equals(this.c.a()) || "supermarket-drug-search-product".equals(this.c.a())) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("click_block", String.valueOf(optJSONObject.optInt("click_block")));
                            str8 = com.sankuai.mads.e.a(a5, hashMap3);
                        }
                        com.sankuai.waimai.ad.mads.a.a(i2, new b.a(optString, str8, 2));
                        com.sankuai.waimai.ad.monitor.b.a(optString, "SH", i2, str5, str3);
                    }
                } else if (a2 != null) {
                    String str9 = optString + a2.hashCode() + optString2 + "sh_expose";
                    if (h.a(str9)) {
                        return;
                    }
                    h.b(str9);
                    com.sankuai.waimai.ad.mads.a.a(i2, new b.a(optString, a5, 3));
                    com.sankuai.waimai.ad.monitor.b.a(optString, "SH", i2, str5, str3);
                }
            }
        }
    }

    private void a(int i, String str, Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b22a245af787e176644679173989d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b22a245af787e176644679173989d9");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a(str);
        if (i == 2) {
            a2 = JudasManualManager.b(str);
        }
        JudasManualManager.a a3 = a2.a(map).a("c_nfqbfvw");
        a3.b = this.b;
        a3.a();
    }

    private Map<String, Object> a(JSONObject jSONObject, Object obj, Map<String, Object> map, int i, int i2) {
        Object[] objArr = {jSONObject, obj, map, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840b64b2b7e3cfa95c7b1dd15505274c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840b64b2b7e3cfa95c7b1dd15505274c");
        }
        new HashMap();
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(jSONObject.toString());
        if (map.size() > 0) {
            Object obj2 = map.get("custom-lx-key");
            Object obj3 = map.get("custom-lx-value");
            if ((obj2 instanceof String) && obj3 != null) {
                a2.put((String) obj2, obj3);
            }
        }
        if (i == 2) {
            a2.put("index", Integer.valueOf(i2));
        } else {
            a2.put("index", Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0));
        }
        a(a2);
        com.sankuai.waimai.store.search.statistics.d.a().a(this.c, a2);
        com.sankuai.waimai.store.search.statistics.d.a().a(this.c, a2, this.e);
        return a2;
    }

    private void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630bccb734c4cc4ba4e272b888dba113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630bccb734c4cc4ba4e272b888dba113");
        } else if (this.c == null) {
        } else {
            Object a2 = this.c.a("drug_index");
            Object a3 = this.c.a("drug_item_index");
            if ((a2 instanceof Integer) && ((Integer) a2).intValue() >= 0) {
                map.put("index", a2);
            }
            if (!(a3 instanceof Integer) || ((Integer) a3).intValue() < 0) {
                return;
            }
            map.put(DataConstants.INDEX, a3);
        }
    }
}
