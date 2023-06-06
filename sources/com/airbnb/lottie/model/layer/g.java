package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.i;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends a {
    private final RectF g;
    private final Paint h;
    private final float[] i;
    private final Path j;
    private final d k;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.g = new RectF();
        this.h = new Paint();
        this.i = new float[8];
        this.j = new Path();
        this.k = dVar;
        this.h.setAlpha(0);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setColor(dVar.l);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.k.l);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * this.f.e.d().intValue()) / 100.0f) * 255.0f);
        this.h.setAlpha(intValue);
        if (this.l != null) {
            this.h.setColorFilter(this.l.d());
        }
        if (intValue > 0) {
            this.i[0] = 0.0f;
            this.i[1] = 0.0f;
            this.i[2] = this.k.j;
            this.i[3] = 0.0f;
            this.i[4] = this.k.j;
            this.i[5] = this.k.k;
            this.i[6] = 0.0f;
            this.i[7] = this.k.k;
            matrix.mapPoints(this.i);
            this.j.reset();
            this.j.moveTo(this.i[0], this.i[1]);
            this.j.lineTo(this.i[2], this.i[3]);
            this.j.lineTo(this.i[4], this.i[5]);
            this.j.lineTo(this.i[6], this.i[7]);
            this.j.lineTo(this.i[0], this.i[1]);
            this.j.close();
            canvas.drawPath(this.j, this.h);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.set(0.0f, 0.0f, this.k.j, this.k.k);
        this.a.mapRect(this.g);
        rectF.set(this.g);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        super.a((g) t, (com.airbnb.lottie.value.c<g>) cVar);
        if (t == i.x) {
            if (cVar == null) {
                this.l = null;
            } else {
                this.l = new p(cVar);
            }
        }
    }
}
