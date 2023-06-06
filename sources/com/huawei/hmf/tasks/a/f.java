package com.huawei.hmf.tasks.a;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public static final class a<TResult> implements com.huawei.hmf.tasks.d, com.huawei.hmf.tasks.e<TResult> {
        public final CountDownLatch a = new CountDownLatch(1);

        @Override // com.huawei.hmf.tasks.d
        public final void a(Exception exc) {
            this.a.countDown();
        }

        @Override // com.huawei.hmf.tasks.e
        public final void a(TResult tresult) {
            this.a.countDown();
        }
    }

    public static <TResult> TResult a(com.huawei.hmf.tasks.f<TResult> fVar) throws ExecutionException {
        if (fVar.b()) {
            return fVar.d();
        }
        throw new ExecutionException(fVar.e());
    }

    public final <TResult> com.huawei.hmf.tasks.f<TResult> a(Executor executor, final Callable<TResult> callable) {
        final com.huawei.hmf.tasks.g gVar = new com.huawei.hmf.tasks.g();
        try {
            com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.huawei.hmf.tasks.a.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        gVar.a((com.huawei.hmf.tasks.g) callable.call());
                    } catch (Exception e) {
                        gVar.a(e);
                    }
                }
            });
        } catch (Exception e) {
            gVar.a(e);
        }
        return gVar.a;
    }
}
