package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class v extends s {
    private String a;
    private long b;

    public v(int i) {
        super(i);
    }

    public final long f() {
        return this.b;
    }

    public final String i() {
        return this.a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.a);
        aVar.a("notify_id", this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.b = aVar.b("notify_id", -1L);
    }
}
