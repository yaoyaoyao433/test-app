package com.meituan.android.common.aidata.ai.bundle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum AiDownloadEnv {
    ONLINE,
    DEBUG;
    
    public static final String AI_BUNDLE_DIR = "js";
    public static final String AI_DEBUG_BUNDLE_DIR = "debug_js";
    public static final String AI_JS_FRAMEWORK_CONFIG_NAME = "config.json";
    public static final String AI_JS_FRAMEWORK_DIR = "js_framework";
    public static final String AI_JS_FRAMEWORK_FILE_NAME = "env.js";
    public static final String AI_JS_FRAMEWORK_PRESET_VERSION = "0.0.0";
    public static final String AI_ROOT_DIR = "aidata_ai";
    public static final String BUNDLE_FOLDER_NAME_SEPARATOR = "@";
    public static final String ENV_DEBUG = "debug";
    public static final String ENV_ONLINE = "online";
    public static final String FILE_NAME_AUTO_RUN_STRATEGY = "strategy.json";
    public static final String FILE_NAME_DATA_CVS = "data.cvs";
    public static final String FILE_NAME_ENV_JSON = "env.json";
    public static final String FILE_NAME_JS = "main.js";
    public static final String FILE_NAME_JS_CONFIG = "jsconfig.json";
    public static final String FILE_NAME_MODEL = "model";
    public static final String FILE_NAME_MODEL_AUTO_PREDICT = "auto_predict.js";
    public static final String FILE_NAME_MODEL_CONFIG = "modelconfig.json";
    public static final String FILE_NAME_MODEL_FEATURE_CONFIG = "feature.json";
    public static final String FILE_NAME_MODEL_POST_PROCESS = "post_processing.js";
    public static final String FILE_NAME_MODEL_TENSOR_CONFIG = "tensor.json";
    public static ChangeQuickRedirect changeQuickRedirect;

    AiDownloadEnv() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2608106d7bf7272b305a0e682f7ce6b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2608106d7bf7272b305a0e682f7ce6b6");
        }
    }

    public static AiDownloadEnv valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e00823893e5cfb92f91065781944d7a1", RobustBitConfig.DEFAULT_VALUE) ? (AiDownloadEnv) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e00823893e5cfb92f91065781944d7a1") : (AiDownloadEnv) Enum.valueOf(AiDownloadEnv.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AiDownloadEnv[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f73664e291cf9a556d59d0f716ec8a2", RobustBitConfig.DEFAULT_VALUE) ? (AiDownloadEnv[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f73664e291cf9a556d59d0f716ec8a2") : (AiDownloadEnv[]) values().clone();
    }
}
