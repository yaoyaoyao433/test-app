package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class CpuCapabilitiesJni {
    @DoNotStrip
    public static native boolean nativeDeviceSupportsNeon();

    @DoNotStrip
    public static native boolean nativeDeviceSupportsVFPFP16();

    @DoNotStrip
    public static native boolean nativeDeviceSupportsX86();

    static {
        k.b("fb");
    }
}
