package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPredictionListener {
    void onFailed(@Nullable BlueException blueException);

    void onSuccess(@Nullable Object obj);
}
