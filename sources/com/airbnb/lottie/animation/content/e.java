package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements j, l, a.InterfaceC0016a {
    private final Path a = new Path();
    private final String b;
    private final LottieDrawable c;
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> d;
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> e;
    private final com.airbnb.lottie.model.content.a f;
    @Nullable
    private r g;
    private boolean h;

    public e(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        this.b = aVar2.a;
        this.c = lottieDrawable;
        this.d = aVar2.c.a();
        this.e = aVar2.b.a();
        this.f = aVar2;
        aVar.a(this.d);
        aVar.a(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.a == q.a.a) {
                    this.g = rVar;
                    this.g.a(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.l
    public final Path e() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        PointF d = this.d.d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF d2 = this.e.d();
        this.a.offset(d2.x, d2.y);
        this.a.close();
        com.airbnb.lottie.utils.f.a(this.a, this.g);
        this.h = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.g) {
            this.d.a((com.airbnb.lottie.value.c<PointF>) cVar);
        } else if (t == com.airbnb.lottie.i.h) {
            this.e.a((com.airbnb.lottie.value.c<PointF>) cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }
}
