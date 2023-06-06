package uk.co.senab.photoview.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a implements d {
    protected e a;
    float b;
    float c;
    final float d;
    final float e;
    private VelocityTracker f;
    private boolean g;

    @Override // uk.co.senab.photoview.gestures.d
    public boolean a() {
        return false;
    }

    @Override // uk.co.senab.photoview.gestures.d
    public final void a(e eVar) {
        this.a = eVar;
    }

    public a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledTouchSlop();
    }

    float a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    float b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    @Override // uk.co.senab.photoview.gestures.d
    public final boolean b() {
        return this.g;
    }

    @Override // uk.co.senab.photoview.gestures.d
    public boolean c(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f = VelocityTracker.obtain();
                if (this.f != null) {
                    this.f.addMovement(motionEvent);
                } else {
                    uk.co.senab.photoview.log.a.a();
                }
                this.b = a(motionEvent);
                this.c = b(motionEvent);
                this.g = false;
                break;
            case 1:
                if (this.g && this.f != null) {
                    this.b = a(motionEvent);
                    this.c = b(motionEvent);
                    this.f.addMovement(motionEvent);
                    this.f.computeCurrentVelocity(1000);
                    float xVelocity = this.f.getXVelocity();
                    float yVelocity = this.f.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.e) {
                        this.a.a(this.b, this.c, -xVelocity, -yVelocity);
                    }
                }
                if (this.f != null) {
                    this.f.recycle();
                    this.f = null;
                    break;
                }
                break;
            case 2:
                float a = a(motionEvent);
                float b = b(motionEvent);
                float f = a - this.b;
                float f2 = b - this.c;
                if (!this.g) {
                    this.g = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.d);
                }
                if (this.g) {
                    this.a.a(f, f2);
                    this.b = a;
                    this.c = b;
                    if (this.f != null) {
                        this.f.addMovement(motionEvent);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f != null) {
                    this.f.recycle();
                    this.f = null;
                    break;
                }
                break;
        }
        return true;
    }
}
