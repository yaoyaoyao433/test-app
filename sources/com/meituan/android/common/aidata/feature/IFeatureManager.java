package com.meituan.android.common.aidata.feature;

import android.support.annotation.NonNull;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IFeatureManager {
    Map<String, List<ResultRow>> getFeature(@NonNull MLContext mLContext, GetFeatureRequest getFeatureRequest, boolean z, int i, int i2, boolean z2);

    @Deprecated
    void getFeature(@NonNull MLContext mLContext, List<GetFeatureRequest> list, IFeatureListener iFeatureListener, int i);

    void removeFeature(UpdateFeatureRequest updateFeatureRequest);

    void replaceFeature(UpdateFeatureRequest updateFeatureRequest);

    void updateFeature(UpdateFeatureRequest updateFeatureRequest);
}
