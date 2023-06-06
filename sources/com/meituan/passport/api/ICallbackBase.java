package com.meituan.passport.api;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ICallbackBase<T> {
    void onFailed(Throwable th);

    void onSuccess(T t);
}
