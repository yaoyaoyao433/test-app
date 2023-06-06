package com.facebook.react.turbomodule.core;

import android.support.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.interfaces.a;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class TurboModuleManagerDelegate {
    private static volatile boolean a;
    private final HybridData mHybridData;

    protected abstract HybridData a();

    @Nullable
    public abstract a a(String str);

    protected TurboModuleManagerDelegate() {
        b();
        this.mHybridData = a();
    }

    private static synchronized void b() {
        synchronized (TurboModuleManagerDelegate.class) {
            if (!a) {
                k.b("turbomodulejsijni");
                a = true;
            }
        }
    }
}
