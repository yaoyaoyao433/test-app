package com.facebook.react.views.scroll;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    float a;
    float b;
    @Nullable
    private VelocityTracker c;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.c == null) {
            this.c = VelocityTracker.obtain();
        }
        this.c.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.c.computeCurrentVelocity(1);
            this.a = this.c.getXVelocity();
            this.b = this.c.getYVelocity();
            if (this.c != null) {
                this.c.recycle();
                this.c = null;
            }
        }
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }
}
