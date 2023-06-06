package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements d, l, a.InterfaceC0016a, com.airbnb.lottie.model.f {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final List<b> e;
    private final LottieDrawable f;
    @Nullable
    private List<l> g;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.o h;

    private static List<b> a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, List<com.airbnb.lottie.model.content.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            b a = list.get(i).a(lottieDrawable, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Nullable
    private static com.airbnb.lottie.model.animatable.l a(List<com.airbnb.lottie.model.content.b> list) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.model.content.b bVar = list.get(i);
            if (bVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) bVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, String str, List<b> list, @Nullable com.airbnb.lottie.model.animatable.l lVar) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.f = lottieDrawable;
        this.e = list;
        if (lVar != null) {
            this.h = lVar.a();
            this.h.a(aVar);
            this.h.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof i) {
                arrayList.add((i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((i) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.d;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.e.size());
        arrayList.addAll(list);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            b bVar = this.e.get(size);
            bVar.a(arrayList, this.e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<l> c() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                b bVar = this.e.get(i);
                if (bVar instanceof l) {
                    this.g.add((l) bVar);
                }
            }
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix d() {
        if (this.h != null) {
            return this.h.a();
        }
        this.a.reset();
        return this.a;
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        this.a.reset();
        if (this.h != null) {
            this.a.set(this.h.a());
        }
        this.b.reset();
        for (int size = this.e.size() - 1; size >= 0; size--) {
            b bVar = this.e.get(size);
            if (bVar instanceof l) {
                this.b.addPath(((l) bVar).e(), this.a);
            }
        }
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.set(matrix);
        if (this.h != null) {
            this.a.preConcat(this.h.a());
            i = (int) ((((this.h.e.d().intValue() / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            b bVar = this.e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(canvas, this.a, i);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        if (this.h != null) {
            this.a.preConcat(this.h.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            b bVar = this.e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(this.c, this.a);
                if (rectF.isEmpty()) {
                    rectF.set(this.c);
                } else {
                    rectF.set(Math.min(rectF.left, this.c.left), Math.min(rectF.top, this.c.top), Math.max(rectF.right, this.c.right), Math.max(rectF.bottom, this.c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (this.h != null) {
            this.h.a(t, cVar);
        }
    }

    public c(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.n nVar) {
        this(lottieDrawable, aVar, nVar.a, a(lottieDrawable, aVar, nVar.b), a(nVar.b));
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        if (eVar.a(this.d, i)) {
            if (!"__container".equals(this.d)) {
                eVar2 = eVar2.a(this.d);
                if (eVar.c(this.d, i)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(this.d, i)) {
                int b = i + eVar.b(this.d, i);
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    b bVar = this.e.get(i2);
                    if (bVar instanceof com.airbnb.lottie.model.f) {
                        ((com.airbnb.lottie.model.f) bVar).a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }
}
