package com.meituan.android.common.aidata.feature;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.entity.FeatureResult;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IFeatureListener {
    void onFailed(@Nullable Exception exc);

    void onSuccess(@Nullable FeatureResult featureResult);
}
