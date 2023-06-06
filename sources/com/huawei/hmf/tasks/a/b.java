package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class b<TResult> implements com.huawei.hmf.tasks.b<TResult> {
    com.huawei.hmf.tasks.c<TResult> a;
    Executor b;
    final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Executor executor, com.huawei.hmf.tasks.c<TResult> cVar) {
        this.a = cVar;
        this.b = executor;
    }

    @Override // com.huawei.hmf.tasks.b
    public final void a(final com.huawei.hmf.tasks.f<TResult> fVar) {
        com.sankuai.waimai.launcher.util.aop.b.a(this.b, new Runnable() { // from class: com.huawei.hmf.tasks.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (b.this.c) {
                    if (b.this.a != null) {
                        b.this.a.onComplete(fVar);
                    }
                }
            }
        });
    }

    @Override // com.huawei.hmf.tasks.b
    public final void cancel() {
        synchronized (this.c) {
            this.a = null;
        }
    }
}
