package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k extends b<k> {
    public ScaleGestureDetector a;
    public double b;
    public double u;
    private float v;
    private float w;
    private ScaleGestureDetector.OnScaleGestureListener x = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.swmansion.gesturehandler.k.1
        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d = k.this.b;
            k.this.b *= scaleGestureDetector.getScaleFactor();
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                k.this.u = (k.this.b - d) / timeDelta;
            }
            if (Math.abs(k.this.v - scaleGestureDetector.getCurrentSpan()) < k.this.w || k.this.g != 2) {
                return true;
            }
            k.this.d();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            k.this.v = scaleGestureDetector.getCurrentSpan();
            return true;
        }
    };

    public k() {
        this.m = false;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b() {
        this.a = null;
        this.u = 0.0d;
        this.b = 1.0d;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a(MotionEvent motionEvent) {
        if (this.g == 0) {
            Context context = this.f.getContext();
            this.u = 0.0d;
            this.b = 1.0d;
            this.a = new ScaleGestureDetector(context, this.x);
            this.w = ViewConfiguration.get(context).getScaledTouchSlop();
            e();
        }
        if (this.a != null) {
            this.a.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (this.g == 4 && pointerCount < 2) {
            f();
        } else if (motionEvent.getActionMasked() == 1) {
            c();
        }
    }
}
