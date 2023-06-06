package com.meituan.android.common.babel;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.meituan.android.common.kitefly.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IDesensitizer {
    @WorkerThread
    void desensitize(@NonNull Log log);
}
