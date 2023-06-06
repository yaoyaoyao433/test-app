package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements m<PointF, PointF> {
    private final b a;
    private final b b;

    public i(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.m(this.a.a(), this.b.a());
    }
}
