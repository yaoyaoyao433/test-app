package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface f<T extends View> {
    void setDisabled(T t, boolean z);

    void setEnabled(T t, boolean z);

    void setOn(T t, boolean z);

    void setThumbColor(T t, @Nullable Integer num);

    void setThumbTintColor(T t, @Nullable Integer num);

    void setTrackColorForFalse(T t, @Nullable Integer num);

    void setTrackColorForTrue(T t, @Nullable Integer num);

    void setTrackTintColor(T t, @Nullable Integer num);

    void setValue(T t, boolean z);
}
