package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.ModelConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface MLModelEngine {
    void destroy();

    void initPredictor(AiBundle aiBundle, IPredictorInitlizedListener iPredictorInitlizedListener);

    void runPrediction(@NonNull MLContext mLContext, @NonNull Map<String, JSONArray> map, @NonNull List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @NonNull List<String> list3, @NonNull ModelConfig modelConfig, @Nullable IPredictionListener iPredictionListener);
}
