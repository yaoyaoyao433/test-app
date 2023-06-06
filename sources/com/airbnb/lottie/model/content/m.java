package com.airbnb.lottie.model.content;

import android.graphics.Path;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements b {
    public final Path.FillType a;
    public final String b;
    @Nullable
    public final com.airbnb.lottie.model.animatable.a c;
    @Nullable
    public final com.airbnb.lottie.model.animatable.d d;
    private final boolean e;

    public m(String str, boolean z, Path.FillType fillType, @Nullable com.airbnb.lottie.model.animatable.a aVar, @Nullable com.airbnb.lottie.model.animatable.d dVar) {
        this.b = str;
        this.e = z;
        this.a = fillType;
        this.c = aVar;
        this.d = dVar;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.f(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.e + '}';
    }
}
