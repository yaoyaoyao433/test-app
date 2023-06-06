package android.arch.core.executor;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a extends c {
    private static volatile a b;
    @NonNull
    private static final Executor d = new Executor() { // from class: android.arch.core.executor.a.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.a().b(runnable);
        }
    };
    @NonNull
    private static final Executor e = new Executor() { // from class: android.arch.core.executor.a.2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.a().a(runnable);
        }
    };
    @NonNull
    private c c = new b();
    @NonNull
    public c a = this.c;

    private a() {
    }

    @NonNull
    public static a a() {
        if (b != null) {
            return b;
        }
        synchronized (a.class) {
            if (b == null) {
                b = new a();
            }
        }
        return b;
    }

    @Override // android.arch.core.executor.c
    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // android.arch.core.executor.c
    public final void b(Runnable runnable) {
        this.a.b(runnable);
    }

    @Override // android.arch.core.executor.c
    public final boolean b() {
        return this.a.b();
    }
}
