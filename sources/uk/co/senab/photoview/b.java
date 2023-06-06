package uk.co.senab.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b implements GestureDetector.OnDoubleTapListener {
    private d a;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF b;
        if (this.a == null) {
            return false;
        }
        ImageView c = this.a.c();
        if (this.a.j != null && (b = this.a.b()) != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (b.contains(x, y)) {
                this.a.j.a(c, (x - b.left) / b.width(), (y - b.top) / b.height());
                return true;
            }
        }
        if (this.a.k != null) {
            this.a.k.a(c, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        try {
            float d = this.a.d();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (d < this.a.d) {
                this.a.a(this.a.d, x, y, true);
            } else if (d >= this.a.d && d < this.a.e) {
                this.a.a(this.a.e, x, y, true);
            } else {
                this.a.a(this.a.c, x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }
}
