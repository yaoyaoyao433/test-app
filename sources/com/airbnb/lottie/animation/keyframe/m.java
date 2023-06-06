package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends a<PointF, PointF> {
    private final PointF e;
    private final a<Float, Float> f;
    private final a<Float, Float> g;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.e = new PointF();
        this.f = aVar;
        this.g = aVar2;
        a(this.c);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final void a(float f) {
        this.f.a(f);
        this.g.a(f);
        this.e.set(this.f.d().floatValue(), this.g.d().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    final /* bridge */ /* synthetic */ PointF a(com.airbnb.lottie.value.a<PointF> aVar, float f) {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* bridge */ /* synthetic */ PointF d() {
        return this.e;
    }
}
