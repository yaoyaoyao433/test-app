package com.facebook.react.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface h<T extends View> {
    void setInitialPage(T t, int i);

    void setKeyboardDismissMode(T t, @Nullable String str);

    void setPageMargin(T t, int i);

    void setPeekEnabled(T t, boolean z);

    void setScrollEnabled(T t, boolean z);
}
