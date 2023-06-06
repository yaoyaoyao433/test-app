package com.swmansion.gesturehandler;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h extends b<h> {
    public boolean a;
    public boolean b;

    public h() {
        this.m = true;
    }

    @Override // com.swmansion.gesturehandler.b
    public final boolean b(b bVar) {
        return super.b(bVar);
    }

    @Override // com.swmansion.gesturehandler.b
    public final boolean d(b bVar) {
        if (bVar instanceof h) {
            h hVar = (h) bVar;
            if (hVar.g == 4 && hVar.b) {
                return false;
            }
        }
        boolean z = !this.b;
        int i = this.g;
        return !(i == 4 && bVar.g == 4 && z) && i == 4 && z;
    }

    @Override // com.swmansion.gesturehandler.b
    public final boolean e(b bVar) {
        return !this.b;
    }

    private static boolean a(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        this.f.onTouchEvent(obtain);
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a(MotionEvent motionEvent) {
        View view = this.f;
        int i = this.g;
        if (motionEvent.getActionMasked() == 1) {
            view.onTouchEvent(motionEvent);
            if ((i == 0 || i == 2) && view.isPressed()) {
                d();
            }
            f();
        } else if (i != 0 && i != 2) {
            if (i == 4) {
                view.onTouchEvent(motionEvent);
            }
        } else if (this.a) {
            a(view, motionEvent);
            view.onTouchEvent(motionEvent);
            d();
        } else if (a(view, motionEvent)) {
            view.onTouchEvent(motionEvent);
            d();
        } else if (i != 2) {
            e();
        }
    }
}
