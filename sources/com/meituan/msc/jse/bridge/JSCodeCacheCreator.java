package com.meituan.msc.jse.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class JSCodeCacheCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static native void jniCreateCodeCacheFromDioFile(String str, String str2, String str3, String str4);

    private static native void jniCreateCodeCacheFromFile(String str, String str2, String str3);

    static {
        ReactBridge.staticInit();
    }

    public static boolean createCodeCacheFromDioFile(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0db20d2ad9e2746ec70cbd3b348ad33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0db20d2ad9e2746ec70cbd3b348ad33")).booleanValue();
        }
        File file = new File(str4);
        file.getParentFile().mkdirs();
        jniCreateCodeCacheFromDioFile(str, str2, str3, str4);
        return file.exists();
    }

    public static boolean createCodeCacheFromFile(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08a216cd6f8ccb78771ed02d544147eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08a216cd6f8ccb78771ed02d544147eb")).booleanValue();
        }
        File file = new File(str3);
        file.getParentFile().mkdirs();
        jniCreateCodeCacheFromFile(str, str2, str3);
        return file.exists();
    }
}
