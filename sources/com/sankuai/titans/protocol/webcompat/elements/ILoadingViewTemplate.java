package com.sankuai.titans.protocol.webcompat.elements;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ILoadingViewTemplate {
    View getLoadingView(boolean z, @Nullable LayoutInflater layoutInflater);

    long getShowDuration();

    View inflateLoadingView(@NonNull LayoutInflater layoutInflater);

    boolean isFullscreen();

    void onDismiss();
}
