package com.meituan.android.common.aidata.ai;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IAiFeatureListener {
    void onFailed(@Nullable BlueException blueException);

    void onSuccess(@Nullable FeatureResult featureResult);
}
