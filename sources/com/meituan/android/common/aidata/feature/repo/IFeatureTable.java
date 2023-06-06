package com.meituan.android.common.aidata.feature.repo;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.UpdateFeatureRequest;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IFeatureTable {
    void clearAll();

    Map<String, List<ResultRow>> getFeature(@Nullable GetFeatureRequest getFeatureRequest);

    void getFeature(@Nullable GetFeatureRequest getFeatureRequest, @Nullable IFeatureListener iFeatureListener);

    void getFeature(@Nullable List<GetFeatureRequest> list, @Nullable IFeatureListener iFeatureListener);

    String getTableName();

    void removeFeature(@Nullable UpdateFeatureRequest updateFeatureRequest);

    void replaceFeature(@Nullable UpdateFeatureRequest updateFeatureRequest);

    String updateFeature(@Nullable UpdateFeatureRequest updateFeatureRequest);
}
