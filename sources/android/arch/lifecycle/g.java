package android.arch.lifecycle;

import android.arch.core.internal.b;
import android.arch.lifecycle.d;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends d {
    private final WeakReference<f> c;
    private android.arch.core.internal.a<e, a> b = new android.arch.core.internal.a<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d.b> g = new ArrayList<>();
    public d.b a = d.b.INITIALIZED;

    public g(@NonNull f fVar) {
        this.c = new WeakReference<>(fVar);
    }

    public final void a(@NonNull d.a aVar) {
        a(b(aVar));
    }

    public void a(d.b bVar) {
        if (this.a == bVar) {
            return;
        }
        this.a = bVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private boolean b() {
        if (this.b.e == 0) {
            return true;
        }
        d.b bVar = this.b.b.getValue().a;
        d.b bVar2 = this.b.c.getValue().a;
        return bVar == bVar2 && this.a == bVar2;
    }

    private d.b c(e eVar) {
        android.arch.core.internal.a<e, a> aVar = this.b;
        b.c<e, a> cVar = aVar.c(eVar) ? aVar.a.get(eVar).d : null;
        return a(a(this.a, cVar != null ? cVar.getValue().a : null), this.g.isEmpty() ? null : this.g.get(this.g.size() - 1));
    }

    @Override // android.arch.lifecycle.d
    public final void a(@NonNull e eVar) {
        f fVar;
        a aVar = new a(eVar, this.a == d.b.DESTROYED ? d.b.DESTROYED : d.b.INITIALIZED);
        if (this.b.a(eVar, aVar) == null && (fVar = this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            d.b c = c(eVar);
            this.d++;
            while (aVar.a.compareTo(c) < 0 && this.b.c(eVar)) {
                b(aVar.a);
                aVar.a(fVar, c(aVar.a));
                c();
                c = c(eVar);
            }
            if (!z) {
                d();
            }
            this.d--;
        }
    }

    private void c() {
        this.g.remove(this.g.size() - 1);
    }

    private void b(d.b bVar) {
        this.g.add(bVar);
    }

    @Override // android.arch.lifecycle.d
    public final void b(@NonNull e eVar) {
        this.b.b(eVar);
    }

    @Override // android.arch.lifecycle.d
    @NonNull
    public final d.b a() {
        return this.a;
    }

    static d.b b(d.a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return d.b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return d.b.STARTED;
            case ON_RESUME:
                return d.b.RESUMED;
            case ON_DESTROY:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private static d.a c(d.b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return d.a.ON_CREATE;
            case CREATED:
                return d.a.ON_START;
            case STARTED:
                return d.a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(f fVar) {
        android.arch.core.internal.b<e, a>.d a2 = this.b.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry next = a2.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.a) < 0 && !this.f && this.b.c(next.getKey())) {
                b(aVar.a);
                aVar.a(fVar, c(aVar.a));
                c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(f fVar) {
        d.a aVar;
        android.arch.core.internal.a<e, a> aVar2 = this.b;
        b.C0000b c0000b = new b.C0000b(aVar2.c, aVar2.b);
        aVar2.d.put(c0000b, Boolean.FALSE);
        while (c0000b.hasNext() && !this.f) {
            Map.Entry next = c0000b.next();
            a aVar3 = (a) next.getValue();
            while (aVar3.a.compareTo(this.a) > 0 && !this.f && this.b.c(next.getKey())) {
                d.b bVar = aVar3.a;
                switch (bVar) {
                    case INITIALIZED:
                        throw new IllegalArgumentException();
                    case CREATED:
                        aVar = d.a.ON_DESTROY;
                        break;
                    case STARTED:
                        aVar = d.a.ON_STOP;
                        break;
                    case RESUMED:
                        aVar = d.a.ON_PAUSE;
                        break;
                    case DESTROYED:
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException("Unexpected state value " + bVar);
                }
                b(b(aVar));
                aVar3.a(fVar, aVar);
                c();
            }
        }
    }

    private void d() {
        f fVar = this.c.get();
        if (fVar == null) {
            return;
        }
        while (!b()) {
            this.f = false;
            if (this.a.compareTo(this.b.b.getValue().a) < 0) {
                b(fVar);
            }
            b.c<e, a> cVar = this.b.c;
            if (!this.f && cVar != null && this.a.compareTo(cVar.getValue().a) > 0) {
                a(fVar);
            }
        }
        this.f = false;
    }

    static d.b a(@NonNull d.b bVar, @Nullable d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        d.b a;
        GenericLifecycleObserver b;

        a(e eVar, d.b bVar) {
            this.b = i.a(eVar);
            this.a = bVar;
        }

        final void a(f fVar, d.a aVar) {
            d.b b = g.b(aVar);
            this.a = g.a(this.a, b);
            this.b.a(fVar, aVar);
            this.a = b;
        }
    }
}
