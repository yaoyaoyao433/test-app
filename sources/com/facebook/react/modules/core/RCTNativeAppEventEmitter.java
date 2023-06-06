package com.facebook.react.modules.core;

import android.support.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptModule;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public interface RCTNativeAppEventEmitter extends JavaScriptModule {
    void emit(String str, @Nullable Object obj);
}
