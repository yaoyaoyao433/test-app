package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends a {
    private final String b;
    private final LongSparseArray<LinearGradient> c;
    private final LongSparseArray<RadialGradient> d;
    private final RectF e;
    private final int f;
    private final int g;
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> h;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> i;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> j;

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        int width;
        int height;
        a(this.e, matrix);
        if (this.f == com.airbnb.lottie.model.content.f.a) {
            Paint paint = this.a;
            long c = c();
            LinearGradient linearGradient = this.c.get(c);
            if (linearGradient == null) {
                PointF d = this.i.d();
                PointF d2 = this.j.d();
                com.airbnb.lottie.model.content.c d3 = this.h.d();
                LinearGradient linearGradient2 = new LinearGradient((int) (this.e.left + (this.e.width() / 2.0f) + d.x), (int) (this.e.top + (this.e.height() / 2.0f) + d.y), (int) (this.e.left + (this.e.width() / 2.0f) + d2.x), (int) (this.e.top + (this.e.height() / 2.0f) + d2.y), d3.b, d3.a, Shader.TileMode.CLAMP);
                this.c.put(c, linearGradient2);
                linearGradient = linearGradient2;
            }
            paint.setShader(linearGradient);
        } else {
            Paint paint2 = this.a;
            long c2 = c();
            RadialGradient radialGradient = this.d.get(c2);
            if (radialGradient == null) {
                PointF d4 = this.i.d();
                PointF d5 = this.j.d();
                com.airbnb.lottie.model.content.c d6 = this.h.d();
                int[] iArr = d6.b;
                float[] fArr = d6.a;
                RadialGradient radialGradient2 = new RadialGradient((int) (this.e.left + (this.e.width() / 2.0f) + d4.x), (int) (this.e.top + (this.e.height() / 2.0f) + d4.y), (float) Math.hypot(((int) ((this.e.left + (this.e.width() / 2.0f)) + d5.x)) - width, ((int) ((this.e.top + (this.e.height() / 2.0f)) + d5.y)) - height), iArr, fArr, Shader.TileMode.CLAMP);
                this.d.put(c2, radialGradient2);
                radialGradient = radialGradient2;
            }
            paint2.setShader(radialGradient);
        }
        super.a(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.b;
    }

    private int c() {
        int round = Math.round(this.i.c * this.g);
        int round2 = Math.round(this.j.c * this.g);
        int round3 = Math.round(this.h.c * this.g);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    public h(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.e eVar) {
        super(lottieDrawable, aVar, eVar.h.a(), eVar.i.a(), eVar.j, eVar.d, eVar.g, eVar.k, eVar.l);
        this.c = new LongSparseArray<>();
        this.d = new LongSparseArray<>();
        this.e = new RectF();
        this.b = eVar.a;
        this.f = eVar.b;
        this.g = (int) (lottieDrawable.a.a() / 32.0f);
        this.h = eVar.c.a();
        this.h.a(this);
        aVar.a(this.h);
        this.i = eVar.e.a();
        this.i.a(this);
        aVar.a(this.i);
        this.j = eVar.f.a();
        this.j.a(this);
        aVar.a(this.j);
    }
}
