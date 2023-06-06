package com.dianping.gcmrnmodule.wrapperviews.shadow;

import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNModuleNative {
    public static native void mrnmoduleYogaMarkNewLayout(long j, boolean z);

    public static native void mrnmoduleYogaMarkParent(long j, long j2);

    public static native void mrnmoduleYogaRemoveParent(long j);

    static {
        k.b("mrnmodule-jni");
    }
}
