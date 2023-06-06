package com.meituan.metrics.sampler;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface RealTimeMonitor {
    void destroy();

    void onCpu(double d);

    void onFPS(double d);

    void onMemory(double d);
}
