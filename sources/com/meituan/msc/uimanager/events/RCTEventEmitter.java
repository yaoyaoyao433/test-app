package com.meituan.msc.uimanager.events;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface RCTEventEmitter extends JavaScriptModule {
    int getPageId();

    void receiveEvent(int i, int i2, String str, @Nullable WritableMap writableMap);

    void receiveEvent(int i, int i2, String str, @Nullable WritableMap writableMap, View view);

    void receiveTouches(int i, String str, WritableArray writableArray, WritableArray writableArray2, boolean z);
}
