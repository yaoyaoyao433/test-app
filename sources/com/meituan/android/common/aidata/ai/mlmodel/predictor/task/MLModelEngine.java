package com.meituan.android.common.aidata.ai.mlmodel.predictor.task;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictorInitlizedListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.ModelPredictorManager;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.ModelConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.xgb.ModelPredictorProducerXGB;
import com.meituan.android.common.aidata.ai.platform.AppEnvironment;
import com.meituan.android.common.aidata.ai.utils.AiThread;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLModelEngine implements com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngine {
    private static final String PREDICTOR_PREFIX = "PREDICTOR";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExecutorService mMLModleThread;
    private ConcurrentHashMap<String, IPredictor> predictorMap;

    private void unRegisterHandler() {
    }

    public MLModelEngine(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e800869f33f3573cdb5add96f2cfea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e800869f33f3573cdb5add96f2cfea");
            return;
        }
        this.predictorMap = new ConcurrentHashMap<>();
        this.mMLModleThread = Executors.newSingleThreadExecutor();
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngine
    public void initPredictor(final AiBundle aiBundle, final IPredictorInitlizedListener iPredictorInitlizedListener) {
        Object[] objArr = {aiBundle, iPredictorInitlizedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efc4af1499c85b0056df948bf926de2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efc4af1499c85b0056df948bf926de2b");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "062a24887336447301e962d7cc71bea4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "062a24887336447301e962d7cc71bea4");
                    } else {
                        MLModelEngine.this.initializeModelPredictor(aiBundle, iPredictorInitlizedListener);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeModelPredictor(AiBundle aiBundle, final IPredictorInitlizedListener iPredictorInitlizedListener) {
        Object[] objArr = {aiBundle, iPredictorInitlizedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aae3a23d406a6855d43529938f4ceb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aae3a23d406a6855d43529938f4ceb5e");
            return;
        }
        final String predictorKey = getPredictorKey(aiBundle.getBundleName() + "@" + aiBundle.getBundleVersion());
        if (this.predictorMap.containsKey(predictorKey)) {
            postInitSuccess(iPredictorInitlizedListener);
        } else {
            ModelPredictorManager.getInstance().createPredictor(this.mMLModleThread, aiBundle, new IModelPredictorProducer.OnCreatePredictorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer.OnCreatePredictorListener
                public void onSuccess(@NonNull IPredictor iPredictor) {
                    Object[] objArr2 = {iPredictor};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "24ed4c993612284edc5627a0f40661a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "24ed4c993612284edc5627a0f40661a6");
                        return;
                    }
                    MLModelEngine.this.predictorMap.put(predictorKey, iPredictor);
                    MLModelEngine.this.postInitSuccess(iPredictorInitlizedListener);
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer.OnCreatePredictorListener
                public void onFailed(@Nullable BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "abf55020635e25f2597095df76a69af1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "abf55020635e25f2597095df76a69af1");
                    } else {
                        MLModelEngine.this.postInitFailed(iPredictorInitlizedListener, blueException);
                    }
                }
            });
        }
    }

    public static String getPredictorKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a832d78a275969e322c66b3ef75f3e29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a832d78a275969e322c66b3ef75f3e29");
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
            return "debugPREDICTOR_" + str.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
        }
        return "PREDICTOR_" + str.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngine
    public void runPrediction(@NonNull final MLContext mLContext, @NonNull final Map<String, JSONArray> map, @NonNull final List<TensorConfig.TensorConfigItem> list, @Nullable final List<TensorConfig.TensorConfigItem> list2, @NonNull final List<String> list3, @NonNull final ModelConfig modelConfig, @Nullable final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, map, list, list2, list3, modelConfig, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "712f0c098916a404b9ba4fa25d0284dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "712f0c098916a404b9ba4fa25d0284dd");
        } else if (isAlive()) {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "846bed34e8b5b433db0bbec870d4077e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "846bed34e8b5b433db0bbec870d4077e");
                    } else {
                        MLModelEngine.this.postPrediction(mLContext, map, list, list2, list3, modelConfig, iPredictionListener);
                    }
                }
            });
        } else {
            postPredictionFailed(new BlueException("Prediction thread not alive", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED), iPredictionListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postPrediction(@NonNull final MLContext mLContext, @NonNull final Map<String, JSONArray> map, @NonNull List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @NonNull List<String> list3, @NonNull ModelConfig modelConfig, @Nullable final IPredictionListener iPredictionListener) {
        Object[] objArr = {mLContext, map, list, list2, list3, modelConfig, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5db9b648f91502baef52ec4256e4498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5db9b648f91502baef52ec4256e4498");
            return;
        }
        IPredictor iPredictor = this.predictorMap.get(getPredictorKey(mLContext.aiBundle.getBundleName() + "@" + mLContext.aiBundle.getBundleVersion()));
        if (iPredictor == null) {
            if (iPredictionListener != null) {
                iPredictionListener.onFailed(new BlueException("predictor not created", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED));
                return;
            }
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        CatMonitorManager.getInstance().recordModelPredictStart(mLContext, modelConfig.getModelName(), modelConfig.getModelVersion(), mLContext.modelUniqueId, list3);
        final boolean isJsPredictor = isJsPredictor(mLContext.aiBundle);
        iPredictor.predict(mLContext, map, list, list2, mLContext.tensorInputStandardFeature, new IPredictionListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
            public void onSuccess(@Nullable Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aae82fe9f8e62a7e58e98fbc233b0cd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aae82fe9f8e62a7e58e98fbc233b0cd0");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (obj != null) {
                    if (isJsPredictor) {
                        CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 0, elapsedRealtime2, null, "0", JsonUtil.mapToJSONObject(map), obj);
                        MLModelEngine.this.postWholePredictionResult(obj, iPredictionListener, null, "0");
                        return;
                    } else if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        JSONArray optJSONArray = jSONObject.optJSONArray("inputAiTensor");
                        if ("NO_ERROR".equals(jSONObject.optString("errCode"))) {
                            CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 0, elapsedRealtime2, null, "0", optJSONArray, obj);
                            MLModelEngine.this.postWholePredictionResult(obj, iPredictionListener, null, "0");
                            return;
                        }
                        String optString = jSONObject.optString("errCode");
                        CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 1, elapsedRealtime2, optString, "-1", optJSONArray, obj);
                        MLModelEngine.this.postWholePredictionResult(obj, iPredictionListener, optString, "-1");
                        return;
                    } else {
                        CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 1, elapsedRealtime2, "predict result is not legal json", BaseRaptorUploader.ERROR_INVALID_TENSOR_OUTPUT, null, obj);
                        MLModelEngine.this.postWholePredictionResult(obj, iPredictionListener, "predict result is not legal json", BaseRaptorUploader.ERROR_INVALID_TENSOR_OUTPUT);
                        return;
                    }
                }
                CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 1, elapsedRealtime2, "predict result is null", BaseRaptorUploader.ERROR_ENPTY_TENSOR_OUTPUT, null, obj);
                MLModelEngine.this.postWholePredictionResult(obj, iPredictionListener, "predict result is null", BaseRaptorUploader.ERROR_ENPTY_TENSOR_OUTPUT);
            }

            @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener
            public void onFailed(@Nullable BlueException blueException) {
                String str;
                Object[] objArr2 = {blueException};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e4a59318a69db4119a4f579571e3e50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e4a59318a69db4119a4f579571e3e50");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                String str2 = "error message is empty";
                if (blueException != null) {
                    str2 = blueException.getMessage();
                    str = blueException.getErrorCode();
                } else {
                    str = "-1";
                }
                CatMonitorManager.getInstance().recordModelPredictFinish(mLContext, 1, elapsedRealtime2, str2, str, null, null);
                MLModelEngine.this.postWholePredictionResult(null, iPredictionListener, str2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postWholePredictionResult(final Object obj, final IPredictionListener iPredictionListener, final String str, final String str2) {
        Object[] objArr = {obj, iPredictionListener, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ee10a20422d540d2ff6f408e6977eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ee10a20422d540d2ff6f408e6977eb3");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "396f534b3e5bb8462a06c75c7eafc1ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "396f534b3e5bb8462a06c75c7eafc1ea");
                    } else if (!TextUtils.equals("0", str2)) {
                        iPredictionListener.onFailed(new BlueException(str, str2));
                    } else {
                        iPredictionListener.onSuccess(obj);
                    }
                }
            });
        }
    }

    private void postPredictionFailed(final BlueException blueException, final IPredictionListener iPredictionListener) {
        Object[] objArr = {blueException, iPredictionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f6545d1776954a1786d2fae1c105ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f6545d1776954a1786d2fae1c105ec8");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "96474a1d6e3b5f328a3b29aaaa26d800", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "96474a1d6e3b5f328a3b29aaaa26d800");
                    } else {
                        iPredictionListener.onFailed(blueException);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postInitSuccess(final IPredictorInitlizedListener iPredictorInitlizedListener) {
        Object[] objArr = {iPredictorInitlizedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f3aa93852bc31f5df0379a9c34713ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f3aa93852bc31f5df0379a9c34713ff");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e84dd1b1d37ebf2c2ae6e8bd048e068", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e84dd1b1d37ebf2c2ae6e8bd048e068");
                    } else {
                        iPredictorInitlizedListener.onSuccess();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postInitFailed(final IPredictorInitlizedListener iPredictorInitlizedListener, final BlueException blueException) {
        Object[] objArr = {iPredictorInitlizedListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55ac4bb0cac06602d687893364cebfe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55ac4bb0cac06602d687893364cebfe6");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8c66db9bd33c34cbaadae21fc3fc638", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8c66db9bd33c34cbaadae21fc3fc638");
                    } else {
                        iPredictorInitlizedListener.onFailed(blueException);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngine
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4315e2231d047f970d6aef73fe713e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4315e2231d047f970d6aef73fe713e0");
        } else {
            this.mMLModleThread.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.task.MLModelEngine.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7bc797afac692332e383cc3bb6c88263", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7bc797afac692332e383cc3bb6c88263");
                        return;
                    }
                    try {
                        MLModelEngine.this.destroyPredictors();
                    } catch (Exception e) {
                        new StringBuilder("destroy | ").append(e.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyPredictors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9e41200da28112d33bb8d004f6465c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9e41200da28112d33bb8d004f6465c5");
            return;
        }
        new StringBuilder("MLModelEngine | destroy ").append(this);
        AiThread.checkThread();
        if (AppEnvironment.develop()) {
            unRegisterHandler();
        }
        for (String str : this.predictorMap.keySet()) {
            this.predictorMap.get(str).release();
        }
        this.predictorMap.clear();
        if (this.mMLModleThread != null) {
            this.mMLModleThread.shutdown();
            this.mMLModleThread = null;
        }
    }

    private synchronized boolean isAlive() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9ed21d4ffee6bafedae8000d2b4c862", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9ed21d4ffee6bafedae8000d2b4c862")).booleanValue();
        }
        return (this.mMLModleThread == null || this.mMLModleThread.isTerminated() || this.mMLModleThread.isShutdown()) ? false : true;
    }

    public boolean isJsPredictor(@NonNull AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e61b0e46216d427f71edf1141ca566", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e61b0e46216d427f71edf1141ca566")).booleanValue();
        }
        if (aiBundle == null || aiBundle.getCachedBundle() == null) {
            return false;
        }
        return this.predictorMap.get(getPredictorKey(aiBundle.getBundleName() + "@" + aiBundle.getBundleVersion())) instanceof ModelPredictorProducerXGB.XGBPredictor;
    }

    public void removeMLModelPredictor(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9bfeba362df6d5e29a2bb53ed013d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9bfeba362df6d5e29a2bb53ed013d43");
            return;
        }
        String predictorKey = getPredictorKey(str + "@" + str2);
        if (this.predictorMap.containsKey(predictorKey)) {
            this.predictorMap.remove(predictorKey);
        }
    }

    public void clearMLModelPredictorCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c038f3c85548d5eadcece12e68ce9042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c038f3c85548d5eadcece12e68ce9042");
        } else {
            this.predictorMap.clear();
        }
    }
}
