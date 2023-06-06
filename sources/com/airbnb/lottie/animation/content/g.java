package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements d, j, a.InterfaceC0016a {
    @NonNull
    private final String a;
    private final com.airbnb.lottie.model.layer.a b;
    private final LongSparseArray<LinearGradient> c = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> d = new LongSparseArray<>();
    private final Matrix e = new Matrix();
    private final Path f = new Path();
    private final Paint g = new Paint(1);
    private final RectF h = new RectF();
    private final List<l> i = new ArrayList();
    private final int j;
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> k;
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> l;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> m;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> n;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> o;
    private final LottieDrawable p;
    private final int q;

    public g(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.d dVar) {
        this.b = aVar;
        this.a = dVar.g;
        this.p = lottieDrawable;
        this.j = dVar.a;
        this.f.setFillType(dVar.b);
        this.q = (int) (lottieDrawable.a.a() / 32.0f);
        this.k = dVar.c.a();
        this.k.a(this);
        aVar.a(this.k);
        this.l = dVar.d.a();
        this.l.a(this);
        aVar.a(this.l);
        this.m = dVar.e.a();
        this.m.a(this);
        aVar.a(this.m);
        this.n = dVar.f.a();
        this.n.a(this);
        aVar.a(this.n);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.p.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            b bVar = list2.get(i);
            if (bVar instanceof l) {
                this.i.add((l) bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        float f;
        float f2;
        com.airbnb.lottie.d.c("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).e(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.j == com.airbnb.lottie.model.content.f.a) {
            long c = c();
            radialGradient = this.c.get(c);
            if (radialGradient == null) {
                PointF d = this.m.d();
                PointF d2 = this.n.d();
                com.airbnb.lottie.model.content.c d3 = this.k.d();
                LinearGradient linearGradient = new LinearGradient(d.x, d.y, d2.x, d2.y, d3.b, d3.a, Shader.TileMode.CLAMP);
                this.c.put(c, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long c2 = c();
            radialGradient = this.d.get(c2);
            if (radialGradient == null) {
                PointF d4 = this.m.d();
                PointF d5 = this.n.d();
                com.airbnb.lottie.model.content.c d6 = this.k.d();
                int[] iArr = d6.b;
                float[] fArr = d6.a;
                radialGradient = new RadialGradient(d4.x, d4.y, (float) Math.hypot(d5.x - f, d5.y - f2), iArr, fArr, Shader.TileMode.CLAMP);
                this.d.put(c2, radialGradient);
            }
        }
        this.e.set(matrix);
        radialGradient.setLocalMatrix(this.e);
        this.g.setShader(radialGradient);
        if (this.o != null) {
            this.g.setColorFilter(this.o.d());
        }
        this.g.setAlpha(com.airbnb.lottie.utils.e.a((int) ((((i / 255.0f) * this.l.d().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        com.airbnb.lottie.d.d("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).e(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.a;
    }

    private int c() {
        int round = Math.round(this.m.c * this.q);
        int round2 = Math.round(this.n.c * this.q);
        int round3 = Math.round(this.k.c * this.q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.x) {
            if (cVar == null) {
                this.o = null;
                return;
            }
            this.o = new com.airbnb.lottie.animation.keyframe.p(cVar);
            this.o.a(this);
            this.b.a(this.o);
        }
    }
}
