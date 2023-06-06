package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends f<Integer> {
    public e(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        if (aVar.b == 0 || aVar.c == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            return (Integer) this.d.a(aVar.e, aVar.f.floatValue(), aVar.b, aVar.c, f, b(), this.c);
        }
        int intValue = ((Integer) aVar.b).intValue();
        return Integer.valueOf((int) (intValue + (f * (((Integer) aVar.c).intValue() - intValue))));
    }
}
