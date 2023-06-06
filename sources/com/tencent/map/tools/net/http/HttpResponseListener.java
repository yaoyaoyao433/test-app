package com.tencent.map.tools.net.http;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface HttpResponseListener<T> {
    void onFailure(int i, String str, Throwable th);

    void onSuccess(int i, T t);
}
