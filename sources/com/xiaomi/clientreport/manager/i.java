package com.xiaomi.clientreport.manager;

import com.xiaomi.push.as;
/* loaded from: classes6.dex */
public final class i implements Runnable {
    final /* synthetic */ as a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b bVar, as asVar) {
        this.b = bVar;
        this.a = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
