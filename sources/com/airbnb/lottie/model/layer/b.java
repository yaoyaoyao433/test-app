package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.layer.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends a {
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> g;
    private final List<a> h;
    private final RectF i;
    private final RectF j;

    public b(LottieDrawable lottieDrawable, d dVar, List<d> list, com.airbnb.lottie.e eVar) {
        super(lottieDrawable, dVar);
        a aVar;
        a fVar;
        this.h = new ArrayList();
        this.i = new RectF();
        this.j = new RectF();
        com.airbnb.lottie.model.animatable.b bVar = dVar.s;
        if (bVar != null) {
            this.g = bVar.a();
            a(this.g);
            this.g.a(this);
        } else {
            this.g = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(eVar.g.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size >= 0) {
                d dVar2 = list.get(size);
                switch (dVar2.e) {
                    case Shape:
                        fVar = new f(lottieDrawable, dVar2);
                        break;
                    case PreComp:
                        fVar = new b(lottieDrawable, dVar2, eVar.b.get(dVar2.g), eVar);
                        break;
                    case Solid:
                        fVar = new g(lottieDrawable, dVar2);
                        break;
                    case Image:
                        fVar = new c(lottieDrawable, dVar2);
                        break;
                    case Null:
                        fVar = new e(lottieDrawable, dVar2);
                        break;
                    case Text:
                        fVar = new h(lottieDrawable, dVar2);
                        break;
                    default:
                        com.airbnb.lottie.d.b("Unknown layer type " + dVar2.e);
                        fVar = null;
                        break;
                }
                if (fVar != null) {
                    longSparseArray.put(fVar.c.d, fVar);
                    if (aVar2 == null) {
                        this.h.add(0, fVar);
                        switch (AnonymousClass1.a[dVar2.u - 1]) {
                            case 1:
                            case 2:
                                aVar2 = fVar;
                                continue;
                        }
                    } else {
                        aVar2.d = fVar;
                        aVar2 = null;
                    }
                }
                size--;
            } else {
                for (int i = 0; i < longSparseArray.size(); i++) {
                    a aVar3 = (a) longSparseArray.get(longSparseArray.keyAt(i));
                    if (aVar3 != null && (aVar = (a) longSparseArray.get(aVar3.c.f)) != null) {
                        aVar3.e = aVar;
                    }
                }
                return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.airbnb.lottie.model.layer.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[d.b.a().length];

        static {
            try {
                a[d.b.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.c - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    final void b(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.d.c("CompositionLayer#draw");
        canvas.save();
        this.j.set(0.0f, 0.0f, this.c.o, this.c.p);
        matrix.mapRect(this.j);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            if (!this.j.isEmpty() ? canvas.clipRect(this.j) : true) {
                this.h.get(size).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.airbnb.lottie.d.d("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            this.h.get(size).a(this.i, this.a);
            if (rectF.isEmpty()) {
                rectF.set(this.i);
            } else {
                rectF.set(Math.min(rectF.left, this.i.left), Math.min(rectF.top, this.i.top), Math.max(rectF.right, this.i.right), Math.max(rectF.bottom, this.i.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.a(f);
        if (this.g != null) {
            f = (this.g.d().floatValue() * 1000.0f) / this.b.a.a();
        }
        if (this.c.m != 0.0f) {
            f /= this.c.m;
        }
        d dVar = this.c;
        float b = f - (dVar.n / dVar.b.b());
        for (int size = this.h.size() - 1; size >= 0; size--) {
            this.h.get(size).a(b);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected final void b(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.get(i2).a(eVar, i, list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        super.a((b) t, (com.airbnb.lottie.value.c<b>) cVar);
        if (t == i.w) {
            if (cVar == null) {
                this.g = null;
                return;
            }
            this.g = new p(cVar);
            a(this.g);
        }
    }
}
