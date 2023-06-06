package com.meituan.android.quickpass.uptsm.test.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TsmDevConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isDevOn;
    private String tsmUrl;
    private String tsmVersion;
    private String walletVersion;

    public TsmDevConfig() {
    }

    public static TsmDevConfig getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ceb45cbf75878d1ee87fffea0661c1e3", RobustBitConfig.DEFAULT_VALUE) ? (TsmDevConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ceb45cbf75878d1ee87fffea0661c1e3") : SingletonHolder.mConfig;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class SingletonHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static TsmDevConfig mConfig = new TsmDevConfig();
    }

    public void init(boolean z, String str, String str2, String str3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88c67478d0095c9737633732c271f144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88c67478d0095c9737633732c271f144");
            return;
        }
        this.isDevOn = z;
        this.tsmUrl = str;
        this.walletVersion = str2;
        this.tsmVersion = str3;
    }

    public boolean isDevOn() {
        return this.isDevOn;
    }

    public void setDevOn(boolean z) {
        this.isDevOn = z;
    }

    public String getTsmUrl() {
        return this.tsmUrl;
    }

    public void setTsmUrl(String str) {
        this.tsmUrl = str;
    }

    public String getWalletVersion() {
        return this.walletVersion;
    }

    public void setWalletVersion(String str) {
        this.walletVersion = str;
    }

    public String getTsmVersion() {
        return this.tsmVersion;
    }

    public void setTsmVersion(String str) {
        this.tsmVersion = str;
    }
}
