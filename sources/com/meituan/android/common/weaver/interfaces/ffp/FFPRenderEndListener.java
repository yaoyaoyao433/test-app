package com.meituan.android.common.weaver.interfaces.ffp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface FFPRenderEndListener {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IRenderEndEvent {
        @Nullable
        Activity activity();

        long endMs();

        @NonNull
        String finishResult();

        @NonNull
        String pageType();
    }

    void onFFPRenderEnd(@NonNull IRenderEndEvent iRenderEndEvent);
}
