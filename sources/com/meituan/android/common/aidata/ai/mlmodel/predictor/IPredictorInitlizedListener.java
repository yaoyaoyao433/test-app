package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPredictorInitlizedListener {
    void onFailed(BlueException blueException);

    void onSuccess();
}
