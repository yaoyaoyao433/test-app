package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d {
    boolean a = false;
    s b;
    Callback c;
    int d;

    public abstract void a(long j);

    public void a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }
}
