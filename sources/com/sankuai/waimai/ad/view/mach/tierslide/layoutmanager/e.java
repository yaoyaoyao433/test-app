package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e {
    protected int d;
    protected int e;
    protected int f;

    public abstract f a(int i);

    public abstract f a(View view, int i);

    public abstract f a(View view, int i, int i2, int i3, int i4, int i5);

    public abstract int[] a();

    public abstract f b(View view, int i, int i2, int i3, int i4, int i5);

    public abstract boolean c(View view, int i, int i2, int i3, int i4, int i5);

    public final void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final void b(int i) {
        this.f = i;
    }

    public final int b() {
        return this.f;
    }
}
