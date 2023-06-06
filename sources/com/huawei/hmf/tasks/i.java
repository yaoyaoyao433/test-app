package com.huawei.hmf.tasks;

import android.os.Looper;
import com.huawei.hmf.tasks.a.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* loaded from: classes2.dex */
public final class i {
    private static com.huawei.hmf.tasks.a.f a = new com.huawei.hmf.tasks.a.f();

    public static <TResult> f<TResult> a(Callable<TResult> callable) {
        return a.a(h.b(), callable);
    }

    public static <TResult> TResult a(f<TResult> fVar) throws ExecutionException, InterruptedException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (fVar.a()) {
                return (TResult) com.huawei.hmf.tasks.a.f.a(fVar);
            }
            f.a aVar = new f.a();
            fVar.a((e) aVar).a((d) aVar);
            aVar.a.await();
            return (TResult) com.huawei.hmf.tasks.a.f.a(fVar);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }
}
