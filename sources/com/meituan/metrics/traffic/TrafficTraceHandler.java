package com.meituan.metrics.traffic;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface TrafficTraceHandler {
    void clearTraceStorage(String str);

    Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher);

    void initTraceFromStorage();

    void saveTraceToStorage();
}
