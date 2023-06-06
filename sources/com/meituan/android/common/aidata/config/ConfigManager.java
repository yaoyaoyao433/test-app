package com.meituan.android.common.aidata.config;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.data.DataManager;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.resources.config.ResourceConfigParser;
import com.meituan.android.common.aidata.resources.downloader.DDResLoader;
import com.meituan.android.common.aidata.resources.manager.EventDataCacheManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.JSONUtils;
import com.meituan.android.common.aidata.utils.SP;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornConfiguration;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConfigManager {
    public static final String DOWNLOAD_RESOURCE_MAX_WAIT_DURATION = "download_resource_max_wait_duration";
    public static final String HORN_CONFIG_DETAIL = "horn_config_detail";
    public static final String HORN_CONFIG_NAME = "horn_config_name";
    public static final String HORN_DILIVER_TIME = "horn_diliver_time";
    public static final String KEY_AUTO_START_BIZ_LIST = "start_biz_list";
    public static final String KEY_CACHE_MAX_COUNT = "local_cache_max_count";
    public static final String KEY_CAT_SAMPLE_RATE = "service_monitor_upload_sample";
    public static final String KEY_CEP_CONFIG_VER = "cep_config_ver";
    public static final String KEY_CLOUD_PUBLIC_VER = "cloud_public_ver";
    public static final String KEY_COMMON_CONFIG_VER = "common_config_ver";
    public static final String KEY_DISABLE_CEP_SERVICE = "disable_cep_service";
    public static final String KEY_DISABLE_FEATURE_SERVICE = "disable_feature_service";
    public static final String KEY_DISABLE_MODEL_PREDICT = "disable_model_predict";
    public static final String KEY_EVENT_CACHE_MAX_NUM = "event_cache_max_num";
    public static final String KEY_SQL_CONFIG_VER = "sql_config_ver";
    public static final String SUPPORT_30_EVENT_FEATURE = "support_30_event_feature";
    public static final String TAG = "HornConfigManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ConfigManager instance;
    private long cacheMaxCount;
    private final byte[] ddResourceLock;
    private int downloadResourceMaxWaitDuration;
    private volatile boolean hadHandleCache;
    private volatile boolean hadHandleCloudCache;
    private volatile boolean hadHandleCloudResister;
    private volatile boolean hadHandleRegister;
    private boolean hasAutoStartBiz;
    private final JSONObject mAIdataCloudPublicFeature;
    private final JSONObject mAIdataPackageConfig;
    private volatile boolean mHasGetResourceConfig;
    private boolean mIsHornDebug;
    private String mNormalResourceHornConfig;
    private Map<String, Object> mQueryParam;
    private Map<String, Map<String, List<String>>> mResourceConfigGroupByBiz;
    private Map<String, Set<AIData.ResourceConfigUpdateListener>> mResourceConfigUpdateListenerMap;
    private JSONObject mWhiteListResourceConfigInfo;
    private String mWhiteListResourceHornConfig;
    private final byte[] personaLock;
    private final byte[] resourceUpdateNotifyLock;
    private boolean support30EventFeature;
    public static final String AIDATA_COMMON_SDK_CONFIG = "aidata_android_common_config";
    public static String AIDATA_PACKAGE_CONFIG = "aidata_dd_resource_config";
    public static String AIDATA_PKG_WHITE_LIST_CONFIG = "aidata_dd_resource_config_white_list";
    public static final String AIDATA_SQL_CONFIG = "aidata_db_config";
    private static final String BLUE_DB_RT_CONFIG = "blue_db_rt_config";
    public static final String AIDATA_AI_SWITCH_CONFIG = "aidata_ai_switch_config";
    public static final String AIDATA_AUTO_START_BIZ_LIST_CONFIG = "aidata_auto_start_biz_list";
    public static final String AIDATA_DATA_AUTH = "aidata_data_auth";
    public static String AIDATA_CLOUD_PUBLIC_FEATURE = "aidata_cloud_feature_dd_resource_config";
    private static final String KEY_AIDATA_MOBILE_CLOUD_CONSISTENCY_CONFIG = "aidata_mobile_cloud_consistency_config";
    public static final String[] ALL_HORN_CONFIG_KEYS = {AIDATA_COMMON_SDK_CONFIG, AIDATA_PACKAGE_CONFIG, AIDATA_PKG_WHITE_LIST_CONFIG, AIDATA_SQL_CONFIG, BLUE_DB_RT_CONFIG, AIDATA_AI_SWITCH_CONFIG, AIDATA_AUTO_START_BIZ_LIST_CONFIG, AIDATA_DATA_AUTH, AIDATA_CLOUD_PUBLIC_FEATURE, KEY_AIDATA_MOBILE_CLOUD_CONSISTENCY_CONFIG};
    private static final AtomicBoolean isInitIng = new AtomicBoolean(false);
    private static volatile boolean mLoaded = false;

    public String getAidataCloudPublicFeature() {
        return null;
    }

    public String getAidataPackageConfig() {
        return null;
    }

    public void setHornDebug(boolean z) {
    }

    public ConfigManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "862db5532cfc3fbb1bab94f9d0b393d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "862db5532cfc3fbb1bab94f9d0b393d5");
            return;
        }
        this.hasAutoStartBiz = false;
        this.mIsHornDebug = SP.getBoolean(AIData.getContext(), SP.SP_KEY_HORN_ENV, false);
        this.cacheMaxCount = 40000L;
        this.support30EventFeature = false;
        this.downloadResourceMaxWaitDuration = 5;
        this.mAIdataPackageConfig = new JSONObject();
        this.mAIdataCloudPublicFeature = new JSONObject();
        this.mResourceConfigUpdateListenerMap = new ConcurrentHashMap();
        this.hadHandleCache = false;
        this.hadHandleRegister = false;
        this.ddResourceLock = new byte[0];
        this.hadHandleCloudCache = false;
        this.hadHandleCloudResister = false;
        this.personaLock = new byte[0];
        this.resourceUpdateNotifyLock = new byte[0];
    }

    public static ConfigManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91f92660aefdf81e7cbfd295cbccb352", RobustBitConfig.DEFAULT_VALUE)) {
            return (ConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91f92660aefdf81e7cbfd295cbccb352");
        }
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90fcaf2fba7536cd6b4bf33e7091f4ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90fcaf2fba7536cd6b4bf33e7091f4ae");
            return;
        }
        if (!mLoaded && isInitIng.compareAndSet(false, true) && !mLoaded) {
            new StringBuilder("ConfigManager init start isInitIng").append(isInitIng);
            if (!AppUtil.isDevToolIntegrated()) {
                AIDispatcher.getInstance().addHornInitTask(AIDATA_PACKAGE_CONFIG, AIDATA_CLOUD_PUBLIC_FEATURE);
            } else {
                AIDispatcher.getInstance().addHornInitTask(AIDATA_PACKAGE_CONFIG, AIDATA_CLOUD_PUBLIC_FEATURE, AIDATA_PKG_WHITE_LIST_CONFIG);
            }
            Horn.init(AIData.getContext(), new HornConfiguration());
            initHornQueryParam();
            registerAllHornConfig(true);
            mLoaded = true;
            isInitIng.set(false);
        }
        new StringBuilder("horn evn: ").append(this.mIsHornDebug ? "debug" : AiDownloadEnv.ENV_ONLINE);
    }

    public void registerAllHornConfig(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6716f2b6008bfe31a6ebc83079ec4205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6716f2b6008bfe31a6ebc83079ec4205");
            return;
        }
        new StringBuilder("register all horn config at env ").append(this.mIsHornDebug ? "debug" : AiDownloadEnv.ENV_ONLINE);
        registerCommonHornConfig();
        registerSQLiteHornConfig();
        registerBlueDBHornConfig();
        registerResourceHornConfig();
        registerWhiteListResourceHornConfig(z);
        registerAiSwitchHornConfig();
        registerAutoStartBizHornConfig();
        registerDataAuthHornConfig();
        registerCloudPublicFeatureHornConfig();
        registerMobileCloudConsistencyConfig();
    }

    private void initHornQueryParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d4fe9bd552ad56cd090946565d47ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d4fe9bd552ad56cd090946565d47ed");
            return;
        }
        if (this.mQueryParam == null) {
            this.mQueryParam = new HashMap();
        }
        this.mQueryParam.put("app_name", AppUtil.getApplicationName(AIData.getContext()));
        this.mQueryParam.put(Constants.PARAM_APP_VER, AppUtil.getVersionName(AIData.getContext()));
        this.mQueryParam.put("sdk_ver", "0.0.9.77");
        this.mQueryParam.put("os_ver", Integer.valueOf(Build.VERSION.SDK_INT));
        this.mQueryParam.put("lx_union_id", getUnionId());
    }

    private void registerCommonHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbc3215d5a00dd9a8a1de46665ac226a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbc3215d5a00dd9a8a1de46665ac226a");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_COMMON_SDK_CONFIG, this.mIsHornDebug);
        Horn.register(AIDATA_COMMON_SDK_CONFIG, new HornListener("registerCommonHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92014cf69a3f2d48f7487ff3dbc4bb5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92014cf69a3f2d48f7487ff3dbc4bb5c");
                    return;
                }
                StringBuilder sb = new StringBuilder("updateCommonCacheConfig: ");
                sb.append(str);
                sb.append(" tm:");
                sb.append(System.currentTimeMillis());
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    ConfigManager.this.cacheMaxCount = jSONObject.optLong(ConfigManager.KEY_CACHE_MAX_COUNT, 40000L);
                    ConfigManager.this.support30EventFeature = jSONObject.optBoolean(ConfigManager.SUPPORT_30_EVENT_FEATURE, false);
                    ConfigManager.this.downloadResourceMaxWaitDuration = jSONObject.optInt(ConfigManager.DOWNLOAD_RESOURCE_MAX_WAIT_DURATION, 5);
                    LoganManager.getInstance().recordHornConfig(ConfigManager.AIDATA_COMMON_SDK_CONFIG, jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
                } catch (JSONException unused) {
                }
            }
        }, this.mQueryParam);
    }

    private void registerResourceHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce54d9bd32597b658c27aa7eb9e0feb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce54d9bd32597b658c27aa7eb9e0feb5");
            return;
        }
        final String str = AIDATA_PACKAGE_CONFIG;
        Horn.debug(AIData.getContext(), str, this.mIsHornDebug);
        AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.config.ConfigManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca09e66491af4b04a8a9fa9db9858c02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca09e66491af4b04a8a9fa9db9858c02");
                    return;
                }
                String accessCache = Horn.accessCache(str);
                if (TextUtils.isEmpty(accessCache)) {
                    return;
                }
                ConfigManager.this.handleResourceConfig(accessCache, false, true, str);
            }
        });
        Horn.register(str, new HornListener("registerResourceHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str2, boolean z) {
                Object[] objArr2 = {str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8a1cdc619c591c902436c3b7b1e018be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8a1cdc619c591c902436c3b7b1e018be");
                    return;
                }
                ConfigManager.this.mNormalResourceHornConfig = str2;
                try {
                    ConfigManager.this.mAIdataPackageConfig.put(ConfigManager.HORN_CONFIG_NAME, str);
                    ConfigManager.this.mAIdataPackageConfig.put(ConfigManager.HORN_DILIVER_TIME, System.currentTimeMillis());
                    ConfigManager.this.mAIdataPackageConfig.put(ConfigManager.HORN_CONFIG_DETAIL, str2);
                } catch (Exception unused) {
                }
                if (!WhiteListResourceConfig.configEnabled) {
                    ConfigManager.this.handleResourceConfig(str2, z, false, str);
                    ConfigManager.this.notifyHornResourceConfig(str2);
                } else if (z) {
                    StringBuilder sb = new StringBuilder("already got white list resource horn config, abort handle ");
                    sb.append(str);
                    sb.append(" horn config at first time");
                    AIDispatcher.getInstance().notifyHornSyncParseFinish(str);
                }
            }
        }, this.mQueryParam);
    }

    private void registerWhiteListResourceHornConfig(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "900966245064b7c80b9e005315425cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "900966245064b7c80b9e005315425cba");
        } else if (AppUtil.isDevToolIntegrated()) {
            if (this.mWhiteListResourceConfigInfo == null) {
                this.mWhiteListResourceConfigInfo = new JSONObject();
            }
            final String str = AIDATA_PKG_WHITE_LIST_CONFIG;
            Horn.debug(AIData.getContext(), str, this.mIsHornDebug);
            Horn.register(str, new HornListener("registerWhiteListResourceHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.config.HornListener
                public void onChanged(@NonNull String str2, boolean z2) {
                    Object[] objArr2 = {str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "825e5093c8c34325397500ff7868383a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "825e5093c8c34325397500ff7868383a");
                        return;
                    }
                    boolean isResourceConfigValid = ResourceConfigManager.isResourceConfigValid(str2);
                    new StringBuilder("white list resource config valid: ").append(isResourceConfigValid);
                    if (z2 && z && isResourceConfigValid && ConfigManager.this.isHornDebug() == DDResLoader.getInstance().isEnvDebug()) {
                        WhiteListResourceConfig.configEnabled = true;
                    }
                    ConfigManager.this.mWhiteListResourceHornConfig = isResourceConfigValid ? str2 : null;
                    try {
                        ConfigManager.this.mWhiteListResourceConfigInfo.put(ConfigManager.HORN_CONFIG_NAME, str);
                        ConfigManager.this.mWhiteListResourceConfigInfo.put(ConfigManager.HORN_DILIVER_TIME, System.currentTimeMillis());
                        ConfigManager.this.mWhiteListResourceConfigInfo.put(ConfigManager.HORN_CONFIG_DETAIL, ConfigManager.this.mWhiteListResourceHornConfig);
                    } catch (Exception e) {
                        new StringBuilder("assemble WhiteListResourceConfigInfo failed: ").append(e);
                    }
                    if (WhiteListResourceConfig.configEnabled) {
                        ConfigManager.this.handleResourceConfig(str2, z2, false, str);
                        ConfigManager.this.notifyHornResourceConfig(str2);
                        return;
                    }
                    AIDispatcher.getInstance().notifyHornSyncParseFinish(str);
                }
            }, this.mQueryParam);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResourceConfig(String str, boolean z, boolean z2, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b205ddc3339e5443064025c83732303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b205ddc3339e5443064025c83732303");
            return;
        }
        StringBuilder sb = new StringBuilder("handle resource config from ");
        sb.append(str2);
        sb.append(", with content\n");
        sb.append(str);
        sb.append("\nwhich is from cache or not ");
        sb.append(z2);
        if (z2) {
            if (this.hadHandleCache || this.hadHandleRegister) {
                StringBuilder sb2 = new StringBuilder("ResourceConfig had handle cache : ");
                sb2.append(this.hadHandleCache);
                sb2.append(", had handle register : ");
                sb2.append(this.hadHandleRegister);
                return;
            }
            synchronized (this.ddResourceLock) {
                if (!this.hadHandleCache && !this.hadHandleRegister) {
                    this.hadHandleCache = true;
                    ResourceConfigManager.getInstance().handleConfigDataResponse(str, z);
                    JSFrameworkResourceManager.getInstance().handleConfigDataResponse(str);
                    AIDispatcher.getInstance().notifyHornSyncParseFinish(str2);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("ResourceConfig had handle cache : ");
                sb3.append(this.hadHandleCache);
                sb3.append(", had handle register : ");
                sb3.append(this.hadHandleRegister);
                return;
            }
        }
        synchronized (this.ddResourceLock) {
            this.hadHandleRegister = true;
            ResourceConfigManager.getInstance().handleConfigDataResponse(str, z);
            JSFrameworkResourceManager.getInstance().handleConfigDataResponse(str);
            AIDispatcher.getInstance().notifyHornSyncParseFinish(str2);
        }
    }

    public void switchResourceHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc6d307d73a27e81ce401b7950d301f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc6d307d73a27e81ce401b7950d301f");
            return;
        }
        boolean z = WhiteListResourceConfig.configEnabled;
        String str = z ? this.mWhiteListResourceHornConfig : this.mNormalResourceHornConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = z ? AIDATA_PKG_WHITE_LIST_CONFIG : AIDATA_PACKAGE_CONFIG;
        StringBuilder sb = new StringBuilder("switch to resource horn config ");
        sb.append(str2);
        sb.append(" when white list config enabled: ");
        sb.append(z);
        handleResourceConfig(str, false, false, str2);
        notifyHornResourceConfig(str);
    }

    @Nullable
    public Set<String> getWhiteListResourceBizSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "263aed4f1e9277b95f5112e4f19ebceb", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "263aed4f1e9277b95f5112e4f19ebceb") : ResourceConfigParser.parseResourceBizSet(this.mWhiteListResourceHornConfig);
    }

    private void registerSQLiteHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49815870857a1214c6473db1fb0387da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49815870857a1214c6473db1fb0387da");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_SQL_CONFIG, this.mIsHornDebug);
        Horn.register(AIDATA_SQL_CONFIG, new HornListener("registerSQLiteHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74bd48b8d6f2347058f92a0d10268876", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74bd48b8d6f2347058f92a0d10268876");
                } else {
                    DBConfig.getInstance().updateDBConfig(str);
                }
            }
        }, this.mQueryParam);
    }

    private void registerBlueDBHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc417710ad95c422d01916f2a15b76b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc417710ad95c422d01916f2a15b76b3");
            return;
        }
        Horn.debug(AIData.getContext(), BLUE_DB_RT_CONFIG, this.mIsHornDebug);
        Horn.register(BLUE_DB_RT_CONFIG, new HornListener("registerBlueDBHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "899dbf4f2243570dbf5ad370dfc76e00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "899dbf4f2243570dbf5ad370dfc76e00");
                } else {
                    DBConfig.getInstance().updateBlueDBRealTimeConfig(str);
                }
            }
        }, this.mQueryParam);
    }

    private void registerAiSwitchHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43b3683be11739975fb03d4e72c35c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43b3683be11739975fb03d4e72c35c14");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_AI_SWITCH_CONFIG, this.mIsHornDebug);
        Horn.register(AIDATA_AI_SWITCH_CONFIG, new HornListener("registerAiSwitchHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "26d100604fa61f2928f10bb02c840d65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "26d100604fa61f2928f10bb02c840d65");
                } else {
                    ConfigManager.this.updateAiSwitchConfig(str);
                }
            }
        }, this.mQueryParam);
    }

    private void registerAutoStartBizHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d178af8ccd1d0327ebb922f6c66fcdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d178af8ccd1d0327ebb922f6c66fcdd");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_AUTO_START_BIZ_LIST_CONFIG, this.mIsHornDebug);
        Horn.register(AIDATA_AUTO_START_BIZ_LIST_CONFIG, new HornListener("registerAutoStartBizHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                JSONArray optJSONArray;
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "efac5e4665356d7b5fe72f04c4a9bd9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "efac5e4665356d7b5fe72f04c4a9bd9f");
                    return;
                }
                try {
                    if (ConfigManager.this.hasAutoStartBiz) {
                        return;
                    }
                    ConfigManager.this.hasAutoStartBiz = true;
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has(ConfigManager.KEY_AUTO_START_BIZ_LIST) || (optJSONArray = jSONObject.optJSONArray(ConfigManager.KEY_AUTO_START_BIZ_LIST)) == null) {
                        return;
                    }
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            AIDataDelegate.getInstance().startServiceWithBiz(optString);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, this.mQueryParam);
    }

    private void registerDataAuthHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61246b0808fb6bf7ad48b617395f453e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61246b0808fb6bf7ad48b617395f453e");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_DATA_AUTH, this.mIsHornDebug);
        Horn.invalidateCache(AIDATA_DATA_AUTH);
        Horn.register(AIDATA_DATA_AUTH, new HornListener("registerDataAuthHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.9
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c1b06a734a403b75c33acb03c9b5ff6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c1b06a734a403b75c33acb03c9b5ff6");
                } else {
                    AuthConfig.getInstance().updateConfig(JSONUtils.parseToJSONObject(str));
                }
            }
        }, this.mQueryParam);
    }

    private void registerCloudPublicFeatureHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef14a3b3c798139c466d7ae46e148811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef14a3b3c798139c466d7ae46e148811");
            return;
        }
        Horn.debug(AIData.getContext(), AIDATA_CLOUD_PUBLIC_FEATURE, this.mIsHornDebug);
        AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.config.ConfigManager.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "639a760adec3a3291f1964eb1650791b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "639a760adec3a3291f1964eb1650791b");
                    return;
                }
                String accessCache = Horn.accessCache(ConfigManager.AIDATA_CLOUD_PUBLIC_FEATURE);
                if (TextUtils.isEmpty(accessCache)) {
                    return;
                }
                ConfigManager.this.handleCloudPublicFeature(accessCache, false, true);
            }
        });
        Horn.register(AIDATA_CLOUD_PUBLIC_FEATURE, new HornListener("registerCloudPublicFeatureHornConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.11
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d042a99fe8e48bde7a530bc64d880927", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d042a99fe8e48bde7a530bc64d880927");
                } else {
                    ConfigManager.this.handleCloudPublicFeature(str, z, false);
                }
            }
        }, this.mQueryParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCloudPublicFeature(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bca6cb8be1da57d49215fd588cdf4ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bca6cb8be1da57d49215fd588cdf4ead");
        } else if (z2) {
            if (this.hadHandleCloudCache || this.hadHandleCloudResister) {
                StringBuilder sb = new StringBuilder("CloudPublicFeature had handle cache : ");
                sb.append(this.hadHandleCloudCache);
                sb.append(", had handle register : ");
                sb.append(this.hadHandleCloudResister);
                return;
            }
            synchronized (this.personaLock) {
                if (!this.hadHandleCloudCache && !this.hadHandleCloudResister) {
                    this.hadHandleCloudCache = true;
                    PersonaManager.getInstance().parseHorn(str);
                    AIDispatcher.getInstance().notifyHornSyncParseFinish(AIDATA_CLOUD_PUBLIC_FEATURE);
                    return;
                }
                StringBuilder sb2 = new StringBuilder("CloudPublicFeature had handle cache : ");
                sb2.append(this.hadHandleCloudCache);
                sb2.append(", had handle register : ");
                sb2.append(this.hadHandleCloudResister);
            }
        } else {
            synchronized (this.personaLock) {
                this.hadHandleCloudResister = true;
                PersonaManager.getInstance().parseHorn(str);
                AIDispatcher.getInstance().notifyHornSyncParseFinish(AIDATA_CLOUD_PUBLIC_FEATURE);
                try {
                    this.mAIdataCloudPublicFeature.put(HORN_CONFIG_NAME, AIDATA_CLOUD_PUBLIC_FEATURE);
                    this.mAIdataCloudPublicFeature.put(HORN_DILIVER_TIME, System.currentTimeMillis());
                    this.mAIdataCloudPublicFeature.put(HORN_CONFIG_DETAIL, str);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void registerMobileCloudConsistencyConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26de566f1acd4833724c25409bc6019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26de566f1acd4833724c25409bc6019");
            return;
        }
        Horn.debug(AIData.getContext(), KEY_AIDATA_MOBILE_CLOUD_CONSISTENCY_CONFIG, this.mIsHornDebug);
        Horn.register(KEY_AIDATA_MOBILE_CLOUD_CONSISTENCY_CONFIG, new HornListener("registerMobileCloudConsistencyConfig") { // from class: com.meituan.android.common.aidata.config.ConfigManager.12
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.config.HornListener
            public void onChanged(@NonNull String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f72d22e97e7f9ce58733ecfed1c229c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f72d22e97e7f9ce58733ecfed1c229c0");
                    return;
                }
                MobileCloudConsistencyConfig.getInstance().updateConfig(str);
                DataManager.getInstance().startReportSeqData();
            }
        }, this.mQueryParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAiSwitchConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8c9d16f4c0d41178a4c94d1966c4c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8c9d16f4c0d41178a4c94d1966c4c0b");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AiSwitchConfig aiSwitchConfig = AiSwitchConfig.getInstance();
            boolean isDisableCepService = aiSwitchConfig.isDisableCepService();
            boolean optBoolean = jSONObject.optBoolean(KEY_DISABLE_CEP_SERVICE, false);
            if (optBoolean) {
                AIDataDelegate.getInstance().stopCepService();
            } else if (isDisableCepService) {
                for (String str2 : AIDataDelegate.getInstance().getTriggerBizSet()) {
                    new StringBuilder("HornConfigManager updateAiSwitchConfig, biz=").append(str2);
                    AIData.startServiceWithBiz(str2);
                }
            }
            aiSwitchConfig.setIsDisableCepService(optBoolean);
            aiSwitchConfig.setIsDisableFeatureService(jSONObject.optBoolean(KEY_DISABLE_FEATURE_SERVICE, false));
            aiSwitchConfig.setIsDisableModelService(jSONObject.optBoolean(KEY_DISABLE_MODEL_PREDICT, false));
            CatMonitorManager.getInstance().setSampleRate(jSONObject.optInt(KEY_CAT_SAMPLE_RATE, 1));
            EventDataCacheManager.getInstance().setCacheMaxNum(jSONObject.optInt(KEY_EVENT_CACHE_MAX_NUM, 400));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public long getCacheMaxCount() {
        return this.cacheMaxCount;
    }

    public boolean support30EventType() {
        return this.support30EventFeature;
    }

    public int downloadResourceMaxWaitDuration() {
        return this.downloadResourceMaxWaitDuration;
    }

    public boolean isHornDebug() {
        return this.mIsHornDebug;
    }

    public void setHornDebug(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "008b86145072f8a375a275a11fd12d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "008b86145072f8a375a275a11fd12d92");
            return;
        }
        this.mIsHornDebug = z;
        SP.putBoolean(context, SP.SP_KEY_HORN_ENV, z);
    }

    public String getUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b0b7017b46758ac62e557750f7ea6ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b0b7017b46758ac62e557750f7ea6ba");
        }
        OneIdHandler oneIdHandler = OneIdHandler.getInstance(AIData.getContext());
        String localOneId = oneIdHandler.getLocalOneId();
        return TextUtils.isEmpty(localOneId) ? oneIdHandler.getOneIdFromLocal() : localOneId;
    }

    public JSONObject getAIdataPackageConfig() {
        return this.mAIdataPackageConfig;
    }

    @Nullable
    public JSONObject getWhiteListResourceConfigInfo() {
        return this.mWhiteListResourceConfigInfo;
    }

    public JSONObject getAIdataCloudPublicFeature() {
        return this.mAIdataCloudPublicFeature;
    }

    public void notifyHornResourceConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd746af6d838a86bcf7f1f8f6c48e4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd746af6d838a86bcf7f1f8f6c48e4b4");
            return;
        }
        this.mHasGetResourceConfig = true;
        this.mResourceConfigGroupByBiz = ResourceConfigParser.parseResourceConfigByBiz(str);
        synchronized (this.resourceUpdateNotifyLock) {
            for (String str2 : this.mResourceConfigUpdateListenerMap.keySet()) {
                Map<String, List<String>> map = this.mResourceConfigGroupByBiz.get(str2);
                if (map != null) {
                    for (AIData.ResourceConfigUpdateListener resourceConfigUpdateListener : this.mResourceConfigUpdateListenerMap.get(str2)) {
                        resourceConfigUpdateListener.onUpdate(map);
                    }
                }
            }
        }
    }

    public void registerResourceConfigUpdateListener(String str, AIData.ResourceConfigUpdateListener resourceConfigUpdateListener) {
        Object[] objArr = {str, resourceConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fff001f958e9bf2750b553ad70ddd0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fff001f958e9bf2750b553ad70ddd0f9");
            return;
        }
        synchronized (this.resourceUpdateNotifyLock) {
            if (this.mHasGetResourceConfig && this.mResourceConfigGroupByBiz != null) {
                Map<String, List<String>> map = this.mResourceConfigGroupByBiz.get(str);
                if (map == null) {
                    map = new HashMap<>();
                }
                resourceConfigUpdateListener.onUpdate(map);
            }
            Set<AIData.ResourceConfigUpdateListener> set = this.mResourceConfigUpdateListenerMap.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.mResourceConfigUpdateListenerMap.put(str, set);
            }
            set.add(resourceConfigUpdateListener);
        }
    }

    public void removeResourceConfigUpdateListener(AIData.ResourceConfigUpdateListener resourceConfigUpdateListener) {
        Object[] objArr = {resourceConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06bb7d93b3a44f8e0658a3b1c3ec9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06bb7d93b3a44f8e0658a3b1c3ec9e0");
            return;
        }
        synchronized (this.resourceUpdateNotifyLock) {
            for (String str : this.mResourceConfigUpdateListenerMap.keySet()) {
                Set<AIData.ResourceConfigUpdateListener> set = this.mResourceConfigUpdateListenerMap.get(str);
                if (set != null) {
                    set.remove(resourceConfigUpdateListener);
                }
            }
        }
    }
}
