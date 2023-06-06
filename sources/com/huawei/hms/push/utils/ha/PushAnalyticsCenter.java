package com.huawei.hms.push.utils.ha;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PushAnalyticsCenter {
    public PushBaseAnalytics a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static PushAnalyticsCenter a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.a = pushBaseAnalytics;
    }
}
