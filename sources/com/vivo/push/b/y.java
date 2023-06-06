package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class y extends com.vivo.push.o {
    private String a;

    @Override // com.vivo.push.o
    public final String toString() {
        return "StopServiceCommand";
    }

    public y(String str) {
        super(2008);
        this.a = str;
    }

    public y() {
        super(2008);
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("package_name", this.a);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.a = aVar.a("package_name");
    }
}
