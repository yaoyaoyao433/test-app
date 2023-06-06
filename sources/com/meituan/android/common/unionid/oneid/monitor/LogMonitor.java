package com.meituan.android.common.unionid.oneid.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogMonitor {
    public static final String DATA_IS_NULL_TAG = "data_is_null";
    public static final String DPID_CHANGE_TAG = "dpid_change";
    public static final String EXCEPTION_TAG = "exception";
    public static final String ID_REQUEST_TRACE = "id_request_trace";
    public static final String LOCALID_EMPTY = "localId_empty";
    public static final String LOCALID_EXCEPTION = "localId_exception";
    public static final String LOCALID_ILLEGAL_CALL = "localId_illegal_call";
    public static final String LOCALID_NOT_SAVE = "localId_not_save";
    public static final String NET_ERROR_TAG = "net";
    public static final String NET_UNAVAILABLE_TAG = "net_unavailable";
    public static final String ONEID_CHANGE_TAG = "oneid_change";
    public static final String PARSE_DATA_ERROR = "parse_data_error";
    public static final String RETRY_TIMES_OVERDUE = "retry_times_overdue";
    private static final long TIME_INTERVAL = 5000;
    public static final String UNIONID_DOWNLOAD_SOURCE_EMPTY = "unionid_channel_empty";
    public static final String UUID_CHANGE_TAG = "uuid_change";
    public static final String UUID_DOWNLOAD_SOURCE_EMPTY = "uuid_channel_empty";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ILogger mILogger;
    private static LinkedHashMap<String, EMessage> mMemoryLogCache = new LinkedHashMap<>(30);
    private static long sLastTimestamp = 0;
    private static String sdkVersion = "";
    private static int sCount = 0;
    private static ExecutorService sExecutorService = c.a("unionId-monitor");

    public static void watch(String str, String str2, JSONObject jSONObject) {
        if (mILogger == null) {
        }
    }

    private static boolean isNeedWatch(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95fffc133bd31bab642cde92e2b149c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95fffc133bd31bab642cde92e2b149c4")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastTimestamp > 5000) {
            sLastTimestamp = currentTimeMillis;
            LinkedHashMap<String, EMessage> linkedHashMap = mMemoryLogCache;
            if (linkedHashMap.containsKey(str + str2)) {
                LinkedHashMap<String, EMessage> linkedHashMap2 = mMemoryLogCache;
                sCount = linkedHashMap2.get(str + str2).count + 1;
            } else {
                sCount = 1;
            }
            LinkedHashMap<String, EMessage> linkedHashMap3 = mMemoryLogCache;
            linkedHashMap3.put(str + str2, new EMessage(1, jSONObject));
            return true;
        }
        LinkedHashMap<String, EMessage> linkedHashMap4 = mMemoryLogCache;
        if (linkedHashMap4.containsKey(str + str2)) {
            LinkedHashMap<String, EMessage> linkedHashMap5 = mMemoryLogCache;
            if (jSONObject.toString().equals(linkedHashMap5.get(str + str2).msg.toString())) {
                LinkedHashMap<String, EMessage> linkedHashMap6 = mMemoryLogCache;
                EMessage eMessage = linkedHashMap6.get(str + str2);
                eMessage.count = eMessage.count + 1;
                return false;
            }
            sLastTimestamp = currentTimeMillis;
            LinkedHashMap<String, EMessage> linkedHashMap7 = mMemoryLogCache;
            linkedHashMap7.put(str + str2, new EMessage(1, jSONObject));
            sCount = 1;
            return true;
        }
        sLastTimestamp = currentTimeMillis;
        LinkedHashMap<String, EMessage> linkedHashMap8 = mMemoryLogCache;
        linkedHashMap8.put(str + str2, new EMessage(1, jSONObject));
        sCount = 1;
        return true;
    }

    private static JSONObject getFinalMsgPack(String str, String str2, JSONObject jSONObject, int i) {
        Object[] objArr = {str, str2, jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4037515d4f38067a64f049f42fd25232", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4037515d4f38067a64f049f42fd25232");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", str);
            jSONObject2.put("sub_tag", str2);
            jSONObject2.put("msg", jSONObject);
            jSONObject2.put("ver", sdkVersion);
            jSONObject2.put("tm", System.currentTimeMillis());
            jSONObject2.put("count", i);
            return jSONObject2;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setLogger(ILogger iLogger) {
        mILogger = iLogger;
    }

    public static void setSdkVersion(String str) {
        sdkVersion = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class EMessage {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public JSONObject msg;

        public EMessage(int i, JSONObject jSONObject) {
            this.count = i;
            this.msg = jSONObject;
        }
    }
}
