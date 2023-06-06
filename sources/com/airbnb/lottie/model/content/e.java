package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.p;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements b {
    public final String a;
    public final int b;
    public final com.airbnb.lottie.model.animatable.c c;
    public final com.airbnb.lottie.model.animatable.d d;
    public final com.airbnb.lottie.model.animatable.f e;
    public final com.airbnb.lottie.model.animatable.f f;
    public final com.airbnb.lottie.model.animatable.b g;
    public final p.a h;
    public final p.b i;
    public final float j;
    public final List<com.airbnb.lottie.model.animatable.b> k;
    @Nullable
    public final com.airbnb.lottie.model.animatable.b l;

    public e(String str, int i, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, p.a aVar, p.b bVar2, float f, List<com.airbnb.lottie.model.animatable.b> list, @Nullable com.airbnb.lottie.model.animatable.b bVar3) {
        this.a = str;
        this.b = i;
        this.c = cVar;
        this.d = dVar;
        this.e = fVar;
        this.f = fVar2;
        this.g = bVar;
        this.h = aVar;
        this.i = bVar2;
        this.j = f;
        this.k = list;
        this.l = bVar3;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.h(lottieDrawable, aVar, this);
    }
}
