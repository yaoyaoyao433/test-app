package com.sankuai.waimai.business.search.ui.result.pouch;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.foundation.utils.m;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.mach.monitor.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements com.sankuai.waimai.mach.d, JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private String b;
    private int c;
    private Map<String, Object> d;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmstatistics";
    }

    public d(String str, int i, Map<String, Object> map) {
        Object[] objArr = {str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11f29f1a6516dd25cb80bc79243efe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11f29f1a6516dd25cb80bc79243efe3");
            return;
        }
        this.c = i;
        this.b = str;
        this.d = map;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a4151629eb10aebf6bb87601021057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a4151629eb10aebf6bb87601021057");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            JSONObject optJSONObject = jSONObject.optJSONObject("lab");
            if (optJSONObject == null) {
                return;
            }
            int optInt = optJSONObject.optInt("adType");
            long optLong = optJSONObject.optLong("adId");
            long optLong2 = optJSONObject.optLong("poiId");
            String optString2 = optJSONObject.optString("poiIdStr");
            String optString3 = optJSONObject.optString("chargeInfo");
            JSONObject a2 = m.a(optString3);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("adType", optInt);
                jSONObject2.put("adChargeInfo", a2);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("extra");
                if (optJSONObject2 != null) {
                    long optLong3 = optJSONObject2.optLong("spuId");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
                    jSONObject3.put("spuId", String.valueOf(optLong3));
                    jSONObject2.put("extra", jSONObject3);
                }
                String jSONObject4 = jSONObject2.toString();
                String a3 = com.sankuai.mads.e.a(optString, 0);
                switch (i) {
                    case 1:
                        com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString3, 2).a(a3));
                        JudasManualManager.a a4 = JudasManualManager.a(optString, "c_nfqbfvw", this.b).a("ad_id", optLong);
                        if (TextUtils.isEmpty(optString2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(optLong2);
                            optString2 = sb.toString();
                        }
                        JudasManualManager.a a5 = a4.a("poi_id", optString2).a("adlog_identifier", a3).a("index", this.c).a("ad", jSONObject4);
                        a(a5);
                        a5.a();
                        return;
                    case 2:
                        com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString3, 3).a(a3));
                        JudasManualManager.a a6 = JudasManualManager.b(optString).a("c_nfqbfvw");
                        a6.b = this.b;
                        JudasManualManager.a a7 = a6.a("ad_id", optLong);
                        if (TextUtils.isEmpty(optString2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(optLong2);
                            optString2 = sb2.toString();
                        }
                        JudasManualManager.a a8 = a7.a("poi_id", optString2).a("adlog_identifier", a3).a("index", this.c).a("ad", jSONObject4);
                        a(a8);
                        a8.a();
                        String templateId = aVar.f.getTemplateId();
                        if (TextUtils.isEmpty(templateId)) {
                            return;
                        }
                        c.a aVar2 = new c.a();
                        aVar2.c = "ad_type_8";
                        aVar2.d = templateId;
                        aVar2.b = "搜索结果页_0";
                        com.sankuai.waimai.platform.mach.monitor.b.a().b(aVar2.a(), map);
                        return;
                    default:
                        return;
                }
            } catch (JSONException unused) {
            }
        }
    }

    private void a(JudasManualManager.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a8553000e5eb234ce8107e6c8c5db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a8553000e5eb234ce8107e6c8c5db9");
        } else if (this.d != null && !this.d.isEmpty()) {
            for (Map.Entry<String, Object> entry : this.d.entrySet()) {
                String key = entry.getKey();
                if (key != null && entry.getValue() != null) {
                    aVar.a(key, String.valueOf(entry.getValue()));
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af23f4ccb9d002f846e671653b00f9c0", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af23f4ccb9d002f846e671653b00f9c0") : new String[]{"clicklx", "viewlx", "clicksh", "viewsh"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce41a59e5244d2d4b30df1c57af8714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce41a59e5244d2d4b30df1c57af8714");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("bid");
                String optString2 = jSONObject.optString("cid");
                String optString3 = jSONObject.optString("lab");
                Map<String, Object> map = TextUtils.isEmpty(optString3) ? null : (Map) com.sankuai.waimai.mach.utils.b.a().fromJson(optString3, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.d.1
                }.getType());
                jSONObject.optString("eventid");
                String optString4 = jSONObject.optString("chargeinfo");
                int optInt = jSONObject.optInt("adtype");
                String a2 = com.sankuai.mads.e.a(optString, 0);
                if (str.equals("clicklx")) {
                    JudasManualManager.a(optString, optString2, this.b).a(map).a();
                } else if (str.equals("viewlx")) {
                    JudasManualManager.b(optString, optString2, this.b).a(map).a();
                } else if (str.equals("clicksh")) {
                    com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString4, 2).a(a2));
                } else if (str.equals("viewsh")) {
                    com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, optString4, 3).a(a2));
                }
            } catch (JSONException unused) {
            }
        }
    }
}
