package com.meituan.android.common.kitefly;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogConvertor {
    private static final String EC = "F\"k-`0'7P2X!eIBqTM)g?c_S=:Km6lQi4WzGNa8s(AE/@Y.D5^Hy~w>ZhJ[\\]$pLxb1|;f&*UR,j#n+%orVtu3C<v9{d}O";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ILogger logger = Logger.getBabelLogger();
    private static final String TAG = "LogConvertor";
    private static final CatchException mCatchConvertException = new CatchException(TAG, 5, 1000);

    public static void addInfoOnLogCreate(Context context, @NonNull Log log) {
        String str;
        Object[] objArr = {context, log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4696157dea7f1d9352004af34377f190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4696157dea7f1d9352004af34377f190");
            return;
        }
        try {
            log.envMaps = new HashMap();
            log.envMaps.put("os", "Android");
            convertCategory(log);
            String tokenByPriority = getTokenByPriority(context, log);
            if (TextUtils.isEmpty(tokenByPriority) && KiteFly.isDebug) {
                throw new Exception("token is empty. Please override BabelConfig#getToken(). ");
            }
            log.envMaps.put("token", tokenByPriority);
            log.token = tokenByPriority;
            log.envMaps.put("sdkVersion", "4.7.24.2-waimai");
            log.envMaps.put("osVersion", Build.VERSION.RELEASE);
            log.envMaps.put("appVersion", obtainValue(Babel.getBabelConfig().getAppVersion(), ""));
            String appName = Babel.getBabelConfig().getAppName();
            if (TextUtils.isEmpty(appName)) {
                appName = ApkUtil.obtainPackageName(context);
            }
            log.envMaps.put("app", obtainValue(appName, ""));
            if (!TextUtils.equals(log.tag, "anr") || !TextUtils.equals(log.tag, "lag_log")) {
                log.envMaps.put(NetLogConstants.Environment.BUILD_VERSION, Babel.getBabelConfig().getBuildVersion());
            }
            log.envMaps.put(NetLogConstants.Environment.MCC_MNC, NetWorkUtils.getMccmnc(context));
            log.envMaps.put("networkType", NetWorkUtils.getNetWorkTypeForBabel(context));
            log.envMaps.put("babelid", obtainValue(Babel.getBabelConfig().getUuid(), ""));
            log.envMaps.put(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MANUFACTURER);
            log.envMaps.put("deviceType", Build.MODEL);
            log.envMaps.put("isOhos", Boolean.valueOf(DeviceUtil.isOhos()));
            log.envMaps.put("ohosVersion", DeviceUtil.getOhosVersion());
            log.envMaps.put("is64", Boolean.valueOf(ProcessUtils.is64Bit()));
            if (log.option == null) {
                log.option = new HashMap();
            }
            Map<String, Object> appQuery = Babel.getBabelConfig().getAppQuery();
            if (appQuery != null) {
                log.option.putAll(appQuery);
            }
            if (!TextUtils.isEmpty(log.log)) {
                log.option.put(SnifferDBHelper.COLUMN_LOG, log.log);
            }
            if (log.option.get("report_traffic") != null) {
                log.option.put("report_network", Integer.valueOf(com.sankuai.common.utils.NetWorkUtils.isWifiConnected(context) ? 1 : 0));
            }
            log.option.put("deviceLevel", String.valueOf(DeviceUtil.getDeviceLevel(context)));
            int i = log.status;
            if (i != 100) {
                switch (i) {
                    case 0:
                        str = "realtime";
                        break;
                    case 1:
                        str = "standard";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
            } else {
                str = KiteFlyConstants.VIP_NAME;
            }
            log.option.put("$status", str);
            log.option.put("logUUId", log.logUUId);
            log.option.put("threadName", log.threadName);
            log.option.put("threadId", log.threadId);
            log.option.put("isMainThread", log.isMainThread ? "1" : "0");
            log.option.put("processName", ProcessUtils.getCurrentProcessName(context));
        } catch (Throwable th) {
            logger.e(TAG, th);
            mCatchConvertException.reportException(th);
        }
    }

    public static void addInfoOnLogReport(Context context, @NonNull Log log) {
        Object[] objArr = {context, log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "caa41e54f297db4f2303e00f20fc6e65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "caa41e54f297db4f2303e00f20fc6e65");
            return;
        }
        try {
            if (log.envMaps == null) {
                log.envMaps = new HashMap();
            }
            log.envMaps.put("reportNetworkType", NetWorkUtils.getNetWorkTypeForBabel(context));
            log.envMaps.put("reportVersion", Babel.getBabelConfig().getAppVersion());
            if (log.option == null) {
                log.option = new HashMap();
            }
            log.option.put("log_source", Integer.valueOf(log.logSource));
        } catch (Throwable th) {
            logger.e(TAG, th);
            mCatchConvertException.reportException(th);
        }
    }

    private static String getTokenByPriority(Context context, Log log) {
        Object[] objArr = {context, log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2aec6e7e2629da7cad73578e11491515", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2aec6e7e2629da7cad73578e11491515");
        }
        if (!TextUtils.isEmpty(log.token)) {
            return log.token;
        }
        String token = Babel.getBabelConfig().getToken();
        if (TextUtils.isEmpty(token)) {
            return KiteFly.logTokens.get(TextUtils.isEmpty(log.tag) ? "default" : log.tag);
        }
        return token;
    }

    private static String obtainValue(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92903b8f227be524e631a0b0acbbdabf", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92903b8f227be524e631a0b0acbbdabf") : (TextUtils.isEmpty(str) || StringUtil.NULL.equals(str)) ? str2 : str;
    }

    public static Map<LogMergedKey, LinkedList<Log>> mergeLogs(Context context, LinkedList<Log> linkedList) {
        LinkedList linkedList2;
        Object[] objArr = {context, linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "384cc1f6aea039994d3661a4c19ac2af", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "384cc1f6aea039994d3661a4c19ac2af");
        }
        if (context == null || linkedList == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<Log> it = linkedList.iterator();
            while (it.hasNext()) {
                Log next = it.next();
                if (next != null) {
                    if (next.envMaps == null) {
                        next.envMaps = new HashMap();
                    }
                    LogMergedKey logMergedKey = new LogMergedKey(next.reportChannel, next.token, next.innerProperty);
                    if (hashMap.containsKey(logMergedKey)) {
                        linkedList2 = (LinkedList) hashMap.get(logMergedKey);
                    } else {
                        linkedList2 = new LinkedList();
                    }
                    linkedList2.add(next);
                    hashMap.put(logMergedKey, linkedList2);
                }
            }
        } catch (Throwable th) {
            logger.e(TAG, th);
            mCatchConvertException.reportException(th);
        }
        return hashMap;
    }

    public static String convert2NetData(List<Log> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dfee880486628401b2e686bddc13c27", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dfee880486628401b2e686bddc13c27");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", list.get(0).reportChannel);
            jSONObject.put("category_type", "fe_perf");
            parseEnvForOldFormation(jSONObject, list.get(0).envMaps);
            JSONArray jSONArray = new JSONArray();
            for (Log log : list) {
                JSONObject jSONObject2 = new JSONObject();
                addTrafficInfo(log, jSONObject2);
                jSONObject2.put("value", log.value);
                jSONObject2.put("ts", log.ts);
                try {
                    jSONObject2.put("details", new JSONObject(log.details));
                } catch (Throwable unused) {
                }
                jSONObject2.put("raw", log.raw);
                jSONObject2.put("tags", new JSONObject(log.option));
                jSONObject2.put("type", log.tag);
                jSONArray.put(jSONObject2);
            }
            if (TypeConfig.getsInstance().withEnc()) {
                jSONObject.put("logs", encrypt(jSONArray.toString()));
            } else {
                jSONObject.put("logs", jSONArray);
            }
        } catch (Throwable th) {
            logger.e(TAG, th);
            mCatchConvertException.reportException(th);
        }
        return jSONObject.toString();
    }

    private static String encrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7ff8412a4d3768880583b252d330573", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7ff8412a4d3768880583b252d330573");
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= '~' && charAt >= '!') {
                sb.append(EC.charAt(charAt - '!'));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static void addTrafficInfo(Log log, JSONObject jSONObject) {
        Object[] objArr = {log, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12c5803153f000370fc1dbdd420ee397", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12c5803153f000370fc1dbdd420ee397");
            return;
        }
        try {
            Object remove = log.option.remove("traffic");
            if (remove != null) {
                jSONObject.put("name", "report_traffic");
                jSONObject.put("_value", remove);
            }
            Object remove2 = log.option.remove("report_createdTime");
            if (remove2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(remove2);
                jSONObject.put("created_at", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(TimeUtil.currentTimeMillisSNTP() / 1000);
                jSONObject.put("Uploaded_at", sb2.toString());
            }
        } catch (Throwable th) {
            logger.e(TAG, th);
            mCatchConvertException.reportException(th);
        }
    }

    private static void parseEnvForOldFormation(JSONObject jSONObject, Map<String, Object> map) {
        Object[] objArr = {jSONObject, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25513c3d7f6ddcf1a65a8bb01383658e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25513c3d7f6ddcf1a65a8bb01383658e");
        } else if (map == null) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(map);
                jSONObject2.put("ts", TimeUtil.currentTimeMillisSNTP());
                jSONObject2.put("eVersion", 1);
                jSONObject.put("env", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    private static void parseEnvForNewFormation(JSONObject jSONObject, Map<String, Object> map, boolean z) {
        Object[] objArr = {jSONObject, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ebe8837c82ff5c3544b80ad4beb9ec6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ebe8837c82ff5c3544b80ad4beb9ec6");
        } else if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("env_ts", TimeUtil.currentTimeMillisSNTP());
            } catch (Exception unused) {
            }
        }
    }

    private static void convertCategory(@NonNull Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05006ea0f673e9e48d46dfcd032aaec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05006ea0f673e9e48d46dfcd032aaec7");
        } else if (log.innerProperty.isGeneralChannel) {
            log.reportChannel = "p2";
            log.innerProperty.isNewLog = Boolean.TRUE;
            log.innerProperty.isLv4Local = Boolean.TRUE;
        } else {
            if (!log.innerProperty.isLv4Local.booleanValue() && log.tag.startsWith(ContainerInfo.ENV_MMP) && TypeConfig.getsInstance().isUseSafeLv4Category()) {
                log.reportChannel = "p5";
                log.innerProperty.isLv4Local = Boolean.TRUE;
            }
            if (TextUtils.equals(log.reportChannel, KiteFlyConstants.FE_LOG_REPORT)) {
                log.reportChannel = KiteFlyConstants.MET_BABEL_ANDROID;
            } else if (TextUtils.isEmpty(log.reportChannel)) {
                log.reportChannel = TypeConfig.getsInstance().getCategoryByType(log.tag);
            }
        }
    }
}
