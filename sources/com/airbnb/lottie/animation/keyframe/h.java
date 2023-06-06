package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends com.airbnb.lottie.value.a<PointF> {
    @Nullable
    Path a;

    public h(com.airbnb.lottie.e eVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(eVar, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
        boolean z = (this.c == 0 || this.b == 0 || !((PointF) this.b).equals(((PointF) this.c).x, ((PointF) this.c).y)) ? false : true;
        if (this.c == 0 || z) {
            return;
        }
        this.a = com.airbnb.lottie.utils.f.a((PointF) this.b, (PointF) this.c, aVar.g, aVar.h);
    }
}
