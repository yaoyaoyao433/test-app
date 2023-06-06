package com.dianping.picasso.rx;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface PicassoSubscriber<T> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(T t);
}
