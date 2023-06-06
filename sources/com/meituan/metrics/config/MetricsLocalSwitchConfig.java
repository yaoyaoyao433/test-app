package com.meituan.metrics.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsLocalSwitchConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mActivityStr;
    private boolean mCpuSw;
    private boolean mFpsSw;
    private boolean mLagSw;
    private boolean mMemSw;

    public MetricsLocalSwitchConfig(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "079e64fde4a0a6c7ff68b878b9f868e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "079e64fde4a0a6c7ff68b878b9f868e3");
            return;
        }
        this.mActivityStr = str;
        this.mFpsSw = z;
        this.mCpuSw = z;
        this.mMemSw = z;
        this.mLagSw = z;
    }

    public MetricsLocalSwitchConfig setAllSw(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "745c6eaffebf9f715559071d2ec45d9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsLocalSwitchConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "745c6eaffebf9f715559071d2ec45d9d");
        }
        this.mFpsSw = z;
        this.mCpuSw = z;
        this.mMemSw = z;
        this.mLagSw = z;
        return this;
    }

    public MetricsLocalSwitchConfig setFPSSw(boolean z) {
        this.mFpsSw = z;
        return this;
    }

    public MetricsLocalSwitchConfig setCpuSw(boolean z) {
        this.mCpuSw = z;
        return this;
    }

    public MetricsLocalSwitchConfig setMemSw(boolean z) {
        this.mMemSw = z;
        return this;
    }

    public MetricsLocalSwitchConfig setLagSw(boolean z) {
        this.mLagSw = z;
        return this;
    }

    public String getActivitySw() {
        return this.mActivityStr;
    }

    public boolean getFPSSw() {
        return this.mFpsSw;
    }

    public boolean getCPUSw() {
        return this.mCpuSw;
    }

    public boolean getMemSw() {
        return this.mMemSw;
    }

    public boolean getLagSw() {
        return this.mLagSw;
    }

    public boolean getSampleSw() {
        return this.mFpsSw && this.mCpuSw && this.mMemSw;
    }

    public void commit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e128ec68c81cd31bb18a9bc206c96b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e128ec68c81cd31bb18a9bc206c96b0");
        } else {
            MetricsLocalSwitchConfigManager.getInstance().updateConfig(this);
        }
    }
}
