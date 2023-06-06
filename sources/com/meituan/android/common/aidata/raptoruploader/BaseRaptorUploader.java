package com.meituan.android.common.aidata.raptoruploader;

import com.dianping.monitor.impl.m;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseRaptorUploader {
    private static final String AIDATA_VER = "aidata_ver";
    private static final String APP = "app";
    private static final int APP_RAPTOR = 415;
    private static final String APP_VERSION = "app_version";
    public static final String BIZ = "biz";
    public static final String DEVICE_LEVEL = "deviceLevel";
    public static final String ERROR_ALREADY_LOADED = "-101";
    public static final String ERROR_CODE = "errorCode";
    public static final String ERROR_DATA_FORMATE_WRONG = "-140002";
    public static final String ERROR_DEBUG_RELOAD_INTERUPT = "-300";
    public static final String ERROR_DEGRADE_REASONING_SERVICE = "-170000";
    public static final String ERROR_DY_LOAD_JS_FAILED = "-150002";
    public static final String ERROR_EMPTY_BUNDLE_RES = "-150004";
    public static final String ERROR_EMPTY_FEATURE_RES = "-130000";
    public static final String ERROR_ENPTY_TENSOR_OUTPUT = "-180009";
    public static final String ERROR_EXECUTE_BIZ_FAILED = "-202";
    public static final String ERROR_EXECUTE_COMMON_FAILED = "-201";
    public static final String ERROR_EXECUTE_INSTANCE_DESTROY = "-204";
    public static final String ERROR_EXECUTE_SCRIPT_TIMEOUT = "-203";
    public static final String ERROR_FAILED_AUTO_RUN_JS = "-20001";
    public static final String ERROR_FAILED_CREATE_ENGINE = "-180011";
    public static final String ERROR_FAILED_CREATE_PREDICTOR = "-180010";
    public static final String ERROR_FAILED_MODEL_POST_PROCESS_EXECUTE = "-190002";
    public static final String ERROR_FAILED_MODEL_POST_PROCESS_RESOURCE = "-190001";
    public static final String ERROR_FAILED_PARSE_ARGS_GET_FEATURE = "-200021";
    public static final String ERROR_FAILED_PARSE_ARGS_PREDICT = "-200022";
    public static final String ERROR_ILLEGAL_OPERATOR_NAME = "-160001";
    public static final String ERROR_ILLEGAL_PARAMS = "-160004";
    public static final String ERROR_ILLEGAL_PRODUCE_PARAMS = "-150003";
    public static final String ERROR_INIT_FAILED = "-150006";
    public static final String ERROR_INVALID_BUNDLE_RES = "-150005";
    public static final String ERROR_INVALID_FEATURE_CONFIG = "-180002";
    public static final String ERROR_INVALID_OPERATOR_RESULT = "-180003";
    public static final String ERROR_INVALID_SOURCE_CODE = "-100";
    public static final String ERROR_INVALID_TENSOR_INPUT = "-180006";
    public static final String ERROR_INVALID_TENSOR_OUTPUT = "-180008";
    public static final String ERROR_INVALID_TENSOR_RESHAPE = "-180005";
    public static final String ERROR_INVALID_TENSOR_RESULT = "-180007";
    public static final String ERROR_JS_MODEL_LOAD_FAILED = "-170003";
    public static final String ERROR_LOAD_FAILED = "-102";
    public static final String ERROR_LOAD_INSTANCE_DESTROY = "-103";
    public static final String ERROR_MODEL_PREDICT_FAILED = "-170002";
    public static final String ERROR_NOT_FIND_DYNAMIC_OPERATOR = "-160003";
    public static final String ERROR_NOT_FIND_OPERATOR = "-160002";
    public static final int ERROR_NOT_INIT = 403;
    public static final String ERROR_NOT_SUPPORT_INTERPRETER = "-170001";
    public static final String ERROR_OPERATOR_TIMEOUT = "-180004";
    public static final String ERROR_PRODUCER_NOT_FIND = "-140001";
    public static final int ERROR_SERVICE_DEGRADE = -140000;
    public static final String ERROR_UNKNOWN = "-1";
    public static final String ERROR_UNLOAD_FRAMEWORK = "-104";
    public static final String ERROR_UNLOAD_SCRIPT = "-200";
    public static final String ERROR_UNSUPPORT_MODEL_TYPE = "-180001";
    public static final String ERROR_UNZIP_FAILED = "-150001";
    public static final String FAIL_DETAIL = "fail_detail";
    public static final String FEATURE = "feature";
    public static final String FRAMEWORK_VERSION = "framework_version";
    public static final String INPUT_DATA = "input_data";
    public static final String IN_VALID_VERSION = "-999";
    public static final int MAX_SAMPLE_RATE = 100;
    private static final String MODEL = "model";
    public static final String MODEL_NAME = "model_name";
    public static final String OUTPUT_DATA = "output_data";
    public static final String PATH = "path";
    private static final String PLATFORM = "platform";
    public static final String RAPTOR_ENV = "env";
    public static final float RATE_NOT_SUCCESS = 0.0f;
    public static final float RATE_SUCCESS = 1.0f;
    public static final String REAL_TIME_VALUE = "-999";
    public static final String STATUS = "status";
    public static final String STATUS_CANCEL = "cancel";
    public static final String STATUS_FAIL = "fail";
    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_TIME_OUT = "timeout";
    public static final String SUCCESS_CODE = "0";
    private static final String SYS_VERSION = "sysVersion";
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSONObject extraJson;
    public m mMetricMonitorService;

    public BaseRaptorUploader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f668938ade2515e7a4a5590d4b9e459e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f668938ade2515e7a4a5590d4b9e459e");
        } else {
            this.mMetricMonitorService = new m(415, AIData.getContext(), NVLinker.getUnionID());
        }
    }

    private void addBaseTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "205213fa203f071dc35adf5bb062a1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "205213fa203f071dc35adf5bb062a1f9");
            return;
        }
        m mVar = this.mMetricMonitorService;
        StringBuilder sb = new StringBuilder();
        sb.append(NVLinker.getAppID());
        mVar.a("app", sb.toString());
        this.mMetricMonitorService.a(AIDATA_VER, "0.0.9.77");
        this.mMetricMonitorService.a("model", AppUtil.getSystemModel());
        this.mMetricMonitorService.a("platform", "1");
        this.mMetricMonitorService.a(SYS_VERSION, AppUtil.getSystemVersion());
        this.mMetricMonitorService.a("app_version", AppUtil.getVersionName(AIData.getContext()));
        this.mMetricMonitorService.a("env", AppUtil.getEnv());
        this.mMetricMonitorService.a("deviceLevel", AppUtil.getDeviceLevel());
    }

    public BaseRaptorUploader addValues(String str, Number number) {
        Object[] objArr = {str, number};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "319a80c2fe7f4fe4e7709a32280650c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "319a80c2fe7f4fe4e7709a32280650c5");
        }
        if (number == null) {
            return this;
        }
        this.mMetricMonitorService.a(str, Collections.singletonList(Float.valueOf(number.floatValue())));
        return this;
    }

    public BaseRaptorUploader addTags(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b22bfa08741a7f95206dd6928fd07609", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b22bfa08741a7f95206dd6928fd07609");
        }
        this.mMetricMonitorService.a(str, str2);
        return this;
    }

    public BaseRaptorUploader addTags(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e20944c4f73815ad209e35049a664eb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e20944c4f73815ad209e35049a664eb2");
        }
        m mVar = this.mMetricMonitorService;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        mVar.a(str, sb.toString());
        return this;
    }

    public BaseRaptorUploader addExtra(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be5ebe4c69c4116c8cad77e2c2bd262", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be5ebe4c69c4116c8cad77e2c2bd262");
        }
        if (this.extraJson == null) {
            this.extraJson = new JSONObject();
        }
        try {
            this.extraJson.put(str, str2);
        } catch (JSONException e) {
            if (LogUtil.isLogEnabled()) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public BaseRaptorUploader addExtra(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "439103a43627455207e60022f36d3f95", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "439103a43627455207e60022f36d3f95");
        }
        if (this.extraJson == null) {
            this.extraJson = new JSONObject();
        }
        try {
            this.extraJson.put(str, jSONObject);
        } catch (JSONException e) {
            if (LogUtil.isLogEnabled()) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public BaseRaptorUploader addExtraJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96cbf975e64626ef4d888ba1dde6d2b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96cbf975e64626ef4d888ba1dde6d2b9");
        }
        if (jSONObject != null) {
            this.mMetricMonitorService.a(jSONObject.toString());
        }
        return this;
    }

    public BaseRaptorUploader addExtraMap(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd3081b3fbaedaecb5c44015417c7170", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseRaptorUploader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd3081b3fbaedaecb5c44015417c7170");
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(map);
        } catch (Exception e) {
            if (LogUtil.isLogEnabled()) {
                e.printStackTrace();
            }
        }
        if (jSONObject != null) {
            this.mMetricMonitorService.a(jSONObject.toString());
        }
        return this;
    }

    public void send(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16de44f17207258f420dd82b9b4885e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16de44f17207258f420dd82b9b4885e1");
            return;
        }
        if (this.extraJson != null) {
            this.mMetricMonitorService.a(this.extraJson.toString());
        }
        addBaseTags();
        uploadWithSampleRate(i);
    }

    public void send() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4ec5f0152841a03e4c185d26305201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4ec5f0152841a03e4c185d26305201");
        } else {
            send(100);
        }
    }

    private void uploadWithSampleRate(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e0105161a3fe10d62b14b8a0af1eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e0105161a3fe10d62b14b8a0af1eb7");
        } else if (i == 100) {
            this.mMetricMonitorService.a();
        } else if (i >= new Random().nextInt(100)) {
            this.mMetricMonitorService.a();
        }
    }
}
