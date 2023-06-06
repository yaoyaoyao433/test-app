package com.meituan.android.mrn.component.utils;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class YellowBox {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface RCTLog extends JavaScriptModule {
        void logIfNoNativeHook(String str, Object obj);
    }

    public static void a(ReactContext reactContext, String str) {
        Object[] objArr = {reactContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45a8761b9cff1b39aa5c1398a3794e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45a8761b9cff1b39aa5c1398a3794e07");
        } else if (reactContext != null) {
            try {
                ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook("warn", str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
