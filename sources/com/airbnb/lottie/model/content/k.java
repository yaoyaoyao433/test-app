package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k implements b {
    public final String a;
    public final com.airbnb.lottie.model.animatable.b b;
    public final com.airbnb.lottie.model.animatable.b c;
    public final com.airbnb.lottie.model.animatable.l d;

    public k(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar) {
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        this.d = lVar;
    }

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.o(lottieDrawable, aVar, this);
    }
}
