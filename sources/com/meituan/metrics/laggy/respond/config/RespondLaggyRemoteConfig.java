package com.meituan.metrics.laggy.respond.config;

import android.os.SystemClock;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class RespondLaggyRemoteConfig {
    private static final double RATE = Math.random();
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean enable;
    private float rate;
    private long threshold;
    private long timeout;
    @SerializedName("androidWhiteList")
    private String[] whiteList;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bc2c418aac7995f756cc4a5e76d928", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bc2c418aac7995f756cc4a5e76d928");
        }
        return "RespondLaggyRemoteConfig{enable=" + this.enable + ", rate=" + this.rate + ", threshold=" + this.threshold + ", timeout=" + this.timeout + '}';
    }

    public boolean isEnable() {
        return this.enable && ((double) this.rate) > RATE;
    }

    private long getThreshold() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1184a4cd17cb95a9225162a4be4d37d0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1184a4cd17cb95a9225162a4be4d37d0")).longValue() : Math.max(50L, this.threshold);
    }

    public long getTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acf4e0fe4f92833a751ab32fbf94082", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acf4e0fe4f92833a751ab32fbf94082")).longValue() : Math.max(1500L, this.timeout);
    }

    public boolean inWhiteList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b61625db67447e4d9c55b0afa01c789", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b61625db67447e4d9c55b0afa01c789")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.whiteList == null || this.whiteList.length == 0) {
            return false;
        }
        for (String str2 : this.whiteList) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public long getReportLaggyTimeByStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107c0c958b3ed6989a5195c8e66c4a4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107c0c958b3ed6989a5195c8e66c4a4c")).longValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis > getThreshold()) {
            return uptimeMillis;
        }
        return 0L;
    }

    public static RespondLaggyRemoteConfig defaultConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4385f85f1daa019a659e702d9e84147", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespondLaggyRemoteConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4385f85f1daa019a659e702d9e84147");
        }
        RespondLaggyRemoteConfig respondLaggyRemoteConfig = new RespondLaggyRemoteConfig();
        respondLaggyRemoteConfig.enable = false;
        respondLaggyRemoteConfig.rate = 0.0f;
        respondLaggyRemoteConfig.threshold = 100L;
        respondLaggyRemoteConfig.timeout = PayTask.j;
        respondLaggyRemoteConfig.whiteList = new String[0];
        return respondLaggyRemoteConfig;
    }
}
