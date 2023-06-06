package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IOperatorProducer {
    @Nullable
    List<String> getSupportedOperatorNames();

    void operate(@NonNull Object obj, @NonNull OperatorConfig operatorConfig, @Nullable IInnerOperatorListener iInnerOperatorListener);
}
