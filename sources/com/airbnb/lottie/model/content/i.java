package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements b {
    public final String a;
    public final a b;
    public final com.airbnb.lottie.model.animatable.b c;
    public final com.airbnb.lottie.model.animatable.m<PointF, PointF> d;
    public final com.airbnb.lottie.model.animatable.b e;
    public final com.airbnb.lottie.model.animatable.b f;
    public final com.airbnb.lottie.model.animatable.b g;
    public final com.airbnb.lottie.model.animatable.b h;
    public final com.airbnb.lottie.model.animatable.b i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        Star(1),
        Polygon(2);
        
        private final int c;

        a(int i) {
            this.c = i;
        }

        public static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.c == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6) {
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = mVar;
        this.e = bVar2;
        this.f = bVar3;
        this.g = bVar4;
        this.h = bVar5;
        this.i = bVar6;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.m(lottieDrawable, aVar, this);
    }
}
