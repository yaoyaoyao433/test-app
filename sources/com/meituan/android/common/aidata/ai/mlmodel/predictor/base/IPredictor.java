package com.meituan.android.common.aidata.ai.mlmodel.predictor.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPredictor {
    void predict(@NonNull MLContext mLContext, @NonNull Map<String, JSONArray> map, @Nullable List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, String str, @Nullable IPredictionListener iPredictionListener);

    void release();
}
