package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.g;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> mTaskApiCall;
    private final g<TResult> mTaskCompletionSource;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, g<TResult> gVar) {
        super(1);
        this.mTaskApiCall = taskApiCall;
        this.mTaskCompletionSource = gVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.mTaskApiCall;
    }

    public g<TResult> getTaskCompletionSource() {
        return this.mTaskCompletionSource;
    }
}
