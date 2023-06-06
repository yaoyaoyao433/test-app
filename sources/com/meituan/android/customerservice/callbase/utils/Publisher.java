package com.meituan.android.customerservice.callbase.utils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface Publisher<T> {
    void addSubscriber(T t);

    void notify(String str, Object obj);

    void removeSubscriber(T t);
}
