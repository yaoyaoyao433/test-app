package com.facebook.react.devsupport;

import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements com.facebook.react.devsupport.interfaces.b {
    private final DefaultNativeModuleCallExceptionHandler a = new DefaultNativeModuleCallExceptionHandler();

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public final void handleException(Exception exc) {
        com.facebook.common.logging.a.d("DisabledDevSupportManager", "Caught exception", exc);
        this.a.handleException(exc);
    }
}
