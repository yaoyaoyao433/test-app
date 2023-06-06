package com.xiaomi.clientreport.manager;
/* loaded from: classes6.dex */
public final class d implements Runnable {
    final /* synthetic */ com.xiaomi.clientreport.data.c a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b bVar, com.xiaomi.clientreport.data.c cVar) {
        this.b = bVar;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.b, this.a);
    }
}
