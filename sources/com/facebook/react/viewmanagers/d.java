package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface d<T extends View> {
    void setColors(T t, @Nullable ReadableArray readableArray);

    void setEnabled(T t, boolean z);

    void setProgressBackgroundColor(T t, @Nullable Integer num);

    void setProgressViewOffset(T t, float f);

    void setRefreshing(T t, boolean z);

    void setSize(T t, int i);
}
