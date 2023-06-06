package com.meituan.metrics.config;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.config.MetricsRemoteConfigV2;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsRemoteConfigManager {
    public static final int DISABLE = -1;
    @Deprecated
    public static final int ENABLE_BOTH = 3;
    public static final int ENABLE_NEW = 2;
    private static final String KEY_ENABLE = "enable";
    private static final String KEY_RATE = "rate";
    private static final String METRICS_REMOTE_CONFIG_TRAFFIC = "metrics_remote_config_traffic";
    private static final String METRICS_REMOTE_CONFIG_V2_FILE_NAME = "metrics_remote_config_v2";
    private static final String TAG = "MetricsRemoteConfigManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsRemoteConfigManager instance;
    private MetricsRemoteConfigV2 configV2;
    private Gson gson;
    private boolean nativeTraceEnable;

    @Deprecated
    public int getCpuConfig(String str) {
        return -1;
    }

    @Deprecated
    public int getMemoryConfig(String str) {
        return -1;
    }

    public MetricsRemoteConfigManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06de207d78127e30e02341efdb75743f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06de207d78127e30e02341efdb75743f");
            return;
        }
        this.gson = new Gson();
        this.nativeTraceEnable = true;
    }

    public static MetricsRemoteConfigManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7eca00cd9505e0101032689a9aa99cbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsRemoteConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7eca00cd9505e0101032689a9aa99cbb");
        }
        if (instance == null) {
            synchronized (MetricsRemoteConfigManager.class) {
                if (instance == null) {
                    instance = new MetricsRemoteConfigManager();
                }
            }
        }
        return instance;
    }

    public boolean isAppStartupEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6737c773ab07ba1dd9336bbea8a9c70c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6737c773ab07ba1dd9336bbea8a9c70c")).booleanValue() : this.configV2 != null && this.configV2.isAppStartupEnable();
    }

    public boolean isFpsEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e32f8b5151fc904b068279d40dd50bea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e32f8b5151fc904b068279d40dd50bea")).booleanValue();
        }
        if (this.configV2 != null) {
            return this.configV2.isFpsPageEnable() || this.configV2.isFpsScrollEnable() || this.configV2.isFpsCustomEnable();
        }
        return false;
    }

    public boolean isFpsPageEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce154bf42d52660b711c6b09996a0fe4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce154bf42d52660b711c6b09996a0fe4")).booleanValue() : this.configV2 != null && this.configV2.isFpsPageEnable();
    }

    public boolean isFpsPageEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a72bed7daba1493734da76b1e674d93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a72bed7daba1493734da76b1e674d93")).booleanValue() : this.configV2 != null && this.configV2.isFpsPageEnable(str);
    }

    public boolean isFpsScrollEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e19a7fc77f8a84f5d4e5db736eb04d67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e19a7fc77f8a84f5d4e5db736eb04d67")).booleanValue() : this.configV2 != null && this.configV2.isFpsScrollEnable();
    }

    public boolean isFpsScrollEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f8ed0324a3d3e5d1beec5ef498d2ecb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f8ed0324a3d3e5d1beec5ef498d2ecb")).booleanValue() : this.configV2 != null && this.configV2.isFpsScrollEnable(str);
    }

    public boolean isFpsCustomEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca6c4fe8b4e640b38c3a9904e12bbed6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca6c4fe8b4e640b38c3a9904e12bbed6")).booleanValue() : this.configV2 != null && this.configV2.isFpsCustomEnable();
    }

    public boolean isFpsCustomEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50ec6cfc75a59a970b34d03f44fcdb5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50ec6cfc75a59a970b34d03f44fcdb5e")).booleanValue() : this.configV2 != null && this.configV2.isFpsCustomEnable(str);
    }

    public boolean getLoadPageConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e357006bc59c0acd220975917ccd6b7e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e357006bc59c0acd220975917ccd6b7e")).booleanValue() : this.configV2 != null && this.configV2.isLoadPageEnable(str);
    }

    public boolean getLoadCustomConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad21d3a66de7789a0336d9b274ab7745", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad21d3a66de7789a0336d9b274ab7745")).booleanValue() : this.configV2 != null && this.configV2.isLoadPageCustom(str);
    }

    public boolean isMemoryEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f719c62c1f0a84a6fc7d9129d9a74ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f719c62c1f0a84a6fc7d9129d9a74ab")).booleanValue() : this.configV2 != null && this.configV2.isMemoryEnable(str);
    }

    public boolean isCpuEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca67fc5edc675f092a9aef1876cb8b7d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca67fc5edc675f092a9aef1876cb8b7d")).booleanValue() : this.configV2 != null && this.configV2.isCpuEnable(str);
    }

    public boolean isTrafficEnable() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "293058ed1f98e38e395558e47b8b607a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "293058ed1f98e38e395558e47b8b607a")).booleanValue();
        }
        if (this.configV2 == null || (context = Metrics.getInstance().getContext()) == null) {
            return false;
        }
        q a = q.a(context, METRICS_REMOTE_CONFIG_TRAFFIC, 2);
        float b = a.b(KEY_RATE, -1.0f);
        float trafficRate = this.configV2.getTrafficRate();
        if (b == trafficRate) {
            return a.b("enable", false);
        }
        a.a(KEY_RATE, trafficRate);
        if (MetricsRemoteConfigV2.RATE < trafficRate) {
            a.a("enable", true);
            return true;
        }
        a.a("enable", false);
        return false;
    }

    public MetricsRemoteConfigV2 getRemoteConfigV2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124eda0bc45329b81839ebaf45d808b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsRemoteConfigV2) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124eda0bc45329b81839ebaf45d808b4");
        }
        Environment environment = Metrics.getEnvironment();
        Context context = Metrics.getInstance().getContext();
        if (context == null) {
            return null;
        }
        MetricsRemoteConfigV2.isMainProcess = ProcessUtils.isMainProcess(context);
        StoreUtils.deleteOldFile(context, METRICS_REMOTE_CONFIG_V2_FILE_NAME);
        if (this.configV2 == null) {
            synchronized (MetricsRemoteConfigManager.class) {
                if (Metrics.debug) {
                    Logger.getMetricsLogger().d("create debug MetricsRemoteConfigV2");
                    setDefaultConfig(true);
                } else {
                    String accessCache = Horn.accessCache("metrics_config");
                    if (!TextUtils.isEmpty(accessCache)) {
                        try {
                            this.configV2 = (MetricsRemoteConfigV2) this.gson.fromJson(accessCache, (Class<Object>) MetricsRemoteConfigV2.class);
                        } catch (Throwable unused) {
                        }
                    }
                    if (this.configV2 == null || TextUtils.isEmpty(accessCache)) {
                        setDefaultConfig(false);
                    }
                    if (environment != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("metricsToken", environment.getToken());
                        hashMap.put("metricsSdkVersion", environment.sdkVersion);
                        Horn.register("metrics_config", new HornCallback() { // from class: com.meituan.metrics.config.MetricsRemoteConfigManager.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.horn.HornCallback
                            public void onChanged(boolean z, String str) {
                                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39717cfa4f2e4b503590418f854e1f39", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39717cfa4f2e4b503590418f854e1f39");
                                } else {
                                    Logger.getMetricsLogger().dt(MetricsRemoteConfigManager.TAG, "update local metrics_config.", new Object[0]);
                                }
                            }
                        }, hashMap);
                    }
                }
                if (Build.VERSION.SDK_INT >= 23 && environment != null) {
                    getAnrConfig(environment);
                }
            }
        }
        return this.configV2;
    }

    private void setDefaultConfig(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e108e8c9682a9e7a375034819bdfe00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e108e8c9682a9e7a375034819bdfe00");
            return;
        }
        this.configV2 = new MetricsRemoteConfigV2();
        float f = 1.0f;
        this.configV2.loadHomepage = 1.0f;
        this.configV2.anr = 1.0f;
        if (z) {
            this.configV2.lag = 1.0f;
            this.configV2.lagThreshold = 2500;
            this.configV2.maxReportCallstackTimes = 10;
        } else {
            this.configV2.lag = 0.001f;
            this.configV2.lagThreshold = 3000;
            this.configV2.maxReportCallstackTimes = 5;
            f = 0.0f;
        }
        this.configV2.fpsPage = new MetricsRemoteConfigV2.PagesConfig();
        this.configV2.fpsPage.pages = new ConcurrentHashMap<>();
        this.configV2.fpsPage.pages.put("*", Float.valueOf(f));
        this.configV2.fpsScroll = new MetricsRemoteConfigV2.PagesConfig();
        this.configV2.fpsScroll.pages = new ConcurrentHashMap<>();
        this.configV2.fpsScroll.pages.put("*", Float.valueOf(f));
        this.configV2.fpsCustom = new MetricsRemoteConfigV2.KeysConfig();
        this.configV2.fpsCustom.keys = new ConcurrentHashMap<>();
        this.configV2.fpsCustom.keys.put("*", Float.valueOf(f));
        this.configV2.loadPage = new MetricsRemoteConfigV2.PagesConfig();
        this.configV2.loadPage.pages = new ConcurrentHashMap<>();
        this.configV2.loadPage.pages.put("*", Float.valueOf(f));
        this.configV2.loadCustom = new MetricsRemoteConfigV2.KeysConfig();
        this.configV2.loadCustom.keys = new ConcurrentHashMap<>();
        this.configV2.loadCustom.keys.put("*", Float.valueOf(f));
        this.configV2.memory = new MetricsRemoteConfigV2.PagesConfig();
        this.configV2.memory.pages = new ConcurrentHashMap<>();
        this.configV2.memory.pages.put("*", Float.valueOf(f));
        this.configV2.cpu = new MetricsRemoteConfigV2.PagesConfig();
        this.configV2.cpu.pages = new ConcurrentHashMap<>();
        this.configV2.cpu.pages.put("*", Float.valueOf(f));
        this.configV2.processCpu = new MetricsRemoteConfigV2.Process();
        this.configV2.processCpu.processes = new ConcurrentHashMap<>();
        this.configV2.processCpu.processes.put("Main", Float.valueOf(f));
        this.configV2.processMemory = new MetricsRemoteConfigV2.Process();
        this.configV2.processMemory.processes = new ConcurrentHashMap<>();
        this.configV2.processMemory.processes.put("Main", Float.valueOf(f));
    }

    private void getAnrConfig(Environment environment) {
        Object[] objArr = {environment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cce5a7736b1b5f546cb6a9b9ff3e3a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cce5a7736b1b5f546cb6a9b9ff3e3a7");
            return;
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.meituan.metrics.config.MetricsRemoteConfigManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea9053eb4e19968c0d815f66f2f3df7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea9053eb4e19968c0d815f66f2f3df7b");
                    return;
                }
                Logger.getMetricsLogger().d("NativeTraceConfig", Boolean.valueOf(z), str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    MetricsRemoteConfigManager.this.nativeTraceEnable = jSONObject.getBoolean("native_trace_enable");
                    MetricsAnrManager.setEmptyErrorInfoAnrEnable(jSONObject.getBoolean("report_empty_error_state_enable"));
                } catch (Exception unused) {
                }
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put("metricsToken", environment.getToken());
        hashMap.put("metricsSdkVersion", environment.sdkVersion);
        Horn.register("metrics_anr_config", hornCallback, hashMap);
    }

    public boolean isNativeTraceEnable() {
        return this.nativeTraceEnable;
    }
}
