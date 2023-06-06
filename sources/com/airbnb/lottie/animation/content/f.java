package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements d, j, a.InterfaceC0016a {
    private final com.airbnb.lottie.model.layer.a c;
    private final String d;
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f;
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> g;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> h;
    private final LottieDrawable i;
    private final Path a = new Path();
    private final Paint b = new Paint(1);
    private final List<l> e = new ArrayList();

    public f(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.m mVar) {
        this.c = aVar;
        this.d = mVar.b;
        this.i = lottieDrawable;
        if (mVar.c == null || mVar.d == null) {
            this.f = null;
            this.g = null;
            return;
        }
        this.a.setFillType(mVar.a);
        this.f = mVar.c.a();
        this.f.a(this);
        aVar.a(this.f);
        this.g = mVar.d.a();
        this.g.a(this);
        aVar.a(this.g);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            b bVar = list2.get(i);
            if (bVar instanceof l) {
                this.e.add((l) bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.d;
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.d.c("FillContent#draw");
        this.b.setColor(this.f.d().intValue());
        this.b.setAlpha(com.airbnb.lottie.utils.e.a((int) ((((i / 255.0f) * this.g.d().intValue()) / 100.0f) * 255.0f), 0, 255));
        if (this.h != null) {
            this.b.setColorFilter(this.h.d());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.a.addPath(this.e.get(i2).e(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        com.airbnb.lottie.d.d("FillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        this.a.reset();
        for (int i = 0; i < this.e.size(); i++) {
            this.a.addPath(this.e.get(i).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.a) {
            this.f.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == com.airbnb.lottie.i.d) {
            this.g.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == com.airbnb.lottie.i.x) {
            if (cVar == null) {
                this.h = null;
                return;
            }
            this.h = new com.airbnb.lottie.animation.keyframe.p(cVar);
            this.h.a(this);
            this.c.a(this.h);
        }
    }
}
