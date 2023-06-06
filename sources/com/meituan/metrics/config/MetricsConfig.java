package com.meituan.metrics.config;

import com.meituan.metrics.Environment;
import com.meituan.metrics.traffic.TrafficDispatcher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.b;
import com.meituan.snare.q;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MetricsConfig {
    private static final String TRAFFIC_DEFAULT_REG_API = "^http(s)?://(.*\\.)?(meituan\\.com|maoyan\\.com|dianping\\.com|kuxun\\.cn).*";
    private static final String TRAFFIC_DEFAULT_REG_RES = "^http(s)?://(.*\\.)?(meituan\\.net|dpfile\\.com).*";
    private static final String TRAFFIC_DEFAULT_REG_WEB = "^http(s)?://(.*\\.)?(meituan\\.com|maoyan\\.com|dianping\\.com|kuxun\\.cn|meituan\\.net|dpfile\\.com).*";
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getAnrOption() {
        return "";
    }

    @Deprecated
    public String getApkHash() {
        return "";
    }

    @Deprecated
    public String getAppName() {
        return null;
    }

    public String getBuildVersion() {
        return "";
    }

    @Deprecated
    public String getChannel() {
        return "";
    }

    @Deprecated
    public long getCityId() {
        return -1L;
    }

    public int getDebugMaxLaggyReportTimes() {
        return Integer.MAX_VALUE;
    }

    public Environment.IStatisticSessionGetter getStatisticSessionGetter() {
        return null;
    }

    @Deprecated
    public String getToken() {
        return null;
    }

    @Deprecated
    public long getTopTrafficCollectThresholdByte() {
        return -1L;
    }

    @Deprecated
    public int getTopTrafficCount() {
        return -1;
    }

    @Deprecated
    public long getTopTrafficReportThresholdByte() {
        return -1L;
    }

    public String getTrafficApiUrlPattern() {
        return TRAFFIC_DEFAULT_REG_API;
    }

    public String getTrafficResUrlPattern() {
        return TRAFFIC_DEFAULT_REG_RES;
    }

    public String getTrafficWebUrlPattern() {
        return TRAFFIC_DEFAULT_REG_WEB;
    }

    @Deprecated
    public String getUserId() {
        return "";
    }

    @Deprecated
    public String getUuid() {
        return null;
    }

    public boolean isAnrEnable() {
        return true;
    }

    public boolean isBigImageEnable() {
        return true;
    }

    public boolean isLagEnable() {
        return true;
    }

    public boolean isNativeFPSSampleEnable() {
        return true;
    }

    public boolean isSampleEnable() {
        return true;
    }

    public boolean isSignalAnrDetectorEnable() {
        return false;
    }

    public boolean isStartupTimerEnable() {
        return true;
    }

    public boolean isTrafficNativeHookEnable() {
        return false;
    }

    public boolean isTrafficStatDisabled() {
        return false;
    }

    public q getReportStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "236abc455df25a5fc70f51c0c500fe72", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "236abc455df25a5fc70f51c0c500fe72") : new b();
    }

    public TrafficDispatcher getTrafficDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812be591f053a8c3e1853ddc2d798f88", RobustBitConfig.DEFAULT_VALUE) ? (TrafficDispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812be591f053a8c3e1853ddc2d798f88") : new TrafficDispatcher() { // from class: com.meituan.metrics.config.MetricsConfig.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.traffic.TrafficDispatcher
            public void onLoganNeeded(String str, String str2) {
            }
        };
    }
}
