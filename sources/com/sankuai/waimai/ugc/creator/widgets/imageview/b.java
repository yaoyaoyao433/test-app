package com.sankuai.waimai.ugc.creator.widgets.imageview;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    boolean b;
    d c;
    private int d;
    private int e;
    private final ScaleGestureDetector f;
    private VelocityTracker g;
    private float h;
    private float i;
    private final float j;
    private final float k;

    public b(Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19418e6f7984228281b92f82ef0977c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19418e6f7984228281b92f82ef0977c8");
            return;
        }
        this.d = -1;
        this.e = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledTouchSlop();
        this.c = dVar;
        this.f = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.imageview.b.1
            public static ChangeQuickRedirect a;
            private float c;
            private float d = 0.0f;

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                Object[] objArr2 = {scaleGestureDetector};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61dfd1e4acf98c2cd3d2c156456beb0d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61dfd1e4acf98c2cd3d2c156456beb0d")).booleanValue();
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                if (scaleFactor >= 0.0f) {
                    b.this.c.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.c, scaleGestureDetector.getFocusY() - this.d);
                    this.c = scaleGestureDetector.getFocusX();
                    this.d = scaleGestureDetector.getFocusY();
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                Object[] objArr2 = {scaleGestureDetector};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "280d3421ac1fe675d932afcf793645ca", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "280d3421ac1fe675d932afcf793645ca")).booleanValue();
                }
                this.c = scaleGestureDetector.getFocusX();
                this.d = scaleGestureDetector.getFocusY();
                return true;
            }
        });
    }

    private float b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53b94885e26525359276293aa66eb88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53b94885e26525359276293aa66eb88")).floatValue();
        }
        try {
            return motionEvent.getX(this.e);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012d7e358010e2180c515f907a062467", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012d7e358010e2180c515f907a062467")).floatValue();
        }
        try {
            return motionEvent.getY(this.e);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56bcda52114677dc1337d4ae05e7442", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56bcda52114677dc1337d4ae05e7442")).booleanValue() : this.f.isInProgress();
    }

    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5e192b3e9b0190c9186ae78cdc870b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5e192b3e9b0190c9186ae78cdc870b")).booleanValue();
        }
        try {
            this.f.onTouchEvent(motionEvent);
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdd79e333854a4130dc27400353472b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdd79e333854a4130dc27400353472b8")).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action != 6) {
                switch (action) {
                    case 0:
                        this.d = motionEvent.getPointerId(0);
                        this.g = VelocityTracker.obtain();
                        if (this.g != null) {
                            this.g.addMovement(motionEvent);
                        }
                        this.h = b(motionEvent);
                        this.i = c(motionEvent);
                        this.b = false;
                        break;
                    case 1:
                        this.d = -1;
                        if (this.b && this.g != null) {
                            this.h = b(motionEvent);
                            this.i = c(motionEvent);
                            this.g.addMovement(motionEvent);
                            this.g.computeCurrentVelocity(1000);
                            float xVelocity = this.g.getXVelocity();
                            float yVelocity = this.g.getYVelocity();
                            if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.k) {
                                this.c.a(this.h, this.i, -xVelocity, -yVelocity);
                            }
                        }
                        if (this.g != null) {
                            this.g.recycle();
                            this.g = null;
                            break;
                        }
                        break;
                    case 2:
                        float b = b(motionEvent);
                        float c = c(motionEvent);
                        float f = b - this.h;
                        float f2 = c - this.i;
                        if (!this.b) {
                            this.b = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.j);
                        }
                        if (this.b) {
                            this.c.a(f, f2);
                            this.h = b;
                            this.i = c;
                            if (this.g != null) {
                                this.g.addMovement(motionEvent);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.d = -1;
                        if (this.g != null) {
                            this.g.recycle();
                            this.g = null;
                            break;
                        }
                        break;
                }
            } else {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (motionEvent.getPointerId(action2) == this.d) {
                    int i = action2 == 0 ? 1 : 0;
                    this.d = motionEvent.getPointerId(i);
                    this.h = motionEvent.getX(i);
                    this.i = motionEvent.getY(i);
                }
            }
            this.e = motionEvent.findPointerIndex(this.d != -1 ? this.d : 0);
            return true;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
