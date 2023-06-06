package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends n<PointF, PointF> {
    @Override // com.airbnb.lottie.model.animatable.n
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public f(List<com.airbnb.lottie.value.a<PointF>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.j(this.a);
    }
}
