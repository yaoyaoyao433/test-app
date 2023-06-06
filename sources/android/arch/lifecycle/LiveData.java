package android.arch.lifecycle;

import android.arch.lifecycle.d;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    private static final Object b = new Object();
    private boolean h;
    private boolean i;
    private final Object a = new Object();
    private android.arch.core.internal.b<l<T>, LiveData<T>.b> c = new android.arch.core.internal.b<>();
    private int d = 0;
    private volatile Object e = b;
    private volatile Object f = b;
    private int g = -1;
    private final Runnable j = new Runnable() { // from class: android.arch.lifecycle.LiveData.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.b;
            }
            LiveData.this.b((LiveData) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LiveData<T>.b bVar) {
        if (bVar.d) {
            if (!bVar.a()) {
                bVar.a(false);
            } else if (bVar.e >= this.g) {
            } else {
                bVar.e = this.g;
                bVar.c.a(this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@Nullable LiveData<T>.b bVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bVar != null) {
                a((b) bVar);
                bVar = null;
            } else {
                android.arch.core.internal.b<l<T>, LiveData<T>.b>.d a2 = this.c.a();
                while (a2.hasNext()) {
                    a((b) ((b) a2.next().getValue()));
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    @MainThread
    public final void a(@NonNull f fVar, @NonNull l<T> lVar) {
        if (fVar.getLifecycle().a() == d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(fVar, lVar);
        LiveData<T>.b a2 = this.c.a(lVar, lifecycleBoundObserver);
        if (a2 != null && !a2.a(fVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        fVar.getLifecycle().a(lifecycleBoundObserver);
    }

    @MainThread
    public final void a(@NonNull l<T> lVar) {
        a aVar = new a(lVar);
        LiveData<T>.b a2 = this.c.a(lVar, aVar);
        if (a2 != null && (a2 instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        aVar.a(true);
    }

    @MainThread
    public final void b(@NonNull l<T> lVar) {
        a("removeObserver");
        LiveData<T>.b b2 = this.c.b(lVar);
        if (b2 == null) {
            return;
        }
        b2.b();
        b2.a(false);
    }

    public void a(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == b;
            this.f = t;
        }
        if (z) {
            android.arch.core.executor.a.a().b(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @MainThread
    public void b(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        b((b) null);
    }

    @Nullable
    public final T a() {
        T t = (T) this.e;
        if (t != b) {
            return t;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements GenericLifecycleObserver {
        @NonNull
        final f a;

        LifecycleBoundObserver(@NonNull f fVar, l<T> lVar) {
            super(lVar);
            this.a = fVar;
        }

        @Override // android.arch.lifecycle.LiveData.b
        final boolean a() {
            return this.a.getLifecycle().a().a(d.b.STARTED);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public final void a(f fVar, d.a aVar) {
            if (this.a.getLifecycle().a() == d.b.DESTROYED) {
                LiveData.this.b((l) this.c);
            } else {
                a(a());
            }
        }

        @Override // android.arch.lifecycle.LiveData.b
        final boolean a(f fVar) {
            return this.a == fVar;
        }

        @Override // android.arch.lifecycle.LiveData.b
        final void b() {
            this.a.getLifecycle().b(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public abstract class b {
        final l<T> c;
        boolean d;
        int e = -1;

        abstract boolean a();

        boolean a(f fVar) {
            return false;
        }

        void b() {
        }

        b(l<T> lVar) {
            this.c = lVar;
        }

        final void a(boolean z) {
            if (z == this.d) {
                return;
            }
            this.d = z;
            boolean z2 = LiveData.this.d == 0;
            LiveData.this.d += this.d ? 1 : -1;
            if (z2 && this.d) {
                LiveData.this.b();
            }
            int unused = LiveData.this.d;
            if (this.d) {
                LiveData.this.b(this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends LiveData<T>.b {
        @Override // android.arch.lifecycle.LiveData.b
        final boolean a() {
            return true;
        }

        a(l<T> lVar) {
            super(lVar);
        }
    }

    private static void a(String str) {
        if (android.arch.core.executor.a.a().a.b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }
}
