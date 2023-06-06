package com.meituan.msc.viewmanagers;

import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b<T extends View> {
    void setAnimationType(T t, @Nullable String str);

    void setHardwareAccelerated(T t, boolean z);

    void setStatusBarTranslucent(T t, boolean z);

    void setTransparent(T t, boolean z);
}
