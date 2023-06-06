package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.RegisterManager;
import com.meituan.android.common.aidata.ai.base.AbsStringRegisteredHolder;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.PredictorTypeNotFoundException;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ModelPredictorManager {
    private static final String TAG = "ModelPredictorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ModelPredictorManager sInstance;
    private RegisterManager<String, PredictorProducerHolder> mHolderSet;

    public ModelPredictorManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0309ec824f051b23c1b34e9ec994dbfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0309ec824f051b23c1b34e9ec994dbfc");
        } else {
            this.mHolderSet = new RegisterManager<>();
        }
    }

    public static ModelPredictorManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "547f37c463cdbab7d82737300b25d5cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModelPredictorManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "547f37c463cdbab7d82737300b25d5cf");
        }
        if (sInstance == null) {
            synchronized (ModelPredictorManager.class) {
                if (sInstance == null) {
                    sInstance = new ModelPredictorManager();
                }
            }
        }
        return sInstance;
    }

    public synchronized void registerModelPredictorProducer(@NonNull IModelPredictorProducer iModelPredictorProducer) {
        Object[] objArr = {iModelPredictorProducer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c0cf348ce04c5f94aa443a130e1920e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c0cf348ce04c5f94aa443a130e1920e");
        } else {
            this.mHolderSet.register(new PredictorProducerHolder(iModelPredictorProducer));
        }
    }

    public synchronized void createPredictor(@NonNull final ExecutorService executorService, @Nullable final AiBundle aiBundle, @Nullable final IModelPredictorProducer.OnCreatePredictorListener onCreatePredictorListener) {
        Object[] objArr = {executorService, aiBundle, onCreatePredictorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaf03d996bde25d6c2e2b3e058261dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaf03d996bde25d6c2e2b3e058261dd7");
            return;
        }
        if (aiBundle != null && aiBundle.getModelConfig() != null && !TextUtils.isEmpty(aiBundle.getModelConfig().getModelFileType())) {
            String modelFileType = aiBundle.getModelConfig().getModelFileType();
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append("createPredictor(): bundle = ");
            sb.append(getBundleName(aiBundle));
            sb.append(", modelFileType = ");
            sb.append(modelFileType);
            PredictorProducerHolder predictorProducerHolder = this.mHolderSet.get(modelFileType);
            if (predictorProducerHolder != null) {
                predictorProducerHolder.getValue().createPredictor(aiBundle, new IModelPredictorProducer.OnCreatePredictorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.ModelPredictorManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer.OnCreatePredictorListener
                    public void onSuccess(@NonNull IPredictor iPredictor) {
                        Object[] objArr2 = {iPredictor};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55624413ff83f941f32315ee2524ad4d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55624413ff83f941f32315ee2524ad4d");
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ModelPredictorManager.TAG);
                        sb2.append(" createPredictor(): success, bundle = ");
                        sb2.append(ModelPredictorManager.this.getBundleName(aiBundle));
                        ModelPredictorManager.this.notifySuccess(executorService, onCreatePredictorListener, iPredictor);
                    }

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.IModelPredictorProducer.OnCreatePredictorListener
                    public void onFailed(@Nullable BlueException blueException) {
                        Object[] objArr2 = {blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d5a37488c23901278284afa35810428", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d5a37488c23901278284afa35810428");
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ModelPredictorManager.TAG);
                        sb2.append(" createPredictor(): failed, bundle = ");
                        sb2.append(ModelPredictorManager.this.getBundleName(aiBundle));
                        sb2.append(", e = ");
                        sb2.append(AiFeatureUtil.exceptionToString(blueException));
                        ModelPredictorManager.this.notifyFailed(executorService, onCreatePredictorListener, blueException);
                    }
                });
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(TAG);
                sb2.append(" createPredictor(): failed, bundle = ");
                sb2.append(getBundleName(aiBundle));
                sb2.append(", predictor producer not found");
                notifyFailed(executorService, onCreatePredictorListener, new PredictorTypeNotFoundException(modelFileType, "predictor producer not found", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED));
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(TAG);
            sb3.append("createPredictor(): failed, bundle = ");
            sb3.append(getBundleName(aiBundle));
            sb3.append(", bundle has no modelFileType ");
            notifyFailed(executorService, onCreatePredictorListener, new PredictorTypeNotFoundException("bundle has no modelFileType", BaseRaptorUploader.ERROR_MODEL_PREDICT_FAILED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBundleName(@Nullable AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a58677816c8ff07b95a9e4b153e9b5e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a58677816c8ff07b95a9e4b153e9b5e1") : aiBundle == null ? StringUtil.NULL : aiBundle.getBundleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySuccess(@NonNull ExecutorService executorService, @Nullable final IModelPredictorProducer.OnCreatePredictorListener onCreatePredictorListener, @NonNull final IPredictor iPredictor) {
        Object[] objArr = {executorService, onCreatePredictorListener, iPredictor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a827584daf182c35cae09a5dbcf81f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a827584daf182c35cae09a5dbcf81f42");
        } else if (onCreatePredictorListener == null || executorService == null) {
        } else {
            executorService.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.ModelPredictorManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a353d94401b2a421d0fd4701c54d86fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a353d94401b2a421d0fd4701c54d86fd");
                    } else {
                        onCreatePredictorListener.onSuccess(iPredictor);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(@NonNull ExecutorService executorService, @Nullable final IModelPredictorProducer.OnCreatePredictorListener onCreatePredictorListener, @Nullable final BlueException blueException) {
        Object[] objArr = {executorService, onCreatePredictorListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5b8dd6134fb2d59b73541d8681ae214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5b8dd6134fb2d59b73541d8681ae214");
        } else if (onCreatePredictorListener == null || executorService == null) {
        } else {
            executorService.submit(new Runnable() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.ModelPredictorManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e6f7027547a9c1e943c0de475ddd0e86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e6f7027547a9c1e943c0de475ddd0e86");
                    } else {
                        onCreatePredictorListener.onFailed(blueException);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PredictorProducerHolder extends AbsStringRegisteredHolder<IModelPredictorProducer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.aidata.ai.base.AbsStringRegisteredHolder, com.meituan.android.common.aidata.ai.base.IRegisteredMember
        public boolean isAllowed(String str) {
            List<String> supportedType;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65c91621ef9e89ba1ee3c0e2a0e26974", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65c91621ef9e89ba1ee3c0e2a0e26974")).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (supportedType = getValue().getSupportedType()) != null) {
                for (String str2 : supportedType) {
                    if (str2 != null && TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public PredictorProducerHolder(@NonNull IModelPredictorProducer iModelPredictorProducer) {
            super("", iModelPredictorProducer);
            Object[] objArr = {iModelPredictorProducer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a10ed90a39395e97a6adba3585db877f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a10ed90a39395e97a6adba3585db877f");
            }
        }
    }
}
