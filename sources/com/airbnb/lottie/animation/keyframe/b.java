package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends f<Integer> {
    public b(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        if (aVar.b == 0 || aVar.c == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) aVar.b).intValue();
        int intValue2 = ((Integer) aVar.c).intValue();
        if (this.d != null) {
            return (Integer) this.d.a(aVar.e, aVar.f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, b(), this.c);
        }
        return Integer.valueOf(com.airbnb.lottie.utils.b.a(f, intValue, intValue2));
    }
}
