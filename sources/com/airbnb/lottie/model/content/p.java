package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p implements com.airbnb.lottie.model.content.b {
    public final String a;
    @Nullable
    public final com.airbnb.lottie.model.animatable.b b;
    public final List<com.airbnb.lottie.model.animatable.b> c;
    public final com.airbnb.lottie.model.animatable.a d;
    public final com.airbnb.lottie.model.animatable.d e;
    public final com.airbnb.lottie.model.animatable.b f;
    public final a g;
    public final b h;
    public final float i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap a() {
            switch (this) {
                case Butt:
                    return Paint.Cap.BUTT;
                case Round:
                    return Paint.Cap.ROUND;
                default:
                    return Paint.Cap.SQUARE;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join a() {
            switch (this) {
                case Bevel:
                    return Paint.Join.BEVEL;
                case Miter:
                    return Paint.Join.MITER;
                case Round:
                    return Paint.Join.ROUND;
                default:
                    return null;
            }
        }
    }

    public p(String str, @Nullable com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, a aVar2, b bVar3, float f) {
        this.a = str;
        this.b = bVar;
        this.c = list;
        this.d = aVar;
        this.e = dVar;
        this.f = bVar2;
        this.g = aVar2;
        this.h = bVar3;
        this.i = f;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.q(lottieDrawable, aVar, this);
    }
}
