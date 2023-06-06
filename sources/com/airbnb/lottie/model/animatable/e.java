package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements m<PointF, PointF> {
    private final List<com.airbnb.lottie.value.a<PointF>> a;

    public e() {
        this.a = Collections.singletonList(new com.airbnb.lottie.value.a(new PointF(0.0f, 0.0f)));
    }

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        if (this.a.get(0).c()) {
            return new com.airbnb.lottie.animation.keyframe.j(this.a);
        }
        return new com.airbnb.lottie.animation.keyframe.i(this.a);
    }
}
