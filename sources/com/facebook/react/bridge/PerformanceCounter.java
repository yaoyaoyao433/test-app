package com.facebook.react.bridge;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface PerformanceCounter {
    Map<String, Long> getPerformanceCounters();

    void profileNextBatch();
}
