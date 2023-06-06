package com.meituan.android.common.horn.extra.lifecycle;

import android.app.Application;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ILifecycleService {
    void register(@NonNull Application application, @NonNull ILifecycleListener iLifecycleListener);
}
