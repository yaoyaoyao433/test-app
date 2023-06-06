package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.JsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.Reporter;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.titans.protocol.utils.UrlUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JsHandlerReportImpl implements JsHandlerReportStrategy {
    private static final int BRIDGE_MEM_MAX = 100;
    private static final String REPORT_KEY_BRIDGE_ERR_CODE = "code";
    private static final String REPORT_KEY_BRIDGE_ERR_CODE_SOURCE = "errorCode";
    private static final String REPORT_KEY_BRIDGE_METHOD = "method";
    private static final String REPORT_KEY_BRIDGE_PAGE = "page";
    private static final String REPORT_KEY_BRIDGE_STATUS = "status";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ConcurrentHashMap<BridgeReportData, Long> sBridgeReportData = new ConcurrentHashMap<>();
    private final List<String> queryList;

    public JsHandlerReportImpl(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84aa3421f8f26e88b31cedce21ced1c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84aa3421f8f26e88b31cedce21ced1c8");
        } else {
            this.queryList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class BridgeReportData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final HashMap<String, Object> tags;
        public final long ts;

        public BridgeReportData(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f6ceae45af0a01dbdfd650f6ad8407", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f6ceae45af0a01dbdfd650f6ad8407");
                return;
            }
            this.tags = new HashMap<>();
            if (map != null) {
                this.tags.putAll(map);
            }
            this.ts = System.currentTimeMillis() / 1000;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7340714e704e3428c14a2b68be42840", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7340714e704e3428c14a2b68be42840")).intValue() : this.tags.hashCode();
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "160e800aed15bec333be86371f46e8c5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "160e800aed15bec333be86371f46e8c5")).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof BridgeReportData) {
                BridgeReportData bridgeReportData = (BridgeReportData) obj;
                if (this.tags.size() != bridgeReportData.tags.size()) {
                    return false;
                }
                for (Map.Entry<String, Object> entry : this.tags.entrySet()) {
                    Object value = entry.getValue();
                    Object obj2 = bridgeReportData.tags.get(entry.getKey());
                    if (value == null) {
                        if (obj2 != null && !TextUtils.isEmpty(obj2.toString())) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public static void triggerUsageReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c51d58288e18993c931442939b4bb53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c51d58288e18993c931442939b4bb53");
            return;
        }
        HashMap hashMap = new HashMap(sBridgeReportData);
        sBridgeReportData.clear();
        for (Map.Entry entry : hashMap.entrySet()) {
            BridgeReportData bridgeReportData = (BridgeReportData) entry.getKey();
            Reporter.report(bridgeReportData.ts, "titansx-bridge", bridgeReportData.tags, (Long) entry.getValue());
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandlerReportStrategy
    public void report(BaseJsHandler baseJsHandler, JSONObject jSONObject) {
        Object[] objArr = {baseJsHandler, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06c7826cadd31565d1cdbf71cfd02932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06c7826cadd31565d1cdbf71cfd02932");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("page", UriUtil.filterQueryParams(baseJsHandler.jsHost().getUrl(), this.queryList));
            } catch (Exception unused) {
            }
            if (!hashMap.containsKey("page")) {
                hashMap.put("page", "unknown");
            }
            hashMap.put("method", TextUtils.isEmpty(baseJsHandler.jsBean().method) ? baseJsHandler.getClass().getSimpleName() : baseJsHandler.jsBean().method);
            hashMap.put("status", jSONObject.optString("status"));
            hashMap.put("code", jSONObject.optString("errorCode"));
            BridgeReportData bridgeReportData = new BridgeReportData(hashMap);
            Long l = sBridgeReportData.get(bridgeReportData);
            if (l == null) {
                l = 0L;
            }
            sBridgeReportData.put(bridgeReportData, Long.valueOf(l.longValue() + 1));
            if (sBridgeReportData.size() >= 100) {
                triggerUsageReport();
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.dianping.titans.js.jshandler.JsHandlerReportStrategy
    public void reportBridgeArrival(String str, JsHandler.Source source, String str2) {
        Object[] objArr = {str, source, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d108918b01c3360464c07e8cb7c02472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d108918b01c3360464c07e8cb7c02472");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        hashMap.put("source", source.name());
        hashMap.put("page", UrlUtils.clearQueryAndFragment(str2));
        hashMap.put("status", "arrive");
        Reporter.report("titansx-bridge", (Map<String, Object>) hashMap, (Long) 1L);
    }
}
