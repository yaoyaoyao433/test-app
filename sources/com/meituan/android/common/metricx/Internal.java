package com.meituan.android.common.metricx;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.kitefly.utils.CommonUtils;
import com.meituan.android.common.metricx.MetricX;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.crashreporter.d;
import com.meituan.metrics.config.MetricsConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.n;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Internal {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MetricX.AppEnvironment internalAppEnvironment = new MetricX.AppEnvironment() { // from class: com.meituan.android.common.metricx.Internal.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getAppVersion() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af87d71b81b127139306ee1cd7da7798", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af87d71b81b127139306ee1cd7da7798");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getAppVersion())) {
                return appEnvironment.getAppVersion();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (!TextUtils.isEmpty("")) {
                    return "";
                }
            }
            if (Internal.sSnareConfig == null || TextUtils.isEmpty(Internal.sSnareConfig.t)) {
                return ApkUtil.obtainAppVersion(ContextProvider.getInstance().getContext());
            }
            return Internal.sSnareConfig.t;
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final long getVersionCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "167db6218933fdb1255db1d459ff57ee", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "167db6218933fdb1255db1d459ff57ee")).longValue();
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && appEnvironment.getVersionCode() >= 0) {
                return appEnvironment.getVersionCode();
            }
            return ApkUtil.obtainVersionCode(ContextProvider.getInstance().getContext());
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getToken() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198826ea4ad58f23d3121aaa6286d9c4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198826ea4ad58f23d3121aaa6286d9c4");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getToken())) {
                return appEnvironment.getToken();
            }
            if (Internal.sCrashReporterConfig != null && !TextUtils.isEmpty(Internal.sCrashReporterConfig.b())) {
                return Internal.sCrashReporterConfig.b();
            }
            if (Internal.sMetricsConfig != null && !TextUtils.isEmpty(Internal.sMetricsConfig.getToken())) {
                return Internal.sMetricsConfig.getToken();
            }
            return CommonUtils.obtainToken(ContextProvider.getInstance().getContext());
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getApkHash() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4567bea74f2477174e1f6b658190e491", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4567bea74f2477174e1f6b658190e491");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getApkHash())) {
                return appEnvironment.getApkHash();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (!TextUtils.isEmpty("")) {
                    d dVar2 = Internal.sCrashReporterConfig;
                    return "";
                }
            }
            if (Internal.sMetricsConfig == null || TextUtils.isEmpty(Internal.sMetricsConfig.getApkHash())) {
                return (Internal.sSnareConfig == null || TextUtils.isEmpty(Internal.sSnareConfig.s)) ? "" : Internal.sSnareConfig.s;
            }
            return Internal.sMetricsConfig.getApkHash();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getChannel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d356cd87326faec456c6a1a6feb6b6", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d356cd87326faec456c6a1a6feb6b6");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null) {
                return appEnvironment.getChannel();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (!TextUtils.isEmpty("")) {
                    d dVar2 = Internal.sCrashReporterConfig;
                    return "";
                }
            }
            if (Internal.sMetricsConfig != null && !TextUtils.isEmpty(Internal.sMetricsConfig.getChannel())) {
                return Internal.sMetricsConfig.getChannel();
            }
            return super.getChannel();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getBuildVersion() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e66eff9a616dc111c568870a2bccee66", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e66eff9a616dc111c568870a2bccee66");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getBuildVersion())) {
                return appEnvironment.getBuildVersion();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (TextUtils.isEmpty("")) {
                    return "";
                }
                d dVar2 = Internal.sCrashReporterConfig;
                return "";
            }
            return "";
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getAppName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19630ee436b4d788f1451fed69bc79b8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19630ee436b4d788f1451fed69bc79b8");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getAppName())) {
                return appEnvironment.getAppName();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (!TextUtils.isEmpty(null)) {
                    d dVar2 = Internal.sCrashReporterConfig;
                    return null;
                }
            }
            if (Internal.sMetricsConfig != null && !TextUtils.isEmpty(Internal.sMetricsConfig.getAppName())) {
                return Internal.sMetricsConfig.getAppName();
            }
            Context context = ContextProvider.getInstance().getContext();
            if (context == null) {
                return "";
            }
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
            } catch (Throwable th) {
                Logger.getMetricxLogger().e(th.getMessage(), th);
                return "";
            }
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final long getCityId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa94bc8f8c81b7b7128f3529ef2ea19b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa94bc8f8c81b7b7128f3529ef2ea19b")).longValue();
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && appEnvironment.getCityId() != -1) {
                return appEnvironment.getCityId();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
            }
            if (Internal.sMetricsConfig == null || Internal.sMetricsConfig.getCityId() == -1) {
                return -1L;
            }
            return Internal.sMetricsConfig.getCityId();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getUserId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84fbf44da83737f13dd7d1dfe100a724", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84fbf44da83737f13dd7d1dfe100a724");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getUserId())) {
                return appEnvironment.getUserId();
            }
            if (Internal.sCrashReporterConfig == null || TextUtils.isEmpty(Internal.sCrashReporterConfig.h())) {
                return (Internal.sMetricsConfig == null || TextUtils.isEmpty(Internal.sMetricsConfig.getUserId())) ? "" : Internal.sMetricsConfig.getUserId();
            }
            return Internal.sCrashReporterConfig.h();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getUuid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8247550e690f5aa2dda29930e64c007a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8247550e690f5aa2dda29930e64c007a");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getUuid())) {
                return appEnvironment.getUuid();
            }
            if (Internal.sCrashReporterConfig == null || TextUtils.isEmpty(Internal.sCrashReporterConfig.a())) {
                return (Internal.sMetricsConfig == null || TextUtils.isEmpty(Internal.sMetricsConfig.getUuid())) ? "" : Internal.sMetricsConfig.getUuid();
            }
            return Internal.sCrashReporterConfig.a();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getCityName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e688203f13eb04394438b22903c506d4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e688203f13eb04394438b22903c506d4");
            }
            MetricX.AppEnvironment appEnvironment = MetricX.getInstance().appEnvironment;
            if (appEnvironment != null && !TextUtils.isEmpty(appEnvironment.getCityName())) {
                return appEnvironment.getCityName();
            }
            if (Internal.sCrashReporterConfig != null) {
                d dVar = Internal.sCrashReporterConfig;
                if (TextUtils.isEmpty("")) {
                    return "";
                }
                d dVar2 = Internal.sCrashReporterConfig;
                return "";
            }
            return "";
        }
    };
    public static d sCrashReporterConfig;
    public static MetricsConfig sMetricsConfig;
    public static n sSnareConfig;

    public static MetricX.AppEnvironment getAppEnvironment() {
        return internalAppEnvironment;
    }
}
