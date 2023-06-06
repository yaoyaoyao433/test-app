package com.meituan.android.common.aidata.jsengine.utils;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.error.ErrorCode;
import com.meituan.android.common.aidata.jsengine.AutoJSServiceManager;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.instance.JSInstance;
import com.meituan.android.common.aidata.jsengine.modules.autopredict.PredictMethod;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSExecuteUtil {
    public static final int JS_ERROR_AI_BUNDLE_IS_NULL = 0;
    public static final int JS_ERROR_EXECUTE_FAIL = 4;
    public static final int JS_ERROR_EXECUTE_RESULT_IS_NULL = 5;
    public static final int JS_ERROR_JS_INSTANCE_IS_NULL = 1;
    public static final int JS_ERROR_LOAD_FAIL = 3;
    public static final int JS_ERROR_LOAD_SUCCESS_JS_INSTANCE_IS_NULL = 2;
    public static final String KEY_JS_OPTIONS_CATCH_ERROR_MODE = "catchErrorMode";
    public static final String KEY_JS_OPTIONS_EXECUTE_MODE = "executeMode";
    public static final int SCRIPT_AUTO_PREDICT = 6;
    public static final int SCRIPT_AUTO_RUN = 5;
    public static final int SCRIPT_FEATURE = 1;
    public static final int SCRIPT_MODEL = 3;
    public static final int SCRIPT_MODEL_POST_PROCESS = 4;
    public static final int SCRIPT_OPERATOR = 2;
    public static final int SCRIPT_UNKNOWN = -1;
    public static final String VALUE_JS_OPTIONS_CATCH_ERROR_MODE_RETURN_ERROR_ONLY = "returnErrorOnly";
    public static final String VALUE_JS_OPTIONS_CATCH_ERROR_MODE_RETURN_RESULT_POSSIBLY = "returnResultPossibly";
    public static final String VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH = "batch";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface JSExecuteType {
    }

    private static int getFeatureErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1acfc2e6caadc1108c0a76d6e4ad276c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1acfc2e6caadc1108c0a76d6e4ad276c")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_FEATURE;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_FEATURE;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_FEATURE;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_FEATURE;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_FEATURE;
            default:
                return -1;
        }
    }

    private static int getJSAutoPredictErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e88c6e780719f7181728055a4ab2188b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e88c6e780719f7181728055a4ab2188b")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_JS_AUTO_PREDICT;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_JS_AUTO_PREDICT;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_JS_AUTO_PREDICT;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_JS_AUTO_PREDICT;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_JS_AUTO_PREDICT;
            default:
                return -1;
        }
    }

    private static int getJSAutoRunErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98576199a005ebf5a743331824d139cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98576199a005ebf5a743331824d139cb")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_JS_AUTO_RUN;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_JS_AUTO_RUN;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_JS_AUTO_RUN;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_JS_AUTO_RUN;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_JS_AUTO_RUN;
            default:
                return -1;
        }
    }

    private static int getModelErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64c7fec697bb6bf586e3d537fbdcfa68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64c7fec697bb6bf586e3d537fbdcfa68")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_MODEL;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_MODEL;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_MODEL;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_MODEL;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_MODEL;
            default:
                return -1;
        }
    }

    private static int getModelPostProcessErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "200bf14de0bcbd9d5cb4d8d85d210405", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "200bf14de0bcbd9d5cb4d8d85d210405")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_MODEL_POST_PROCESS;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_MODEL_POST_PROCESS;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_MODEL_POST_PROCESS;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_MODEL_POST_PROCESS;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_MODEL_POST_PROCESS;
            default:
                return -1;
        }
    }

    private static int getOperatorErrorCode(int i, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd6a19de61f8442327ed45e08561d597", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd6a19de61f8442327ed45e08561d597")).intValue();
        }
        switch (i) {
            case 0:
                return ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
            case 1:
                return ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_OPERATOR;
            case 2:
                return ErrorCode.JSExecute.LOAD_SUCCESS_JS_INSTANCE_IS_NULL_OPERATOR;
            case 3:
                return ErrorCode.JSExecute.LOAD_FAIL_OPERATOR;
            case 4:
                return ErrorCode.JSExecute.EXECUTE_FAIL_OPERATOR;
            default:
                return -1;
        }
    }

    public static void execute(int i, String str, AiBundle aiBundle, JSONArray jSONArray, JSCallback jSCallback) {
        Object[] objArr = {Integer.valueOf(i), str, aiBundle, jSONArray, jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "219a239f91dd8953ee9467950fc8677e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "219a239f91dd8953ee9467950fc8677e");
        } else {
            execute(i, str, aiBundle, jSONArray, (JSONObject) null, jSCallback);
        }
    }

    public static void execute(int i, String str, AiBundle aiBundle, JSONArray jSONArray, JSONObject jSONObject, JSCallback jSCallback) {
        Object[] objArr = {Integer.valueOf(i), str, aiBundle, jSONArray, jSONObject, jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "295bda676a3b0d370f137a91721b9b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "295bda676a3b0d370f137a91721b9b85");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aiBundle == null) {
            BlueException jSException = getJSException(i, str, 0, null);
            int batchNum = getBatchNum(jSONArray, jSONObject);
            jSCallback.onFailed("", jSException, batchNum, elapsedRealtime);
            sendFail(str, i, jSONArray, batchNum, "", jSException);
            return;
        }
        execute(i, str, aiBundle.getJSInstance(), aiBundle.getJsContent(), jSONArray, jSONObject, elapsedRealtime, jSCallback);
    }

    public static void execute(int i, String str, JSInstance jSInstance, String str2, JSONArray jSONArray, JSCallback jSCallback) {
        Object[] objArr = {Integer.valueOf(i), str, jSInstance, str2, jSONArray, jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77037e3fd7472c1887b5cec9a9bea3b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77037e3fd7472c1887b5cec9a9bea3b6");
        } else {
            execute(i, str, jSInstance, str2, jSONArray, null, SystemClock.elapsedRealtime(), jSCallback);
        }
    }

    public static void execute(final int i, final String str, final JSInstance jSInstance, final String str2, final JSONArray jSONArray, final JSONObject jSONObject, final long j, final JSCallback jSCallback) {
        Object[] objArr = {Integer.valueOf(i), str, jSInstance, str2, jSONArray, jSONObject, new Long(j), jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "256f3ed93b276fc580945a99ca8a651f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "256f3ed93b276fc580945a99ca8a651f");
        } else if (jSInstance == null) {
            BlueException jSException = getJSException(i, str, 1, null);
            int batchNum = getBatchNum(jSONArray, jSONObject);
            if (jSCallback != null) {
                jSCallback.onFailed("", jSException, batchNum, j);
            }
            sendFail(str, i, jSONArray, batchNum, "", jSException);
        } else {
            new StringBuilder("js loadScript : ").append(str);
            final IJSCallback iJSCallback = new IJSCallback() { // from class: com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                public final void onSuccess(String str3, @Nullable String str4, @Nullable JSValueWrapper jSValueWrapper) {
                    Object[] objArr2 = {str3, str4, jSValueWrapper};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d4fbd93b75a69ffa0324f21aa35a82e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d4fbd93b75a69ffa0324f21aa35a82e3");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("js loadScript success : ");
                    sb.append(str);
                    sb.append(", frameworkId = ");
                    sb.append(str3);
                    sb.append(", instanceId = ");
                    sb.append(str4);
                    if (TextUtils.isEmpty(str4)) {
                        BlueException jSException2 = JSExecuteUtil.getJSException(i, str, 2, null);
                        int batchNum2 = JSExecuteUtil.getBatchNum(jSONArray, jSONObject);
                        if (jSCallback != null) {
                            jSCallback.onFailed(str3, jSException2, batchNum2, j);
                        }
                        JSExecuteUtil.sendFail(str, i, jSONArray, batchNum2, str3, jSException2);
                        return;
                    }
                    final IJSCallback iJSCallback2 = new IJSCallback() { // from class: com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onSuccess(String str5, @Nullable String str6, @Nullable JSValueWrapper jSValueWrapper2) {
                            Object[] objArr3 = {str5, str6, jSValueWrapper2};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b4b65395aca3655c1b2ce9ad7f3f3ff8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b4b65395aca3655c1b2ce9ad7f3f3ff8");
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("js execute success : ");
                            sb2.append(str);
                            sb2.append(", frameworkId = ");
                            sb2.append(str5);
                            sb2.append(", instanceId = ");
                            sb2.append(jSInstance.getInstanceId());
                            sb2.append(", result = ");
                            sb2.append(jSValueWrapper2 != null ? jSValueWrapper2.stringValue() : StringUtil.NULL);
                            int batchNum3 = JSExecuteUtil.getBatchNum(jSONArray, jSONObject);
                            if (jSCallback != null) {
                                jSCallback.onSuccess(str5, jSValueWrapper2, batchNum3, j);
                            }
                            JSExecuteUtil.sendSuccess(str, i, jSONArray, str5, jSValueWrapper2, j, batchNum3);
                        }

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onFailed(String str5, @Nullable BlueException blueException) {
                            Object[] objArr3 = {str5, blueException};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "068b9e36551ae4035bc382ea69985f4e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "068b9e36551ae4035bc382ea69985f4e");
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("js execute fail : ");
                            sb2.append(str);
                            sb2.append(", frameworkId = ");
                            sb2.append(str5);
                            sb2.append(", instanceId = ");
                            sb2.append(jSInstance.getInstanceId());
                            sb2.append(", e = ");
                            sb2.append(blueException != null ? blueException.toString() : StringUtil.NULL);
                            BlueException jSException3 = JSExecuteUtil.getJSException(i, str, 4, blueException);
                            int batchNum3 = JSExecuteUtil.getBatchNum(jSONArray, jSONObject);
                            if (jSCallback != null) {
                                jSCallback.onFailed(str5, jSException3, batchNum3, j);
                            }
                            JSExecuteUtil.sendFail(str, i, jSONArray, batchNum3, "", jSException3);
                        }
                    };
                    jSInstance.executeWithArguments(jSONArray, jSONObject, new JSCallbackWithFrameworkUpdateChecking(iJSCallback2, new IJSFrameworkUpdateResultCallback() { // from class: com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil.1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback
                        public void onUpdateFinish(boolean z, boolean z2, @Nullable BlueException blueException) {
                            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), blueException};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e412fcfc4af8d9e93fe912a639944822", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e412fcfc4af8d9e93fe912a639944822");
                            } else if (z2) {
                                jSInstance.executeWithArguments(jSONArray, iJSCallback2);
                            }
                        }
                    }));
                }

                @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                public final void onFailed(String str3, @Nullable BlueException blueException) {
                    Object[] objArr2 = {str3, blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a29b2c1c16cf5e5f1cc7dfcc366791a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a29b2c1c16cf5e5f1cc7dfcc366791a");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("JSOperatorProducer.operate.loadScript.onFailed(): loadScript failed : bundle = ");
                    sb.append(str);
                    sb.append(", frameworkId = ");
                    sb.append(str3);
                    sb.append(", instanceId = ");
                    sb.append(jSInstance.getInstanceId());
                    sb.append(", e = ");
                    sb.append(blueException != null ? blueException.toString() : StringUtil.NULL);
                    BlueException jSException2 = JSExecuteUtil.getJSException(i, str, 4, blueException);
                    int batchNum2 = JSExecuteUtil.getBatchNum(jSONArray, jSONObject);
                    if (jSCallback != null) {
                        jSCallback.onFailed(str3, jSException2, JSExecuteUtil.getBatchNum(jSONArray, jSONObject), j);
                    }
                    JSExecuteUtil.sendFail(str, i, jSONArray, batchNum2, str3, jSException2);
                    if (TextUtils.equals("prod", AppUtil.getEnv())) {
                        return;
                    }
                    AutoJSServiceManager.getInstance().callbackObserver(str, "", blueException, false);
                }
            };
            jSInstance.loadScript(str2, null, new JSCallbackWithFrameworkUpdateChecking(iJSCallback, new IJSFrameworkUpdateResultCallback() { // from class: com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback
                public final void onUpdateFinish(boolean z, boolean z2, @Nullable BlueException blueException) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86df7c62151bc17ada876a4db4e33504", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86df7c62151bc17ada876a4db4e33504");
                    } else if (z2) {
                        JSInstance.this.loadScript(str2, null, iJSCallback);
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BlueException getJSException(int i, String str, int i2, BlueException blueException) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff6a7305555d4367dee461b040e35189", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlueException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff6a7305555d4367dee461b040e35189");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(blueException);
        sb.append(CommonConstant.Symbol.COMMA);
        int i3 = -1;
        if (i == -1) {
            sb.append("unknown js execute type : ");
        } else {
            switch (i) {
                case 1:
                    sb.append("js feature produce : ");
                    i3 = getFeatureErrorCode(i2, blueException);
                    break;
                case 2:
                    sb.append("js operator produce : ");
                    i3 = getOperatorErrorCode(i2, blueException);
                    break;
                case 3:
                    sb.append("js model produce : ");
                    i3 = getModelErrorCode(i2, blueException);
                    break;
                case 4:
                    sb.append("js model post process : ");
                    i3 = getModelPostProcessErrorCode(i2, blueException);
                    break;
                case 5:
                    sb.append("js auto run process : ");
                    i3 = getJSAutoRunErrorCode(i2, blueException);
                    break;
                case 6:
                    sb.append("js auto predict process : ");
                    i3 = getJSAutoPredictErrorCode(i2, blueException);
                    break;
            }
        }
        sb.append(str);
        sb.append(" : ");
        switch (i2) {
            case 0:
                sb.append("aiBundle is null");
                break;
            case 1:
                sb.append("js instance is null");
                break;
            case 2:
                sb.append("load script success but js instance is null");
                break;
            case 3:
                sb.append("load script fail");
                break;
            case 4:
                sb.append("execute script fail");
                break;
        }
        return new BlueException(new Exception(sb.toString()), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendSuccess(String str, int i, JSONArray jSONArray, String str2, JSValueWrapper jSValueWrapper, long j, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), jSONArray, str2, jSValueWrapper, new Long(j), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4364ab0886e39483d65db6d19a40e8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4364ab0886e39483d65db6d19a40e8c0");
        } else if (jSValueWrapper == null) {
            sendFail(str, i, jSONArray, i2, str2, getResultNullException(i));
        } else {
            BaseRaptorUploader baseRaptorUploader = new BaseRaptorUploader();
            switch (i) {
                case 6:
                    addAutoPredictRaptorTag(jSONArray, baseRaptorUploader);
                    break;
            }
            Object objectData = jSValueWrapper.getObjectData();
            baseRaptorUploader.addValues(RaptorConstants.JS_SUCC_RATE, 1).addValues(RaptorConstants.JS_SCRIPT_DURATION, Float.valueOf(jSValueWrapper.getExecuteTime())).addValues(RaptorConstants.JS_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - j)).addTags("bundle_id", str).addTags("bundle_version", ResourceConfigManager.getInstance().getBundleVersion(str)).addTags("framework_version", str2).addTags("type", i).addTags("status", "success").addTags("errorCode", "0").addTags(RaptorConstants.JS_BATCH_NUM, i2).addExtra(RaptorConstants.OUTPUT_RESULT, objectData == null ? "" : objectData.toString()).send();
            if (AIDataDelegate.getInstance().isDebugEnable() && i == 5) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("path", RaptorConstants.AIDATA_JS_PRODUCE);
                    jSONObject.put(RaptorConstants.JS_SUCC_RATE, 1);
                    jSONObject.put(RaptorConstants.JS_SCRIPT_DURATION, jSValueWrapper.getExecuteTime());
                    jSONObject.put(RaptorConstants.JS_DURATION, SystemClock.elapsedRealtime() - j);
                    jSONObject.put("bundle_id", str);
                    jSONObject.put("bundle_version", ResourceConfigManager.getInstance().getBundleVersion(str));
                    jSONObject.put("framework_version", str2);
                    jSONObject.put("type", i);
                    jSONObject.put("status", "success");
                    jSONObject.put("errorCode", "0");
                    jSONObject.put(RaptorConstants.JS_BATCH_NUM, i2);
                    jSONObject.put(RaptorConstants.OUTPUT_RESULT, objectData == null ? "" : objectData.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                LogUtil.aiLogD("【aidata_js_produce】\n" + jSONObject.toString());
            }
        }
    }

    private static BlueException getResultNullException(int i) {
        int i2;
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0354293da74468397a513a443ade0a66", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlueException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0354293da74468397a513a443ade0a66");
        }
        switch (i) {
            case 1:
                i2 = ErrorCode.JSExecute.RESULT_NULL_FEATURE;
                str = "js feature";
                break;
            case 2:
                i2 = ErrorCode.JSExecute.RESULT_NULL_OPERATOR;
                str = "operator";
                break;
            case 3:
                i2 = ErrorCode.JSExecute.RESULT_NULL_MODEL;
                str = "js model";
                break;
            case 4:
                i2 = ErrorCode.JSExecute.RESULT_NULL_MODEL_POST_PROCESS;
                str = "model post";
                break;
            case 5:
                i2 = ErrorCode.JSExecute.RESULT_NULL_JS_AUTO_RUN;
                str = "js auto run";
                break;
            case 6:
                i2 = ErrorCode.JSExecute.RESULT_NULL_JS_AUTO_PREDICT;
                str = "js auto predict";
                break;
            default:
                i2 = -1;
                str = "-1";
                break;
        }
        String str2 = str + "result is null";
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        return new BlueException(str2, sb.toString());
    }

    private static void addAutoPredictRaptorTag(JSONArray jSONArray, BaseRaptorUploader baseRaptorUploader) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object[] objArr = {jSONArray, baseRaptorUploader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "828a45d481a962f76e3882566facf2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "828a45d481a962f76e3882566facf2c4");
        } else if (baseRaptorUploader == null || jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null || (optJSONObject2 = optJSONObject.optJSONObject(PredictMethod.KEY_CEP_CONFIG)) == null) {
        } else {
            baseRaptorUploader.addTags("cepId", optJSONObject2.optString("cepId"));
            baseRaptorUploader.addTags(RaptorUploaderImpl.SUB_CEP_ID, optJSONObject2.optString(RaptorUploaderImpl.SUB_CEP_ID));
            baseRaptorUploader.addTags(RaptorUploaderImpl.CEP_VERSION, optJSONObject2.optString(RaptorUploaderImpl.CEP_VERSION));
            baseRaptorUploader.addExtra(RaptorUploaderImpl.CEP_UNIQUE_ID, optJSONObject2.optString(RaptorUploaderImpl.CEP_UNIQUE_ID));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendFail(String str, int i, JSONArray jSONArray, int i2, String str2, BlueException blueException) {
        Object[] objArr = {str, Integer.valueOf(i), jSONArray, Integer.valueOf(i2), str2, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6144eae62e059d9b3de5806e85a5091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6144eae62e059d9b3de5806e85a5091");
            return;
        }
        BaseRaptorUploader addTags = new BaseRaptorUploader().addValues(RaptorConstants.JS_SUCC_RATE, 0).addTags("bundle_id", str).addTags("bundle_version", ResourceConfigManager.getInstance().getBundleVersion(str)).addTags("framework_version", str2).addTags("type", i).addTags("status", "fail").addTags("errorCode", blueException.getErrorCode()).addTags(RaptorConstants.JS_BATCH_NUM, i2).addTags("fail_detail", blueException.getErrorMsg());
        switch (i) {
            case 6:
                addAutoPredictRaptorTag(jSONArray, addTags);
                break;
        }
        addTags.send();
        if (AIDataDelegate.getInstance().isDebugEnable() && i == 5) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("path", RaptorConstants.AIDATA_JS_PRODUCE);
                jSONObject.put(RaptorConstants.JS_SUCC_RATE, 0);
                jSONObject.put("bundle_id", str);
                jSONObject.put("bundle_version", ResourceConfigManager.getInstance().getBundleVersion(str));
                jSONObject.put("framework_version", str2);
                jSONObject.put("type", i);
                jSONObject.put("status", "fail");
                jSONObject.put("errorCode", blueException.getErrorCode());
                jSONObject.put(RaptorConstants.JS_BATCH_NUM, i2);
                jSONObject.put("fail_detail", blueException.getErrorMsg());
            } catch (Exception e) {
                e.printStackTrace();
            }
            LogUtil.aiLogD("【aidata_js_produce】\n" + jSONObject.toString());
        }
    }

    public static int getBatchNum(JSONArray jSONArray, JSONObject jSONObject) {
        Object[] objArr = {jSONArray, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "899caaec533eafa57e8cde3eb2dc241f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "899caaec533eafa57e8cde3eb2dc241f")).intValue();
        }
        if (jSONObject == null || !TextUtils.equals(jSONObject.optString(KEY_JS_OPTIONS_EXECUTE_MODE), VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH)) {
            return -1;
        }
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }
}
