package com.meituan.android.common.weaver.interfaces.tracer;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EmptyTracer implements ITracer {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.tracer.ITracer
    public void beginSection(@NonNull String str) {
    }

    @Override // com.meituan.android.common.weaver.interfaces.tracer.ITracer
    public void endSection() {
    }

    @Override // com.meituan.android.common.weaver.interfaces.tracer.ITracer
    public void endSection(@NonNull Map<String, Object> map) {
    }

    @Override // com.meituan.android.common.weaver.interfaces.tracer.ITracer
    public void setCounter(@NonNull String str, long j) {
    }

    @Override // com.meituan.android.common.weaver.interfaces.tracer.ITracer
    public void traceInstant(@NonNull String str) {
    }
}
