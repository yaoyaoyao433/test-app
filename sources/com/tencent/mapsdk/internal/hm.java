package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hm implements iu<fm> {
    @Override // com.tencent.mapsdk.internal.iu
    public final /* synthetic */ fm a(float f, fm fmVar, fm fmVar2) {
        fm fmVar3 = fmVar;
        fm fmVar4 = fmVar2;
        double d = f;
        return new fm(fmVar3.a + ((fmVar4.a - fmVar3.a) * d), fmVar3.b + (d * (fmVar4.b - fmVar3.b)));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static fm a2(float f, fm fmVar, fm fmVar2) {
        double d = f;
        return new fm(fmVar.a + ((fmVar2.a - fmVar.a) * d), fmVar.b + (d * (fmVar2.b - fmVar.b)));
    }
}
