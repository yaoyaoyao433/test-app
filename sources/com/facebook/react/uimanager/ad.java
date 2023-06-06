package com.facebook.react.uimanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ad {
    @Nullable
    Bundle getAppProperties();

    int getHeightMeasureSpec();

    @Nullable
    String getInitialUITemplate();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    @Nullable
    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void onStage(int i);

    void runApplication();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
