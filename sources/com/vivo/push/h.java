package com.vivo.push;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h implements Runnable {
    final /* synthetic */ com.vivo.push.b.b a;
    final /* synthetic */ String b;
    final /* synthetic */ e c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar, com.vivo.push.b.b bVar, String str) {
        this.c = eVar;
        this.a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a);
        this.c.e(this.b);
    }
}
