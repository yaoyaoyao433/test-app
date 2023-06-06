package com.swmansion.gesturehandler;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends b<g> {
    private static float u = 10.0f;
    public long a = 500;
    public float b;
    private float v;
    private float w;
    private Handler x;

    public g(Context context) {
        this.m = true;
        this.b = u * context.getResources().getDisplayMetrics().density;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b(int i, int i2) {
        if (this.x != null) {
            this.x.removeCallbacksAndMessages(null);
            this.x = null;
        }
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a(MotionEvent motionEvent) {
        if (this.g == 0) {
            e();
            this.v = motionEvent.getRawX();
            this.w = motionEvent.getRawY();
            this.x = new Handler();
            if (this.a > 0) {
                this.x.postDelayed(new Runnable() { // from class: com.swmansion.gesturehandler.g.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.d();
                    }
                }, this.a);
            } else if (this.a == 0) {
                d();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.x != null) {
                this.x.removeCallbacksAndMessages(null);
                this.x = null;
            }
            if (this.g == 4) {
                f();
                return;
            } else {
                c();
                return;
            }
        }
        float rawX = motionEvent.getRawX() - this.v;
        float rawY = motionEvent.getRawY() - this.w;
        if ((rawX * rawX) + (rawY * rawY) > this.b) {
            if (this.g == 4) {
                cancel();
            } else {
                c();
            }
        }
    }
}
