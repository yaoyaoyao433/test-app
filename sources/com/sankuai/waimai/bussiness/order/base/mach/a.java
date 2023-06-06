package com.sankuai.waimai.bussiness.order.base.mach;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    public Map<String, List<Map<String, Object>>> b;
    public HashSet<String> c;
    private String d;
    private String e;

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028e0037fde6d696d7bd58f316620002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028e0037fde6d696d7bd58f316620002");
            return;
        }
        this.b = new HashMap();
        this.c = new HashSet<>();
        this.d = str;
        this.e = str2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> map2;
        String str3;
        Map<String, Object> map3;
        int i2 = 0;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96122c35b6b70da2176a95b0ed29833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96122c35b6b70da2176a95b0ed29833");
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
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            if (!"lx".equals(str2)) {
                Map<String, Object> map4 = map2;
                if ("sh".equals(str2)) {
                    Object[] objArr2 = {Integer.valueOf(i), optString, map4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf5345db8ff50261397bf9753480e8e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf5345db8ff50261397bf9753480e8e1");
                        return;
                    } else if (map4 != null) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) map4.get("ad");
                            str3 = jSONObject2.optString("adChargeInfo");
                            try {
                                i2 = jSONObject2.optInt("adType");
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            str3 = null;
                        }
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        switch (i) {
                            case 1:
                                com.sankuai.waimai.ad.mads.a.a(i2, new b.a(optString, str3, 2));
                                return;
                            case 2:
                                com.sankuai.waimai.ad.mads.a.a(i2, new b.a(optString, str3, 3));
                                return;
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            Object[] objArr3 = {Integer.valueOf(i), optString, optString2, map2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            Map<String, Object> map5 = map2;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e00bf33bff92b9bd5aa20e75385745a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e00bf33bff92b9bd5aa20e75385745a");
                return;
            }
            if (TextUtils.isEmpty(optString2)) {
                optString2 = this.d;
            }
            switch (i) {
                case 1:
                    JudasManualManager.a a2 = JudasManualManager.a(optString).a(optString2);
                    a2.b = this.e;
                    a2.b(map5).a();
                    return;
                case 2:
                    if (TextUtils.equals("b_waimai_y2s7on1p_mv", optString)) {
                        map3 = map5;
                        Object obj = map3.get("sku_id");
                        if (obj != null) {
                            String obj2 = obj.toString();
                            if (this.c.contains(obj2)) {
                                return;
                            }
                            this.c.add(obj2);
                        }
                    } else {
                        map3 = map5;
                        if (this.b.containsKey(optString)) {
                            List<Map<String, Object>> list = this.b.get(optString);
                            if (a(list, map3)) {
                                return;
                            }
                            list.add(map3);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(map3);
                            this.b.put(optString, arrayList);
                        }
                    }
                    JudasManualManager.a a3 = JudasManualManager.b(optString).a(optString2);
                    a3.b = this.e;
                    a3.b(map3).a();
                    return;
                default:
                    return;
            }
        }
    }

    private boolean a(List<Map<String, Object>> list, Map<String, Object> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d042e09f05b9f1b8e4544b75ae8ae2ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d042e09f05b9f1b8e4544b75ae8ae2ec")).booleanValue();
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
