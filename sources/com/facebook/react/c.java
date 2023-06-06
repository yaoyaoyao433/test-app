package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    final ReactApplicationContext a;
    final ReactInstanceManager b;
    final Map<String, ModuleHolder> c = new ConcurrentHashMap();

    public c(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        this.a = reactApplicationContext;
        this.b = reactInstanceManager;
    }
}
