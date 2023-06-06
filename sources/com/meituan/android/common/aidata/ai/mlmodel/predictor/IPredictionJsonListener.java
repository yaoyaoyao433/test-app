package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPredictionJsonListener {
    void onFailed(@Nullable Exception exc);

    void onSuccess(@Nullable JSONObject jSONObject);
}
