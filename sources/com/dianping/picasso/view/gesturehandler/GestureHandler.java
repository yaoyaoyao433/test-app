package com.dianping.picasso.view.gesturehandler;

import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class GestureHandler {
    protected static final int GESTURE_ACTIVE = 1;
    protected static final int GESTURE_BEGIN = 0;
    protected static final int GESTURE_END = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean handle(MotionEvent motionEvent) {
        return false;
    }

    public boolean handle(MotionEvent motionEvent, int i) {
        return false;
    }

    public boolean handlePan(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        return false;
    }
}
