package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends f<PointF> {
    private final PointF e;

    public j(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.e = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        if (aVar.b == 0 || aVar.c == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) aVar.b;
        PointF pointF2 = (PointF) aVar.c;
        if (this.d != null) {
            return (PointF) this.d.a(aVar.e, aVar.f.floatValue(), pointF, pointF2, f, b(), this.c);
        }
        this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.e;
    }
}
