package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create() throws Exception;

    void startSamplingProfiler();

    void stopSamplingProfiler(String str);
}
