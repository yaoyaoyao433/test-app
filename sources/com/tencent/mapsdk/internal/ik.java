package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ik implements iu<Number> {
    @Override // com.tencent.mapsdk.internal.iu
    public final /* synthetic */ Number a(float f, Number number, Number number2) {
        double doubleValue = number.doubleValue();
        return Double.valueOf(doubleValue + (f * (number2.doubleValue() - doubleValue)));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Number a2(float f, Number number, Number number2) {
        double doubleValue = number.doubleValue();
        return Double.valueOf(doubleValue + (f * (number2.doubleValue() - doubleValue)));
    }
}
