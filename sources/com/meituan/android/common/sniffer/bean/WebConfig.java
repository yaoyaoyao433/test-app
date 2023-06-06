package com.meituan.android.common.sniffer.bean;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WebConfig {
    public boolean enabled;
    public List<ExcludeConfig> excludeConfigs;
    public MetricsConfig metrics;
    public List<MonitorConfig> monitorConfigs;
    public boolean withPermission = false;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MetricsConfig {
        public int fieldLenLimit;
        public int limit;
        public int logLimit;
        public double logRate;
        public List<String> moduleWhiteList;
        public List<String> typeWhiteList;

        public String toString() {
            return "limit:" + this.limit + "; logLimit:" + this.logLimit + "; fieldLenLimit:" + this.fieldLenLimit + "; moduleWhiteList:" + this.moduleWhiteList + "; typeWhiteList:" + this.typeWhiteList;
        }
    }
}
