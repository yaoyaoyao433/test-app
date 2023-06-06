package com.meituan.android.common.aidata.jsengine.modules.autopredict;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.jsengine.AutoJSServiceManager;
import com.meituan.android.common.aidata.jsengine.modules.AbstractNativeMethod;
import com.meituan.android.common.aidata.jsengine.modules.IJSNativeModuleCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PredictMethod extends AbstractNativeMethod {
    public static final String KEY_BIZ_PREDICT_MODULE = "bizPredictModule";
    public static final String KEY_CEP_CONFIG = "cepConfig";
    private static final String KEY_EXTERNAL_FEATURES = "externalFeatures";
    private static final String KEY_JS_FEATURE_PARAM = "jsFeatureParam";
    public static final String KEY_MODEL_NAME = "modelName";
    public static final String KEY_MODEL_UNIQUE_ID = "modelUniqueId";
    public static final String KEY_MODEL_VERSION = "modelVersion";
    public static final String KEY_OUTPUT = "output";
    public static final String KEY_POST_BY_NATIVE = "postByNative";
    private static final String TAG = "PredictMethod";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeMethod
    public String getMethodName() {
        return AIDataModule.MODULE_METHOD_PREDICT;
    }

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeMethod
    public void invoke(String str, String str2, final String str3, final IJSNativeModuleCallback iJSNativeModuleCallback) {
        BlueException blueException;
        Object[] objArr = {str, str2, str3, iJSNativeModuleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f76b49779863d125dd2758a71238c367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f76b49779863d125dd2758a71238c367");
            return;
        }
        JSONObject jSONObject = null;
        try {
            blueException = null;
            jSONObject = new JSONArray(str2).optJSONObject(0);
        } catch (Exception e) {
            e.getMessage();
            blueException = new BlueException(e, BaseRaptorUploader.ERROR_FAILED_PARSE_ARGS_PREDICT);
        }
        if (jSONObject == null) {
            handleResult(null, null, blueException, true, false, str3, iJSNativeModuleCallback);
            return;
        }
        final JSONObject optJSONObject = jSONObject.optJSONObject("jsFeatureParam");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(KEY_CEP_CONFIG);
        final boolean optBoolean = jSONObject.optBoolean(KEY_POST_BY_NATIVE, false);
        final MLContext mLContext = new MLContext();
        mLContext.modelName = jSONObject.optString("modelName", "");
        mLContext.feature = jSONObject.optJSONObject(KEY_EXTERNAL_FEATURES);
        mLContext.startTime = SystemClock.elapsedRealtime();
        mLContext.modelUniqueId = AppUtil.getUniqueId();
        mLContext.autoPredictInfo = optJSONObject2;
        if (optJSONObject != null) {
            mLContext.outParamsCallback = new JSFeatureOutParamsCallback() { // from class: com.meituan.android.common.aidata.jsengine.modules.autopredict.PredictMethod.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback
                public JSONObject getOutParams(String str4) {
                    Object[] objArr2 = {str4};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd5411022e43bbd5cf127114c0b05e8b", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd5411022e43bbd5cf127114c0b05e8b") : optJSONObject.optJSONObject(str4);
                }
            };
        }
        mLContext.listener = new IPredictionJsonListener() { // from class: com.meituan.android.common.aidata.jsengine.modules.autopredict.PredictMethod.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
            public void onSuccess(@Nullable JSONObject jSONObject2) {
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cafebc56b2a660125a8c0d64feb4e678", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cafebc56b2a660125a8c0d64feb4e678");
                } else {
                    PredictMethod.this.handleResult(mLContext, jSONObject2, null, optBoolean, true, str3, iJSNativeModuleCallback);
                }
            }

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener
            public void onFailed(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58b8a17cc65bd10e8aefce0c4f18458b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58b8a17cc65bd10e8aefce0c4f18458b");
                } else {
                    PredictMethod.this.handleResult(mLContext, null, exc, optBoolean, false, str3, iJSNativeModuleCallback);
                }
            }
        };
        AIDispatcher.getInstance().addExecuteMLTask(mLContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(MLContext mLContext, JSONObject jSONObject, Exception exc, boolean z, boolean z2, String str, IJSNativeModuleCallback iJSNativeModuleCallback) {
        Object[] objArr = {mLContext, jSONObject, exc, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, iJSNativeModuleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc9b45258caa9d629d22da83c146350b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc9b45258caa9d629d22da83c146350b");
            return;
        }
        if (z) {
            StringBuilder sb = new StringBuilder("notify ml result\n");
            sb.append(jSONObject);
            sb.append("\n to observer as postByNative is true");
            AutoJSServiceManager.getInstance().callbackObserver(mLContext != null ? mLContext.modelName : null, jSONObject, exc, z2);
        }
        if (iJSNativeModuleCallback == 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (mLContext != null) {
            try {
                jSONObject2.put("modelName", mLContext.modelName);
                jSONObject2.put("modelVersion", mLContext.getModelBundleVersion());
                jSONObject2.put(KEY_MODEL_UNIQUE_ID, mLContext.modelUniqueId);
            } catch (Exception unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject2.put("output", jSONObject.opt("output"));
        }
        jSONObject2.put(KEY_POST_BY_NATIVE, z);
        if (!z2) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", exc instanceof BlueException ? ((BlueException) exc).getErrorCode() : "-1");
            jSONObject3.put("msg", exc != null ? exc.getMessage() : "error is null");
            jSONObject2.put("error", jSONObject3);
        }
        iJSNativeModuleCallback.invoke(str, jSONObject2);
    }
}
