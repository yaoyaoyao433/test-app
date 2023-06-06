package com.meituan.msc.common.aov_task.context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.common.aov_task.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface a {
    @NonNull
    f a();

    <T> T a(@NonNull com.meituan.msc.common.aov_task.task.c<T> cVar);

    <TaskResult> TaskResult a(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls);

    @Nullable
    com.meituan.msc.common.aov_task.task.c<?> b(Class<? extends com.meituan.msc.common.aov_task.task.c<?>> cls);
}
