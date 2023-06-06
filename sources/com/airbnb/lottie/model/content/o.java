package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o implements b {
    public final String a;
    public final com.airbnb.lottie.model.animatable.h b;
    private final int c;

    public o(String str, int i, com.airbnb.lottie.model.animatable.h hVar) {
        this.a = str;
        this.c = i;
        this.b = hVar;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.p(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.c + '}';
    }
}
