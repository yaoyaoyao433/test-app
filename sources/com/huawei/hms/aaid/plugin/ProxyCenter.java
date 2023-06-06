package com.huawei.hms.aaid.plugin;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProxyCenter {
    public PushProxy proxy;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ProxyCenter a = new ProxyCenter();
    }

    public static ProxyCenter getInstance() {
        return a.a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
