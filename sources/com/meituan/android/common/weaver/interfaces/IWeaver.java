package com.meituan.android.common.weaver.interfaces;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IWeaver {
    @AnyThread
    <T> void registerListener(@NonNull T t, Class<T> cls);

    @AnyThread
    <T> void unregisterListener(@NonNull T t, Class<T> cls);

    @AnyThread
    void weave(@NonNull WeaverEvent weaverEvent);
}
