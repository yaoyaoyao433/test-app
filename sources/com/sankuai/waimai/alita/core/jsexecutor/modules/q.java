package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.aidata.a;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "sqlQuery";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        com.sankuai.waimai.alita.core.featuredatareport.a a;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02abfea2e6e616a0b7568113cfca9e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02abfea2e6e616a0b7568113cfca9e2a");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge sqlQuery: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        int b2 = com.sankuai.waimai.alita.core.engine.d.a().b(str);
        com.sankuai.waimai.alita.core.engine.e.a().e(str, b2);
        HashMap hashMap = new HashMap();
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_TAG_SQL_QUERY_IS_COMPATIBLE, "false");
        List<a.c> b3 = b(str2);
        if (b3 == null || b3.size() == 0) {
            com.sankuai.waimai.alita.core.engine.e.a().a(str, b2, false, hashMap);
            a(mVar, str3);
            return;
        }
        com.sankuai.waimai.alita.core.jsexecutor.task.d dVar = null;
        try {
            dVar = com.sankuai.waimai.alita.core.engine.d.a().a(str).d;
        } catch (Exception unused) {
        }
        a.C0696a c0696a = new a.C0696a();
        c0696a.a = dVar;
        Map<String, List<Map<String, Object>>> a2 = com.sankuai.waimai.alita.core.aidata.a.a().a(b3, c0696a);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_TAG_SQL_QUERY_IS_COMPATIBLE, c0696a.b ? "true" : "false");
        if (dVar != null) {
            try {
                String str4 = dVar.b;
                String str5 = dVar.c;
                com.sankuai.waimai.alita.core.featuredatareport.d a3 = com.sankuai.waimai.alita.core.featuredatareport.d.a();
                Object[] objArr2 = {str4};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.featuredatareport.d.a;
                com.sankuai.waimai.alita.core.featuredatareport.c a4 = PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "fcfb301f93f8737a161b1d80537b1953", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.featuredatareport.c) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "fcfb301f93f8737a161b1d80537b1953") : a3.a(AlitaBundleUtil.a(str4));
                Object[] objArr3 = {str4, str5, b3, a2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.featuredatareport.c.a;
                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "91490f5a30646b39cd3353a91e73e455", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "91490f5a30646b39cd3353a91e73e455");
                } else {
                    String str6 = com.sankuai.waimai.alita.core.featuredatareport.b.b;
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && (a = a4.c.a(str4)) != null) {
                        if (com.sankuai.waimai.alita.core.base.util.d.a(a.d)) {
                            com.sankuai.waimai.alita.core.utils.c.a("AlitaFeatureDataReportManager.reportIfNeed(): isHit = true, bundleId = " + str4 + ", bundleVersion = " + str5);
                            a4.a(str4, str5, b3, a2);
                        } else {
                            com.sankuai.waimai.alita.core.utils.c.a("AlitaFeatureDataReportManager.reportIfNeed(): isHit = false, bundleId = " + str4 + ", bundleVersion = " + str5);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        JSONObject a5 = a(a2);
        if (a5 == null) {
            com.sankuai.waimai.alita.core.engine.e.a().a(str, b2, false, hashMap);
            a(mVar, str3);
            return;
        }
        com.sankuai.waimai.alita.core.engine.e.a().a(str, b2, true, hashMap);
        a(str, mVar, str3, a5);
    }

    private List<a.c> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2051df62e8ee7af871731e28a7eade8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2051df62e8ee7af871731e28a7eade8f");
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONArray.getJSONObject(i).optString("name", "");
                JSONObject optJSONObject = jSONObject.optJSONObject("sql");
                String optString2 = optJSONObject.optString(Constants.SQLConstants.KEY_SELECT, "");
                String optString3 = optJSONObject.optString("from", "");
                String optString4 = optJSONObject.optString(Constants.SQLConstants.KEY_WHERE, "");
                String optString5 = optJSONObject.optString(Constants.SQLConstants.KEY_HAVING, "");
                String optString6 = optJSONObject.optString(Constants.SQLConstants.KEY_ORDER_BY, "");
                String optString7 = optJSONObject.optString(Constants.SQLConstants.KEY_GROUP_BY, "");
                String optString8 = optJSONObject.optString("limit", "");
                boolean optBoolean = optJSONObject.optBoolean(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_TAG_SQL_QUERY_IS_COMPATIBLE, false);
                a.b bVar = new a.b();
                bVar.b = optString;
                bVar.c = optString2;
                bVar.d = optString3;
                bVar.e = optString4;
                bVar.g = optString5;
                bVar.h = optString6;
                bVar.f = optString7;
                bVar.i = optString8;
                bVar.j = optBoolean;
                arrayList.add(bVar.a());
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject a(Map<String, List<Map<String, Object>>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe9936631a40be300e58363fecadd60", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe9936631a40be300e58363fecadd60");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<Map<String, Object>>> entry : map.entrySet()) {
                List<Map<String, Object>> value = entry.getValue();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < value.size(); i++) {
                    jSONArray.put(new JSONObject(value.get(i)));
                }
                jSONObject.put(entry.getKey(), jSONArray);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
