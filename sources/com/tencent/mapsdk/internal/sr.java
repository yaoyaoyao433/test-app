package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sr implements nr {
    private nw a;
    private sw b;
    private ns c;
    private boolean d;

    public sr(so soVar, String str) {
        this.b = soVar;
        this.a = new su(soVar.G(), str);
        this.c = new ss(soVar.G(), str);
    }

    @Override // com.tencent.mapsdk.internal.nr
    public final nw c() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.nr
    public final le d() {
        return new sq(this.b);
    }

    @Override // com.tencent.mapsdk.internal.nr
    public final ns e() {
        return this.c;
    }

    @Override // com.tencent.mapsdk.internal.nr
    public final boolean a() {
        return this.d;
    }

    @Override // com.tencent.mapsdk.internal.nr
    public final void b() {
        this.d = true;
    }
}
