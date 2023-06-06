package uk.co.senab.photoview.gestures;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
/* compiled from: ProGuard */
@TargetApi(8)
/* loaded from: classes7.dex */
public final class c extends b {
    protected final ScaleGestureDetector f;

    public c(Context context) {
        super(context);
        this.f = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: uk.co.senab.photoview.gestures.c.1
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
                c.this.a.b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    @Override // uk.co.senab.photoview.gestures.a, uk.co.senab.photoview.gestures.d
    public final boolean a() {
        return this.f.isInProgress();
    }

    @Override // uk.co.senab.photoview.gestures.b, uk.co.senab.photoview.gestures.a, uk.co.senab.photoview.gestures.d
    public final boolean c(MotionEvent motionEvent) {
        this.f.onTouchEvent(motionEvent);
        return super.c(motionEvent);
    }
}
