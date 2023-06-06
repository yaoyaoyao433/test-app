package com.meituan.android.common.aidata.feature.producer;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IFeatureProducerManager {
    Map<String, List<ResultRow>> produceFeature(ProduceRequest produceRequest);

    void produceFeature(ProduceRequest produceRequest, @Nullable IFeatureProducerListener iFeatureProducerListener);

    void registerFeatureProducer(IFeatureProducer iFeatureProducer);

    void unregisterFeatureProducer(IFeatureProducer iFeatureProducer);
}
