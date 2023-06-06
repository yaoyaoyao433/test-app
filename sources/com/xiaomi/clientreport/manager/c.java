package com.xiaomi.clientreport.manager;
/* loaded from: classes6.dex */
public final class c implements Runnable {
    final /* synthetic */ com.xiaomi.clientreport.data.b a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar, com.xiaomi.clientreport.data.b bVar2) {
        this.b = bVar;
        this.a = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.b, this.a);
    }
}
