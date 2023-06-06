package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n implements b {
    public final String a;
    public final List<b> b;

    public n(String str, List<b> list) {
        this.a = str;
        this.b = list;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.c(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
