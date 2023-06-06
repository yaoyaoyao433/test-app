package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface j<T extends View> {
    void setAnimated(T t, boolean z);

    void setAnimationType(T t, @Nullable String str);

    void setHardwareAccelerated(T t, boolean z);

    void setIdentifier(T t, int i);

    void setPresentationStyle(T t, @Nullable String str);

    void setStatusBarTranslucent(T t, boolean z);

    void setSupportedOrientations(T t, @Nullable ReadableArray readableArray);

    void setTransparent(T t, boolean z);
}
