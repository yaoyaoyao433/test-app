package com.meituan.msc.jse.bridge;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create(String str) throws Exception;

    void startSamplingProfiler();

    void stopSamplingProfiler(String str);
}
