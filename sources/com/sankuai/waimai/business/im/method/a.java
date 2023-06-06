package com.sankuai.waimai.business.im.method;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public Map<String, List<Map<String, Object>>> b;
    private String c;
    private String d;

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49d7073d2c194e8900dcc0966dc06ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49d7073d2c194e8900dcc0966dc06ba");
            return;
        }
        this.b = new HashMap();
        this.c = str;
        this.d = str2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> map2;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859a052849ea4c3d602c0ca8db289114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859a052849ea4c3d602c0ca8db289114");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            String optString2 = jSONObject.optString("cid");
            try {
                map2 = JsonUtil.jsonObjectToMap(jSONObject.optJSONObject("lab"));
            } catch (Exception unused) {
                map2 = null;
            }
            if (!TextUtils.isEmpty(optString) && "lx".equals(str2)) {
                Object[] objArr2 = {Integer.valueOf(i), optString, optString2, map2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e85eded0edebb5214364601375ef355", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e85eded0edebb5214364601375ef355");
                    return;
                }
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = this.c;
                }
                switch (i) {
                    case 1:
                        JudasManualManager.a a2 = JudasManualManager.a(optString).a(optString2);
                        a2.b = this.d;
                        a2.b(map2).a();
                        return;
                    case 2:
                        if (this.b.containsKey(optString)) {
                            List<Map<String, Object>> list = this.b.get(optString);
                            if (a(list, map2)) {
                                return;
                            }
                            list.add(map2);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(map2);
                            this.b.put(optString, arrayList);
                        }
                        JudasManualManager.a a3 = JudasManualManager.b(optString).a(optString2);
                        a3.b = this.d;
                        a3.b(map2).a();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private boolean a(List<Map<String, Object>> list, Map<String, Object> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a441270035687f7976d41c44b4fdf7a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a441270035687f7976d41c44b4fdf7a3")).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (Map<String, Object> map2 : list) {
            if (map2 == null && map == null) {
                return true;
            }
            if (map2 != null && map2.equals(map)) {
                return true;
            }
        }
        return false;
    }
}
