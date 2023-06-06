package com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.jsengine.AIDataTaskListener;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.base.AbsPredictor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.ModelFileNotValidException;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.ModelTypeNotMatchedException;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.PredictorCreateException;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.IJSCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ModelPredictorProducerXGB implements IModelPredictorProducer {
    public static final String MODEL_FILE_TYPE_XGB = "aidata-js";
    public static final String TAG = "ModelPredictorProducerXGB";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer
    @Nullable
    public List<String> getSupportedType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54fc6196a57cb6088edc2610667481b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54fc6196a57cb6088edc2610667481b4");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("aidata-js");
        return arrayList;
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer
    public void createPredictor(@NonNull AiBundle aiBundle, @Nullable final IModelPredictorProducer.OnCreatePredictorListener onCreatePredictorListener) {
        BlueException modelTypeNotMatchedException;
        boolean z = false;
        Object[] objArr = {aiBundle, onCreatePredictorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eeed99974a52d41b4a9e22fc364b952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eeed99974a52d41b4a9e22fc364b952");
            return;
        }
        boolean z2 = (aiBundle.getCachedBundle() == null || !aiBundle.getCachedBundle().isModelValid() || TextUtils.isEmpty(aiBundle.getCachedBundle().getModelFilePath())) ? false : true;
        if (aiBundle.getModelConfig() != null && "aidata-js".equals(aiBundle.getModelConfig().getModelFileType())) {
            z = true;
        }
        String str = StringUtil.NULL;
        if (aiBundle.getCachedBundle() != null) {
            str = aiBundle.getCachedBundle().getModelFilePath();
        }
        String str2 = StringUtil.NULL;
        if (aiBundle.getModelConfig() != null) {
            str2 = aiBundle.getModelConfig().getModelFileType();
        }
        final XGBPredictor xGBPredictor = null;
        if (z2 && z) {
            try {
                XGBPredictor xGBPredictor2 = new XGBPredictor(aiBundle);
                modelTypeNotMatchedException = null;
                xGBPredictor = xGBPredictor2;
            } catch (Throwable th) {
                PredictorCreateException predictorCreateException = new PredictorCreateException(str2, "predictor create failed, e = " + th.toString());
                predictorCreateException.setErrorCode("-1");
                modelTypeNotMatchedException = predictorCreateException;
            }
        } else if (!z2) {
            modelTypeNotMatchedException = new ModelFileNotValidException(str, "model file is not valid");
            modelTypeNotMatchedException.setErrorCode(BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT);
        } else {
            modelTypeNotMatchedException = new ModelTypeNotMatchedException(str2, "aidata-js", "model type is not matched");
            modelTypeNotMatchedException.setErrorCode(BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT);
        }
        if (onCreatePredictorListener != null) {
            if (xGBPredictor != null) {
                xGBPredictor.init(new AIDataTaskListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.jsengine.AIDataTaskListener
                    public void onSuccess(@Nullable String str3, @Nullable JSValueWrapper jSValueWrapper) {
                        Object[] objArr2 = {str3, jSValueWrapper};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91af6a951c557765b192117c00495b63", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91af6a951c557765b192117c00495b63");
                        } else {
                            onCreatePredictorListener.onSuccess(xGBPredictor);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.ai.jsengine.AIDataTaskListener
                    public void onFailed(@Nullable BlueException blueException) {
                        Object[] objArr2 = {blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d84dc6d33ac9f399873c2a8e474e814", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d84dc6d33ac9f399873c2a8e474e814");
                        } else {
                            onCreatePredictorListener.onFailed(blueException);
                        }
                    }
                });
            } else if (modelTypeNotMatchedException != null) {
                onCreatePredictorListener.onFailed(modelTypeNotMatchedException);
            } else {
                onCreatePredictorListener.onFailed(new BlueException("create tflite predictor failed, isModelFileValid = " + z2 + ", isModelTypeMatched = " + z, BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class XGBPredictor extends AbsPredictor {
        public static ChangeQuickRedirect changeQuickRedirect;
        private AiBundle mAiBundle;

        @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.AbsPredictor
        public void doPredict(@NonNull MLContext mLContext, @NonNull List<AiTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable IPredictionListener iPredictionListener) {
        }

        public XGBPredictor(AiBundle aiBundle) {
            Object[] objArr = {aiBundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3be9ad4974603cb2fa9b14f4be3a4b15", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3be9ad4974603cb2fa9b14f4be3a4b15");
            } else {
                this.mAiBundle = aiBundle;
            }
        }

        public void init(final AIDataTaskListener aIDataTaskListener) {
            Object[] objArr = {aIDataTaskListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c78ac1b489247cfa126f190f3b6255ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c78ac1b489247cfa126f190f3b6255ab");
            } else if (this.mAiBundle != null && this.mAiBundle.getJSInstance() != null) {
                this.mAiBundle.getJSInstance().loadScript(this.mAiBundle.getJsContent(), null, new IJSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB.XGBPredictor.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onSuccess(String str, @Nullable String str2, @Nullable JSValueWrapper jSValueWrapper) {
                        Object[] objArr2 = {str, str2, jSValueWrapper};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ee0266c7c68baff05e8c264082e71f7e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ee0266c7c68baff05e8c264082e71f7e");
                        } else if (aIDataTaskListener != null) {
                            aIDataTaskListener.onSuccess(str2, jSValueWrapper);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onFailed(String str, @Nullable BlueException blueException) {
                        Object[] objArr2 = {str, blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c75552f3a87cce095e72b76848ca799", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c75552f3a87cce095e72b76848ca799");
                        } else if (aIDataTaskListener != null) {
                            aIDataTaskListener.onFailed(blueException);
                        }
                    }
                });
            } else if (aIDataTaskListener != null) {
                aIDataTaskListener.onFailed(new BlueException("bundle is null", BaseRaptorUploader.ERROR_INVALID_FEATURE_CONFIG));
            }
        }

        @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.AbsPredictor, com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor
        public void predict(@NonNull final MLContext mLContext, @NonNull Map<String, JSONArray> map, @Nullable List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, String str, @Nullable final IPredictionListener iPredictionListener) {
            Object[] objArr = {mLContext, map, list, list2, str, iPredictionListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92ab113022017083020da46a50ae16ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92ab113022017083020da46a50ae16ad");
                return;
            }
            try {
                if (this.mAiBundle != null && this.mAiBundle.getJSInstance() != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(new JSONObject(map));
                    StringBuilder sb = new StringBuilder();
                    sb.append(ModelPredictorProducerXGB.TAG);
                    sb.append(".doPredict(): runTask : bundle = ");
                    sb.append(this.mAiBundle.getBundleName());
                    sb.append(", instanceId = ");
                    sb.append(this.mAiBundle.getJSInstance().getInstanceId());
                    sb.append(", arg[0] = ");
                    sb.append(map.toString());
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.mAiBundle.getJSInstance().executeWithArguments(jSONArray, new IJSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB.XGBPredictor.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onSuccess(String str2, @Nullable String str3, @Nullable JSValueWrapper jSValueWrapper) {
                            Object[] objArr2 = {str2, str3, jSValueWrapper};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4065938f2482c9ab0d029a050dd8b9a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4065938f2482c9ab0d029a050dd8b9a");
                                return;
                            }
                            String str4 = ModelPredictorProducerXGB.TAG;
                            StringBuilder sb2 = new StringBuilder("predict onSuccess: frameworkId = ");
                            sb2.append(str2);
                            sb2.append(", instanceId = ");
                            sb2.append(str3);
                            if (jSValueWrapper == null) {
                                XGBPredictor.this.predictCallFailed(str2, iPredictionListener, new BlueException("js result is not string", BaseRaptorUploader.ERROR_DATA_FORMATE_WRONG));
                                return;
                            }
                            try {
                                mLContext.isPredictSuccess = true;
                                Object objectData = jSValueWrapper.getObjectData();
                                XGBPredictor.this.callSuccess(iPredictionListener, objectData);
                                XGBPredictor.this.sendSuccess(str2, jSValueWrapper.getExecuteTime(), SystemClock.elapsedRealtime() - elapsedRealtime, objectData);
                            } catch (Exception e) {
                                XGBPredictor.this.predictCallFailed(str2, iPredictionListener, new BlueException(e.getMessage(), BaseRaptorUploader.ERROR_DATA_FORMATE_WRONG));
                            }
                        }

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onFailed(String str2, @Nullable BlueException blueException) {
                            Object[] objArr2 = {str2, blueException};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d350dc46055f17e8db8083b60147517", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d350dc46055f17e8db8083b60147517");
                                return;
                            }
                            String str3 = ModelPredictorProducerXGB.TAG;
                            new StringBuilder("predict onFailed: frameworkId = ").append(str2);
                            XGBPredictor.this.predictCallFailed(str2, iPredictionListener, blueException);
                        }
                    });
                    return;
                }
                predictCallFailed("", iPredictionListener, new BlueException("task key is empty", BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
            } catch (Exception e) {
                predictCallFailed("", iPredictionListener, new BlueException(e.getMessage(), "-1"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void predictCallFailed(String str, IPredictionListener iPredictionListener, BlueException blueException) {
            Object[] objArr = {str, iPredictionListener, blueException};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f36706ef160ccdc44acfff2644df47e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f36706ef160ccdc44acfff2644df47e");
                return;
            }
            callFailed(iPredictionListener, blueException);
            sendFail(str, blueException);
        }

        @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor
        public void release() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aa69e7528fb4203c91cc80657404759", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aa69e7528fb4203c91cc80657404759");
            } else if (this.mAiBundle == null || this.mAiBundle.getJSInstance() == null) {
            } else {
                this.mAiBundle.getJSInstance().destroyInstance(new IJSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB.XGBPredictor.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onFailed(String str, BlueException blueException) {
                    }

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onSuccess(String str, String str2, JSValueWrapper jSValueWrapper) {
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendSuccess(String str, float f, long j, Object obj) {
            Object[] objArr = {str, Float.valueOf(f), new Long(j), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdb6f7fe31ed2382f693fd6fb858df7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdb6f7fe31ed2382f693fd6fb858df7e");
            } else {
                new BaseRaptorUploader().addValues(RaptorConstants.JS_SUCC_RATE, 1).addValues(RaptorConstants.JS_SCRIPT_DURATION, Float.valueOf(f)).addValues(RaptorConstants.JS_DURATION, Long.valueOf(j)).addTags("path", RaptorConstants.AIDATA_JS_PRODUCE).addTags("type", 3).addTags("status", "success").addTags("errorCode", "0").addTags("framework_version", str).addExtra(RaptorConstants.OUTPUT_RESULT, obj == null ? "" : obj.toString()).send();
            }
        }

        private void sendFail(String str, BlueException blueException) {
            Object[] objArr = {str, blueException};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74299fe9e8b4120bf3e996e5625bdba4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74299fe9e8b4120bf3e996e5625bdba4");
                return;
            }
            String str2 = "-1";
            String str3 = "";
            if (blueException != null) {
                str2 = blueException.getErrorCode();
                str3 = blueException.getErrorMsg();
            }
            new BaseRaptorUploader().addValues(RaptorConstants.JS_SUCC_RATE, 0).addTags("path", RaptorConstants.AIDATA_JS_PRODUCE).addTags("type", 3).addTags("status", "fail").addTags("errorCode", str2).addTags("framework_version", str).addExtra("fail_detail", str3).send();
        }
    }
}
