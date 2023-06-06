package com.vivo.push.b;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n extends s {
    private String a;
    private int b;
    private boolean c;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnLogCommand";
    }

    public n() {
        super(7);
        this.b = 0;
        this.c = false;
    }

    public final String d() {
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final int e() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final boolean f() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.a);
        aVar.a(KnbConstants.PARAMS_LOG_LEVEL, this.b);
        aVar.a("is_server_log", this.c);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.a("content");
        this.b = aVar.b(KnbConstants.PARAMS_LOG_LEVEL, 0);
        this.c = aVar.e("is_server_log");
    }
}
