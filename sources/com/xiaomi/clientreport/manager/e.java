package com.xiaomi.clientreport.manager;

import com.xiaomi.push.m;
import java.util.concurrent.ExecutorService;
/* loaded from: classes6.dex */
public final class e extends m.a {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(b bVar) {
        this.a = bVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public final void run() {
        int f;
        ExecutorService executorService;
        f = this.a.f();
        if (f > 0) {
            executorService = this.a.a;
            executorService.execute(new f(this));
        }
    }
}
