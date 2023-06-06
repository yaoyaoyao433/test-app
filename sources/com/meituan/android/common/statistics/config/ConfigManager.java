package com.meituan.android.common.statistics.config;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.cache.CacheFactory;
import com.meituan.android.common.statistics.cache.DBCacheHandler;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.ChannelManager;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.flowmanager.FlowManager;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.report.ReportStrategyController;
import com.meituan.android.common.statistics.sensor.SensorCollectManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DeviceUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConfigManager {
    private static final String BLUE_CACHE_CONFIG = "lx_android_blue_cache_config";
    private static final String FLOW_FILTER_CONFIG = "ocean_track_blacklist";
    private static final String FLOW_REPORT_STRATEGY = "android_lx_sdk_report_config";
    private static final String FLOW_VALLAB_CONFIG = "lx_android_vallab_config";
    private static final String KEY_ALLOW_CONTINUOUS_POLL_REPORT = "enable_continuous_upload";
    private static final String KEY_ALLOW_RETRY_FAILED_TIMES = "request_times_during_delete_failed";
    private static final String KEY_BID_HIGH_FLOW_LIMIT_MAX = "bid_high_flow_limit_max";
    private static final String KEY_BID_HIGH_FLOW_LIMIT_TIME = "bid_high_flow_limit_time";
    public static final String KEY_BLUE_CACHE_TIMEOUT_INTERVAL = "cache_timeout_interval";
    public static final String KEY_BLUE_MAX_CACHE_COUNT = "max_cache_count";
    private static final String KEY_COLLECT_CUSTOM_GESTURE_SWITCH = "custom_collect_gesture_switch";
    private static final String KEY_COLLECT_GESTURE_SWITCH = "collect_gesture_switch";
    public static final String KEY_COMMON_CONFIG_VER = "lx_android_common_cnf_ver";
    private static final String KEY_DISABLE_DEBUG = "disable_debug";
    private static final String KEY_DISABLE_LINK_TRACK_IN_APP = "disable_link_track_in_app";
    private static final String KEY_DISPATCH_BLUE_MV_TM_SWITCH = "dispatch_blue_mv_tm_switch";
    public static final String KEY_DROP_EVENT_TABLE = "drop_event_table";
    private static final String KEY_EVENT_MATCH_MODE = "match_cid_poiid_exclusively";
    private static final String KEY_EVENT_SDK_FILTER = "event_data_filter";
    private static final String KEY_GESTURE_SWITCH = "gesture_switch";
    private static final String KEY_HTTP_SWITCH = "http_switch";
    private static final String KEY_INTERCEPT_REPORT = "lx_android_intercept_report";
    private static final String KEY_LOGAN_BLACK_CONFIG = "logan_black_config";
    private static final String KEY_LX_ANDROID_DOWNLOAD_OCEAN_BLACK_459 = "lx_android_download_ocean_black_459";
    private static final String KEY_LX_ANDROID_IMMEDIATE_REPORT = "lx_android_immediate_report";
    private static final String KEY_LX_DICT = "lx_dict";
    private static final String KEY_LX_SDK_INTERCEPT_REPORT = "lx_sdk_intercept_report";
    private static final String KEY_MAX_REPORT_NUM_BY_DAY = "upload_times_in_day";
    private static final String KEY_MODEL_EXPOSURE_SWITCH = "model_exposure_switch";
    public static final String KEY_MOTION_ENABLE = "motion_enable";
    public static final String KEY_MOTION_REPORT_ENABLE = "motion_report_enable";
    public static final String KEY_MOTION_TIME_COLLECT = "motion_time_collect";
    public static final String KEY_MOTION_TIME_DELAY = "motion_time_delay";
    public static final String KEY_MOTION_TIME_PAUSE = "motion_time_pause";
    private static final String KEY_NUM_PER_REPORT = "num_per_package";
    private static final String KEY_REPORT_CUSTOM_GESTURE_SWITCH = "custom_report_gesture_switch";
    public static final String KEY_REPORT_FLOW_CONTROL_CONFIG_VER = "lx_android_flow_control_cnf_ver";
    private static final String KEY_REPORT_GESTURE_SWITCH = "report_gesture_switch";
    public static final String KEY_REPORT_STRATEGY_CONFIG_VER = "lx_android_report_strategy_cnf_ver";
    private static final String KEY_SUPPORT_MULTI_PROCESS = "lx_android_support_multi_process";
    private static final String KEY_UPLOAD_TIME_INTERVAL = "upload_gap_timeInterval";
    private static final String KEY_VALLAB_MAX_LENGTH = "vallab_max_length";
    private static final String KEY_WAIT_PV_TIMEOUT = "wait_pv_timeout";
    private static final String LX_ANDROID_MOTION_CONFIG = "lx_android_motion_config";
    private static final String LX_ONLINE_HANDLE = "lx_online_handle";
    private static final String LX_SDK_CONFIG = "lxsdk_android_config";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ConfigManager instance;
    private ChannelManager mChannelManager;
    private Map mConfigMap;
    private Context mContext;
    private Map<String, Object> query;
    private static AtomicBoolean isInitIng = new AtomicBoolean(false);
    private static volatile boolean initEnd = false;

    public ConfigManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f326b344331a84f3b68db8e913a13720", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f326b344331a84f3b68db8e913a13720");
            return;
        }
        this.mChannelManager = null;
        this.mConfigMap = null;
        this.mContext = context;
    }

    public static ConfigManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af2ac8047b6170ff3b142795bde8056c", 6917529027641081856L)) {
            return (ConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af2ac8047b6170ff3b142795bde8056c");
        }
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager(context);
                }
            }
        }
        return instance;
    }

    public void init(Context context, ChannelManager channelManager) {
        Object[] objArr = {context, channelManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cb8abe29cb6c64c0abb9af33513a222", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cb8abe29cb6c64c0abb9af33513a222");
            return;
        }
        LogUtil.log("ConfigManager init start ps:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        if (initEnd) {
            return;
        }
        LogUtil.log("ConfigManager init start initEnd ps:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        if (!isInitIng.compareAndSet(false, true) || initEnd) {
            return;
        }
        LogUtil.log("ConfigManager init start isInitIng " + isInitIng + " ps:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        this.mContext = context;
        this.mChannelManager = channelManager;
        this.query = new HashMap();
        this.mConfigMap = Collections.synchronizedMap(new HashMap());
        ReportStrategyController.getCounterFromCache(context);
        ReportStrategyController.getGestureScCounterFromCache(context);
        initHornQueryParam(context);
        registerCommonHornConfig(context);
        registerFlowReportStrategy(context);
        registerVallabConfig(context);
        registerBlueConfig(context);
        registerOnlineHandleConfig(context);
        registerMotionConfig(context);
        initEnd = true;
        isInitIng.set(false);
    }

    public void initHornQueryParam(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20d72b9741ca0fbd90928a1df51c95b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20d72b9741ca0fbd90928a1df51c95b3");
            return;
        }
        this.query.put("lx_os", "android");
        this.query.put("lx_app_name", AppUtil.getApplicationName(context));
        this.query.put("lx_app_ver", AppUtil.getVersionName(context));
        this.query.put("lx_sdk_ver", BuildConfig.LX_VERSION_NAME);
        this.query.put("os_ver", Integer.valueOf(Build.VERSION.SDK_INT));
        if (StatisticsDelegate.getInstance().getDefaultEnvironment() == null || StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() == null) {
            return;
        }
        String str = StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.query.put("lx_union_id", str);
    }

    private void registerMotionConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "466a3d3c1c6a953a6c7f0f74088a65e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "466a3d3c1c6a953a6c7f0f74088a65e0");
            return;
        }
        Horn.debug(context, LX_ANDROID_MOTION_CONFIG, LogUtil.isLogEnabled());
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.accessCache(LX_ANDROID_MOTION_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "29ebac18b9026ba4cc79c3a4c07d3114", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "29ebac18b9026ba4cc79c3a4c07d3114");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateMotionConfig(str);
                        ConfigManager.this.handleMotionInit();
                    }
                }
            });
            Horn.register(LX_ANDROID_MOTION_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbb8f8d44407b7a31d406621542b9792", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbb8f8d44407b7a31d406621542b9792");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateMotionConfig(str);
                    }
                }
            }, this.query);
            return;
        }
        Horn.accessCache(LX_ANDROID_MOTION_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b730efc254d6dd84a42f212acb5b60a4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b730efc254d6dd84a42f212acb5b60a4");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    ConfigManager.this.updateMotionConfig(str);
                }
            }
        });
    }

    private void registerOnlineHandleConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706cefba6d6fafec4698455d8e240a75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706cefba6d6fafec4698455d8e240a75");
            return;
        }
        Horn.debug(context, LX_ONLINE_HANDLE, LogUtil.isLogEnabled());
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.accessCache(LX_ONLINE_HANDLE, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d37acd8cc877b54964e7dfe9d221be2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d37acd8cc877b54964e7dfe9d221be2");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateOnlineHandleConfig(str);
                    }
                }
            });
            Horn.register(LX_ONLINE_HANDLE, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37c94a84f77739ab6d6051d30b2fab4f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37c94a84f77739ab6d6051d30b2fab4f");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    }
                }
            }, this.query);
            return;
        }
        Horn.accessCache(LX_ONLINE_HANDLE, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8af76edac8e6f6ca866de9389bc2109b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8af76edac8e6f6ca866de9389bc2109b");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    ConfigManager.this.updateOnlineHandleConfig(str);
                }
            }
        });
    }

    private void registerCommonHornConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762b0fe64d5c4d383e2bc26c8acee913", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762b0fe64d5c4d383e2bc26c8acee913");
            return;
        }
        Horn.debug(context, LX_SDK_CONFIG, LogUtil.isLogEnabled());
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.accessCache(LX_SDK_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9eb5e1d2f68a12c4a2fbbb22553d3d0b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9eb5e1d2f68a12c4a2fbbb22553d3d0b");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateCommonCacheConfig(str);
                    }
                }
            });
            Horn.register(LX_SDK_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e383d5ce5be2132f134aed7f7d12e90f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e383d5ce5be2132f134aed7f7d12e90f");
                        return;
                    }
                    LogUtil.log("main process ConfigManager registerCommonHornConfig register callback enable:" + z + " result:" + str);
                    if (!z || TextUtils.isEmpty(str)) {
                        return;
                    }
                    ConfigManager.this.updateCommonCacheConfig(str);
                    ConfigManager.this.handleOceanBlack();
                }
            }, this.query);
            return;
        }
        Horn.accessCache(LX_SDK_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.9
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "971c74e0c75ea907191e41ca6c6f330a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "971c74e0c75ea907191e41ca6c6f330a");
                    return;
                }
                LogUtil.log("subprocess ConfigManager registerCommonHornConfig accessCache callback enable:" + z + " result:" + str + " tm:" + System.currentTimeMillis());
                if (!z || TextUtils.isEmpty(str)) {
                    return;
                }
                ConfigManager.this.updateCommonCacheConfig(str);
                ConfigManager.this.handleOceanBlack();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOceanBlack() {
        Map<String, String> environment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ae93aa131b8653517943055e927a7de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ae93aa131b8653517943055e927a7de");
            return;
        }
        DefaultEnvironment defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment();
        if (defaultEnvironment == null || (environment = defaultEnvironment.getEnvironment()) == null) {
            return;
        }
        String str = environment.get(Constants.Environment.KEY_UNION_ID);
        if (TextUtils.isEmpty(str) || str.length() < 2) {
            return;
        }
        OceanBlackDownloadManager.getInstance().pullServiceBlackConfig(this.mContext, str.substring(str.length() - 2));
    }

    private void registerFlowReportStrategy(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9cb861529f70839a61fa2c48b53591", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9cb861529f70839a61fa2c48b53591");
            return;
        }
        Horn.debug(context, FLOW_REPORT_STRATEGY, LogUtil.isLogEnabled());
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.register(FLOW_REPORT_STRATEGY, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a25b225bca39d14e41bb1f63cebd89ac", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a25b225bca39d14e41bb1f63cebd89ac");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateFlowReportStrategy(context, str);
                    }
                }
            }, this.query);
        } else {
            Horn.accessCache(FLOW_REPORT_STRATEGY, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6eb2c084277827a67dae1795d5bdda43", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6eb2c084277827a67dae1795d5bdda43");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        ConfigManager.this.updateFlowReportStrategy(context, str);
                    }
                }
            });
        }
    }

    private void registerVallabConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ac7e235817ef1938d22ed82e2603df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ac7e235817ef1938d22ed82e2603df");
            return;
        }
        Horn.debug(context, FLOW_VALLAB_CONFIG, true);
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.register(FLOW_VALLAB_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c8f2b361b434c894f4d1c6007079180", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c8f2b361b434c894f4d1c6007079180");
                        return;
                    }
                    LogUtil.log("main process vallab config main process: enable:" + z + ", result:" + str);
                    if (!z || TextUtils.isEmpty(str)) {
                        return;
                    }
                    VallabConfig.getInstance(ConfigManager.this.mContext).updateVallabCacheConfig(str);
                }
            }, this.query);
        } else {
            Horn.accessCache(FLOW_VALLAB_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a80a9286ba50fdb3f5b6924c801801c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a80a9286ba50fdb3f5b6924c801801c");
                        return;
                    }
                    LogUtil.log("subprocess vallab config: enable:" + z + ", result:" + str);
                    if (!z || TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtil.log("vallab config file content:" + str);
                    VallabConfig.getInstance(ConfigManager.this.mContext).updateVallabCacheConfig(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMotionConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0757b1c0ef7d319b0923d0ea1cd3780", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0757b1c0ef7d319b0923d0ea1cd3780");
            return;
        }
        LogUtil.log("=========== updateMotionConfig ======= " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mConfigMap.put(KEY_MOTION_ENABLE, Boolean.valueOf(jSONObject.optBoolean(KEY_MOTION_ENABLE, false)));
            this.mConfigMap.put(KEY_MOTION_TIME_DELAY, Integer.valueOf(jSONObject.optInt(KEY_MOTION_TIME_DELAY, 30)));
            this.mConfigMap.put(KEY_MOTION_TIME_COLLECT, Integer.valueOf(jSONObject.optInt(KEY_MOTION_TIME_COLLECT, 60)));
            this.mConfigMap.put(KEY_MOTION_TIME_PAUSE, Integer.valueOf(jSONObject.optInt(KEY_MOTION_TIME_PAUSE, 120)));
            this.mConfigMap.put(KEY_MOTION_REPORT_ENABLE, Boolean.valueOf(jSONObject.optBoolean(KEY_MOTION_REPORT_ENABLE, false)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMotionInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77911bae493a54d19c94fda3f42ae961", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77911bae493a54d19c94fda3f42ae961");
        } else if (getInstance(this.mContext).isMotionEnable() && ProcessUtils.isMainProcess(Statistics.getContext()) && !DeviceUtil.isPrivacyMode(Statistics.getContext())) {
            SensorCollectManager.getInstance().init(getInstance(this.mContext).getMotionTimeDelay(), getInstance(this.mContext).getMotionTimeCollect(), getInstance(this.mContext).getMotionTimePause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateOnlineHandleConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eac4c8142112ea5b2f3d3934f38705a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eac4c8142112ea5b2f3d3934f38705a");
            return;
        }
        LogUtil.log("=========== updateOnlineHandleConfig ======= " + str);
        try {
            this.mConfigMap.put(KEY_DROP_EVENT_TABLE, Boolean.valueOf(new JSONObject(str).optBoolean(KEY_DROP_EVENT_TABLE, false)));
            handleOnlineConfig(this.mContext);
        } catch (Exception unused) {
        }
    }

    private void handleOnlineConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25c7eb6b372daa2cd3066908d678e7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25c7eb6b372daa2cd3066908d678e7f");
        } else if (context == null || !getInstance(context).isDropEventTable()) {
        } else {
            SQLiteDatabase writableDatabase = ((DBCacheHandler) CacheFactory.getDBCacheHandler(context)).getWritableDatabase();
            DBCacheHandler.getInstance(context).dropTable(writableDatabase);
            LogUtil.reportErrorImmediateSC("drop_table", "");
            DBCacheHandler.getInstance(context).createTable2(writableDatabase);
            LogUtil.reportErrorImmediateSC("create_table", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCommonCacheConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a129037d7d4b30f6684ee59cb399d23e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a129037d7d4b30f6684ee59cb399d23e");
            return;
        }
        LogUtil.log("=========== updateCommonCacheConfig: " + str + " process:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()) + " tm:" + System.currentTimeMillis() + ":pn" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""))) {
                this.mConfigMap.put(KEY_COMMON_CONFIG_VER, jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
            }
            StringBuilder sb = new StringBuilder("=========== updateCommonCacheConfig: ");
            sb.append(this.mConfigMap);
            LogUtil.log(sb.toString() == null ? StringUtil.NULL : "nt null");
            this.mConfigMap.put(KEY_HTTP_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_HTTP_SWITCH, false)));
            this.mConfigMap.put(KEY_WAIT_PV_TIMEOUT, Long.valueOf(jSONObject.optLong(KEY_WAIT_PV_TIMEOUT, MetricsAnrManager.ANR_THRESHOLD)));
            this.mConfigMap.put(KEY_EVENT_MATCH_MODE, Boolean.valueOf(jSONObject.optBoolean(KEY_EVENT_MATCH_MODE, false)));
            this.mConfigMap.put(KEY_GESTURE_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_GESTURE_SWITCH, false)));
            this.mConfigMap.put(KEY_INTERCEPT_REPORT, Boolean.valueOf(jSONObject.optBoolean(KEY_INTERCEPT_REPORT, false)));
            this.mConfigMap.put(KEY_DISABLE_DEBUG, Boolean.valueOf(jSONObject.optBoolean(KEY_DISABLE_DEBUG, false)));
            this.mConfigMap.put(KEY_SUPPORT_MULTI_PROCESS, Boolean.valueOf(jSONObject.optBoolean(KEY_SUPPORT_MULTI_PROCESS, true)));
            this.mConfigMap.put(KEY_DISABLE_LINK_TRACK_IN_APP, Boolean.valueOf(jSONObject.optBoolean(KEY_DISABLE_LINK_TRACK_IN_APP, false)));
            this.mConfigMap.put(KEY_VALLAB_MAX_LENGTH, Long.valueOf(jSONObject.optLong(KEY_VALLAB_MAX_LENGTH, 10000L)));
            this.mConfigMap.put(KEY_MODEL_EXPOSURE_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_MODEL_EXPOSURE_SWITCH, true)));
            this.mConfigMap.put(KEY_COLLECT_GESTURE_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_COLLECT_GESTURE_SWITCH, false)));
            this.mConfigMap.put(KEY_REPORT_GESTURE_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_REPORT_GESTURE_SWITCH, false)));
            this.mConfigMap.put(KEY_COLLECT_CUSTOM_GESTURE_SWITCH, jSONObject.optJSONArray(KEY_COLLECT_CUSTOM_GESTURE_SWITCH));
            this.mConfigMap.put(KEY_REPORT_CUSTOM_GESTURE_SWITCH, jSONObject.optJSONArray(KEY_REPORT_CUSTOM_GESTURE_SWITCH));
            this.mConfigMap.put(KEY_BID_HIGH_FLOW_LIMIT_TIME, Integer.valueOf(jSONObject.optInt(KEY_BID_HIGH_FLOW_LIMIT_TIME)));
            this.mConfigMap.put(KEY_BID_HIGH_FLOW_LIMIT_MAX, Integer.valueOf(jSONObject.optInt(KEY_BID_HIGH_FLOW_LIMIT_MAX)));
            this.mConfigMap.put("lx_dict", Boolean.valueOf(jSONObject.optBoolean("lx_dict", true)));
            this.mConfigMap.put(KEY_LX_ANDROID_DOWNLOAD_OCEAN_BLACK_459, Boolean.valueOf(jSONObject.optBoolean(KEY_LX_ANDROID_DOWNLOAD_OCEAN_BLACK_459, false)));
            this.mConfigMap.put(KEY_LOGAN_BLACK_CONFIG, jSONObject.optJSONArray(KEY_LOGAN_BLACK_CONFIG));
            this.mConfigMap.put(KEY_DISPATCH_BLUE_MV_TM_SWITCH, Boolean.valueOf(jSONObject.optBoolean(KEY_DISPATCH_BLUE_MV_TM_SWITCH, true)));
            this.mConfigMap.put(KEY_LX_ANDROID_IMMEDIATE_REPORT, jSONObject.optJSONObject(KEY_LX_ANDROID_IMMEDIATE_REPORT));
            CatMonitorManager.getInstance().reportHornConfigUpdate(LX_SDK_CONFIG, (String) this.mConfigMap.get(KEY_COMMON_CONFIG_VER));
            CatMonitorManager.getInstance().reportHornChildProcessStatus((String) this.mConfigMap.get(KEY_COMMON_CONFIG_VER), (Boolean) this.mConfigMap.get(KEY_SUPPORT_MULTI_PROCESS));
            if (isDebugModeDisabled()) {
                Statistics.setDebugMode(false);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFlowReportStrategy(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c175e149f51432f5d2942c607d29c87d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c175e149f51432f5d2942c607d29c87d");
            return;
        }
        LogUtil.log("=========== updateFlowReportStrategy: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""))) {
                this.mConfigMap.put(KEY_REPORT_STRATEGY_CONFIG_VER, jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
            }
            this.mConfigMap.put(KEY_LX_SDK_INTERCEPT_REPORT, Boolean.valueOf(jSONObject.optBoolean(KEY_LX_SDK_INTERCEPT_REPORT, false)));
            updateReportPollTime(uploadTimeInterval(), jSONObject.optDouble(KEY_UPLOAD_TIME_INTERVAL, 5.0d));
            this.mConfigMap.put(KEY_NUM_PER_REPORT, Integer.valueOf(jSONObject.optInt(KEY_NUM_PER_REPORT, 50)));
            this.mConfigMap.put(KEY_MAX_REPORT_NUM_BY_DAY, Integer.valueOf(jSONObject.optInt(KEY_MAX_REPORT_NUM_BY_DAY, 500000)));
            this.mConfigMap.put(KEY_ALLOW_CONTINUOUS_POLL_REPORT, Boolean.valueOf(jSONObject.optBoolean(KEY_ALLOW_CONTINUOUS_POLL_REPORT, true)));
            this.mConfigMap.put(KEY_ALLOW_RETRY_FAILED_TIMES, Integer.valueOf(jSONObject.optInt(KEY_ALLOW_RETRY_FAILED_TIMES, 50)));
            CatMonitorManager.getInstance().reportHornConfigUpdate(FLOW_REPORT_STRATEGY, (String) this.mConfigMap.get(KEY_REPORT_STRATEGY_CONFIG_VER));
            FlowManager.getInstance(context).onSDKConfigUpdated(jSONObject.optJSONArray(KEY_EVENT_SDK_FILTER));
        } catch (JSONException unused) {
        }
    }

    public void readConfigFromCache(String str, final ConfigCallback configCallback) {
        Object[] objArr = {str, configCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26cc2838e25b5332f55e5aba4d82180", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26cc2838e25b5332f55e5aba4d82180");
        } else if (TextUtils.isEmpty(str) || configCallback == null) {
        } else {
            Horn.debug(this.mContext, str, LogUtil.isLogEnabled());
            Horn.accessCache(str, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.14
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22030a88e759935b4a387ecdbe1c1b7a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22030a88e759935b4a387ecdbe1c1b7a");
                    } else if (configCallback != null) {
                        configCallback.onChanged(z, str2);
                    }
                }
            });
        }
    }

    public void readConfigFromNetwork(String str, final ConfigCallback configCallback) {
        Object[] objArr = {str, configCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b78bbd48a2a806841d1c3badfb3cb35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b78bbd48a2a806841d1c3badfb3cb35");
        } else if (TextUtils.isEmpty(str) || configCallback == null) {
        } else {
            Horn.debug(this.mContext, str, LogUtil.isLogEnabled());
            if (ProcessUtils.isMainProcess(Statistics.getContext())) {
                Horn.register(str, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.15
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public void onChanged(boolean z, String str2) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65e0bfeae06e54aac2e8a8ad74c0912d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65e0bfeae06e54aac2e8a8ad74c0912d");
                        } else if (configCallback != null) {
                            configCallback.onChanged(z, str2);
                        }
                    }
                }, this.query);
            } else {
                readConfigFromCache(str, configCallback);
            }
        }
    }

    public boolean isDownloadOceanBlack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80678b438696ff1314bff74c0d200831", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80678b438696ff1314bff74c0d200831")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() == 0) {
            return false;
        }
        Object obj = this.mConfigMap.get(KEY_LX_ANDROID_DOWNLOAD_OCEAN_BLACK_459);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return true;
    }

    public boolean isMotionEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6d444c9df7ca0a1eed24f8df70e4668", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6d444c9df7ca0a1eed24f8df70e4668")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_MOTION_ENABLE);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public int getMotionTimeDelay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c5bb7c5c82e1a798cf3e265f17b875", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c5bb7c5c82e1a798cf3e265f17b875")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0) {
            return 30;
        }
        Object obj = this.mConfigMap.get(KEY_MOTION_TIME_DELAY);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() > 0) {
                return num.intValue();
            }
            return 30;
        }
        return 30;
    }

    public int getMotionTimeCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "402cd5ec190d7f41eb2c9a799b1165bd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "402cd5ec190d7f41eb2c9a799b1165bd")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0) {
            return 60;
        }
        Object obj = this.mConfigMap.get(KEY_MOTION_TIME_COLLECT);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() > 0) {
                return num.intValue();
            }
            return 60;
        }
        return 60;
    }

    public int getMotionTimePause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17ddcd0078a9e1d1c2c0de6cc9bc003c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17ddcd0078a9e1d1c2c0de6cc9bc003c")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0) {
            return 120;
        }
        Object obj = this.mConfigMap.get(KEY_MOTION_TIME_PAUSE);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() > 0) {
                return num.intValue();
            }
            return 120;
        }
        return 120;
    }

    public boolean getMotionReportEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b5957d5b1863f8039cd9faa1ddade8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b5957d5b1863f8039cd9faa1ddade8")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_MOTION_REPORT_ENABLE);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public boolean isDropEventTable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3b4adb7f9fe687ef27cbe7fbea0c0a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3b4adb7f9fe687ef27cbe7fbea0c0a")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_DROP_EVENT_TABLE);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public boolean isHttpSwitchOn() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4662eb23e766e3ac739bb7b80fd6b25a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4662eb23e766e3ac739bb7b80fd6b25a")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_HTTP_SWITCH)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public long waitPvTimeout() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a28eae4d3f16462375b8a470f039d93", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a28eae4d3f16462375b8a470f039d93")).longValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_WAIT_PV_TIMEOUT)) == null || !(obj instanceof Long)) {
            return -1L;
        }
        return ((Long) obj).longValue();
    }

    public boolean isLazyMatchMode() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42b4cf7f252ff7ef89e3bdecc6ace554", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42b4cf7f252ff7ef89e3bdecc6ace554")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_EVENT_MATCH_MODE)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public boolean isCollectGestureOn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3797f14dbbbaea2eefc497f6fd80d43", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3797f14dbbbaea2eefc497f6fd80d43")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_COLLECT_GESTURE_SWITCH);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public boolean isReportGestureOn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e476ded08a4e1babd2e4db5323dc1ff0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e476ded08a4e1babd2e4db5323dc1ff0")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_REPORT_GESTURE_SWITCH);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public boolean isCollectKeyValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ebc8c753d1324a7aa9800048cebe56f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ebc8c753d1324a7aa9800048cebe56f")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_COLLECT_CUSTOM_GESTURE_SWITCH);
            if (obj instanceof JSONArray) {
                try {
                    List<Object> list = JsonUtil.toList((JSONArray) obj);
                    if (CollectionUtils.isEmpty(list)) {
                        return false;
                    }
                    if (list.contains(str)) {
                        return true;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean isReportKeyValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a9ba835135f206497b4636c60ab23d3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a9ba835135f206497b4636c60ab23d3")).booleanValue();
        }
        if (this.mConfigMap != null && this.mConfigMap.size() > 0) {
            Object obj = this.mConfigMap.get(KEY_REPORT_CUSTOM_GESTURE_SWITCH);
            if (obj instanceof JSONArray) {
                try {
                    List<Object> list = JsonUtil.toList((JSONArray) obj);
                    if (CollectionUtils.isEmpty(list)) {
                        return false;
                    }
                    if (list.contains(str)) {
                        return true;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean isDebugModeDisabled() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60003dcd3896303a5e5d2d655df05018", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60003dcd3896303a5e5d2d655df05018")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_DISABLE_DEBUG)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public boolean isModelExposureOn() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4368257d47af37c7dcacead00207d6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4368257d47af37c7dcacead00207d6")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_MODEL_EXPOSURE_SWITCH)) == null || !(obj instanceof Boolean)) {
            return true;
        }
        return ((Boolean) obj).booleanValue();
    }

    public boolean supportMultiProcess() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65634465ee58b17cea9a45a33c96d331", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65634465ee58b17cea9a45a33c96d331")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_SUPPORT_MULTI_PROCESS)) == null || !(obj instanceof Boolean)) {
            return true;
        }
        return ((Boolean) obj).booleanValue();
    }

    private void updateReportPollTime(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "975eb78bac472923cdee1ac7b3116a7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "975eb78bac472923cdee1ac7b3116a7d");
        } else if (d == d2 || this.mConfigMap == null) {
        } else {
            this.mConfigMap.put(KEY_UPLOAD_TIME_INTERVAL, Double.valueOf(d2));
            if (this.mChannelManager == null || this.mChannelManager.getReporter() == null) {
                return;
            }
            this.mChannelManager.getReporter().rescheduledReport();
        }
    }

    public long getVallabMaxLength() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f50580f8d612063339c2309fd5c9c48b", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f50580f8d612063339c2309fd5c9c48b")).longValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_VALLAB_MAX_LENGTH)) == null || !(obj instanceof Long)) {
            return 10000L;
        }
        return ((Long) obj).longValue();
    }

    public boolean isLinkTrackInAppDisabled() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84297825a26c25078e1ea10155685854", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84297825a26c25078e1ea10155685854")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_DISABLE_LINK_TRACK_IN_APP)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public boolean sdkInterceptReport() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "902d42b94649f41ebb7d1f6b3595f2ac", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "902d42b94649f41ebb7d1f6b3595f2ac")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_LX_SDK_INTERCEPT_REPORT)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public double uploadTimeInterval() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "741160683092022933ab50ad07f17986", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "741160683092022933ab50ad07f17986")).doubleValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_UPLOAD_TIME_INTERVAL)) == null || !(obj instanceof Double)) {
            return 5.0d;
        }
        return ((Double) obj).doubleValue();
    }

    public int eventNumPerReport() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2830d4d1d924c46b234bcf1cfd8a81", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2830d4d1d924c46b234bcf1cfd8a81")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_NUM_PER_REPORT)) == null || !(obj instanceof Integer)) {
            return 50;
        }
        return ((Integer) obj).intValue();
    }

    public int maxReportNumPerDay() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05fe5e02ca8b4f0536d5dea61a029865", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05fe5e02ca8b4f0536d5dea61a029865")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_MAX_REPORT_NUM_BY_DAY)) == null || !(obj instanceof Integer)) {
            return 500000;
        }
        return ((Integer) obj).intValue();
    }

    public boolean continuePollReportAllowed() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aedfeb62f8311b59e089d9c75779b531", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aedfeb62f8311b59e089d9c75779b531")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_ALLOW_CONTINUOUS_POLL_REPORT)) == null || !(obj instanceof Boolean)) {
            return true;
        }
        return ((Boolean) obj).booleanValue();
    }

    public int allowRetryFailedTimes() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67d99754c974a10dca32020e0198a3a4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67d99754c974a10dca32020e0198a3a4")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_ALLOW_RETRY_FAILED_TIMES)) == null || !(obj instanceof Integer)) {
            return 50;
        }
        return ((Integer) obj).intValue();
    }

    public boolean interceptReport() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8364cd0f0645f5755298ca409afcf43a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8364cd0f0645f5755298ca409afcf43a")).booleanValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.size() <= 0 || (obj = this.mConfigMap.get(KEY_INTERCEPT_REPORT)) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final JSONObject getStatInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a79dd0614e20619cc5178b3fa77a173", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a79dd0614e20619cc5178b3fa77a173");
        }
        if (this.mConfigMap != null) {
            if (this.mConfigMap.containsKey(KEY_COMMON_CONFIG_VER) || this.mConfigMap.containsKey(KEY_REPORT_STRATEGY_CONFIG_VER) || !TextUtils.isEmpty(FlowManager.getInstance(this.mContext).getFileMd5())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (this.mConfigMap.containsKey(KEY_COMMON_CONFIG_VER) && !TextUtils.isEmpty((String) this.mConfigMap.get(KEY_COMMON_CONFIG_VER))) {
                        jSONObject.put(KEY_COMMON_CONFIG_VER, this.mConfigMap.get(KEY_COMMON_CONFIG_VER));
                    }
                    if (this.mConfigMap.containsKey(KEY_REPORT_STRATEGY_CONFIG_VER) && !TextUtils.isEmpty((String) this.mConfigMap.get(KEY_REPORT_STRATEGY_CONFIG_VER))) {
                        jSONObject.put(KEY_REPORT_STRATEGY_CONFIG_VER, this.mConfigMap.get(KEY_REPORT_STRATEGY_CONFIG_VER));
                    }
                    if (!TextUtils.isEmpty(FlowManager.getInstance(this.mContext).getFileMd5())) {
                        jSONObject.put(KEY_REPORT_FLOW_CONTROL_CONFIG_VER, FlowManager.getInstance(this.mContext).getFileMd5());
                    }
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private void registerBlueConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3f5970b0d78e0d626f8d78f3268d779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3f5970b0d78e0d626f8d78f3268d779");
            return;
        }
        Horn.debug(context, BLUE_CACHE_CONFIG, LogUtil.isLogEnabled());
        if (ProcessUtils.isMainProcess(Statistics.getContext())) {
            Horn.accessCache(BLUE_CACHE_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d22525cce34bb09524b6fcf3e2ed456", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d22525cce34bb09524b6fcf3e2ed456");
                        return;
                    }
                    ConfigManager.this.updateBlueConfig(str);
                    LogUtil.log("Horn.accessCache(): " + str);
                }
            });
            Horn.register(BLUE_CACHE_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.17
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e99127f509a6dd574773f887123fa1b4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e99127f509a6dd574773f887123fa1b4");
                        return;
                    }
                    LogUtil.log("main process blue config main process: enable:" + z + ", result:" + str);
                    if (!z || TextUtils.isEmpty(str)) {
                        return;
                    }
                    LogUtil.log("blue config file content:" + str);
                    ConfigManager.this.updateBlueConfig(str);
                    LogUtil.log("Horn.register(): " + str);
                }
            }, this.query);
            return;
        }
        Horn.accessCache(BLUE_CACHE_CONFIG, new HornCallback() { // from class: com.meituan.android.common.statistics.config.ConfigManager.18
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b5c40032ad1ab48d3c04bd8ed2c7c8f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b5c40032ad1ab48d3c04bd8ed2c7c8f");
                    return;
                }
                LogUtil.log("subprocess blue config: enable:" + z + ", result:" + str);
                if (!z || TextUtils.isEmpty(str)) {
                    return;
                }
                LogUtil.log("blue config file content:" + str);
                ConfigManager.this.updateBlueConfig(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBlueConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da05d1e064129bc64ecf1d8eb15a14c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da05d1e064129bc64ecf1d8eb15a14c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mConfigMap.put(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
            this.mConfigMap.put(KEY_BLUE_CACHE_TIMEOUT_INTERVAL, Integer.valueOf(jSONObject.optInt(KEY_BLUE_CACHE_TIMEOUT_INTERVAL, 10000)));
            this.mConfigMap.put(KEY_BLUE_MAX_CACHE_COUNT, Integer.valueOf(jSONObject.optInt(KEY_BLUE_MAX_CACHE_COUNT, 200)));
        } catch (Exception e) {
            LogUtil.log("ConfigManager.updateBlueConfig()：" + e.getMessage());
        }
    }

    public int getHighFlowLimitTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ca83f480e1f7d910409f0ddd75f4ff3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ca83f480e1f7d910409f0ddd75f4ff3")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_TIME) == null || !(this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_TIME) instanceof Integer)) {
            return -1;
        }
        return ((Integer) this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_TIME)).intValue();
    }

    public int getHighFlowLimitMax() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4db7187ac8facc9e775e05809f921aa4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4db7187ac8facc9e775e05809f921aa4")).intValue();
        }
        if (this.mConfigMap == null || this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_MAX) == null || !(this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_MAX) instanceof Integer)) {
            return -1;
        }
        return ((Integer) this.mConfigMap.get(KEY_BID_HIGH_FLOW_LIMIT_MAX)).intValue();
    }

    public boolean isEncReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bda32e911d2e4645e7fd3e50443d039f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bda32e911d2e4645e7fd3e50443d039f")).booleanValue();
        }
        if (this.mConfigMap != null) {
            Object obj = this.mConfigMap.get("lx_dict");
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return true;
        }
        return true;
    }

    public boolean dispatchBlueMvTm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b632817a51a1b09d8c576134f1160899", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b632817a51a1b09d8c576134f1160899")).booleanValue();
        }
        if (this.mConfigMap != null) {
            Object obj = this.mConfigMap.get(KEY_DISPATCH_BLUE_MV_TM_SWITCH);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return true;
        }
        return true;
    }

    public int getBlueCacheTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2d2502cbd5836a5c868ca366da59d1f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2d2502cbd5836a5c868ca366da59d1f")).intValue();
        }
        try {
            Object obj = this.mConfigMap.get(KEY_BLUE_CACHE_TIMEOUT_INTERVAL);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                if (intValue < 0) {
                    return 0;
                }
                return intValue > 50000 ? RequestIDMap.OP_TYPE_GESTURE.OP_TYPE_SAVE_GESTURE : intValue;
            }
            return 10000;
        } catch (Exception e) {
            LogUtil.log("ConfigManager.getBlueCacheTimeout()：" + e.getMessage());
            return 10000;
        }
    }

    public int getBlueCacheCountLimit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d70f10712478ebf4e09b7457e086545f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d70f10712478ebf4e09b7457e086545f")).intValue();
        }
        try {
            Object obj = this.mConfigMap.get(KEY_BLUE_MAX_CACHE_COUNT);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                if (intValue < 0) {
                    return 0;
                }
                if (intValue > 500) {
                    return 500;
                }
                return intValue;
            }
            return 200;
        } catch (Exception e) {
            LogUtil.log("ConfigManager.getBlueCacheCountLimit()：" + e.getMessage());
            return 200;
        }
    }

    public boolean isLoganBlack(String str, String str2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de5b2384fe44a80bcfe7b496fe8c3f92", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de5b2384fe44a80bcfe7b496fe8c3f92")).booleanValue();
        }
        if ((this.mConfigMap.get(KEY_LOGAN_BLACK_CONFIG) instanceof JSONArray) && (jSONArray = (JSONArray) this.mConfigMap.get(KEY_LOGAN_BLACK_CONFIG)) != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if ((jSONArray.get(i) instanceof JSONArray) && (jSONArray2 = (JSONArray) jSONArray.get(i)) != null && jSONArray2.length() >= 2 && jSONArray2.get(0).equals(str)) {
                        if ((Constants.PREFIX + jSONArray2.get(1)).equals(str2)) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    public boolean isImmediateReport(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d8809a6ebea9a21460355aedee0ea01", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d8809a6ebea9a21460355aedee0ea01")).booleanValue();
        }
        if (this.mConfigMap == null) {
            return false;
        }
        Object obj = this.mConfigMap.get(KEY_LX_ANDROID_IMMEDIATE_REPORT);
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has(str)) {
                if (EventName.isPageEvent(str)) {
                    JSONArray optJSONArray = jSONObject.optJSONArray(str);
                    if (!TextUtils.isEmpty(str2) && optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            if (str2.equals(optJSONArray.get(i))) {
                                return true;
                            }
                        }
                    }
                } else if (EventName.isModuleEvent(str) || EventName.isSystemEvent(str)) {
                    return isModuleEventImmediateReport(jSONObject, str, str2, str3);
                }
            }
        }
        return false;
    }

    private boolean isModuleEventImmediateReport(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccbbd43dbb77567b292654ae030ed0fe", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccbbd43dbb77567b292654ae030ed0fe")).booleanValue();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return !TextUtils.isEmpty(str3) && optJSONObject != null && optJSONObject.length() > 0 && optJSONObject.has(str3) && ((optJSONArray = optJSONObject.optJSONArray(str3)) == null || optJSONArray.length() <= 0 || JsonUtil.toList(optJSONArray).contains(str2));
    }
}
