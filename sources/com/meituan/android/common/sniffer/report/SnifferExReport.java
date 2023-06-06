package com.meituan.android.common.sniffer.report;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.sniffer.assist.Assistant;
import com.meituan.metrics.util.TimeUtil;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SnifferExReport {
    private static final String ERROR_BUSINESS = "sniffer_cache";
    public static final String ERROR_MODULE_ERROR = "sniffer_error";
    public static final String ERROR_MODULE_FAILED = "sniffer_failed";

    public static void reportErrorLog(String str, String str2, Throwable th) {
        reportErrorLog(str, str2, getExceptionStr(th));
    }

    public static void reportErrorLog(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, ERROR_BUSINESS);
        hashMap.put("caseModule", str);
        hashMap.put("caseType", str2);
        Assistant.Builder builder = new Assistant.Builder();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error", str3);
        hashMap2.put("type", str2);
        builder.setExts(hashMap2);
        Babel.logRT(new Log.Builder(builder.build().toJson()).tag(KiteFlyConstants.SNIFFER).optional(hashMap).ts(TimeUtil.currentTimeMillisSNTP()).reportChannel("s0").lv4LocalStatus(true).build());
        Babel.log(new Log.Builder(null).tag(KiteFlyConstants.SNIFFER_FAIL_METRICS).optional(hashMap).ts(TimeUtil.currentTimeMillisSNTP()).reportChannel("s0").lv4LocalStatus(true).build());
    }

    private static String getExceptionStr(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Throwable unused) {
            return "00^_^00";
        }
    }
}
