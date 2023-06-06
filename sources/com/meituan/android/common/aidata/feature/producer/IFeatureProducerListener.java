package com.meituan.android.common.aidata.feature.producer;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IFeatureProducerListener {
    void onFailed(@Nullable BlueException blueException);

    void onSuccess(@Nullable Map<String, List<ResultRow>> map);
}
