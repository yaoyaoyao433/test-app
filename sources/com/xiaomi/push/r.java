package com.xiaomi.push;

import com.xiaomi.push.p;
/* loaded from: classes6.dex */
public final class r implements Runnable {
    final /* synthetic */ p.b a;
    final /* synthetic */ p b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(p pVar, p.b bVar) {
        this.b = pVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
