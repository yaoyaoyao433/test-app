package com.meituan.android.common.metricx;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MetricX {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AppEnvironment appEnvironment;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class AppEnvironment {
        public static ChangeQuickRedirect changeQuickRedirect;

        @AnyThread
        @Deprecated
        public String getAndroidId() {
            return null;
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
            return null;
        }

        @AnyThread
        public String getChannel() {
            return null;
        }

        @AnyThread
        public long getCityId() {
            return -1L;
        }

        @AnyThread
        public String getCityName() {
            return "";
        }

        @AnyThread
        public String getToken() {
            return null;
        }

        @AnyThread
        public String getUserId() {
            return null;
        }

        @AnyThread
        public String getUuid() {
            return null;
        }

        @AnyThread
        public long getVersionCode() {
            return -1L;
        }
    }

    public void setAppEnvironment(AppEnvironment appEnvironment) {
        this.appEnvironment = appEnvironment;
    }

    public MetricX() {
    }

    @NonNull
    public static MetricX getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f8c6e71d5a4cc53004b88b6d52cd801", RobustBitConfig.DEFAULT_VALUE) ? (MetricX) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f8c6e71d5a4cc53004b88b6d52cd801") : _Inner._instance;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class _Inner {
        private static MetricX _instance = new MetricX();
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
