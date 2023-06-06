package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface b<T extends View> {
    void setAnimating(T t, boolean z);

    void setColor(T t, @Nullable Integer num);

    void setIndeterminate(T t, boolean z);

    void setProgress(T t, double d);

    void setStyleAttr(T t, @Nullable String str);

    void setTestID(T t, @Nullable String str);

    void setTypeAttr(T t, @Nullable String str);
}
