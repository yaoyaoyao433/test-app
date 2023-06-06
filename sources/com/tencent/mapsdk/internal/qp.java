package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qp implements Comparable<qp> {
    public final int a;
    public final int b;
    public final int c;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull qp qpVar) {
        return this.a - qpVar.a;
    }

    public qp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private int a(@NonNull qp qpVar) {
        return this.a - qpVar.a;
    }
}
