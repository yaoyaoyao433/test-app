package com.meituan.android.common.sniffer;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.sniffer.bean.ExcludeConfig;
import com.meituan.android.common.sniffer.bean.Message;
import com.meituan.android.common.sniffer.handler.WorkHandler;
import com.meituan.android.common.sniffer.report.SnifferExReport;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.android.common.sniffer.util.SnifferSpUtil;
import com.meituan.metrics.util.TimeUtil;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class SnifferImpl implements ISnifferM {
    public SnifferImpl(Context context) {
        registerIBackground();
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public final void normal(String str, String str2, String str3) {
        normal(str, str2, str3, null, 1L);
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
        smell(str, str2, str3, null, null);
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
        if (Sniffer.hasInited() && ConfigManager.isEnabled() && !TextUtils.isEmpty(str2)) {
            WorkHandler.instance().post(new Runnable() { // from class: com.meituan.android.common.sniffer.SnifferImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        Map<String, ExcludeConfig> excludeConfigMap = ConfigManager.getExcludeConfigMap();
                        if (excludeConfigMap != null && excludeConfigMap.containsKey(str2)) {
                            ExcludeConfig excludeConfig = excludeConfigMap.get(str2);
                            if (TextUtils.isEmpty(excludeConfig.type) || excludeConfig.type.equals(str4)) {
                                return;
                            }
                        }
                        long currentTimeMillisSNTP = z ? TimeUtil.currentTimeMillisSNTP() : 0L;
                        HashMap hashMap = null;
                        if (!TextUtils.isEmpty(str6)) {
                            hashMap = new HashMap();
                            boolean z2 = true;
                            try {
                                hashMap.put("extra", (JsonObject) GsonUtil.getGson().fromJson(str6, (Class<Object>) JsonObject.class));
                            } catch (Exception unused) {
                                z2 = false;
                            }
                            if (!z2) {
                                hashMap.put("extra", str6);
                            }
                        }
                        Message message = new Message();
                        message.setWrong(z);
                        message.setTraceTime(currentTimeMillisSNTP);
                        message.setBusiness(str);
                        message.setPageName(str3);
                        message.setModule(str2);
                        message.setType(str4);
                        message.setDescribe(str5);
                        message.setExts(hashMap);
                        message.setWeight(j);
                        String appVersion = Babel.getBabelConfig() != null ? Babel.getBabelConfig().getAppVersion() : "-1";
                        Map<String, String> map2 = map;
                        if (map2 == null) {
                            map2 = new HashMap<>();
                        }
                        map2.put("appVersion", appVersion);
                        message.setCustomFieldMap(map2);
                        Reporter.report(message);
                    } catch (Throwable th) {
                        SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_ERROR, "report", th);
                    }
                }
            });
        }
    }

    private void registerIBackground() {
        AppBus.getInstance().register(new AppBus.OnBackgroundListener() { // from class: com.meituan.android.common.sniffer.SnifferImpl.2
            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public void onBackground() {
                Reporter.reportCacheData();
                WorkHandler.instance().post(new Runnable() { // from class: com.meituan.android.common.sniffer.SnifferImpl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SnifferSpUtil.getInstance().saveInBackground();
                    }
                });
            }
        }, false);
    }
}
