package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements b {
    public final String a;
    public final com.airbnb.lottie.model.animatable.m<PointF, PointF> b;
    public final com.airbnb.lottie.model.animatable.f c;
    public final boolean d;

    public a(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z) {
        this.a = str;
        this.b = mVar;
        this.c = fVar;
        this.d = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.e(lottieDrawable, aVar, this);
    }
}
