package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.ModelConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.ModelFileNotValidException;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelInstancePool;
import com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.JSCallback;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.aidata.raptoruploader.RaptorEntity;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLModelEngineManager {
    public static final String RESULT_KEY_MODEL_UNIQUE_ID = "model_unique_id";
    public static final String RESULT_KEY_NAME = "name";
    public static final String RESULT_KEY_OUTPUT = "output";
    public static final String RESULT_KEY_PREDICT_ID = "predictID";
    public static final String RESULT_KEY_VERSION = "version";
    public static final String TAG = "MLModelEngineManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MLModelEngineManager sInstance;

    public static MLModelEngineManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3e3a78e92513c2edfca95b1c94a6fb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLModelEngineManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3e3a78e92513c2edfca95b1c94a6fb2");
        }
        if (sInstance == null) {
            synchronized (MLModelEngineManager.class) {
                if (sInstance == null) {
                    sInstance = new MLModelEngineManager();
                }
            }
        }
        return sInstance;
    }

    public void executeMLModelBundle(@NonNull final MLContext mLContext) {
        Object[] objArr = {mLContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ed0a76f521148c67098e50709b0cf8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ed0a76f521148c67098e50709b0cf8d");
        } else if (mLContext.aiBundle != null && mLContext.aiBundle.checkValid()) {
            LogUtil.aiLogD(TAG + " executeMLModelBundle(): load bundle success, bundleName = " + mLContext.modelName);
            CatMonitorManager.getInstance().recordModelLoad(mLContext, 0, null, "0");
            executeMLModel(mLContext, new IPredictionListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
                public void onSuccess(@Nullable Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "10209599f3f9004cd47eb2ad197224b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "10209599f3f9004cd47eb2ad197224b7");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Aidata MLModelEngineManager.executeMLModelBundle(): prediction complete, bundleName = ");
                    sb.append(mLContext.modelName);
                    sb.append(", version: ");
                    sb.append(mLContext.getModelBundleVersion());
                    try {
                        JSONObject convertPredictResultToJson = MLModelEngineManager.this.convertPredictResultToJson(mLContext, obj);
                        CatMonitorManager.getInstance().recordModelPredict(mLContext, 0, null, "0");
                        MLModelEngineManager.this.callbackSuccess(mLContext, convertPredictResultToJson);
                    } catch (Exception unused) {
                        CatMonitorManager.getInstance().recordModelPredict(mLContext, 1, "prediction result convert error", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED);
                        MLModelEngineManager.this.callbackFail(mLContext, new Exception("prediction result convert error"));
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
                public void onFailed(@Nullable BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de104fb862438bd0b9ec2e2a5988f770", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de104fb862438bd0b9ec2e2a5988f770");
                        return;
                    }
                    CatMonitorManager.getInstance().recordModelPredict(mLContext, 1, blueException != null ? blueException.getMessage() : "executeMLModel未知错误", blueException != null ? blueException.getErrorCode() : "-1");
                    MLModelEngineManager.this.callbackFail(mLContext, blueException);
                }
            });
        } else {
            String str = TAG;
            LogUtil.aiLogE(str, " executeMLModelBundle(): load bundle failed, bundleName = " + mLContext.modelName + ", bundle is not valid");
            callbackFail(mLContext, new Exception("bundle load info invalid"));
            if (mLContext.aiBundle == null) {
                CatMonitorManager.getInstance().recordModelLoad(mLContext, 1, "bundle is null", BaseRaptorUploader.ERROR_EMPTY_BUNDLE_RES);
                CatMonitorManager catMonitorManager = CatMonitorManager.getInstance();
                catMonitorManager.recordModelPredict(mLContext, 1, "bundle is null : " + mLContext.getErrorDesc(), BaseRaptorUploader.ERROR_EMPTY_BUNDLE_RES);
            } else if (!mLContext.aiBundle.isMLBundleValid()) {
                CatMonitorManager.getInstance().recordModelLoad(mLContext, 1, "bundle is not valid", BaseRaptorUploader.ERROR_INVALID_BUNDLE_RES);
                CatMonitorManager catMonitorManager2 = CatMonitorManager.getInstance();
                catMonitorManager2.recordModelPredict(mLContext, 1, "bundle is not valid : " + mLContext.getErrorDesc(), BaseRaptorUploader.ERROR_INVALID_BUNDLE_RES);
            } else if (mLContext.aiBundle.getCachedBundle().isModelValid()) {
            } else {
                CatMonitorManager.getInstance().recordModelLoad(mLContext, 1, "bundle file is not valid", BaseRaptorUploader.ERROR_INVALID_BUNDLE_RES);
                CatMonitorManager catMonitorManager3 = CatMonitorManager.getInstance();
                catMonitorManager3.recordModelPredict(mLContext, 1, "bundle file is not valid : " + mLContext.getErrorDesc(), BaseRaptorUploader.ERROR_INVALID_BUNDLE_RES);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(MLContext mLContext, Exception exc) {
        Object[] objArr = {mLContext, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16be7d3def7635cc454fbeb227db0458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16be7d3def7635cc454fbeb227db0458");
        } else if (mLContext == null || mLContext.listener == null) {
        } else {
            mLContext.listener.onFailed(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackSuccess(MLContext mLContext, JSONObject jSONObject) {
        Object[] objArr = {mLContext, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fa4381ccefadcb290b61b9867af3e72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fa4381ccefadcb290b61b9867af3e72");
        } else if (mLContext == null || mLContext.listener == null) {
        } else {
            mLContext.listener.onSuccess(jSONObject);
        }
    }

    private void executeMLModel(@NonNull final MLContext mLContext, final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eeeeb10eef00c4b7ebf87498ce6b596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eeeeb10eef00c4b7ebf87498ce6b596");
            return;
        }
        new StringBuilder("Aidata MLModelEngineManager.exectueMLModel(): create predictor, bundleName = ").append(mLContext.aiBundle.getBundleName());
        com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine mLModelEngine = MLModelInstancePool.getPool().getMLModelEngine(mLContext.aiBundle);
        if (mLModelEngine != null) {
            mLModelEngine.initPredictor(mLContext.aiBundle, new IPredictorInitlizedListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictorInitlizedListener
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28187cfeebd79f01c82b85cfaad2ba19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28187cfeebd79f01c82b85cfaad2ba19");
                        return;
                    }
                    LogUtil.aiLogD("Aidata MLModelEngineManager.exectueMLModel(): create predictor success, bundleName = " + mLContext.aiBundle.getBundleName());
                    if (mLContext.aiBundle.getFeatureConfig() != null) {
                        if (mLContext.feature == null) {
                            MLModelEngineManager.this.startMLProcess(mLContext, iPredictionListener);
                            return;
                        } else {
                            MLModelEngineManager.this.startMLProcess(mLContext, mLContext.feature, iPredictionListener);
                            return;
                        }
                    }
                    onFailed(new ModelFileNotValidException(mLContext.getModelFilePath(), "feature config is not valid"));
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictorInitlizedListener
                public void onFailed(BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3a138941cc13767bca06e1194ceb902a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3a138941cc13767bca06e1194ceb902a");
                        return;
                    }
                    String str = MLModelEngineManager.TAG;
                    LogUtil.aiLogE(str, "Aidata zMLModelEngineManager.exectueMLModel(): create predictor failed, bundleName = " + mLContext.aiBundle.getBundleName() + ", errMsg=" + blueException.getMessage());
                    blueException.setErrorCode(BaseRaptorUploader.ERROR_FAILED_CREATE_ENGINE);
                    if (iPredictionListener != null) {
                        iPredictionListener.onFailed(blueException);
                    }
                }
            });
        } else if (iPredictionListener != null) {
            iPredictionListener.onFailed(new BlueException("engine count is cannot beyound limit", BaseRaptorUploader.ERROR_INIT_FAILED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMLProcess(@NonNull final MLContext mLContext, final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5043c0ef279daddaf5921cd249bc1934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5043c0ef279daddaf5921cd249bc1934");
            return;
        }
        LogUtil.aiLogD("Aidata MLModelEngineManager.startMLProcess(): start feature process, bundleName = " + mLContext.aiBundle.getBundleName());
        new MLFeatureProcessHelper().process(mLContext, new MLFeatureProcessHelper.PreprocessListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.PreprocessListener
            public void onSuccess(@Nullable Map<String, JSONArray> map, @NonNull List<String> list) {
                Object[] objArr2 = {map, list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e80dbf270ce52582cc3a0c210d6b22e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e80dbf270ce52582cc3a0c210d6b22e");
                    return;
                }
                LogUtil.aiLogD(MLModelEngineManager.TAG + " startMLProcess(): feature process success, bundleName = " + mLContext.aiBundle.getBundleName());
                mLContext.operatorFeature = map;
                MLModelEngineManager.this.processFeatureSuccessCallback(mLContext, map, list, iPredictionListener);
            }

            @Override // com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.PreprocessListener
            public void onFailed(@Nullable BlueException blueException) {
                Object[] objArr2 = {blueException};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6f0dc176756d78078639a19c542d0458", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6f0dc176756d78078639a19c542d0458");
                    return;
                }
                String str = MLModelEngineManager.TAG;
                LogUtil.aiLogE(str, " startMLProcess(): feature process failed, bundleName = " + mLContext.aiBundle.getBundleName() + ", e = " + AiFeatureUtil.exceptionToString(blueException));
                iPredictionListener.onFailed(blueException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMLProcess(@NonNull final MLContext mLContext, JSONObject jSONObject, final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, jSONObject, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa996d5b3f8098862296ee2777d91b7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa996d5b3f8098862296ee2777d91b7f");
            return;
        }
        LogUtil.aiLogD("Aidata MLModelEngineManager.startMLProcess(): start feature process, bundleName = " + mLContext.aiBundle.getBundleName());
        new MLFeatureProcessHelper().process(mLContext, jSONObject, new MLFeatureProcessHelper.PreprocessListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.PreprocessListener
            public void onSuccess(@Nullable Map<String, JSONArray> map, @NonNull List<String> list) {
                Object[] objArr2 = {map, list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcf51b7d8da634c33799d255c24e5e01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcf51b7d8da634c33799d255c24e5e01");
                    return;
                }
                LogUtil.aiLogD(MLModelEngineManager.TAG + " startMLProcess(): feature process success, bundleName = " + mLContext.aiBundle.getBundleName());
                mLContext.operatorFeature = map;
                MLModelEngineManager.this.processFeatureSuccessCallback(mLContext, map, list, iPredictionListener);
            }

            @Override // com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.PreprocessListener
            public void onFailed(@Nullable BlueException blueException) {
                Object[] objArr2 = {blueException};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af62ed2a568b5e5403f0b35248371b07", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af62ed2a568b5e5403f0b35248371b07");
                    return;
                }
                String str = MLModelEngineManager.TAG;
                LogUtil.aiLogE(str, " startMLProcess(): feature process failed, bundleName = " + mLContext.aiBundle.getBundleName() + ", e = " + AiFeatureUtil.exceptionToString(blueException));
                iPredictionListener.onFailed(blueException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public JSONObject convertPredictResultToJson(@NonNull MLContext mLContext, @Nullable Object obj) throws Exception {
        Object[] objArr = {mLContext, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b717a9b8fce28b2f97da872c9b720925", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b717a9b8fce28b2f97da872c9b720925");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model_unique_id", mLContext.modelUniqueId);
        jSONObject.put("name", mLContext.modelName);
        jSONObject.put("version", mLContext.getModelBundleVersion());
        jSONObject.put("output", obj);
        return jSONObject;
    }

    private void logProcessFeatureResult(Map<String, JSONArray> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33dcb514cbdec11429447ef96fb3f543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33dcb514cbdec11429447ef96fb3f543");
        } else if (LogUtil.isLogEnabled() && map != null) {
            for (String str : map.keySet()) {
                LogUtil.aiLogD("key=" + str);
                JSONArray jSONArray = map.get(str);
                StringBuilder sb = new StringBuilder("value=");
                if (jSONArray == null) {
                    jSONArray = StringUtil.NULL;
                }
                sb.append(jSONArray);
                LogUtil.aiLogD(sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processFeatureSuccessCallback(@NonNull final MLContext mLContext, @Nullable Map<String, JSONArray> map, @NonNull List<String> list, final IPredictionListener iPredictionListener) {
        List<TensorConfig.TensorConfigItem> list2;
        List<TensorConfig.TensorConfigItem> list3;
        Object[] objArr = {mLContext, map, list, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca1f43a44bb1c80f17cb232cfc2bdb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca1f43a44bb1c80f17cb232cfc2bdb28");
            return;
        }
        logProcessFeatureResult(map);
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(" startMLProcess operatorUniqueIdList=");
        sb.append(list.toString());
        try {
            AiTensorParser.checkFeaturesValidity(map);
            if ("mtnn".equals(mLContext.aiBundle.getModelConfig().getModelFileType())) {
                List<TensorConfig.TensorConfigItem> list4 = mLContext.aiBundle.getTensorConfig().input;
                List<TensorConfig.TensorConfigItem> list5 = mLContext.aiBundle.getTensorConfig().output;
                LogUtil.aiLogD(TAG + " MLModelEngineManager.startMLProcess(): make tensor success, bundleName = " + mLContext.aiBundle.getBundleName());
                list3 = list5;
                list2 = list4;
            } else {
                list2 = null;
                list3 = null;
            }
            com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine mLModelEngine = MLModelInstancePool.getPool().getMLModelEngine(mLContext.aiBundle);
            if (mLModelEngine == null) {
                if (iPredictionListener != null) {
                    iPredictionListener.onFailed(new BlueException("engine count is cannot beyound limit", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED));
                    return;
                }
                return;
            }
            ModelConfig modelConfig = mLContext.aiBundle.getModelConfig();
            if (modelConfig == null) {
                LogUtil.aiLogE(TAG, "startMLProcess bundle modelConfig is null");
            } else {
                mLModelEngine.runPrediction(mLContext, map, list2, list3, list, modelConfig, new IPredictionListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.5
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
                    public void onSuccess(@Nullable Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "416e39ad41b3877fffe99fe8f39af055", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "416e39ad41b3877fffe99fe8f39af055");
                            return;
                        }
                        new StringBuilder("MLModelEngineManager.startMLProcess(): predict complete, bundleName = ").append(mLContext.aiBundle.getBundleName());
                        if (iPredictionListener == null) {
                            return;
                        }
                        if (!mLContext.isPostProcess()) {
                            iPredictionListener.onSuccess(obj);
                        } else if (mLContext.isPredictSuccess) {
                            MLModelEngineManager.this.postProcess(mLContext, obj, iPredictionListener);
                        } else {
                            iPredictionListener.onFailed(new BlueException(obj.toString()));
                        }
                    }

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
                    public void onFailed(@Nullable BlueException blueException) {
                        Object[] objArr2 = {blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8fb0257cd13c64ebca0a381d4ead583f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8fb0257cd13c64ebca0a381d4ead583f");
                            return;
                        }
                        String str = MLModelEngineManager.TAG;
                        StringBuilder sb2 = new StringBuilder("MLModelEngineManager.startMLProcess(): predict failed, bundleName = ");
                        sb2.append(mLContext.aiBundle.getBundleName());
                        sb2.append(", e = ");
                        sb2.append(AiFeatureUtil.exceptionToString(blueException));
                        if (iPredictionListener != null) {
                            iPredictionListener.onFailed(blueException);
                        }
                    }
                });
            }
        } catch (BlueException e) {
            LogUtil.aiLogE(TAG, " startMLProcess(): feature process failed, bundleName = " + mLContext.aiBundle.getBundleName() + ", e = " + AiFeatureUtil.exceptionToString(e));
            iPredictionListener.onFailed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postProcess(@NonNull final MLContext mLContext, Object obj, @NonNull final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, obj, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17807819f0175dd26f2a1302b007094e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17807819f0175dd26f2a1302b007094e");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operatorResults", new JSONObject(mLContext.operatorFeature));
            jSONObject.put("predictResults", obj);
        } catch (Exception unused) {
        }
        jSONArray.put(jSONObject);
        mLContext.startPostProcessTime = SystemClock.elapsedRealtime();
        JSExecuteUtil.execute(4, mLContext.modelName, mLContext.getPostProcessJSInstance(), mLContext.getPostProcessJSContent(), jSONArray, new JSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
            public void onSuccess(String str, JSValueWrapper jSValueWrapper, int i, long j) {
                Object[] objArr2 = {str, jSValueWrapper, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ec5af76de718df2ef88c15f31d59ceb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ec5af76de718df2ef88c15f31d59ceb");
                    return;
                }
                if (iPredictionListener != null) {
                    iPredictionListener.onSuccess(jSValueWrapper == null ? null : jSValueWrapper.getObjectData());
                }
                MLModelEngineManager.this.reportPostProcess(true, mLContext, jSValueWrapper.getObjectData(), null, SystemClock.elapsedRealtime());
            }

            @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
            public void onFailed(String str, BlueException blueException, int i, long j) {
                Object[] objArr2 = {str, blueException, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4e0716c068e60cc7fa639149d57d71d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4e0716c068e60cc7fa639149d57d71d0");
                    return;
                }
                if (iPredictionListener != null) {
                    iPredictionListener.onFailed(blueException);
                }
                MLModelEngineManager.this.reportPostProcess(false, mLContext, null, blueException, 0L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportPostProcess(boolean z, MLContext mLContext, Object obj, BlueException blueException, long j) {
        String errorMsg;
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), mLContext, obj, blueException, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd323bcdb33058b9230ff96c51fedf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd323bcdb33058b9230ff96c51fedf2");
        } else if (mLContext == null) {
        } else {
            RaptorEntity addExtra = new RaptorEntity().addTag("path", RaptorUploaderImpl.MODEL_POST_PROCESS_PATH).addTag("model_name", mLContext.modelName).addTag(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion()).addTag("biz", mLContext.getBiz()).addExtra("model_unique_id", mLContext.modelUniqueId);
            if (z) {
                addExtra.addValue(RaptorUploaderImpl.MODEL_POST_PROCESS_SUCC_RATE, 1.0f).addValue(RaptorUploaderImpl.MODEL_POST_PROCESS_DURATION, (float) (j - mLContext.startPostProcessTime)).addTag("status", "success").addTag("errorCode", "0").addExtra(BaseRaptorUploader.OUTPUT_DATA, AiFeatureUtil.objectToString(obj)).send();
                if (AIDataDelegate.getInstance().isDebugEnable()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("path", RaptorUploaderImpl.MODEL_POST_PROCESS_PATH);
                        jSONObject.put("model_name", mLContext.modelName);
                        jSONObject.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
                        jSONObject.put("biz", mLContext.getBiz());
                        jSONObject.put("model_unique_id", mLContext.modelUniqueId);
                        jSONObject.put(RaptorUploaderImpl.MODEL_POST_PROCESS_SUCC_RATE, 1.0d);
                        jSONObject.put("status", "success");
                        jSONObject.put("errorCode", "0");
                        jSONObject.put(BaseRaptorUploader.OUTPUT_DATA, AiFeatureUtil.objectToString(obj));
                        LogUtil.aiLogD("【blue_model_post_process】\n" + jSONObject.toString());
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (blueException == null) {
                str = "-1";
                errorMsg = RaptorConstants.ERROR_UNKNOWN_VALUE;
            } else {
                String errorCode = blueException.getErrorCode();
                errorMsg = blueException.getErrorMsg();
                str = errorCode;
            }
            addExtra.addValue(RaptorUploaderImpl.MODEL_POST_PROCESS_SUCC_RATE, 0.0f).addTag("status", "fail").addTag("errorCode", str).addExtra("fail_detail", errorMsg).send();
            JSONObject jSONObject2 = new JSONObject();
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                try {
                    jSONObject2.put("path", RaptorUploaderImpl.MODEL_POST_PROCESS_PATH);
                    jSONObject2.put("model_name", mLContext.modelName);
                    jSONObject2.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
                    jSONObject2.put("biz", mLContext.getBiz());
                    jSONObject2.put("model_unique_id", mLContext.modelUniqueId);
                    jSONObject2.put(RaptorUploaderImpl.MODEL_POST_PROCESS_SUCC_RATE, 0.0d);
                    jSONObject2.put("status", "fail");
                    jSONObject2.put("errorCode", str);
                    jSONObject2.put("fail_detail", errorMsg);
                    LogUtil.aiLogD("【blue_model_post_process】\n" + jSONObject2.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
