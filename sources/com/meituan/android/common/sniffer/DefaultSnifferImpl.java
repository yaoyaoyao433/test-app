package com.meituan.android.common.sniffer;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class DefaultSnifferImpl implements ISnifferM {
    private static final String BUSINESS = "business";
    private static final String CASE_DESCRIBE = "caseDescribe";
    private static final String CASE_MODULE = "caseModule";
    private static final String CASE_PAGE = "casePage";
    private static final String CASE_TYPE = "caseType";
    private static final int CUSTOM_FIELD_LIMIT_COUNT = 5;
    private static final int FIELD_LENGTH_LIMIT = 50;
    public static final String REPORT_CHANNEL = "s0";
    private static final String REPORT_DATE = "report_date";
    private static final int REPORT_INDEX_COUNT = 30000;
    private static final int REPORT_LOG_COUNT = 2;
    private static final int REPORT_SIZE = 10;
    private static final String SNIFFER = "sniffer";
    private static final String SNIFFER_FAIL_METRICS = "sniffer.fail.metrics";
    private static final String SNIFFER_SP = "sniffer_sp2";
    private static final String SNIFFER_SUCCESS_METRICS = "sniffer.success.metrics";
    public static volatile boolean enable = true;
    private int count;
    private volatile boolean init = false;
    private Map<String, Log.Builder> logs = new HashMap();
    private ExecutorService threadPool;

    private void init() {
        this.threadPool = c.a("Sniffer-DefaultSnifferImpl");
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void normal(String str, String str2, String str3) {
        normal(str, str2, str3, (String) null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void normal(String str, String str2, String str3, String str4) {
        normal(str, str2, str3, str4, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, long j) {
        normal(str, str2, str3, null, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, long j) {
        normal(str, str2, str3, str4, j, null);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, long j, Map<String, String> map) {
        normal(str, str2, "", str3, str4, j, map);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void normal(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        report(false, str, str2, str3, str4, null, str5, j, map);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3) {
        smell(str, str2, str3, null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3, String str4) {
        smell(str, str2, str3, str4, null);
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void smell(String str, String str2, String str3, String str4, String str5) {
        smell(str, str2, str3, str4, str5, 1L);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, long j) {
        smell(str, str2, str3, str4, str5, j, null);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        smell(str, str2, "", str3, str4, str5, j, map);
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public final void smell(String str, String str2, String str3, String str4, String str5, String str6, long j, Map<String, String> map) {
        report(true, str, str2, str3, str4, str5, str6, j, map);
    }

    private void report(final boolean z, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final long j, final Map<String, String> map) {
        final Context context = ContextHolder.getInstance().getContext();
        if (context == null || !enable) {
            return;
        }
        if (!this.init) {
            init();
            this.init = true;
        }
        this.threadPool.execute(new Runnable() { // from class: com.meituan.android.common.sniffer.DefaultSnifferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap;
                boolean z2;
                Message message = new Message(str, str2, str4, str5, str6, j);
                try {
                    StringBuilder sb = new StringBuilder(message.business);
                    sb.append('_');
                    sb.append(message.caseModule);
                    sb.append('_');
                    sb.append(message.caseType);
                    sb.append('_');
                    HashMap hashMap2 = new HashMap();
                    if (map != null) {
                        int i = 1;
                        for (String str7 : map.keySet()) {
                            if (i >= 5) {
                                break;
                            }
                            i++;
                            hashMap2.put(DefaultSnifferImpl.fieldLengthLimit(str7), DefaultSnifferImpl.fieldLengthLimit((String) map.get(str7)));
                        }
                    }
                    if (z) {
                        if (DefaultSnifferImpl.needReport(context, str2, str4)) {
                            if (TextUtils.isEmpty(str6)) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap();
                                try {
                                    hashMap.put("extra", (JsonObject) new Gson().fromJson(str6, (Class<Object>) JsonObject.class));
                                    z2 = true;
                                } catch (Exception unused) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    hashMap.put("extra", str6);
                                }
                            }
                            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
                            hashMap2.put("business", str);
                            hashMap2.put(DefaultSnifferImpl.CASE_MODULE, str2);
                            hashMap2.put(DefaultSnifferImpl.CASE_TYPE, str4);
                            hashMap2.put(DefaultSnifferImpl.CASE_DESCRIBE, str5);
                            hashMap2.put(DefaultSnifferImpl.CASE_PAGE, str3);
                            Log.Builder lv4LocalStatus = new Log.Builder(new Gson().toJson(hashMap)).tag("sniffer").optional(hashMap2).ts(currentTimeMillisSNTP).reportChannel("s0").lv4LocalStatus(true);
                            DefaultSnifferImpl.this.conditionReport(10, sb.toString() + currentTimeMillisSNTP, lv4LocalStatus, 0L);
                        }
                        if (DefaultSnifferImpl.needReport(context, str2)) {
                            hashMap2.put("business", str);
                            hashMap2.put(DefaultSnifferImpl.CASE_MODULE, str2);
                            hashMap2.put(DefaultSnifferImpl.CASE_TYPE, str4);
                            Log.Builder lv4LocalStatus2 = new Log.Builder(null).value(j).tag("sniffer.fail.metrics").optional(hashMap2).reportChannel("s0").lv4LocalStatus(true);
                            DefaultSnifferImpl defaultSnifferImpl = DefaultSnifferImpl.this;
                            sb.append(z);
                            defaultSnifferImpl.conditionReport(10, sb.toString(), lv4LocalStatus2, j);
                        }
                    } else if (DefaultSnifferImpl.needReport(context, str2)) {
                        hashMap2.put("business", str);
                        hashMap2.put(DefaultSnifferImpl.CASE_MODULE, str2);
                        hashMap2.put(DefaultSnifferImpl.CASE_TYPE, str4);
                        Log.Builder lv4LocalStatus3 = new Log.Builder(null).value(j).tag("sniffer.success.metrics").optional(hashMap2).reportChannel("s0").lv4LocalStatus(true);
                        DefaultSnifferImpl defaultSnifferImpl2 = DefaultSnifferImpl.this;
                        sb.append(z);
                        defaultSnifferImpl2.conditionReport(10, sb.toString(), lv4LocalStatus3, j);
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fieldLengthLimit(String str) {
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
        return str.length() < 50 ? str : str.substring(0, 50);
    }

    public static boolean needReport(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str3 = str + CommonConstant.Symbol.UNDERLINE + str2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(SNIFFER_SP, 0);
        if (isCurrentDay(context)) {
            int i = sharedPreferences.getInt(str3, 0);
            if (i < 2) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str3, i + 1);
                edit.apply();
                return true;
            }
            return false;
        }
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putInt(str3, 1);
        edit2.apply();
        return true;
    }

    public static boolean needReport(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SNIFFER_SP, 0);
        if (isCurrentDay(context)) {
            int i = sharedPreferences.getInt(str, 0);
            if (i < 30000) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str, i + 1);
                edit.apply();
                return true;
            }
            return false;
        }
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putInt(str, 1);
        edit2.apply();
        return true;
    }

    private static boolean isCurrentDay(Context context) {
        String format = new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(new Date(TimeUtil.currentTimeMillisSNTP()));
        SharedPreferences sharedPreferences = context.getSharedPreferences(SNIFFER_SP, 0);
        String string = sharedPreferences.getString(REPORT_DATE, "");
        if (TextUtils.isEmpty(string)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(REPORT_DATE, format);
            edit.apply();
            return true;
        } else if (string.equals(format) || Integer.valueOf(format).intValue() <= Integer.valueOf(string).intValue()) {
            return true;
        } else {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString(REPORT_DATE, format);
            edit2.apply();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void conditionReport(int i, String str, Log.Builder builder, long j) {
        synchronized (this.logs) {
            if (builder != null) {
                try {
                    this.count++;
                    Log.Builder builder2 = this.logs.get(str);
                    if (builder2 != null) {
                        builder2.reduce(new Log.ValueStrategy() { // from class: com.meituan.android.common.sniffer.DefaultSnifferImpl.2
                            @Override // com.meituan.android.common.kitefly.Log.ValueStrategy
                            public Long calculate(Long l, Long l2) {
                                return Long.valueOf(l.longValue() + l2.longValue());
                            }
                        }, j, 0L);
                    } else {
                        this.logs.put(str, builder);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.count >= i) {
                this.count = 0;
                ArrayList arrayList = new ArrayList();
                for (Log.Builder builder3 : this.logs.values()) {
                    if (builder3 != null) {
                        arrayList.add(builder3.build());
                    }
                }
                Babel.logRT(arrayList);
                this.logs.clear();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class Message {
        public String business;
        public String caseDescribe;
        public String caseLog;
        public String caseModule;
        public String caseType;
        public long weight;

        public Message(String str, String str2, String str3, String str4, String str5, long j) {
            if (str == null || "".equals(str)) {
                this.business = "default";
            } else {
                this.business = str;
            }
            this.caseModule = str2;
            this.caseType = str3;
            this.caseDescribe = str4;
            this.caseLog = str5;
            this.weight = j;
        }
    }
}
