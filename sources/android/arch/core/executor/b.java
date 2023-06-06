package android.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class b extends c {
    private final Object a = new Object();
    private ExecutorService b = Executors.newFixedThreadPool(2);
    @Nullable
    private volatile Handler c;

    @Override // android.arch.core.executor.c
    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // android.arch.core.executor.c
    public final void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    @Override // android.arch.core.executor.c
    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
