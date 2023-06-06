package com.sankuai.waimai.platform.utils.cache.interfaces;

import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a<T> {
    @MainThread
    void a(@Nullable T t, @Nullable b<Boolean> bVar);

    @MainThread
    void cancel();
}
