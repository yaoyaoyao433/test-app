package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends s {
    private int a;
    private int b;

    public l() {
        super(2016);
        this.a = -1;
        this.b = -1;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("key_dispatch_environment", this.a);
        aVar.a("key_dispatch_area", this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.b("key_dispatch_environment", 1);
        this.b = aVar.b("key_dispatch_area", 1);
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }
}
