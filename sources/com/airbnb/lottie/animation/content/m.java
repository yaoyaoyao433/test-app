package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.model.content.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements j, l, a.InterfaceC0016a {
    private final Path a = new Path();
    private final String b;
    private final LottieDrawable c;
    private final i.a d;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> e;
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> g;
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> h;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> i;
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> j;
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> k;
    @Nullable
    private r l;
    private boolean m;

    public m(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.i iVar) {
        this.c = lottieDrawable;
        this.b = iVar.a;
        this.d = iVar.b;
        this.e = iVar.c.a();
        this.f = iVar.d.a();
        this.g = iVar.e.a();
        this.i = iVar.g.a();
        this.k = iVar.i.a();
        if (this.d == i.a.Star) {
            this.h = iVar.f.a();
            this.j = iVar.h.a();
        } else {
            this.h = null;
            this.j = null;
        }
        aVar.a(this.e);
        aVar.a(this.f);
        aVar.a(this.g);
        aVar.a(this.i);
        aVar.a(this.k);
        if (this.d == i.a.Star) {
            aVar.a(this.h);
            aVar.a(this.j);
        }
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
        this.i.a(this);
        this.k.a(this);
        if (this.d == i.a.Star) {
            this.h.a(this);
            this.j.a(this);
        }
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.a == q.a.a) {
                    this.l = rVar;
                    this.l.a(this);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d0  */
    @Override // com.airbnb.lottie.animation.content.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path e() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.m.e():android.graphics.Path");
    }

    @Override // com.airbnb.lottie.animation.content.b
    public final String b() {
        return this.b;
    }

    @Override // com.airbnb.lottie.model.f
    public final void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.e.a(eVar, i, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.model.f
    public final <T> void a(T t, @Nullable com.airbnb.lottie.value.c<T> cVar) {
        if (t == com.airbnb.lottie.i.o) {
            this.e.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.p) {
            this.g.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.h) {
            this.f.a((com.airbnb.lottie.value.c<PointF>) cVar);
        } else if (t == com.airbnb.lottie.i.q && this.h != null) {
            this.h.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.r) {
            this.i.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.s && this.j != null) {
            this.j.a((com.airbnb.lottie.value.c<Float>) cVar);
        } else if (t == com.airbnb.lottie.i.t) {
            this.k.a((com.airbnb.lottie.value.c<Float>) cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.InterfaceC0016a
    public final void a() {
        this.m = false;
        this.c.invalidateSelf();
    }
}
