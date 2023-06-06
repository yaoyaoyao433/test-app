package com.airbnb.lottie.model.animatable;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends n<Float, Float> {
    @Override // com.airbnb.lottie.model.animatable.n
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        super(Float.valueOf(0.0f));
    }

    public b(List<com.airbnb.lottie.value.a<Float>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public final com.airbnb.lottie.animation.keyframe.a<Float, Float> a() {
        return new com.airbnb.lottie.animation.keyframe.c(this.a);
    }
}
