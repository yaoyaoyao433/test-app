package com.meituan.msc.extern;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class IEnvInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @MainThread
    @Deprecated
    public void doDelayedInit() {
    }

    public abstract String getAppCode();

    public abstract String getAppID();

    public abstract String getAppName();

    public abstract int getAppVersionCode();

    public abstract String getAppVersionName();

    public abstract Context getApplicationContext();

    public abstract String getBuildNumber();

    public abstract String getChannel();

    public abstract String getKNBHostScheme();

    public abstract int getMobileAppId();

    public abstract String getUUID();

    public abstract String getUserID();

    public abstract String getWXAppId();

    public abstract boolean isProdEnv();

    public String getAliasAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aa8fc3023d1017cb9ad615c663f4920", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aa8fc3023d1017cb9ad615c663f4920") : getAppCode();
    }
}
