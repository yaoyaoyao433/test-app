package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface m extends j {
    boolean dispatchTouchEvent(MotionEvent motionEvent);

    Context getContext();

    int getHeight();

    ViewParent getParent();

    int getWidth();

    void onSurfaceChanged(Object obj, int i, int i2);

    void setCustomMapStylePath(String str);

    void setMapCustomEnable(boolean z);

    void setOnDrawFrameCostListener(ab abVar);

    void setVisibility(int i);

    void setZoomMode(ac acVar);
}
