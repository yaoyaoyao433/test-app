package com.meituan.android.neohybrid.neo.http;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface a<T> {
    void onRequestFail(int i, Exception exc);

    void onRequestSucc(int i, T t);
}
