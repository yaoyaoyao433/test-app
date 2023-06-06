package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends f<PointF> {
    private final PointF e;
    private final float[] f;
    private h g;
    private PathMeasure h;

    public i(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        h hVar = (h) aVar;
        Path path = hVar.a;
        if (path == null) {
            return (PointF) aVar.b;
        }
        if (this.d != null) {
            return (PointF) this.d.a(hVar.e, hVar.f.floatValue(), hVar.b, hVar.c, b(), f, this.c);
        }
        if (this.g != hVar) {
            this.h = new PathMeasure(path, false);
            this.g = hVar;
        }
        this.h.getPosTan(f * this.h.getLength(), this.f, null);
        this.e.set(this.f[0], this.f[1]);
        return this.e;
    }
}
