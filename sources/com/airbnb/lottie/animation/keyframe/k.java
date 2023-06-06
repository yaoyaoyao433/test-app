package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends f<com.airbnb.lottie.value.d> {
    public k(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.d>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        if (aVar.b == 0 || aVar.c == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.d dVar = (com.airbnb.lottie.value.d) aVar.b;
        com.airbnb.lottie.value.d dVar2 = (com.airbnb.lottie.value.d) aVar.c;
        if (this.d != null) {
            return (com.airbnb.lottie.value.d) this.d.a(aVar.e, aVar.f.floatValue(), dVar, dVar2, f, b(), this.c);
        }
        float f2 = dVar.a;
        float f3 = f2 + ((dVar2.a - f2) * f);
        float f4 = dVar.b;
        return new com.airbnb.lottie.value.d(f3, f4 + (f * (dVar2.b - f4)));
    }
}
