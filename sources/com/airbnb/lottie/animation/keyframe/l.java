package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends a<com.airbnb.lottie.model.content.l, Path> {
    private final com.airbnb.lottie.model.content.l e;
    private final Path f;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.l>> list) {
        super(list);
        this.e = new com.airbnb.lottie.model.content.l();
        this.f = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* synthetic */ Path a(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.l> aVar, float f) {
        com.airbnb.lottie.model.content.l lVar = aVar.b;
        com.airbnb.lottie.model.content.l lVar2 = aVar.c;
        com.airbnb.lottie.model.content.l lVar3 = this.e;
        if (lVar3.b == null) {
            lVar3.b = new PointF();
        }
        lVar3.c = lVar.c || lVar2.c;
        if (lVar.a.size() != lVar2.a.size()) {
            com.airbnb.lottie.d.b("Curves must have the same number of control points. Shape 1: " + lVar.a.size() + "\tShape 2: " + lVar2.a.size());
        }
        if (lVar3.a.isEmpty()) {
            int min = Math.min(lVar.a.size(), lVar2.a.size());
            for (int i = 0; i < min; i++) {
                lVar3.a.add(new com.airbnb.lottie.model.a());
            }
        }
        PointF pointF = lVar.b;
        PointF pointF2 = lVar2.b;
        float f2 = pointF.x;
        float f3 = f2 + ((pointF2.x - f2) * f);
        float f4 = pointF.y;
        float f5 = f4 + ((pointF2.y - f4) * f);
        if (lVar3.b == null) {
            lVar3.b = new PointF();
        }
        lVar3.b.set(f3, f5);
        for (int size = lVar3.a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.model.a aVar2 = lVar.a.get(size);
            com.airbnb.lottie.model.a aVar3 = lVar2.a.get(size);
            PointF pointF3 = aVar2.a;
            PointF pointF4 = aVar2.b;
            PointF pointF5 = aVar2.c;
            PointF pointF6 = aVar3.a;
            PointF pointF7 = aVar3.b;
            PointF pointF8 = aVar3.c;
            float f6 = pointF3.x;
            float f7 = pointF3.y;
            lVar3.a.get(size).a.set(f6 + ((pointF6.x - f6) * f), f7 + ((pointF6.y - f7) * f));
            float f8 = pointF4.x;
            float f9 = pointF4.y;
            lVar3.a.get(size).b.set(f8 + ((pointF7.x - f8) * f), f9 + ((pointF7.y - f9) * f));
            float f10 = pointF5.x;
            float f11 = pointF5.y;
            lVar3.a.get(size).c.set(f10 + ((pointF8.x - f10) * f), f11 + ((pointF8.y - f11) * f));
        }
        com.airbnb.lottie.utils.e.a(this.e, this.f);
        return this.f;
    }
}
