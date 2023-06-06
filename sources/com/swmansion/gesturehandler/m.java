package com.swmansion.gesturehandler;

import android.view.MotionEvent;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    long a;
    long b;
    double c;
    double d;
    public float e;
    public float f;
    boolean g;
    int[] h = new int[2];
    a i;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        boolean a(m mVar);

        void b(m mVar);
    }

    public m(a aVar) {
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        this.b = this.a;
        this.a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.h[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        this.e = (x + x2) * 0.5f;
        this.f = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (Double.isNaN(this.c)) {
            this.d = 0.0d;
        } else {
            this.d = this.c - d;
        }
        this.c = d;
        if (this.d > 3.141592653589793d) {
            this.d -= 3.141592653589793d;
        } else if (this.d < -3.141592653589793d) {
            this.d += 3.141592653589793d;
        }
        if (this.d > 1.5707963267948966d) {
            this.d -= 3.141592653589793d;
        } else if (this.d < -1.5707963267948966d) {
            this.d += 3.141592653589793d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.g) {
            this.g = false;
            if (this.i != null) {
                this.i.b(this);
            }
        }
    }
}
