package com.meituan.mmp.lib.embeddedwidget;

import android.view.MotionEvent;
import android.view.Surface;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface d extends c {
    void a();

    void a(Surface surface, int i, int i2);

    void b(boolean z);

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    void setSurface(Surface surface);
}
