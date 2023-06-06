package com.airbnb.lottie.model.content;

import android.graphics.Path;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements b {
    public final int a;
    public final Path.FillType b;
    public final com.airbnb.lottie.model.animatable.c c;
    public final com.airbnb.lottie.model.animatable.d d;
    public final com.airbnb.lottie.model.animatable.f e;
    public final com.airbnb.lottie.model.animatable.f f;
    public final String g;
    @Nullable
    private final com.airbnb.lottie.model.animatable.b h = null;
    @Nullable
    private final com.airbnb.lottie.model.animatable.b i = null;

    public d(String str, int i, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2) {
        this.a = i;
        this.b = fillType;
        this.c = cVar;
        this.d = dVar;
        this.e = fVar;
        this.f = fVar2;
        this.g = str;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.g(lottieDrawable, aVar, this);
    }
}
