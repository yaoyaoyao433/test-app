package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends c {
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    public b(boolean z, String str) {
        super(z ? 2006 : 2007, str);
        this.e = false;
    }

    public final void d() {
        this.c = null;
    }

    public final void e() {
        this.b = null;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("sdk_clients", this.a);
        aVar.a("sdk_version", 323L);
        aVar.a("BaseAppCommand.EXTRA_APPID", this.c);
        aVar.a("BaseAppCommand.EXTRA_APPKEY", this.b);
        aVar.a("PUSH_REGID", this.d);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.a("sdk_clients");
        this.c = aVar.a("BaseAppCommand.EXTRA_APPID");
        this.b = aVar.a("BaseAppCommand.EXTRA_APPKEY");
        this.d = aVar.a("PUSH_REGID");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "AppCommand:" + b();
    }
}
