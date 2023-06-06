package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReactSoftException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class an {
    public static ChangeQuickRedirect a;

    @Nullable
    public static com.meituan.msc.c a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6e809af152ccd96aa542d94e374ed15", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6e809af152ccd96aa542d94e374ed15") : reactContext.getUIManagerModule();
    }

    @Nullable
    private static com.meituan.msc.c a(ReactContext reactContext, boolean z) {
        Object[] objArr = {reactContext, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98a39d2bd9ffbb9d5e8047d5bad0ea0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98a39d2bd9ffbb9d5e8047d5bad0ea0d");
        }
        if (!reactContext.hasActiveCatalystInstance()) {
            ReactSoftException.logSoftException("UIManagerHelper", new com.meituan.msc.exception.b("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
        }
        return reactContext.getUIManagerModule();
    }

    @Nullable
    public static com.meituan.msc.uimanager.events.b a(ReactContext reactContext, int i) {
        Object[] objArr = {reactContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f74af9ee46f22c4b0dd892ff764c08b0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.uimanager.events.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f74af9ee46f22c4b0dd892ff764c08b0") : b(reactContext);
    }

    @Nullable
    private static com.meituan.msc.uimanager.events.b b(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f023bd039d1008c39ef3f51f26f6969d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.uimanager.events.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f023bd039d1008c39ef3f51f26f6969d");
        }
        com.meituan.msc.c a2 = a(reactContext, false);
        if (a2 == null) {
            return null;
        }
        return (com.meituan.msc.uimanager.events.b) a2.a();
    }
}
