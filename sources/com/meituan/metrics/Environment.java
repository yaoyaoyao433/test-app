package com.meituan.metrics;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.config.MetricsConfig;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Environment {
    private static final String STARTUP_APP_VERSION = "startup_app_version";
    public static final int START_UP_FIRST_TIME = 1;
    public static final int START_UP_FIRST_TIME_VERSION = 2;
    public static final int START_UP_FIRST_TIME_VERSION_DEGRADE = 3;
    public static final int START_UP_NORMAL = 0;
    public static final int START_UP_UNDEFINED = -1;
    public static int appStartupType = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private q cipStorageCenter;
    private final WeakReference<Context> contextWeakRef;
    public String deviceProvider;
    public String deviceType;
    private volatile boolean firstStartupInit;
    private IStatisticSessionGetter iStatisticSessionGetter;
    public String os;
    public String osVersion;
    private String sc;
    public String sdkVersion;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ExtraGetter<T> {
        T onGetExtra();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface IStatisticSessionGetter {
        String getSession();
    }

    public Environment(final Context context, MetricsConfig metricsConfig) {
        Object[] objArr = {context, metricsConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "839d557219d765f9cb137db95d52a5b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "839d557219d765f9cb137db95d52a5b1");
            return;
        }
        this.firstStartupInit = false;
        this.contextWeakRef = new WeakReference<>(context);
        this.os = "Android";
        this.osVersion = Build.VERSION.RELEASE;
        this.sdkVersion = "4.7.24.2-waimai";
        this.deviceProvider = Build.MANUFACTURER;
        this.deviceType = Build.MODEL;
        this.cipStorageCenter = q.a(context, "metrics_environment", 2);
        ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.Environment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.util.thread.Task
            public void schedule() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "556e763effe163a5738bec50dad0477c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "556e763effe163a5738bec50dad0477c");
                } else {
                    Environment.this.initStartup(context);
                }
            }
        });
        this.iStatisticSessionGetter = metricsConfig.getStatisticSessionGetter();
    }

    public void initStartup(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ddbda36b78e21322487e163f6be4a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ddbda36b78e21322487e163f6be4a2e");
        } else if (this.firstStartupInit) {
        } else {
            long versionCode = Internal.getAppEnvironment().getVersionCode();
            if (versionCode <= 0) {
                return;
            }
            long b = this.cipStorageCenter.b(STARTUP_APP_VERSION, -1L);
            if (b == -1) {
                appStartupType = 1;
            } else {
                int i = (versionCode > b ? 1 : (versionCode == b ? 0 : -1));
                if (i == 0) {
                    appStartupType = 0;
                } else if (i > 0) {
                    appStartupType = 2;
                } else {
                    appStartupType = 3;
                }
            }
            this.cipStorageCenter.a(STARTUP_APP_VERSION, versionCode);
            this.firstStartupInit = true;
        }
    }

    @Deprecated
    public String getAppVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0eeebf67b0087232b884df926b74562", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0eeebf67b0087232b884df926b74562") : Internal.getAppEnvironment().getAppVersion();
    }

    public boolean isFirstStartup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67e76a7090457057de6ba2f5b4fab8a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67e76a7090457057de6ba2f5b4fab8a1")).booleanValue();
        }
        if (!this.firstStartupInit) {
            initStartup(Metrics.getInstance().getContext());
        }
        return appStartupType == 1 || appStartupType == 2;
    }

    public String getMccmnc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a15da1fb2c330af090bf94cb8382309", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a15da1fb2c330af090bf94cb8382309") : NetWorkUtils.getMccmnc(this.contextWeakRef.get());
    }

    public final String getSc() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d12498d4796516b67701dfacfc0250f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d12498d4796516b67701dfacfc0250f");
        }
        if (!TextUtils.isEmpty(this.sc)) {
            return this.sc;
        }
        if (this.contextWeakRef == null || (context = this.contextWeakRef.get()) == null) {
            return "";
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.sc = i + "*" + i2;
        return this.sc;
    }

    public String getUuid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63209d33196a5e795d6464d48bb4c16d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63209d33196a5e795d6464d48bb4c16d") : Internal.getAppEnvironment().getUuid();
    }

    public String getCh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f95775db3a88588e497c5d868c9d6947", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f95775db3a88588e497c5d868c9d6947") : Internal.getAppEnvironment().getChannel();
    }

    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c55a538d3677e003d83a17eb501603e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c55a538d3677e003d83a17eb501603e") : Internal.getAppEnvironment().getToken();
    }

    @Deprecated
    public String getAppnm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a8078815c8d45697ff6b6ed9bc0cbdd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a8078815c8d45697ff6b6ed9bc0cbdd") : Internal.getAppEnvironment().getAppName();
    }

    public String getApkHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227171b93990eb10559112d69c108e19", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227171b93990eb10559112d69c108e19") : Internal.getAppEnvironment().getApkHash();
    }

    public String getBuildVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed03ea2e6b88bc846a9252545a3ef48a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed03ea2e6b88bc846a9252545a3ef48a") : Internal.getAppEnvironment().getBuildVersion();
    }

    public String getUid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85bcc3de60d668eb30a0cc074d006531", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85bcc3de60d668eb30a0cc074d006531") : Internal.getAppEnvironment().getUserId();
    }

    public long getCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cb9184b3f5745c1e41909383eb104d1", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cb9184b3f5745c1e41909383eb104d1")).longValue() : Internal.getAppEnvironment().getCityId();
    }

    public final String getNet() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dabc31551651e60f71f2bf8afe0c0b6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dabc31551651e60f71f2bf8afe0c0b6") : (this.contextWeakRef == null || (context = this.contextWeakRef.get()) == null) ? "unknown" : NetWorkUtils.getNetWorkTypeForCrashAndSniffer(context);
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb897a93bcc8c750301c4880f5fa915f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb897a93bcc8c750301c4880f5fa915f");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("os", this.os);
                jSONObject.put("token", getToken());
                jSONObject.put("osVersion", this.osVersion);
                jSONObject.put("sdkVersion", this.sdkVersion);
                jSONObject.put("appVersion", Internal.getAppEnvironment().getAppVersion());
                jSONObject.put(NetLogConstants.Environment.DEVICE_PROVIDER, this.deviceProvider);
                jSONObject.put("deviceId", getUuid() == null ? "" : getUuid());
                jSONObject.put("deviceType", this.deviceType);
                jSONObject.put(NetLogConstants.Environment.MCC_MNC, getMccmnc());
                jSONObject.put("hash", getApkHash());
                jSONObject.put("ts", TimeUtil.currentTimeMillisSNTP());
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public String getSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9e23eb207ddf1dd2fcadebf3e66b80e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9e23eb207ddf1dd2fcadebf3e66b80e") : this.iStatisticSessionGetter != null ? this.iStatisticSessionGetter.getSession() : "";
    }
}
