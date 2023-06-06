package com.sankuai.waimai.store.search.ui.result.mach;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    String b;
    com.sankuai.waimai.mach.recycler.c c;
    Map<String, Object> d;
    private BaseProductPoi e;

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> hashMap;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c548020b86cd7ad6b920c41e246b55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c548020b86cd7ad6b920c41e246b55b");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            String optString2 = jSONObject.optString("cache_sub_index");
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("sg_tag_lab");
            int optInt = jSONObject.optInt("type", -1);
            Map<String, Object> attrs = aVar.g.getAttrs();
            if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                return;
            }
            Object a2 = this.c.a("mach_extra_key_biz_data");
            Object a3 = this.c.a("mach_extra_key_index");
            if (a2 instanceof String) {
                String str3 = (String) a2;
                if (!TextUtils.isEmpty(str3)) {
                    this.e = (BaseProductPoi) com.sankuai.waimai.store.util.i.a(str3, BaseProductPoi.class);
                }
            }
            if ("lx".equals(str2)) {
                if (i == 1) {
                    Map<String, Object> hashMap2 = new HashMap<>();
                    if (this.d != null) {
                        hashMap2.putAll(this.d);
                    }
                    hashMap2.putAll(a(optJSONObject, a3, attrs, optInt, -1));
                    Object[] objArr2 = {optJSONObject2, a3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72e16e0e869189df5d75aadd6ab43569", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72e16e0e869189df5d75aadd6ab43569");
                    } else if (optJSONObject2 == null) {
                        hashMap = null;
                    } else {
                        Map<String, Object> a4 = com.sankuai.waimai.mach.utils.b.a(optJSONObject2.toString());
                        a4.put("index", Integer.valueOf(a3 instanceof Number ? ((Number) a3).intValue() : 0));
                        hashMap = new HashMap<>();
                        hashMap.put("c_nfqbfvw", a4);
                    }
                    a(i, optString, hashMap2, hashMap);
                } else if (i != 2 || a2 == null) {
                } else {
                    String str4 = optString + a2.hashCode() + optString2 + "lx_expose";
                    if (h.a(str4)) {
                        return;
                    }
                    h.b(str4);
                    Map<String, Object> hashMap3 = new HashMap<>();
                    if (this.d != null) {
                        hashMap3.putAll(this.d);
                    }
                    hashMap3.putAll(a(optJSONObject, a3, attrs, optInt, -1));
                    a(i, optString, hashMap3, null);
                }
            }
        }
    }

    private void a(int i, String str, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {Integer.valueOf(i), str, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7528c45e575db07aacd79036811ba19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7528c45e575db07aacd79036811ba19a");
            return;
        }
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", this.b, str);
        if (i == 2) {
            a2 = com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", this.b, str);
        }
        a2.a(map).c(map2).a();
    }

    private Map<String, Object> a(JSONObject jSONObject, Object obj, Map<String, Object> map, int i, int i2) {
        Object[] objArr = {jSONObject, obj, map, Integer.valueOf(i), -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a5017baeecafccae5ffa8fbd881661", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a5017baeecafccae5ffa8fbd881661");
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
        a2.put("index", Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0));
        com.sankuai.waimai.store.search.statistics.d.a().a(this.c, a2);
        com.sankuai.waimai.store.search.statistics.d.a().a(this.c, a2, this.e);
        return a2;
    }
}
