package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j extends s {
    private int a;
    private int b;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    public j() {
        super(12);
        this.a = -1;
        this.b = -1;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
        aVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.a);
        this.b = aVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }
}
