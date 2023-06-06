package com.vivo.push.b;

import com.tencent.connect.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends s {
    private String a;
    private String b;
    private String c;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnBindCommand";
    }

    public i(int i) {
        super(i);
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("app_id", this.a);
        aVar.a(Constants.PARAM_CLIENT_ID, this.b);
        aVar.a("client_token", this.c);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.a("app_id");
        this.b = aVar.a(Constants.PARAM_CLIENT_ID);
        this.c = aVar.a("client_token");
    }
}
