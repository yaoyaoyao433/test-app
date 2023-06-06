package com.meituan.android.quickpass.uptsm.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class TsmUpdateData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String apkUrl;
    private boolean isDeviceSupport;
    private boolean isUpdate;
    private String targetTsmVersion;

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public boolean isDeviceSupport() {
        return this.isDeviceSupport;
    }

    public void setDeviceSupport(boolean z) {
        this.isDeviceSupport = z;
    }

    public String getApkUrl() {
        return this.apkUrl;
    }

    public void setApkUrl(String str) {
        this.apkUrl = str;
    }

    public String getTargetTsmVersion() {
        return this.targetTsmVersion;
    }

    public void setTargetTsmVersion(String str) {
        this.targetTsmVersion = str;
    }
}
