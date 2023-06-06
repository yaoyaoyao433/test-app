package com.xiaomi.clientreport.manager;

import com.xiaomi.push.m;
import java.util.concurrent.ExecutorService;
/* loaded from: classes6.dex */
public final class g extends m.a {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar) {
        this.a = bVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public final void run() {
        int g;
        ExecutorService executorService;
        g = this.a.g();
        if (g > 0) {
            executorService = this.a.a;
            executorService.execute(new h(this));
        }
    }
}
