package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JSInstance {
    void garbageCollect();

    long getMemoryUsage();

    void invokeCallback(int i, NativeArrayInterface nativeArrayInterface);
}
