package com.github.chrisbanes.xdphotoview;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    final ScaleGestureDetector a;
    boolean b;
    c c;
    private int d = -1;
    private int e = 0;
    private VelocityTracker f;
    private float g;
    private float h;
    private final float i;
    private final float j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i = viewConfiguration.getScaledTouchSlop();
        this.c = cVar;
        this.a = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.github.chrisbanes.xdphotoview.b.1
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                b.this.c.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.e);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.e);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        try {
            this.a.onTouchEvent(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 6) {
                switch (action) {
                    case 0:
                        this.d = motionEvent.getPointerId(0);
                        this.f = VelocityTracker.obtain();
                        if (this.f != null) {
                            this.f.addMovement(motionEvent);
                        }
                        this.g = b(motionEvent);
                        this.h = c(motionEvent);
                        this.b = false;
                        break;
                    case 1:
                        this.d = -1;
                        if (this.b && this.f != null) {
                            this.g = b(motionEvent);
                            this.h = c(motionEvent);
                            this.f.addMovement(motionEvent);
                            this.f.computeCurrentVelocity(1000);
                            float xVelocity = this.f.getXVelocity();
                            float yVelocity = this.f.getYVelocity();
                            if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.j) {
                                this.c.a(this.g, this.h, -xVelocity, -yVelocity);
                            }
                        }
                        if (this.f != null) {
                            this.f.recycle();
                            this.f = null;
                            break;
                        }
                        break;
                    case 2:
                        float b = b(motionEvent);
                        float c = c(motionEvent);
                        float f = b - this.g;
                        float f2 = c - this.h;
                        if (!this.b) {
                            this.b = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.i);
                        }
                        if (this.b) {
                            this.c.a(f, f2);
                            this.g = b;
                            this.h = c;
                            if (this.f != null) {
                                this.f.addMovement(motionEvent);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.d = -1;
                        if (this.f != null) {
                            this.f.recycle();
                            this.f = null;
                            break;
                        }
                        break;
                }
            } else {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (motionEvent.getPointerId(action2) == this.d) {
                    int i = action2 == 0 ? 1 : 0;
                    this.d = motionEvent.getPointerId(i);
                    this.g = motionEvent.getX(i);
                    this.h = motionEvent.getY(i);
                }
            }
            this.e = motionEvent.findPointerIndex(this.d != -1 ? this.d : 0);
            return true;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
