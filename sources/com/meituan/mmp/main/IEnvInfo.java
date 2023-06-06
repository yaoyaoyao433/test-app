package com.meituan.mmp.main;

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

    public abstract String getChannel();

    public abstract int getMobileAppId();

    public abstract String getUUID();

    public abstract String getUserID();

    public abstract String getWXAppId();

    public abstract boolean isProdEnv();

    @Deprecated
    public boolean isThirdMiniProgram(String str) {
        return false;
    }

    public String getAliasAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43a4042ef7fe5c3a38059a2c70e3f44a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43a4042ef7fe5c3a38059a2c70e3f44a") : getAppCode();
    }
}
