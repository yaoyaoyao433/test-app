package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class Countable {
    @DoNotStrip
    private long mInstance = 0;

    public native void dispose();

    static {
        k.b("fb");
    }

    protected void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
