package com.sankuai.waimai.bussiness.order.base.mach;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public final class d implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    public HashSet<String> b;
    private String c;
    private String d;

    public d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674a3a4ac29eaf80ec2caac2b4787eeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674a3a4ac29eaf80ec2caac2b4787eeb");
            return;
        }
        this.b = new HashSet<>();
        this.c = str;
        this.d = str2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> map2;
        String str3;
        Object obj;
        int i2 = 0;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089ee048280e4f897c1d7cea9bb86359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089ee048280e4f897c1d7cea9bb86359");
        } else if (map == null) {
        } else {
            com.sankuai.waimai.imbase.log.a.a("CommonMachLogReporter", "source = " + str2 + ", mode = " + i + ", map = " + com.sankuai.waimai.mach.utils.b.a().toJson(map), new Object[0]);
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
                Map<String, Object> map3 = map2;
                if ("sh".equals(str2)) {
                    Object[] objArr2 = {Integer.valueOf(i), optString, map3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ba06fe3121e8835a7f2f7e5adb6eebd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ba06fe3121e8835a7f2f7e5adb6eebd");
                        return;
                    } else if (map3 != null) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) map3.get("ad");
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
            Map<String, Object> map4 = map2;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "716187277513710c06c73a96328f4657", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "716187277513710c06c73a96328f4657");
                return;
            }
            if (TextUtils.isEmpty(optString2)) {
                optString2 = this.c;
            }
            switch (i) {
                case 1:
                    JudasManualManager.a a2 = JudasManualManager.a(optString).a(optString2);
                    a2.b = this.d;
                    a2.b(map4).a();
                    return;
                case 2:
                    if (map4 != null && TextUtils.equals("b_waimai_y2s7on1p_mv", optString) && (obj = map4.get("sku_id")) != null) {
                        String obj2 = obj.toString();
                        if (this.b.contains(obj2)) {
                            return;
                        }
                        this.b.add(obj2);
                    }
                    JudasManualManager.a a3 = JudasManualManager.b(optString).a(optString2);
                    a3.b = this.d;
                    a3.b(map4).a();
                    return;
                default:
                    return;
            }
        }
    }
}
