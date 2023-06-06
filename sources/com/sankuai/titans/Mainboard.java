package com.sankuai.titans;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Mainboard {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IHostAppProvider hostAppProvider;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Mainboard instance = new Mainboard();
    }

    public Mainboard() {
    }

    public static Mainboard getInstance() {
        return Holder.instance;
    }

    public void registerHostAppProvider(IHostAppProvider iHostAppProvider) {
        Object[] objArr = {iHostAppProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "582a34df980943c838bac2a5e67545c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "582a34df980943c838bac2a5e67545c0");
        } else if (this.hostAppProvider == null) {
            if (iHostAppProvider == null) {
                throw new IllegalArgumentException("provider should not be null");
            }
            this.hostAppProvider = iHostAppProvider;
        }
    }

    public String getAppID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c4e1867678d151794ef812460073d52", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c4e1867678d151794ef812460073d52");
        }
        if (this.hostAppProvider == null) {
            throw new IllegalArgumentException("IHostAppProvider should be implemented");
        }
        if (TextUtils.isEmpty(this.hostAppProvider.getAppID())) {
            throw new IllegalArgumentException("appID should not be empty");
        }
        return this.hostAppProvider.getAppID();
    }

    public String getAppVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e646b8a87c1ad1835c4aa01ffe42820d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e646b8a87c1ad1835c4aa01ffe42820d");
        }
        if (this.hostAppProvider == null) {
            throw new IllegalArgumentException("IHostAppProvider should be implemented");
        }
        if (TextUtils.isEmpty(this.hostAppProvider.getAppVersion())) {
            throw new IllegalArgumentException("appVersion should not be empty");
        }
        return this.hostAppProvider.getAppVersion();
    }

    public String getDeviceID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d7d172432ecbb374c740d9576aaf97b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d7d172432ecbb374c740d9576aaf97b");
        }
        if (this.hostAppProvider == null) {
            throw new IllegalArgumentException("IHostAppProvider should be implemented");
        }
        if (TextUtils.isEmpty(this.hostAppProvider.getDeviceID())) {
            throw new IllegalArgumentException("deviceID should not be empty");
        }
        return this.hostAppProvider.getDeviceID();
    }

    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56de007fe1cab7e54c0b9420bc3ec1ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56de007fe1cab7e54c0b9420bc3ec1ff");
        }
        if (this.hostAppProvider == null) {
            throw new IllegalArgumentException("IHostAppProvider should be implemented");
        }
        if (this.hostAppProvider.getContext() == null) {
            throw new IllegalArgumentException("context required, please implement IHostProvider getContext method");
        }
        return this.hostAppProvider.getContext().getApplicationContext();
    }
}
