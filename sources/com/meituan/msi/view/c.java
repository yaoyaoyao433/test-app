package com.meituan.msi.view;

import android.view.MotionEvent;
import android.view.Surface;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {
    void a(Surface surface, int i, int i2);

    void d();

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    Object getSlWidget();

    void setSLWidget(Object obj);

    void setSurface(Surface surface);
}
