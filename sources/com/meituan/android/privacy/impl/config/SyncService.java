package com.meituan.android.privacy.impl.config;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface SyncService {

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class SyncRequestArgs {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String app;
        public String appVersion;
        public String deviceType;
        public String hash;
        public String id;
        public String os;
        public String osVersion;
        public String sdkVersion;
        public String source;
    }

    @POST("/api/privacy/config")
    Call<ap> sync(@Body SyncRequestArgs syncRequestArgs);

    @POST("/api/privacy/pivyparam")
    Call<ap> syncNetFilter(@Body SyncRequestArgs syncRequestArgs);
}
