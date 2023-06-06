package com.hhmedic.android.sdk.config;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHSDKOptions {
    private final boolean isTest;
    public String mExtensionString;
    public HHImageEngine mImageEngine;
    private final String sdkProductId;
    public boolean isDebug = false;
    public boolean enableCallErrorToast = true;

    public HHSDKOptions(String str, boolean z, HHImageEngine hHImageEngine) {
        this.isTest = z;
        this.sdkProductId = str;
        this.mImageEngine = hHImageEngine;
        if (hHImageEngine == null) {
            Log.e("HH", "warning");
            Log.e("HH", "请实现HHImageEngine接口，SDK里的网络图片无法加载");
            Log.e("HH", "请实现HHImageEngine接口，SDK里的网络图片无法加载");
            Log.e("HH", "warning");
        }
    }

    public final String getSdkProductId() {
        return this.sdkProductId;
    }

    public final boolean isInTest() {
        return this.isTest;
    }
}
