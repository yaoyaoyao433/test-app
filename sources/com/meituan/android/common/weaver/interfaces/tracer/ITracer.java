package com.meituan.android.common.weaver.interfaces.tracer;

import android.support.annotation.NonNull;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ITracer {
    void beginSection(@NonNull String str);

    void endSection();

    void endSection(@NonNull Map<String, Object> map);

    void setCounter(@NonNull String str, long j);

    void traceInstant(@NonNull String str);
}
