package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends f<Float> {
    public c(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        if (aVar.b == 0 || aVar.c == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            return (Float) this.d.a(aVar.e, aVar.f.floatValue(), aVar.b, aVar.c, f, b(), this.c);
        }
        float floatValue = ((Float) aVar.b).floatValue();
        return Float.valueOf(floatValue + (f * (((Float) aVar.c).floatValue() - floatValue)));
    }
}
