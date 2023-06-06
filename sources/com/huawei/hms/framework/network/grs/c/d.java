package com.huawei.hms.framework.network.grs.c;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements Callable<f> {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ String b;
    final /* synthetic */ com.huawei.hms.framework.network.grs.a.c c;
    final /* synthetic */ e d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.a.c cVar) {
        this.d = eVar;
        this.a = executorService;
        this.b = str;
        this.c = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public f call() {
        f b;
        b = this.d.b(this.a, this.b, this.c);
        return b;
    }
}
