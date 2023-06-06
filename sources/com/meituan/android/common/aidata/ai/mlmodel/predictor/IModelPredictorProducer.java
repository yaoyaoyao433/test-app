package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.base.IPredictor;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IModelPredictorProducer {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCreatePredictorListener {
        void onFailed(@Nullable BlueException blueException);

        void onSuccess(@NonNull IPredictor iPredictor);
    }

    void createPredictor(@NonNull AiBundle aiBundle, @Nullable OnCreatePredictorListener onCreatePredictorListener);

    @Nullable
    List<String> getSupportedType();
}
