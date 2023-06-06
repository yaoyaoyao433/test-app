package com.bumptech.glide.request.target;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class i<Z> extends b<Z> {
    private final int a;
    private final int b;

    public i() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.bumptech.glide.request.target.l
    public final void a(j jVar) {
        if (!com.bumptech.glide.util.h.a(this.a, this.b)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.a + " and height: " + this.b + ", either provide dimensions in the constructor or call override()");
        }
        jVar.a(this.a, this.b);
    }
}
