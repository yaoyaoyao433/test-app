package com.sankuai.waimai.store.drug.monitor.poiid;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.irmo.utils.h;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.util.monitor.DrugCommonMonitor;
import com.sankuai.waimai.store.monitor.ApiMonitorProxy;
import com.sankuai.waimai.store.order.DrugOrderMonitor;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugApiMonitor implements ApiMonitorProxy {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static List<String> getExcludeUris() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "641ad17305f736defa30f61d690a3ea3", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "641ad17305f736defa30f61d690a3ea3") : (List) d.h().a("poi_id_monitor/api/exclude_uris", new TypeToken<List<String>>() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.DrugApiMonitor.1
        }.getType());
    }

    @Override // com.sankuai.waimai.store.monitor.ApiMonitorProxy
    public void monitor(String str, String str2, String str3, String str4, int i) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0539ebef2059862c812317dcc2882b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0539ebef2059862c812317dcc2882b98");
        } else if (b.a("api/switch")) {
            String path = getPath(str);
            List<String> excludeUris = getExcludeUris();
            if (excludeUris == null || !excludeUris.contains(path)) {
                int b = b.b(getParamsFromUrl(path + CommonConstant.Symbol.QUESTION_MARK + str2));
                if (b != 0) {
                    reportError(path, b);
                }
                analysisErrorCode(str3, path);
            }
        }
    }

    private static String getPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b2692b916711037f4b548403fadc471", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b2692b916711037f4b548403fadc471");
        }
        try {
            int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
        return str;
    }

    private static Map<String, Object> getParamsFromUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3563f472cea18a32e94505e2218d87a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3563f472cea18a32e94505e2218d87a");
        }
        HashMap hashMap = new HashMap();
        try {
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put(str2, parse.getQueryParameter(str2));
                }
            }
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
        return hashMap;
    }

    private static void reportError(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "731725d02307b304e48f5fef147c7e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "731725d02307b304e48f5fef147c7e68");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("error_type", String.valueOf(i));
        c.a(new DrugCommonMonitor(b.a("api/key", "MEDPoiIdURLV2")), "", "poi id api error!", hashMap);
    }

    private void analysisErrorCode(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92f912f66c0a07bbe055899874c4c519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92f912f66c0a07bbe055899874c4c519");
        } else if (b.a("apiCodeError/switch") && !TextUtils.isEmpty(str) && str2.startsWith("http://hcapi.waimai.meituan.com")) {
            h.a(new h.a() { // from class: com.sankuai.waimai.store.drug.monitor.poiid.DrugApiMonitor.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.utils.h.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9f07140055d1a6277f0c10f8d4913609", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9f07140055d1a6277f0c10f8d4913609");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("code", -1);
                        if (optInt == 0) {
                            return;
                        }
                        String optString = jSONObject.optString("msg");
                        HashMap hashMap = new HashMap();
                        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(optInt));
                        hashMap.put("url", str2);
                        hashMap.put(NetLogConstants.Details.ERROR_MSG, optString);
                        c.a(new DrugOrderMonitor.Monitor("MEDApiCodeMonitor", "apiCodeMonitor"), "", "", hashMap);
                    } catch (Exception e) {
                        com.dianping.judas.util.a.a(e);
                    }
                }
            }, "");
        }
    }
}
