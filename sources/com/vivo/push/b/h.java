package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.vivo.push.o {
    private String a;

    public h() {
        super(2013);
    }

    public h(String str) {
        this();
        this.a = str;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("MsgArriveCommand.MSG_TAG", this.a);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.a = aVar.a("MsgArriveCommand.MSG_TAG");
    }
}
