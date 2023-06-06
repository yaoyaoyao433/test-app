package com.meituan.android.common.babel;

import android.support.annotation.AnyThread;
import android.support.annotation.Nullable;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BabelConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public IDesensitizer desensitizer() {
        return null;
    }

    @AnyThread
    public long getActivateDelayMils() {
        return MetricsAnrManager.ANR_THRESHOLD;
    }

    @AnyThread
    public String getApkHash() {
        return null;
    }

    @AnyThread
    public String getAppName() {
        return null;
    }

    @AnyThread
    public String getAppVersion() {
        return null;
    }

    @AnyThread
    public String getBuildVersion() {
        return "-1";
    }

    @AnyThread
    public String getChannel() {
        return null;
    }

    @AnyThread
    public String getToken() {
        return null;
    }

    @AnyThread
    public String getUuid() {
        return null;
    }

    @AnyThread
    public boolean isReportExceptionLimited() {
        return true;
    }

    public boolean isSensitiveLocalEnable() {
        return false;
    }

    @AnyThread
    @Nullable
    public Map<String, Object> getAppQuery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a876ca7bc7cb8ed16c7634452471a8", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a876ca7bc7cb8ed16c7634452471a8") : Collections.emptyMap();
    }
}
