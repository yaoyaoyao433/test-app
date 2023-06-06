package com.sankuai.meituan.android.knb.base;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.IHostAppProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AppHostProvider implements IHostAppProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appID;
    private String appVersion;
    private Context context;
    private String deviceID;

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // com.sankuai.titans.IHostAppProvider
    public String getAppID() {
        return this.appID;
    }

    @Override // com.sankuai.titans.IHostAppProvider
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.sankuai.titans.IHostAppProvider
    public String getDeviceID() {
        return this.deviceID;
    }

    @Override // com.sankuai.titans.IHostAppProvider
    public Context getContext() {
        return this.context;
    }
}
