package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o implements d, i, j, l, a.InterfaceC0016a {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final LottieDrawable c;
    private final com.airbnb.lottie.model.layer.a d;
    private final String e;
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f;
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> g;
    private final com.airbnb.lottie.animation.keyframe.o h;
    private c i;

    public o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.k kVar) {
        this.c = lottieDrawable;
        this.d = aVar;
        this.e = kVar.a;
        this.f = kVar.b.a();
        aVar.a(this.f);
        this.f.a(this);
        this.g = kVar.c.a();
        aVar.a(this.g);
        this.g.a(this);
        this.h = kVar.d.a();
        this.h.a(aVar);
        this.h.a(this);
    }

    @Override // com.airbnb.lottie.animation.content.i
    public final void a(ListIterator<b> listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new c(this.c, this.d, "Repeater", arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        this.i.a(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        Path e = this.i.e();
        this.b.reset();
        float floatValue = this.f.d().floatValue();
        float floatValue2 = this.g.d().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.h.a(i + floatValue2));
            this.b.addPath(e, this.a);
        }
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f.d().floatValue();
        float floatValue2 = this.g.d().floatValue();
        float floatValue3 = this.h.f.d().floatValue() / 100.0f;
        float floatValue4 = this.h.g.d().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.h.a(f + floatValue2));
            this.i.a(canvas, this.a, (int) (i * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        this.i.a(rectF, matrix);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (this.h.a(t, cVar)) {
            return;
        }
        if (t == com.airbnb.lottie.i.m) {
            this.f.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.n) {
            this.g.a((com.airbnb.lottie.value.c<Float>) cVar);
        }
    }
}
