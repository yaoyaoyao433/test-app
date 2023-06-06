package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class im implements iu<Integer> {
    @Override // com.tencent.mapsdk.internal.iu
    public final /* synthetic */ Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (intValue + (f * (num2.intValue() - intValue))));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Integer a2(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (intValue + (f * (num2.intValue() - intValue))));
    }
}
