package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class d<TResult> implements com.huawei.hmf.tasks.b<TResult> {
    com.huawei.hmf.tasks.e<TResult> a;
    final Object b = new Object();
    private Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Executor executor, com.huawei.hmf.tasks.e<TResult> eVar) {
        this.a = eVar;
        this.c = executor;
    }

    @Override // com.huawei.hmf.tasks.b
    public final void a(final com.huawei.hmf.tasks.f<TResult> fVar) {
        if (!fVar.b() || fVar.c()) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.c, new Runnable() { // from class: com.huawei.hmf.tasks.a.d.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this.b) {
                    if (d.this.a != null) {
                        d.this.a.a(fVar.d());
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
