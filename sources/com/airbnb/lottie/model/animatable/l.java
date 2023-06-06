package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.o;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l implements com.airbnb.lottie.model.content.b {
    public final e a;
    public final m<PointF, PointF> b;
    public final g c;
    public final b d;
    public final d e;
    @Nullable
    public final b f;
    @Nullable
    public final b g;

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return null;
    }

    public l() {
        this(new e(), new e(), new g(), new b(), new d(), new b(), new b());
    }

    public l(e eVar, m<PointF, PointF> mVar, g gVar, b bVar, d dVar, @Nullable b bVar2, @Nullable b bVar3) {
        this.a = eVar;
        this.b = mVar;
        this.c = gVar;
        this.d = bVar;
        this.e = dVar;
        this.f = bVar2;
        this.g = bVar3;
    }

    public final o a() {
        return new o(this);
    }
}
