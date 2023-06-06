package com.meituan.android.common.aidata.async.tasks;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface TaskAsyncCallable<K, V> {
    void asyncCall(DependencyTask<K, V> dependencyTask, TaskAsyncNotifier<V> taskAsyncNotifier, long j, boolean z);
}
