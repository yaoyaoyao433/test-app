package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.n;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends a {
    private final char[] g;
    private final RectF h;
    private final Matrix i;
    private final Paint j;
    private final Paint k;
    private final Map<com.airbnb.lottie.model.d, List<com.airbnb.lottie.animation.content.c>> l;
    private final n m;
    private final LottieDrawable n;
    private final com.airbnb.lottie.e o;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> q;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> r;
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(LottieDrawable lottieDrawable, d dVar) {
        super(lottieDrawable, dVar);
        this.g = new char[1];
        this.h = new RectF();
        this.i = new Matrix();
        this.j = new Paint(1) { // from class: com.airbnb.lottie.model.layer.h.1
            {
                super(1);
                setStyle(Paint.Style.FILL);
            }
        };
        this.k = new Paint(1) { // from class: com.airbnb.lottie.model.layer.h.2
            {
                super(1);
                setStyle(Paint.Style.STROKE);
            }
        };
        this.l = new HashMap();
        this.n = lottieDrawable;
        this.o = dVar.b;
        this.m = dVar.q.a();
        this.m.a(this);
        a(this.m);
        k kVar = dVar.r;
        if (kVar != null && kVar.a != null) {
            this.p = kVar.a.a();
            this.p.a(this);
            a(this.p);
        }
        if (kVar != null && kVar.b != null) {
            this.q = kVar.b.a();
            this.q.a(this);
            a(this.q);
        }
        if (kVar != null && kVar.c != null) {
            this.r = kVar.c.a();
            this.r.a(this);
            a(this.r);
        }
        if (kVar == null || kVar.d == null) {
            return;
        }
        this.s = kVar.d.a();
        this.s.a(this);
        a(this.s);
    }

    @Override // com.airbnb.lottie.model.layer.a
    final void b(Canvas canvas, Matrix matrix, int i) {
        String str;
        ArrayList arrayList;
        canvas.save();
        if (!this.n.e()) {
            canvas.setMatrix(matrix);
        }
        com.airbnb.lottie.model.b d = this.m.d();
        com.airbnb.lottie.model.c cVar = this.o.d.get(d.b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        if (this.p != null) {
            this.j.setColor(this.p.d().intValue());
        } else {
            this.j.setColor(d.h);
        }
        if (this.q != null) {
            this.k.setColor(this.q.d().intValue());
        } else {
            this.k.setColor(d.i);
        }
        int intValue = (this.f.e.d().intValue() * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        if (this.r != null) {
            this.k.setStrokeWidth(this.r.d().floatValue());
        } else {
            this.k.setStrokeWidth(d.j * com.airbnb.lottie.utils.f.a() * com.airbnb.lottie.utils.f.a(matrix));
        }
        if (!this.n.e()) {
            a(d, cVar, matrix, canvas);
        } else {
            float f = ((float) d.c) / 100.0f;
            float a = com.airbnb.lottie.utils.f.a(matrix);
            String str2 = d.a;
            int i2 = 0;
            while (i2 < str2.length()) {
                com.airbnb.lottie.model.d dVar = this.o.e.get(com.airbnb.lottie.model.d.a(str2.charAt(i2), cVar.a, cVar.c));
                if (dVar != null) {
                    if (this.l.containsKey(dVar)) {
                        str = str2;
                        arrayList = this.l.get(dVar);
                    } else {
                        List<com.airbnb.lottie.model.content.n> list = dVar.a;
                        int size = list.size();
                        arrayList = new ArrayList(size);
                        int i3 = 0;
                        while (i3 < size) {
                            String str3 = str2;
                            arrayList.add(new com.airbnb.lottie.animation.content.c(this.n, this, list.get(i3)));
                            i3++;
                            str2 = str3;
                        }
                        str = str2;
                        this.l.put(dVar, arrayList);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Path e = ((com.airbnb.lottie.animation.content.c) arrayList.get(i4)).e();
                        e.computeBounds(this.h, false);
                        this.i.set(matrix);
                        this.i.preTranslate(0.0f, ((float) (-d.g)) * com.airbnb.lottie.utils.f.a());
                        this.i.preScale(f, f);
                        e.transform(this.i);
                        if (d.k) {
                            a(e, this.j, canvas);
                            a(e, this.k, canvas);
                        } else {
                            a(e, this.k, canvas);
                            a(e, this.j, canvas);
                        }
                    }
                    float a2 = ((float) dVar.b) * f * com.airbnb.lottie.utils.f.a() * a;
                    float f2 = d.e / 10.0f;
                    if (this.s != null) {
                        f2 += this.s.d().floatValue();
                    }
                    canvas.translate(a2 + (f2 * a), 0.0f);
                } else {
                    str = str2;
                }
                i2++;
                str2 = str;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object, java.lang.String] */
    private void a(com.airbnb.lottie.model.b bVar, com.airbnb.lottie.model.c cVar, Matrix matrix, Canvas canvas) {
        com.airbnb.lottie.manager.a aVar;
        float a = com.airbnb.lottie.utils.f.a(matrix);
        LottieDrawable lottieDrawable = this.n;
        ?? r1 = cVar.a;
        ?? r11 = cVar.c;
        Typeface typeface = null;
        if (lottieDrawable.getCallback() == null) {
            aVar = null;
        } else {
            if (lottieDrawable.h == null) {
                lottieDrawable.h = new com.airbnb.lottie.manager.a(lottieDrawable.getCallback(), lottieDrawable.i);
            }
            aVar = lottieDrawable.h;
        }
        if (aVar != null) {
            com.airbnb.lottie.model.h<String> hVar = aVar.a;
            hVar.a = r1;
            hVar.b = r11;
            typeface = aVar.b.get(aVar.a);
            if (typeface == null) {
                typeface = aVar.c.get(r1);
                if (typeface == null) {
                    typeface = Typeface.createFromAsset(aVar.d, "fonts/" + ((String) r1) + aVar.f);
                    aVar.c.put(r1, typeface);
                }
                boolean contains = r11.contains("Italic");
                boolean contains2 = r11.contains("Bold");
                int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                if (typeface.getStyle() != i) {
                    typeface = Typeface.create(typeface, i);
                }
                aVar.b.put(aVar.a, typeface);
            }
        }
        if (typeface == null) {
            return;
        }
        String str = bVar.a;
        o oVar = this.n.j;
        if (oVar != null) {
            if (oVar.b && oVar.a.containsKey(str)) {
                str = oVar.a.get(str);
            } else if (oVar.b) {
                oVar.a.put(str, str);
            }
        }
        this.j.setTypeface(typeface);
        this.j.setTextSize((float) (bVar.c * com.airbnb.lottie.utils.f.a()));
        this.k.setTypeface(this.j.getTypeface());
        this.k.setTextSize(this.j.getTextSize());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            this.g[0] = charAt;
            if (bVar.k) {
                a(this.g, this.j, canvas);
                a(this.g, this.k, canvas);
            } else {
                a(this.g, this.k, canvas);
                a(this.g, this.j, canvas);
            }
            this.g[0] = charAt;
            float measureText = this.j.measureText(this.g, 0, 1);
            float f = bVar.e / 10.0f;
            if (this.s != null) {
                f += this.s.d().floatValue();
            }
            canvas.translate(measureText + (f * a), 0.0f);
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static void a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        super.a((h) t, (com.airbnb.lottie.value.c<h>) cVar);
        if (t == i.a && this.p != null) {
            this.p.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == i.b && this.q != null) {
            this.q.a((com.airbnb.lottie.value.c<Integer>) cVar);
        } else if (t == i.k && this.r != null) {
            this.r.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t != i.l || this.s == null) {
        } else {
            this.s.a((com.airbnb.lottie.value.c<Float>) cVar);
        }
    }
}
