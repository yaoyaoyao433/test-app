package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.UnvarnishedMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o extends v {
    protected UnvarnishedMessage a;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnMessageCommand";
    }

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("msg_v1", this.a.unpackToJson());
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        String a = aVar.a("msg_v1");
        if (TextUtils.isEmpty(a)) {
            return;
        }
        this.a = new UnvarnishedMessage(a);
        this.a.setMsgId(f());
    }

    public final String d() {
        if (this.a == null) {
            return null;
        }
        return this.a.unpackToJson();
    }

    public final UnvarnishedMessage e() {
        return this.a;
    }
}
