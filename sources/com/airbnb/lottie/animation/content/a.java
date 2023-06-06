package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.q;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements d, j, a.InterfaceC0016a {
    private final LottieDrawable f;
    private final com.airbnb.lottie.model.layer.a g;
    private final float[] i;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> j;
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> k;
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> l;
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> m;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> n;
    private final PathMeasure b = new PathMeasure();
    private final Path c = new Path();
    private final Path d = new Path();
    private final RectF e = new RectF();
    private final List<C0015a> h = new ArrayList();
    final Paint a = new Paint(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar2) {
        this.f = lottieDrawable;
        this.g = aVar;
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeCap(cap);
        this.a.setStrokeJoin(join);
        this.a.setStrokeMiter(f);
        this.k = dVar.a();
        this.j = bVar.a();
        if (bVar2 == null) {
            this.m = null;
        } else {
            this.m = bVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        aVar.a(this.k);
        aVar.a(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aVar.a(this.l.get(i2));
        }
        if (this.m != null) {
            aVar.a(this.m);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        if (this.m != null) {
            this.m.a(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.a == q.a.b) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.a(this);
        }
        C0015a c0015a = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof r) {
                r rVar3 = (r) bVar2;
                if (rVar3.a == q.a.b) {
                    if (c0015a != null) {
                        this.h.add(c0015a);
                    }
                    c0015a = new C0015a(rVar3);
                    rVar3.a(this);
                }
            }
            if (bVar2 instanceof l) {
                if (c0015a == null) {
                    c0015a = new C0015a(rVar);
                }
                c0015a.a.add((l) bVar2);
            }
        }
        if (c0015a != null) {
            this.h.add(c0015a);
        }
    }

    @Override // com.airbnb.lottie.animation.content.d
    public void a(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.d.c("StrokeContent#draw");
        this.a.setAlpha(com.airbnb.lottie.utils.e.a((int) ((((i / 255.0f) * this.k.d().intValue()) / 100.0f) * 255.0f), 0, 255));
        this.a.setStrokeWidth(this.j.d().floatValue() * com.airbnb.lottie.utils.f.a(matrix));
        if (this.a.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.d.d("StrokeContent#draw");
            return;
        }
        com.airbnb.lottie.d.c("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            com.airbnb.lottie.d.d("StrokeContent#applyDashPattern");
        } else {
            float a = com.airbnb.lottie.utils.f.a(matrix);
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.i[i2] = this.l.get(i2).d().floatValue();
                if (i2 % 2 == 0) {
                    if (this.i[i2] < 1.0f) {
                        this.i[i2] = 1.0f;
                    }
                } else if (this.i[i2] < 0.1f) {
                    this.i[i2] = 0.1f;
                }
                float[] fArr = this.i;
                fArr[i2] = fArr[i2] * a;
            }
            this.a.setPathEffect(new DashPathEffect(this.i, this.m != null ? this.m.d().floatValue() : 0.0f));
            com.airbnb.lottie.d.d("StrokeContent#applyDashPattern");
        }
        if (this.n != null) {
            this.a.setColorFilter(this.n.d());
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            C0015a c0015a = this.h.get(i3);
            if (c0015a.b != null) {
                a(canvas, c0015a, matrix);
            } else {
                com.airbnb.lottie.d.c("StrokeContent#buildPath");
                this.c.reset();
                for (int size = c0015a.a.size() - 1; size >= 0; size--) {
                    this.c.addPath(c0015a.a.get(size).e(), matrix);
                }
                com.airbnb.lottie.d.d("StrokeContent#buildPath");
                com.airbnb.lottie.d.c("StrokeContent#drawPath");
                canvas.drawPath(this.c, this.a);
                com.airbnb.lottie.d.d("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.d.d("StrokeContent#draw");
    }

    private void a(Canvas canvas, C0015a c0015a, Matrix matrix) {
        float f;
        com.airbnb.lottie.d.c("StrokeContent#applyTrimPath");
        if (c0015a.b == null) {
            com.airbnb.lottie.d.d("StrokeContent#applyTrimPath");
            return;
        }
        this.c.reset();
        for (int size = c0015a.a.size() - 1; size >= 0; size--) {
            this.c.addPath(c0015a.a.get(size).e(), matrix);
        }
        this.b.setPath(this.c, false);
        float length = this.b.getLength();
        while (this.b.nextContour()) {
            length += this.b.getLength();
        }
        float floatValue = (c0015a.b.d.d().floatValue() * length) / 360.0f;
        float floatValue2 = ((c0015a.b.b.d().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((c0015a.b.c.d().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = c0015a.a.size() - 1; size2 >= 0; size2--) {
            this.d.set(c0015a.a.get(size2).e());
            this.d.transform(matrix);
            this.b.setPath(this.d, false);
            float length2 = this.b.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    com.airbnb.lottie.utils.f.a(this.d, f, f3, 0.0f);
                    canvas.drawPath(this.d, this.a);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 <= floatValue3 && floatValue2 < f2) {
                    canvas.drawPath(this.d, this.a);
                } else {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    com.airbnb.lottie.utils.f.a(this.d, f, f3, 0.0f);
                    canvas.drawPath(this.d, this.a);
                }
            }
            f2 += length2;
        }
        com.airbnb.lottie.d.d("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        com.airbnb.lottie.d.c("StrokeContent#getBounds");
        this.c.reset();
        for (int i = 0; i < this.h.size(); i++) {
            C0015a c0015a = this.h.get(i);
            for (int i2 = 0; i2 < c0015a.a.size(); i2++) {
                this.c.addPath(c0015a.a.get(i2).e(), matrix);
            }
        }
        this.c.computeBounds(this.e, false);
        float floatValue = this.j.d().floatValue() / 2.0f;
        this.e.set(this.e.left - floatValue, this.e.top - floatValue, this.e.right + floatValue, this.e.bottom + floatValue);
        rectF.set(this.e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.d.d("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    @CallSuper
    public <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.d) {
            this.k.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == com.airbnb.lottie.i.k) {
            this.j.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.x) {
            if (cVar == null) {
                this.n = null;
                return;
            }
            this.n = new com.airbnb.lottie.animation.keyframe.p(cVar);
            this.n.a(this);
            this.g.a(this.n);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.airbnb.lottie.animation.content.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0015a {
        final List<l> a;
        @Nullable
        final r b;

        private C0015a(@Nullable r rVar) {
            this.a = new ArrayList();
            this.b = rVar;
        }
    }
}
