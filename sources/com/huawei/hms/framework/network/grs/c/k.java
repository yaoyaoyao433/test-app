package com.huawei.hms.framework.network.grs.c;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class k implements Callable<f> {
    final /* synthetic */ com.huawei.hms.framework.network.grs.c.b.c a;
    final /* synthetic */ String b;
    final /* synthetic */ com.huawei.hms.framework.network.grs.a.c c;
    final /* synthetic */ m d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(m mVar, com.huawei.hms.framework.network.grs.c.b.c cVar, String str, com.huawei.hms.framework.network.grs.a.c cVar2) {
        this.d = mVar;
        this.a = cVar;
        this.b = str;
        this.c = cVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public f call() {
        com.huawei.hms.framework.network.grs.a.a aVar;
        ExecutorService executorService;
        com.huawei.hms.framework.network.grs.c.b.c cVar = this.a;
        aVar = this.d.d;
        e eVar = new e(cVar, aVar);
        executorService = this.d.a;
        return eVar.a(executorService, this.b, this.c);
    }
}
