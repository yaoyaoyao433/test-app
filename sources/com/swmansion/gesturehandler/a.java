package com.swmansion.gesturehandler;

import android.os.Handler;
import android.view.MotionEvent;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends b<a> {
    private float w;
    private float x;
    private Handler y;
    private int z;
    private long u = 800;
    private long v = 160;
    public int a = 1;
    public int b = 1;
    private final Runnable A = new Runnable() { // from class: com.swmansion.gesturehandler.a.1
        @Override // java.lang.Runnable
        public final void run() {
            a.this.c();
        }
    };

    private boolean c(MotionEvent motionEvent) {
        if (this.z == this.b) {
            if (((this.a & 1) == 0 || motionEvent.getRawX() - this.w <= ((float) this.v)) && (((this.a & 2) == 0 || this.w - motionEvent.getRawX() <= ((float) this.v)) && (((this.a & 4) == 0 || this.x - motionEvent.getRawY() <= ((float) this.v)) && ((this.a & 8) == 0 || motionEvent.getRawY() - this.x <= ((float) this.v))))) {
                return false;
            }
            this.y.removeCallbacksAndMessages(null);
            d();
            f();
            return true;
        }
        return false;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a() {
        if (this.y != null) {
            this.y.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b() {
        if (this.y != null) {
            this.y.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a(MotionEvent motionEvent) {
        int i = this.g;
        if (i == 0) {
            this.w = motionEvent.getRawX();
            this.x = motionEvent.getRawY();
            e();
            this.z = 1;
            if (this.y == null) {
                this.y = new Handler();
            } else {
                this.y.removeCallbacksAndMessages(null);
            }
            this.y.postDelayed(this.A, this.u);
        }
        if (i == 2) {
            c(motionEvent);
            if (motionEvent.getPointerCount() > this.z) {
                this.z = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() != 1 || c(motionEvent)) {
                return;
            }
            c();
        }
    }
}
