package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o {
    public final a<PointF, PointF> a;
    public final a<?, PointF> b;
    public final a<com.airbnb.lottie.value.d, com.airbnb.lottie.value.d> c;
    public final a<Float, Float> d;
    public final a<Integer, Integer> e;
    @Nullable
    public final a<?, Float> f;
    @Nullable
    public final a<?, Float> g;
    private final Matrix h = new Matrix();

    public o(com.airbnb.lottie.model.animatable.l lVar) {
        this.a = lVar.a.a();
        this.b = lVar.b.a();
        this.c = lVar.c.a();
        this.d = lVar.d.a();
        this.e = lVar.e.a();
        if (lVar.f != null) {
            this.f = lVar.f.a();
        } else {
            this.f = null;
        }
        if (lVar.g != null) {
            this.g = lVar.g.a();
        } else {
            this.g = null;
        }
    }

    public final void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.a(this.a);
        aVar.a(this.b);
        aVar.a(this.c);
        aVar.a(this.d);
        aVar.a(this.e);
        if (this.f != null) {
            aVar.a(this.f);
        }
        if (this.g != null) {
            aVar.a(this.g);
        }
    }

    public final void a(a.InterfaceC0016a interfaceC0016a) {
        this.a.a(interfaceC0016a);
        this.b.a(interfaceC0016a);
        this.c.a(interfaceC0016a);
        this.d.a(interfaceC0016a);
        this.e.a(interfaceC0016a);
        if (this.f != null) {
            this.f.a(interfaceC0016a);
        }
        if (this.g != null) {
            this.g.a(interfaceC0016a);
        }
    }

    public final Matrix a() {
        this.h.reset();
        PointF d = this.b.d();
        if (d.x != 0.0f || d.y != 0.0f) {
            this.h.preTranslate(d.x, d.y);
        }
        float floatValue = this.d.d().floatValue();
        if (floatValue != 0.0f) {
            this.h.preRotate(floatValue);
        }
        com.airbnb.lottie.value.d d2 = this.c.d();
        if (d2.a != 1.0f || d2.b != 1.0f) {
            this.h.preScale(d2.a, d2.b);
        }
        PointF d3 = this.a.d();
        if (d3.x != 0.0f || d3.y != 0.0f) {
            this.h.preTranslate(-d3.x, -d3.y);
        }
        return this.h;
    }

    public final Matrix a(float f) {
        PointF d = this.b.d();
        PointF d2 = this.a.d();
        com.airbnb.lottie.value.d d3 = this.c.d();
        float floatValue = this.d.d().floatValue();
        this.h.reset();
        this.h.preTranslate(d.x * f, d.y * f);
        double d4 = f;
        this.h.preScale((float) Math.pow(d3.a, d4), (float) Math.pow(d3.b, d4));
        this.h.preRotate(floatValue * f, d2.x, d2.y);
        return this.h;
    }

    public final <T> boolean a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.e) {
            this.a.a((com.airbnb.lottie.value.c<PointF>) cVar);
            return true;
        } else if (t == com.airbnb.lottie.i.f) {
            this.b.a((com.airbnb.lottie.value.c<PointF>) cVar);
            return true;
        } else if (t == com.airbnb.lottie.i.i) {
            this.c.a((com.airbnb.lottie.value.c<com.airbnb.lottie.value.d>) cVar);
            return true;
        } else if (t == com.airbnb.lottie.i.j) {
            this.d.a((com.airbnb.lottie.value.c<Float>) cVar);
            return true;
        } else if (t == com.airbnb.lottie.i.c) {
            this.e.a((com.airbnb.lottie.value.c<Integer>) cVar);
            return true;
        } else if (t == com.airbnb.lottie.i.u && this.f != null) {
            this.f.a((com.airbnb.lottie.value.c<Float>) cVar);
            return true;
        } else if (t != com.airbnb.lottie.i.v || this.g == null) {
            return false;
        } else {
            this.g.a((com.airbnb.lottie.value.c<Float>) cVar);
            return true;
        }
    }
}
