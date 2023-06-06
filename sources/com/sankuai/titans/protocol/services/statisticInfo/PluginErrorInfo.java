package com.sankuai.titans.protocol.services.statisticInfo;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.UrlUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PluginErrorInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String error;
    private final String errorUrl;
    private final String lifecycle;
    private final String pluginName;
    private final String pluginVersion;
    private final LifeCycleType type;

    public PluginErrorInfo(LifeCycleType lifeCycleType, String str, String str2, String str3, String str4, Throwable th) {
        this(lifeCycleType, str, str2, str3, str4, Log.getStackTraceString(th));
        Object[] objArr = {lifeCycleType, str, str2, str3, str4, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a70f8425cbae73c7ba5c0a41d2545b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a70f8425cbae73c7ba5c0a41d2545b5");
        }
    }

    public PluginErrorInfo(LifeCycleType lifeCycleType, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {lifeCycleType, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "affe36f0aa70366631dfdaa25565b2a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "affe36f0aa70366631dfdaa25565b2a1");
            return;
        }
        this.type = lifeCycleType;
        this.lifecycle = str;
        this.pluginName = str2;
        this.pluginVersion = str3;
        this.errorUrl = str4;
        this.error = str5;
    }

    public String getError() {
        return this.error;
    }

    public LifeCycleType getType() {
        return this.type;
    }

    public String getLifecycle() {
        return this.lifecycle;
    }

    public String getPluginName() {
        return this.pluginName;
    }

    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public String getErrorUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5cfdace2a77ae39e41e1a7454c5663", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5cfdace2a77ae39e41e1a7454c5663") : UrlUtils.clearQueryAndFragment(this.errorUrl);
    }
}
