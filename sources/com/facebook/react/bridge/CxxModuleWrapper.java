package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        k.b(str);
        return makeDsoNative(k.c(str).getAbsolutePath(), str2);
    }
}
