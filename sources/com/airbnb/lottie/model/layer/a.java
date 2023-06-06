package com.airbnb.lottie.model.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.model.content.g;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.model.layer.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements com.airbnb.lottie.animation.content.d, a.InterfaceC0016a, com.airbnb.lottie.model.f {
    final LottieDrawable b;
    final d c;
    @Nullable
    a d;
    @Nullable
    a e;
    final o f;
    private final String r;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.g s;
    private List<a> t;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i = new Paint(1);
    private final Paint j = new Paint(1);
    private final Paint k = new Paint(1);
    private final Paint l = new Paint(1);
    private final Paint m = new Paint();
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    final Matrix a = new Matrix();
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> u = new ArrayList();
    private boolean v = true;

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<com.airbnb.lottie.animation.content.b> list, List<com.airbnb.lottie.animation.content.b> list2) {
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    void b(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LottieDrawable lottieDrawable, d dVar) {
        this.b = lottieDrawable;
        this.c = dVar;
        this.r = dVar.c + "#draw";
        this.m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (dVar.u == d.b.c) {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.f = dVar.i.a();
        this.f.a((a.InterfaceC0016a) this);
        if (dVar.h != null && !dVar.h.isEmpty()) {
            this.s = new com.airbnb.lottie.animation.keyframe.g(dVar.h);
            for (com.airbnb.lottie.animation.keyframe.a<l, Path> aVar : this.s.a) {
                aVar.a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<?, ?> aVar2 : this.s.b) {
                a(aVar2);
                aVar2.a(this);
            }
        }
        if (!this.c.t.isEmpty()) {
            final com.airbnb.lottie.animation.keyframe.c cVar = new com.airbnb.lottie.animation.keyframe.c(this.c.t);
            cVar.b = true;
            cVar.a(new a.InterfaceC0016a() { // from class: com.airbnb.lottie.model.layer.a.1
                @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
                public final void a() {
                    a.this.a(cVar.d().floatValue() == 1.0f);
                }
            });
            a(cVar.d().floatValue() == 1.0f);
            a(cVar);
            return;
        }
        a(true);
    }

    private boolean c() {
        return this.d != null;
    }

    @SuppressLint({"WrongConstant"})
    private static void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    public final void a(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.u.add(aVar);
    }

    @Override // com.airbnb.lottie.animation.content.d
    @CallSuper
    public void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        this.a.preConcat(this.f.a());
    }

    @Override // com.airbnb.lottie.animation.content.d
    public final void a(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.d.c(this.r);
        if (!this.v) {
            com.airbnb.lottie.d.d(this.r);
            return;
        }
        if (this.t == null) {
            if (this.e == null) {
                this.t = Collections.emptyList();
            } else {
                this.t = new ArrayList();
                for (a aVar = this.e; aVar != null; aVar = aVar.e) {
                    this.t.add(aVar);
                }
            }
        }
        com.airbnb.lottie.d.c("Layer#parentMatrix");
        this.h.reset();
        this.h.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.h.preConcat(this.t.get(size).f.a());
        }
        com.airbnb.lottie.d.d("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * this.f.e.d().intValue()) / 100.0f) * 255.0f);
        if (!c() && !d()) {
            this.h.preConcat(this.f.a());
            com.airbnb.lottie.d.c("Layer#drawLayer");
            b(canvas, this.h, intValue);
            com.airbnb.lottie.d.d("Layer#drawLayer");
            b(com.airbnb.lottie.d.d(this.r));
            return;
        }
        com.airbnb.lottie.d.c("Layer#computeBounds");
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        a(this.n, this.h);
        RectF rectF = this.n;
        Matrix matrix2 = this.h;
        if (c() && this.c.u != d.b.c) {
            this.d.a(this.p, matrix2);
            rectF.set(Math.max(rectF.left, this.p.left), Math.max(rectF.top, this.p.top), Math.min(rectF.right, this.p.right), Math.min(rectF.bottom, this.p.bottom));
        }
        this.h.preConcat(this.f.a());
        b(this.n, this.h);
        this.n.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        com.airbnb.lottie.d.d("Layer#computeBounds");
        com.airbnb.lottie.d.c("Layer#saveLayer");
        a(canvas, this.n, this.i, true);
        com.airbnb.lottie.d.d("Layer#saveLayer");
        a(canvas);
        com.airbnb.lottie.d.c("Layer#drawLayer");
        b(canvas, this.h, intValue);
        com.airbnb.lottie.d.d("Layer#drawLayer");
        if (d()) {
            Matrix matrix3 = this.h;
            c(canvas, matrix3, g.a.a);
            c(canvas, matrix3, g.a.c);
            c(canvas, matrix3, g.a.b);
        }
        if (c()) {
            com.airbnb.lottie.d.c("Layer#drawMatte");
            com.airbnb.lottie.d.c("Layer#saveLayer");
            a(canvas, this.n, this.l, false);
            com.airbnb.lottie.d.d("Layer#saveLayer");
            a(canvas);
            this.d.a(canvas, matrix, intValue);
            com.airbnb.lottie.d.c("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.d.d("Layer#restoreLayer");
            com.airbnb.lottie.d.d("Layer#drawMatte");
        }
        com.airbnb.lottie.d.c("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.d.d("Layer#restoreLayer");
        b(com.airbnb.lottie.d.d(this.r));
    }

    private void b(float f) {
        this.b.a.a.a(this.c.c, f);
    }

    private void a(Canvas canvas) {
        com.airbnb.lottie.d.c("Layer#clearLayer");
        canvas.drawRect(this.n.left - 1.0f, this.n.top - 1.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        com.airbnb.lottie.d.d("Layer#clearLayer");
    }

    private void b(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (d()) {
            int size = this.s.c.size();
            for (int i = 0; i < size; i++) {
                this.g.set(this.s.a.get(i).d());
                this.g.transform(matrix);
                switch (AnonymousClass2.b[this.s.c.get(i).a - 1]) {
                    case 1:
                        return;
                    case 2:
                        return;
                    default:
                        this.g.computeBounds(this.q, false);
                        if (i == 0) {
                            this.o.set(this.q);
                        } else {
                            this.o.set(Math.min(this.o.left, this.q.left), Math.min(this.o.top, this.q.top), Math.max(this.o.right, this.q.right), Math.max(this.o.bottom, this.q.bottom));
                        }
                }
            }
            rectF.set(Math.max(rectF.left, this.o.left), Math.max(rectF.top, this.o.top), Math.min(rectF.right, this.o.right), Math.min(rectF.bottom, this.o.bottom));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.airbnb.lottie.model.layer.a$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b = new int[g.a.a().length];

        static {
            try {
                b[g.a.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.a.c - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.a.a - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = new int[d.a.values().length];
            try {
                a[d.a.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.a.PreComp.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.a.Solid.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.a.Image.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.a.Null.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.a.Text.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.a.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private void c(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        boolean z = true;
        if (AnonymousClass2.b[i - 1] == 1) {
            paint = this.k;
        } else {
            paint = this.j;
        }
        int size = this.s.c.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            } else if (this.s.c.get(i2).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            com.airbnb.lottie.d.c("Layer#drawMask");
            com.airbnb.lottie.d.c("Layer#saveLayer");
            a(canvas, this.n, paint, false);
            com.airbnb.lottie.d.d("Layer#saveLayer");
            a(canvas);
            for (int i3 = 0; i3 < size; i3++) {
                if (this.s.c.get(i3).a == i) {
                    this.g.set(this.s.a.get(i3).d());
                    this.g.transform(matrix);
                    int alpha = this.i.getAlpha();
                    this.i.setAlpha((int) (this.s.b.get(i3).d().intValue() * 2.55f));
                    canvas.drawPath(this.g, this.i);
                    this.i.setAlpha(alpha);
                }
            }
            com.airbnb.lottie.d.c("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.d.d("Layer#restoreLayer");
            com.airbnb.lottie.d.d("Layer#drawMask");
        }
    }

    private boolean d() {
        return (this.s == null || this.s.a.isEmpty()) ? false : true;
    }

    void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            this.b.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        o oVar = this.f;
        oVar.a.a(f);
        oVar.b.a(f);
        oVar.c.a(f);
        oVar.d.a(f);
        oVar.e.a(f);
        if (oVar.f != null) {
            oVar.f.a(f);
        }
        if (oVar.g != null) {
            oVar.g.a(f);
        }
        if (this.s != null) {
            for (int i = 0; i < this.s.a.size(); i++) {
                this.s.a.get(i).a(f);
            }
        }
        if (this.c.m != 0.0f) {
            f /= this.c.m;
        }
        if (this.d != null) {
            this.d.a(this.d.c.m * f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            this.u.get(i2).a(f);
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.c.c;
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        if (eVar.a(b(), i)) {
            if (!"__container".equals(b())) {
                eVar2 = eVar2.a(b());
                if (eVar.c(b(), i)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(b(), i)) {
                b(eVar, i + eVar.b(b(), i), list, eVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    @CallSuper
    public <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        this.f.a(t, cVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.b.invalidateSelf();
    }
}
