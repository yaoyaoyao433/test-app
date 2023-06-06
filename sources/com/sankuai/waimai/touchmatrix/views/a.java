package com.sankuai.waimai.touchmatrix.views;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.touchmatrix.rebuild.utils.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private Map<String, Object> d;
    private String e;

    public a(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a3cd7f2bd0ed0a9d125c8e9455da93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a3cd7f2bd0ed0a9d125c8e9455da93");
            return;
        }
        this.b = str;
        this.c = str2;
        this.e = str3;
        if (map != null) {
            this.d = new HashMap();
            this.d.putAll(map);
        }
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b8f4201f7c4d0982f4e92a35ea871c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b8f4201f7c4d0982f4e92a35ea871c");
        } else if (map != null) {
            StringBuilder sb = new StringBuilder("source = ");
            sb.append(str2);
            sb.append(", mode = ");
            sb.append(i);
            sb.append(", map = ");
            sb.append(com.sankuai.waimai.mach.utils.b.a().toJson(map));
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            Map<String, Object> map2 = null;
            try {
                Map<String, Object> jsonObjectToMap = JsonUtil.jsonObjectToMap(jSONObject.optJSONObject("lab"));
                if (jsonObjectToMap == null) {
                    try {
                        map2 = new HashMap<>();
                    } catch (Exception unused) {
                        map2 = jsonObjectToMap;
                    }
                } else {
                    map2 = jsonObjectToMap;
                }
                if (this.d != null) {
                    for (String str3 : this.d.keySet()) {
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, this.d.get(str3));
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.e)) {
                    map2.put("template_id", this.e);
                }
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            switch (i) {
                case 1:
                    JudasManualManager.a a2 = JudasManualManager.a(optString).a(this.b);
                    a2.b = this.c;
                    a2.b(map2).a();
                    c.d("Mach 上报灵犀 点击 bid: " + optString, new Object[0]);
                    return;
                case 2:
                    JudasManualManager.a a3 = JudasManualManager.b(optString).a(this.b);
                    a3.b = this.c;
                    a3.b(map2).a();
                    c.d("Mach 上报灵犀 曝光 bid: " + optString, new Object[0]);
                    return;
                default:
                    return;
            }
        }
    }
}
