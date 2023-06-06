package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;
import com.facebook.infer.annotation.ThreadConfined;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface UIManager extends JSIModule, PerformanceCounter {
    @UiThread
    @ThreadConfined(ThreadConfined.UI)
    <T extends View> int addRootView(T t, WritableMap writableMap, @Nullable String str);

    void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray);

    void dispatchCommand(int i, String str, @Nullable ReadableArray readableArray);

    <T> T getEventDispatcher();

    void sendAccessibilityEvent(int i, int i2);

    @UiThread
    @ThreadConfined(ThreadConfined.UI)
    void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap);

    @UiThread
    @ThreadConfined(ThreadConfined.UI)
    void updateRootLayoutSpecs(int i, int i2, int i3);
}
