package com.facebook.react.uimanager.events;

import android.support.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public interface RCTEventEmitter extends JavaScriptModule {
    void receiveEvent(int i, String str, @Nullable WritableMap writableMap);

    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
