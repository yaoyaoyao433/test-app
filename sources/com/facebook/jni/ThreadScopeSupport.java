package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        k.b("fb");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
