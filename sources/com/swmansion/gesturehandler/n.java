package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class n extends b<n> {
    public m a;
    public double b;
    public double u;
    private m.a v = new m.a() { // from class: com.swmansion.gesturehandler.n.1
        @Override // com.swmansion.gesturehandler.m.a
        public final boolean a(m mVar) {
            double d = n.this.b;
            n.this.b += mVar.d;
            long j = mVar.a - mVar.b;
            if (j > 0) {
                n.this.u = (n.this.b - d) / j;
            }
            if (Math.abs(n.this.b) < 0.08726646259971647d || n.this.g != 2) {
                return true;
            }
            n.this.d();
            return true;
        }

        @Override // com.swmansion.gesturehandler.m.a
        public final void b(m mVar) {
            n.this.f();
        }
    };

    public n() {
        this.m = false;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b() {
        this.a = null;
        this.u = 0.0d;
        this.b = 0.0d;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a(MotionEvent motionEvent) {
        int pointerId;
        int i = this.g;
        if (i == 0) {
            this.u = 0.0d;
            this.b = 0.0d;
            this.a = new m(this.v);
            e();
        }
        if (this.a != null) {
            m mVar = this.a;
            switch (motionEvent.getActionMasked()) {
                case 0:
                    mVar.g = false;
                    mVar.h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    mVar.h[1] = -1;
                    break;
                case 1:
                    mVar.a();
                    break;
                case 2:
                    if (mVar.g) {
                        mVar.a(motionEvent);
                        if (mVar.i != null) {
                            mVar.i.a(mVar);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (!mVar.g) {
                        mVar.h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                        mVar.g = true;
                        mVar.b = motionEvent.getEventTime();
                        mVar.c = Double.NaN;
                        mVar.a(motionEvent);
                        m.a aVar = mVar.i;
                        break;
                    }
                    break;
                case 6:
                    if (mVar.g && ((pointerId = motionEvent.getPointerId(motionEvent.getActionIndex())) == mVar.h[0] || pointerId == mVar.h[1])) {
                        mVar.a();
                        break;
                    }
                    break;
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            if (i == 4) {
                f();
            } else {
                c();
            }
        }
    }
}
