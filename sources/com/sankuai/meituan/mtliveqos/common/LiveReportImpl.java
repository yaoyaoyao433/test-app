package com.sankuai.meituan.mtliveqos.common;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.p;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.mtliveqos.common.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LiveReportImpl implements a {
    private static final String MULTIMEDIA_CHANNEL = "prism-report-mtlive";
    private static final String OPEN_METRIC_MONITOR_SERVICE_URL_DEBUG = "http://live-monitor-broker.inf.st.sankuai.com/api/v1/push";
    private static final String OPEN_METRIC_MONITOR_SERVICE_URL_RELEASE = "https://live-monitor-broker.sankuai.com/api/v1/push";
    private static final String TAG = "LiveMetricUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    public void smell(String str, String str2, String str3, String str4, @NonNull Map<String, String> map, boolean z) {
    }

    private static void addValues(l lVar, Map<String, Float> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e64f9b526607a7620767cd3e57e7e7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e64f9b526607a7620767cd3e57e7e7c1");
        } else if (lVar != null && map != null && map.size() > 0) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                lVar.a(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
    }

    private static void addTags(l lVar, Map<String, String> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28625d9b5dc953b683aa4540de130dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28625d9b5dc953b683aa4540de130dcc");
        } else if (lVar != null && map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (TextUtils.isEmpty(value)) {
                    value = "none";
                }
                lVar.a(entry.getKey(), value);
            }
        }
    }

    @Override // com.sankuai.meituan.mtliveqos.common.a
    public void log(@NonNull Map<String, String> map, String[] strArr) {
        Object[] objArr = {map, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a94653911922535973bb959544f9c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a94653911922535973bb959544f9c39");
        } else {
            com.dianping.networklog.c.a(new JSONObject(map).toString(), 3, strArr);
        }
    }

    private static boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ab1e903d21cfc391a19a214dbca7860", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ab1e903d21cfc391a19a214dbca7860")).booleanValue();
        }
        b b = com.sankuai.meituan.mtliveqos.b.b();
        if (b == null) {
            return false;
        }
        return b.e();
    }

    @Override // com.sankuai.meituan.mtliveqos.common.a
    public void register(String str, final d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45aba255c39799f5bbe92dcdba5c4a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45aba255c39799f5bbe92dcdba5c4a7c");
        } else {
            Horn.register(str, new HornCallback() { // from class: com.sankuai.meituan.mtliveqos.common.LiveReportImpl.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa620d096a1103b31845ee2c80f86f35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa620d096a1103b31845ee2c80f86f35");
                    } else if (dVar != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        dVar.a(z, str2);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtliveqos.common.a
    public String accessCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ecb6692a7d9a4712d13b63f9abd7ac7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ecb6692a7d9a4712d13b63f9abd7ac7") : Horn.accessCache(str);
    }

    @Override // com.sankuai.meituan.mtliveqos.common.a
    public void sendToLiveMonitoringBackground(@NonNull Context context, int i, @NonNull boolean z, @NonNull Map<String, Float> map, @NonNull Map<String, String> map2) throws Exception {
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193ac5c349d8a22e37338c0eca4957fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193ac5c349d8a22e37338c0eca4957fc");
            return;
        }
        p pVar = new p(i, context, GetUUID.getInstance().getUUID(context));
        pVar.b(OPEN_METRIC_MONITOR_SERVICE_URL_RELEASE);
        addValues(pVar, map);
        addTags(pVar, map2);
        if (z) {
            pVar.a(c.b.MTLIVE_ADD_EXTRA_EVENT_VALUE.C);
        }
        pVar.a();
    }

    @Override // com.sankuai.meituan.mtliveqos.common.a
    public void sendToBabel(@NonNull boolean z, @NonNull Map<String, Float> map, @NonNull Map<String, String> map2) throws Exception {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06e68eca2ed4e3d1a703b3af632be80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06e68eca2ed4e3d1a703b3af632be80c");
            return;
        }
        Map<String, Object> convertCustomMap = convertCustomMap(map2);
        if (z) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                convertCustomMap.put(entry.getKey(), entry.getValue());
            }
            Babel.logRT(new Log.Builder("").reportChannel(MULTIMEDIA_CHANNEL).tag(c.b.MTLIVE_ADD_MATRIX_EVENT_TYPE.C).value(0L).lv4LocalStatus(true).optional(convertCustomMap).build());
            return;
        }
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, Float> entry2 : map.entrySet()) {
            jsonObject.addProperty(entry2.getKey(), entry2.getValue());
        }
        Babel.logRT(new Log.Builder("").reportChannel(MULTIMEDIA_CHANNEL).tag("MTLIVE_DATA").value(0L).details(jsonObject.toString()).optional(convertCustomMap).lv4LocalStatus(true).build());
    }

    private Map<String, Object> convertCustomMap(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce5ade8aa4f78d30c8f04bca6a0bcb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce5ade8aa4f78d30c8f04bca6a0bcb8");
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        return hashMap;
    }
}
