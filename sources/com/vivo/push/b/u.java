package com.vivo.push.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u extends v {
    private long a;
    private int b;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    public u() {
        super(20);
        this.a = -1L;
    }

    public final long d() {
        return this.a;
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("undo_msg_v1", this.a);
        aVar.a("undo_msg_type_v1", this.b);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.b("undo_msg_v1", this.a);
        this.b = aVar.b("undo_msg_type_v1", 0);
    }

    public final String e() {
        if (this.a != -1) {
            return String.valueOf(this.a);
        }
        return null;
    }
}
