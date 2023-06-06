package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CallInvokerHolderImpl implements CallInvokerHolder {
    private static volatile boolean a;
    private final HybridData mHybridData;

    private CallInvokerHolderImpl(HybridData hybridData) {
        a();
        this.mHybridData = hybridData;
    }

    private static synchronized void a() {
        synchronized (CallInvokerHolderImpl.class) {
            if (!a) {
                k.b("turbomodulejsijni");
                a = true;
            }
        }
    }
}
