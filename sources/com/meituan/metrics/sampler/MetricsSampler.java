package com.meituan.metrics.sampler;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsSampler {
    void doSample();

    double getRealTimeValue();

    void pageEnter(Activity activity);

    void pageExit(Activity activity);
}
