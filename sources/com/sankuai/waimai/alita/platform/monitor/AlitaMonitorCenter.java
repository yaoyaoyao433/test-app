package com.sankuai.waimai.alita.platform.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor;
import com.sankuai.waimai.alita.platform.monitor.impl.b;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaMonitorCenter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IRuntimeMonitor mMonitor;
    private static volatile AlitaMonitorCenter sCenter;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AlitaMonitorConst {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static abstract class BaseAvailability {
            public static final int MONITOR_VALUE_FAILED = 0;
            public static final int MONITOR_VALUE_SUCCESS = 1;
            public static final String TAG_KEY_BIZ = "biz";
            public static final String TAG_KEY_ERROR_CODE = "error_code";
            public static final String TAG_KEY_TAG = "tag";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static abstract class BaseBundleAvailability extends BaseAvailability {
            public static final String TAG_KEY_BUNDLE_ID = "bundle_id";
            public static final String TAG_KEY_BUNDLE_VERSION = "bundle_version";
            public static final String TAG_VALUE_BUNDLE_VERSION_UNKNOWN = "unknown";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class BizConfig extends BaseAvailability {
            public static final String MONITOR_KEY = "AlitaBizFeedSuccess";
            public static final String TAG_VALUE_ERROR_CODE_FAILED = "1";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS = "0";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class BundleAlitaMigrate extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaBundleMigrateSuccess";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_MIG = "3";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS_MIG = "2";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS_NO_CHILD = "1";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS_NO_ROOT_FOLDER = "0";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class BundleDownload extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaDownloadSuccess";
            public static final String TAG_VALUE_ERROR_CODE_FAILED = "1";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS = "0";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class BundleLoad extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaLoadSuccess";
            public static final String TAG_KEY_RESOURCE_TYPE = "resource_type";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_CHECK_ERROR = "3";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_DOWNLOADING = "1";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_DOWNLOAD_ERROR = "2";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS = "0";
            public static final String TAG_VALUE_RESOURCE_TYPE_JS = "js";
            public static final String TAG_VALUE_RESOURCE_TYPE_MODEL = "model";
            public static final String TAG_VALUE_RESOURCE_TYPE_UNKNOWN = "unknown";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class CommonEnv {
            public static final String TAG_KEY_APP_VERSION = "app_version";
            public static final String TAG_KEY_DPID = "dpid";
            public static final String TAG_KEY_ENV = "env";
            public static final String TAG_KEY_PLATFORM = "platform";
            public static final String TAG_KEY_SYS_VERSION = "sys_version";
            public static final String TAG_KEY_UUID = "uuid";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class CostTimeMonitorKey {
            public static final String MONITOR_KEY_GET_FEATURE = "AlitaGetFeatureTime";
            public static final String MONITOR_KEY_JS_CALCULATE = "AlitaJSCalculateTime";
            public static final String MONITOR_KEY_MODEL_INTERPRET = "AlitaInterpretTime";
            public static final String MONITOR_KEY_MODEL_POST_PROCESS = "AlitaPostProcessTime";
            public static final String MONITOR_KEY_MODEL_PREDICT = "AlitaPredictTime";
            public static final String MONITOR_KEY_MODEL_PROCESS_FEATURE = "AlitaProcessFeatureTime";
            public static final String MONITOR_KEY_SQL_COMPATIBLE = "AlitaReadSqlCompatibleTime";
            public static final String MONITOR_KEY_SQL_QUERY = "AlitaSQLQueryTime";
            public static final String MONITOR_TAG_SQL_QUERY_IS_COMPATIBLE = "isCompatible";
            public static final String MONITOR_TAG_VALUE_SQL_QUERY_FALSE = "false";
            public static final String MONITOR_TAG_VALUE_SQL_QUERY_TRUE = "true";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class Intention extends BaseBundleAvailability {
            public static final String READ = "AlitaIntentionRead";
            public static final String REGISTER = "AlitaIntentionRegister";
            public static final String SCENE_KEY_OBSERVE = "AlitaIntentionSceneKeyObserve";
            public static final String TAG_KEY_NAME = "name";
            public static final String TAG_KEY_SOURCE = "source";
            public static final String TAG_KEY_TYPE = "type";
            public static final String TAG_KEY_VERSION = "intention_version";
            public static final String UPDATE = "AlitaIntentionUpdate";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class JSCalculate extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaJSSuccess";
            public static final String TAG_KEY_JS_TYPE = "js_type";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_BIZ = "3";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_CALCULATE = "1";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_LOAD = "2";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS = "0";
            public static final String TAG_VALUE_JS_TYPE_ALGORITHM = "1";
            public static final String TAG_VALUE_JS_TYPE_FEATURE = "2";
            public static final String TAG_VALUE_JS_TYPE_OPERATOR = "3";
            public static final String TAG_VALUE_JS_TYPE_UNKNOWN = "0";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class ModelPredict extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaModelInterpretSuccess";
            public static final String TAG_KEY_INTERPRETER_TYPE = "interpreter_type";
            public static final String TAG_KEY_MODEL_TYPE = "model_type";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_FEATURE = "1";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_MODEL = "3";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_PREDICT = "2";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_PREDICTOR_INVALID = "5";
            public static final String TAG_VALUE_ERROR_CODE_FAILED_SWITCH_CLOSED = "4";
            public static final String TAG_VALUE_ERROR_CODE_SUCCESS = "0";
            public static final String TAG_VALUE_INTERPRETER_TYPE_MNN = "mnn";
            public static final String TAG_VALUE_INTERPRETER_TYPE_UNKNOWN = "unknown";
            public static final String TAG_VALUE_MODEL_TYPE_UNKNOWN = "unknown";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class ReadSqlCompatible extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaReadSqlCompatibleSuccess";
            public static final String TAG_KEY_SQL_NAME = "sql_name";
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class WriteSqlCompatible extends BaseBundleAvailability {
            public static final String MONITOR_KEY = "AlitaWriteSqlCompatibleSuccess";
            public static final String TAG_KEY_EVENT_BID = "bid";
            public static final String TAG_KEY_EVENT_CATEGORY = "category";
            public static final String TAG_KEY_EVENT_CID = "cid";
            public static final String TAG_KEY_EVENT_NAME = "event_name";
            public static ChangeQuickRedirect changeQuickRedirect;
        }
    }

    public static AlitaMonitorCenter getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08944a11fb3bae886c68360e6cdb967b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaMonitorCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08944a11fb3bae886c68360e6cdb967b");
        }
        if (sCenter == null) {
            synchronized (AlitaMonitorCenter.class) {
                if (sCenter == null) {
                    sCenter = new AlitaMonitorCenter();
                    mMonitor = new com.sankuai.waimai.alita.platform.monitor.impl.a();
                }
            }
        }
        return sCenter;
    }

    public IRuntimeMonitor getMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4838ba9754981afcabac7996972ba9f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (IRuntimeMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4838ba9754981afcabac7996972ba9f9");
        }
        if (mMonitor == null) {
            return new b();
        }
        return mMonitor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AlitaExceptionMonitorConst {
        public static final String BUSINESS = "alita";
        public static ChangeQuickRedirect changeQuickRedirect;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class Preprocess {
            public static final String MODULE = "preprocess";
            public static final String TYPE_FEATURE_NOT_FOUND = "featureNotFound";
            public static final String TYPE_OPERATOR_NOT_FOUND = "operatorNotFound";
            public static ChangeQuickRedirect changeQuickRedirect;

            public static String makeDescription(String str, String str2, String str3) {
                Object[] objArr = {str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a34170350812c8ff0ad0db8db6b08fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a34170350812c8ff0ad0db8db6b08fc") : String.format("%s_%s_%s", str, str2, str3);
            }
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class LoadPredictor {
            public static final String MODULE = "loadPredictor";
            public static final String TYPE_LOAD_PREDICTOR_DOWNLOAD_FAILED = "downloadFailed";
            public static final String TYPE_LOAD_PREDICTOR_LOAD_LIBRARY_FAILED = "loadLibraryFailed";
            public static final String TYPE_LOAD_PREDICTOR_TOGGLE_DOWNLOAD_FAILED = "toggleDownloadFailed";
            public static ChangeQuickRedirect changeQuickRedirect;

            public static String makeDescription(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6694ec6f535c3460cca055511b331934", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6694ec6f535c3460cca055511b331934") : String.format("%s", str);
            }
        }
    }
}
