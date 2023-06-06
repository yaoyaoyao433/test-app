package com.meituan.metrics.fsp;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsFspLifeCycle {
    void callActivityOnCreate(Activity activity);

    void callActivityOnDestroy(Activity activity);

    void callActivityOnPause(Activity activity);

    void callActivityOnResume(Activity activity);

    void execStartActivity();

    void newActivity();
}
