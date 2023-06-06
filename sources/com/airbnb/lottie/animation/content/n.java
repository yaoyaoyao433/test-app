package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n implements j, l, a.InterfaceC0016a {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final LottieDrawable d;
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> e;
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> g;
    @Nullable
    private r h;
    private boolean i;

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
    }

    public n(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.j jVar) {
        this.c = jVar.a;
        this.d = lottieDrawable;
        this.e = jVar.b.a();
        this.f = jVar.c.a();
        this.g = jVar.d.a();
        aVar.a(this.e);
        aVar.a(this.f);
        aVar.a(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.c;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.a == q.a.a) {
                    this.h = rVar;
                    this.h.a(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        PointF d = this.f.d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        float floatValue = this.g == null ? 0.0f : this.g.d().floatValue();
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF d2 = this.e.d();
        this.a.moveTo(d2.x + f, (d2.y - f2) + floatValue);
        this.a.lineTo(d2.x + f, (d2.y + f2) - floatValue);
        int i = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
        if (i > 0) {
            float f3 = floatValue * 2.0f;
            this.b.set((d2.x + f) - f3, (d2.y + f2) - f3, d2.x + f, d2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((d2.x - f) + floatValue, d2.y + f2);
        if (i > 0) {
            float f4 = floatValue * 2.0f;
            this.b.set(d2.x - f, (d2.y + f2) - f4, (d2.x - f) + f4, d2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(d2.x - f, (d2.y - f2) + floatValue);
        if (i > 0) {
            float f5 = floatValue * 2.0f;
            this.b.set(d2.x - f, d2.y - f2, (d2.x - f) + f5, (d2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((d2.x + f) - floatValue, d2.y - f2);
        if (i > 0) {
            float f6 = floatValue * 2.0f;
            this.b.set((d2.x + f) - f6, d2.y - f2, d2.x + f, (d2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        com.airbnb.lottie.utils.f.a(this.a, this.h);
        this.i = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.i = false;
        this.d.invalidateSelf();
    }
}
