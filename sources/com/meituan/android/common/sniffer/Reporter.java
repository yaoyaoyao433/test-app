package com.meituan.android.common.sniffer;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.android.common.sniffer.assist.Assistant;
import com.meituan.android.common.sniffer.bean.Message;
import com.meituan.android.common.sniffer.bean.WebConfig;
import com.meituan.android.common.sniffer.handler.WorkHandler;
import com.meituan.android.common.sniffer.report.SnifferCache;
import com.meituan.android.common.sniffer.report.SnifferExReport;
import com.meituan.android.common.sniffer.util.AppUtil;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.android.common.sniffer.util.SnifferSpUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Reporter {
    private static final String APP_HASH = "appHash";
    private static final String BUSINESS = "business";
    private static final String CASE_DESCRIBE = "caseDescribe";
    private static final String CASE_METHOD = "caseMethod";
    private static final String CASE_MODULE = "caseModule";
    private static final String CASE_PAGE = "casePage";
    private static final String CASE_TYPE = "caseType";
    private static final int CHUNK_LENGTH = 4000;
    private static final String CITY_ID = "cityId";
    private static final int CUSTOM_FIELD_LIMIT_COUNT = 5;
    private static final int FIELD_LENGTH_LIMIT = 50;
    private static final String PERMISSIONS = "permissions";
    public static final String REPORT_CHANNEL = "s0";
    private static final int REPORT_INDEX_COUNT = 300000;
    private static final int REPORT_LOG_COUNT = 2;
    private static final String SNIFFER = "sniffer";
    private static final String SNIFFER_BABEL_TOKEN = "5950cabfec1c0d24761bf346";
    private static final String SNIFFER_FAIL_METRICS = "sniffer.fail.metrics";
    private static final String SNIFFER_SUCCESS_METRICS = "sniffer.success.metrics";
    private static final String USER_ID = "userId";
    private static Context mContext = null;
    private static volatile double rate_log = 0.01d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init(Context context) {
        KiteFly.setDefaultToken("sniffer", SNIFFER_BABEL_TOKEN);
        mContext = context.getApplicationContext();
        SnifferSpUtil.getInstance().init(context);
    }

    @WorkerThread
    public static void report(Message message) {
        if (message == null) {
            return;
        }
        if (Sniffer.isDebugMode()) {
            logcat("----Reporter report message = " + GsonUtil.getGson().toJson(message));
            new StringBuilder("ConfigManager.getWebConfig(): ").append(ConfigManager.getWebConfig() != null);
            if (ConfigManager.getWebConfig() != null) {
                new StringBuilder().append(ConfigManager.getWebConfig().metrics);
            }
        }
        try {
            if (message.getWeight() <= 0) {
                message.setWeight(1L);
            }
            message.setBusiness(fieldLengthLimit(message.getBusiness()));
            message.setModule(fieldLengthLimit(message.getModule()));
            message.setType(fieldLengthLimit(message.getType()));
            if (message.isWrong()) {
                if (needReportLog(message.getModule(), message.getType())) {
                    logData(message);
                }
                if (needReport(message.getModule())) {
                    cacheIndexData(message, "sniffer.fail.metrics");
                }
            } else if (needReport(message.getModule())) {
                cacheIndexData(message, "sniffer.success.metrics");
            }
        } catch (Throwable th) {
            SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_ERROR, "reporter", th);
            if (Sniffer.isDebugMode()) {
                th.printStackTrace();
            }
        }
    }

    private static String fieldLengthLimit(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("http")) {
            try {
                Uri parse = Uri.parse(str);
                str = parse.getScheme() + "://" + parse.getHost() + parse.getPath();
            } catch (Exception unused) {
            }
        }
        int i = 50;
        if (ConfigManager.getWebConfig() != null && ConfigManager.getWebConfig().metrics != null && ConfigManager.getWebConfig().metrics.fieldLenLimit > 0) {
            i = ConfigManager.getWebConfig().metrics.fieldLenLimit;
        }
        return str.length() <= i ? str : str.substring(0, i);
    }

    private static void logData(Message message) {
        HashMap hashMap = new HashMap();
        hashMap.put("business", message.getBusiness());
        hashMap.put(CASE_MODULE, message.getModule());
        hashMap.put(CASE_TYPE, message.getType());
        hashMap.put(CASE_PAGE, message.getPageName());
        hashMap.put(CITY_ID, Sniffer.getSnifferConfig().getCityId());
        hashMap.put(APP_HASH, Sniffer.getSnifferConfig().getApkHash());
        hashMap.put("userId", Sniffer.getSnifferConfig().getUserId());
        WebConfig webConfig = ConfigManager.getWebConfig();
        if (webConfig != null && webConfig.withPermission) {
            hashMap.put(PERMISSIONS, AppUtil.getPermissions(Sniffer.getContext()));
        }
        hashMap.put(CASE_DESCRIBE, message.getDescribe());
        hashMap.put(CASE_METHOD, message.getMethodNumber());
        Assistant.Builder builder = new Assistant.Builder();
        builder.setNetworkState(NetWorkUtils.getNetWorkTypeForCrashAndSniffer(Sniffer.getContext()));
        if (message.getFullTrack() != null && message.getFullTrack().size() > 0) {
            builder.setTrack(GsonUtil.getGson().toJson(message.getFullTrack()));
        }
        if (message.getExts() != null && message.getExts().size() > 0) {
            builder.setExts(message.getExts());
        }
        String json = builder.build().toJson();
        int length = TextUtils.isEmpty(json) ? 0 : json.length();
        String describe = message.getDescribe();
        if (!TextUtils.isEmpty(describe)) {
            length += describe.length();
        }
        hashMap.put("$customSize", Integer.valueOf(length));
        Babel.logRT(new Log.Builder(json).tag("sniffer").optional(hashMap).ts(TimeUtil.currentTimeMillisSNTP()).reportChannel("s0").lv4LocalStatus(true).build());
    }

    private static void cacheIndexData(Message message, String str) {
        JsonObject jsonObject;
        HashMap hashMap = new HashMap();
        hashMap.put("business", message.getBusiness());
        hashMap.put(CASE_MODULE, message.getModule());
        hashMap.put(CASE_TYPE, message.getType());
        hashMap.put(CASE_PAGE, message.getPageName());
        hashMap.put(CITY_ID, Sniffer.getSnifferConfig().getCityId());
        StringBuilder sb = new StringBuilder(message.getBusiness());
        sb.append('_');
        sb.append(message.getModule());
        sb.append('_');
        sb.append(message.getType());
        sb.append('_');
        Map<String, String> customFieldMap = message.getCustomFieldMap();
        if (customFieldMap != null) {
            int i = 0;
            for (String str2 : customFieldMap.keySet()) {
                if (i >= 5) {
                    break;
                }
                i++;
                String fieldLengthLimit = fieldLengthLimit(str2);
                String fieldLengthLimit2 = fieldLengthLimit(customFieldMap.get(str2));
                hashMap.put(fieldLengthLimit, fieldLengthLimit2);
                sb.append(fieldLengthLimit);
                sb.append(fieldLengthLimit2);
            }
        }
        if (customFieldMap != null) {
            hashMap.put("appVersion", customFieldMap.get("appVersion"));
        }
        Map<String, Object> exts = message.getExts();
        if (exts != null && exts.get("extra") != null && (exts.get("extra") instanceof JsonObject) && (jsonObject = (JsonObject) exts.get("extra")) != null) {
            JsonElement jsonElement = jsonObject.get("skyeyeVersion");
            if (jsonElement != null) {
                String asString = jsonElement.getAsString();
                if (!TextUtils.isEmpty(asString)) {
                    hashMap.put("skyeyeVersion", asString);
                }
            }
            JsonElement jsonElement2 = jsonObject.get("belongPage");
            if (jsonElement2 != null) {
                String asString2 = jsonElement2.getAsString();
                if (!TextUtils.isEmpty(asString2)) {
                    hashMap.put("belongPage", asString2);
                    sb.append(asString2);
                    sb.append(CommonConstant.Symbol.UNDERLINE);
                }
            }
        }
        Log.Builder reportChannel = new Log.Builder(null).value(message.getWeight()).tag(str).optional(hashMap).reportChannel("s0");
        sb.append(message.isWrong());
        cache(sb.toString(), reportChannel, message.getWeight());
    }

    private static void cache(String str, Log.Builder builder, long j) {
        SnifferCache.getInstance().cacheData(str, builder, j);
    }

    private static boolean needReportLog(String str, String str2) {
        List<String> list;
        List<String> list2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (ConfigManager.getWebConfig() == null || ConfigManager.getWebConfig().metrics == null || (list = ConfigManager.getWebConfig().metrics.moduleWhiteList) == null || !list.contains(str) || (list2 = ConfigManager.getWebConfig().metrics.typeWhiteList) == null || !list2.contains(str2)) {
            double d = rate_log;
            if (ConfigManager.getWebConfig() != null && ConfigManager.getWebConfig().metrics != null && ConfigManager.getWebConfig().metrics.logRate > 0.0d) {
                d = ConfigManager.getWebConfig().metrics.logRate;
            }
            if ((TimeUtil.currentTimeMillisSNTP() / 1000) - SnifferSpUtil.getInstance().getTimeByModule(str) <= TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC) {
                return Math.random() < d;
            }
            SnifferSpUtil.getInstance().setTimeByModule(str);
            return true;
        }
        return true;
    }

    private static boolean needReport(String str) {
        List<String> list;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (ConfigManager.getWebConfig() == null || ConfigManager.getWebConfig().metrics == null || (list = ConfigManager.getWebConfig().metrics.moduleWhiteList) == null || !list.contains(str)) {
            if (isCurrentDay()) {
                int i = REPORT_INDEX_COUNT;
                if (ConfigManager.getWebConfig() != null && ConfigManager.getWebConfig().metrics != null) {
                    i = ConfigManager.getWebConfig().metrics.limit;
                }
                int indexLimit = SnifferSpUtil.getInstance().getIndexLimit(str);
                if (indexLimit < i) {
                    SnifferSpUtil.getInstance().setIndexLimit(str, indexLimit + 1);
                    return true;
                }
                return false;
            }
            SnifferSpUtil.getInstance().clear();
            SnifferSpUtil.getInstance().setIndexLimit(str, 1);
            return true;
        }
        return true;
    }

    private static boolean isCurrentDay() {
        String format = new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(new Date(TimeUtil.currentTimeMillisSNTP()));
        String reportDate = SnifferSpUtil.getInstance().getReportDate();
        if (TextUtils.isEmpty(reportDate)) {
            SnifferSpUtil.getInstance().setReportDate(format);
            return true;
        } else if (reportDate.equals(format) || Integer.valueOf(format).intValue() <= Integer.valueOf(reportDate).intValue()) {
            return true;
        } else {
            SnifferSpUtil.getInstance().setReportDate(format);
            return false;
        }
    }

    public static void reportCacheData() {
        WorkHandler.instance().post(new Runnable() { // from class: com.meituan.android.common.sniffer.Reporter.1
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                List<Log> queryAll = SnifferCache.getInstance().queryAll();
                if (queryAll == null || queryAll.size() <= 0) {
                    return;
                }
                Babel.logRT(queryAll);
                SnifferCache.getInstance().clear();
            }
        });
    }

    public static void fetchConfig(HornCallback hornCallback) {
        Horn.register("sniffer", hornCallback);
    }

    private static void logcat(String str) {
        if (str.length() > 4000) {
            int length = str.length() / 4000;
            int i = 0;
            while (i <= length) {
                int i2 = i + 1;
                int i3 = i2 * 4000;
                if (i3 >= str.length()) {
                    StringBuilder sb = new StringBuilder("chunk ");
                    sb.append(i);
                    sb.append(" of ");
                    sb.append(length);
                    sb.append(CommonConstant.Symbol.COLON);
                    sb.append(str.substring(i * 4000));
                } else {
                    StringBuilder sb2 = new StringBuilder("chunk ");
                    sb2.append(i);
                    sb2.append(" of ");
                    sb2.append(length);
                    sb2.append(CommonConstant.Symbol.COLON);
                    sb2.append(str.substring(i * 4000, i3));
                }
                i = i2;
            }
        }
    }
}
