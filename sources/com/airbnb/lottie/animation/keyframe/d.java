package com.airbnb.lottie.animation.keyframe;

import com.meituan.robust.common.CommonConstant;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends f<com.airbnb.lottie.model.content.c> {
    private final com.airbnb.lottie.model.content.c e;

    public d(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.c>> list) {
        super(list);
        com.airbnb.lottie.model.content.c cVar = list.get(0).b;
        int length = cVar != null ? cVar.b.length : 0;
        this.e = new com.airbnb.lottie.model.content.c(new float[length], new int[length]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    final /* synthetic */ Object a(com.airbnb.lottie.value.a aVar, float f) {
        com.airbnb.lottie.model.content.c cVar = this.e;
        com.airbnb.lottie.model.content.c cVar2 = (com.airbnb.lottie.model.content.c) aVar.b;
        com.airbnb.lottie.model.content.c cVar3 = (com.airbnb.lottie.model.content.c) aVar.c;
        if (cVar2.b.length != cVar3.b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar2.b.length + " vs " + cVar3.b.length + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        for (int i = 0; i < cVar2.b.length; i++) {
            float[] fArr = cVar.a;
            float f2 = cVar2.a[i];
            fArr[i] = f2 + ((cVar3.a[i] - f2) * f);
            cVar.b[i] = com.airbnb.lottie.utils.b.a(f, cVar2.b[i], cVar3.b[i]);
        }
        return this.e;
    }
}
