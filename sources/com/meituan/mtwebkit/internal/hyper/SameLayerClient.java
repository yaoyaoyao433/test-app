package com.meituan.mtwebkit.internal.hyper;

import android.graphics.Rect;
import android.support.annotation.Keep;
import android.view.MotionEvent;
import android.view.Surface;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface SameLayerClient {
    void onAttributesChanged(String str);

    void onCreate(String str);

    void onDestroy();

    void onRectChanged(Rect rect);

    void onSurfaceCreated(Surface surface);

    void onSurfaceDestroy(Surface surface);

    void onTouchEvent(MotionEvent motionEvent);

    void onVisibilityChanged(boolean z);
}
