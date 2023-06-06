package com.airbnb.lottie.animation.keyframe;

import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p<K, A> extends a<K, A> {
    private final com.airbnb.lottie.value.b<A> e;

    @Override // com.airbnb.lottie.animation.keyframe.a
    final float c() {
        return 1.0f;
    }

    public p(com.airbnb.lottie.value.c<A> cVar) {
        super(Collections.emptyList());
        this.e = new com.airbnb.lottie.value.b<>();
        a(cVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final void a() {
        if (this.d != null) {
            super.a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final A d() {
        return this.d.a(0.0f, 0.0f, null, null, this.c, this.c, this.c);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    final A a(com.airbnb.lottie.value.a<K> aVar, float f) {
        return d();
    }
}
