package com.xiaomi.clientreport.manager;

import com.xiaomi.push.at;
/* loaded from: classes6.dex */
public final class j implements Runnable {
    final /* synthetic */ at a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, at atVar) {
        this.b = bVar;
        this.a = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
