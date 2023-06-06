package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q extends a {
    private final com.airbnb.lottie.model.layer.a b;
    private final String c;
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> d;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> e;

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(this.d.d().intValue());
        if (this.e != null) {
            this.a.setColorFilter(this.e.d());
        }
        super.a(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.c;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        super.a((q) t, (com.airbnb.lottie.value.c<q>) cVar);
        if (t == com.airbnb.lottie.i.b) {
            this.d.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == com.airbnb.lottie.i.x) {
            if (cVar == null) {
                this.e = null;
                return;
            }
            this.e = new com.airbnb.lottie.animation.keyframe.p(cVar);
            this.e.a(this);
            this.b.a(this.d);
        }
    }

    public q(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.p pVar) {
        super(lottieDrawable, aVar, pVar.g.a(), pVar.h.a(), pVar.i, pVar.e, pVar.f, pVar.c, pVar.b);
        this.b = aVar;
        this.c = pVar.a;
        this.d = pVar.d.a();
        this.d.a(this);
        aVar.a(this.d);
    }
}
