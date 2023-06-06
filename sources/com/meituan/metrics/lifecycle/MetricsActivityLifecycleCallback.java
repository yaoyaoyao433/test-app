package com.meituan.metrics.lifecycle;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsActivityLifecycleCallback {
    void onActivityCreated(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivityStopped(Activity activity);
}
