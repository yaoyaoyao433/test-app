package com.sankuai.titans.dns.config;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansHttpDnsConfigInit {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ConfigCallback {
        void onResult(TitansHttpDnsConfig titansHttpDnsConfig);
    }

    void fetchConfig(Context context, String str, ConfigCallback configCallback);
}
