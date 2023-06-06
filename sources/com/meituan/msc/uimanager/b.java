package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b<T extends View> {
    void a(T t, float f);

    void b(T t, float f);

    void c(T t, float f);

    void d(T t, float f);

    void e(T t, float f);

    void setAccessibilityActions(T t, @Nullable ReadableArray readableArray);

    void setAccessibilityHint(T t, @Nullable String str);

    void setAccessibilityLabel(T t, @Nullable String str);

    void setAccessibilityLiveRegion(T t, @Nullable String str);

    void setAccessibilityRole(T t, @Nullable String str);

    void setBackgroundColor(T t, int i);

    void setElevation(T t, float f);

    void setImportantForAccessibility(T t, @Nullable String str);

    void setNativeId(T t, @Nullable String str);

    void setOpacity(T t, float f);

    void setRenderToHardwareTexture(T t, boolean z);

    void setRotation(T t, float f);

    void setScaleX(T t, float f);

    void setScaleY(T t, float f);

    void setTestId(T t, String str);

    void setTransform(T t, @Nullable ReadableArray readableArray);

    void setTranslateX(T t, float f);

    void setTranslateY(T t, float f);

    void setViewState(T t, @Nullable ReadableMap readableMap);

    void setZIndex(T t, float f);
}
