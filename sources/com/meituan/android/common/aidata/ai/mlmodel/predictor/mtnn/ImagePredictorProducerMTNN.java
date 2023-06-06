package com.meituan.android.common.aidata.ai.mlmodel.predictor.mtnn;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.ModelFileNotValidException;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.ModelTypeNotMatchedException;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.PredictorCreateException;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImagePredictorProducerMTNN implements IModelPredictorProducer {
    public static final String MODEL_FILE_TYPE_MTNN = "mtnn";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer
    @Nullable
    public List<String> getSupportedType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dde209e3daf0eddc17c1b2f04fbd3c3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dde209e3daf0eddc17c1b2f04fbd3c3e");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("mtnn");
        return arrayList;
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer
    public void createPredictor(@NonNull AiBundle aiBundle, @Nullable IModelPredictorProducer.OnCreatePredictorListener onCreatePredictorListener) {
        BlueException modelTypeNotMatchedException;
        boolean z = false;
        Object[] objArr = {aiBundle, onCreatePredictorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec22909dadc813ad95e5badd5db0db69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec22909dadc813ad95e5badd5db0db69");
            return;
        }
        boolean z2 = (aiBundle.getCachedBundle() == null || !aiBundle.getCachedBundle().isModelValid() || TextUtils.isEmpty(aiBundle.getCachedBundle().getModelFilePath())) ? false : true;
        String modelFileType = aiBundle.getModelConfig().getModelFileType();
        if (aiBundle.getModelConfig() != null && "mtnn".equals(modelFileType)) {
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
        AiDataMTNNPredictor aiDataMTNNPredictor = null;
        if (z2 && z) {
            try {
                AiDataMTNNPredictor aiDataMTNNPredictor2 = new AiDataMTNNPredictor(aiBundle.getCachedBundle().getModelFilePath());
                modelTypeNotMatchedException = null;
                aiDataMTNNPredictor = aiDataMTNNPredictor2;
            } catch (Throwable th) {
                PredictorCreateException predictorCreateException = new PredictorCreateException(str2, "predictor create failed, e = " + th.toString());
                predictorCreateException.setErrorCode("-1");
                modelTypeNotMatchedException = predictorCreateException;
            }
        } else if (!z2) {
            modelTypeNotMatchedException = new ModelFileNotValidException(str, "model file is not valid");
            modelTypeNotMatchedException.setErrorCode(BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT);
        } else {
            modelTypeNotMatchedException = new ModelTypeNotMatchedException(str2, "mtnn", "model type is not matched");
            modelTypeNotMatchedException.setErrorCode(BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT);
        }
        if (onCreatePredictorListener != null) {
            if (aiDataMTNNPredictor != null) {
                onCreatePredictorListener.onSuccess(aiDataMTNNPredictor);
            } else if (modelTypeNotMatchedException != null) {
                onCreatePredictorListener.onFailed(modelTypeNotMatchedException);
            } else {
                onCreatePredictorListener.onFailed(new BlueException("create tflite predictor failed, isModelFileValid = " + z2 + ", isModelTypeMatched = " + z, BaseRaptorUploader.ERROR_INVALID_TENSOR_INPUT));
            }
        }
    }
}
