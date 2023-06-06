package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class c<TResult> implements com.huawei.hmf.tasks.b<TResult> {
    com.huawei.hmf.tasks.d a;
    final Object b = new Object();
    private Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Executor executor, com.huawei.hmf.tasks.d dVar) {
        this.a = dVar;
        this.c = executor;
    }

    @Override // com.huawei.hmf.tasks.b
    public final void a(final com.huawei.hmf.tasks.f<TResult> fVar) {
        if (fVar.b() || fVar.c()) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.c, new Runnable() { // from class: com.huawei.hmf.tasks.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this.b) {
                    if (c.this.a != null) {
                        c.this.a.a(fVar.e());
                    }
                }
            }
        });
    }

    @Override // com.huawei.hmf.tasks.b
    public final void cancel() {
        synchronized (this.b) {
            this.a = null;
        }
    }
}
