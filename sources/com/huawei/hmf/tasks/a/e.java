package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.h;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class e<TResult> extends com.huawei.hmf.tasks.f<TResult> {
    public boolean b;
    public TResult c;
    public Exception d;
    private volatile boolean e;
    public final Object a = new Object();
    private List<com.huawei.hmf.tasks.b<TResult>> f = new ArrayList();

    private com.huawei.hmf.tasks.f<TResult> a(com.huawei.hmf.tasks.b<TResult> bVar) {
        boolean a;
        synchronized (this.a) {
            a = a();
            if (!a) {
                this.f.add(bVar);
            }
        }
        if (a) {
            bVar.a(this);
        }
        return this;
    }

    @Override // com.huawei.hmf.tasks.f
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.f
    public final boolean c() {
        return this.e;
    }

    @Override // com.huawei.hmf.tasks.f
    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            if (this.d != null) {
                throw new RuntimeException(this.d);
            }
            tresult = this.c;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.f
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.e = true;
            this.a.notifyAll();
            g();
            return true;
        }
    }

    public void g() {
        synchronized (this.a) {
            for (com.huawei.hmf.tasks.b<TResult> bVar : this.f) {
                try {
                    bVar.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    @Override // com.huawei.hmf.tasks.f
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.b && !this.e && this.d == null;
        }
        return z;
    }

    @Override // com.huawei.hmf.tasks.f
    public final com.huawei.hmf.tasks.f<TResult> a(com.huawei.hmf.tasks.c<TResult> cVar) {
        return a(new b(h.a(), cVar));
    }

    @Override // com.huawei.hmf.tasks.f
    public final com.huawei.hmf.tasks.f<TResult> a(com.huawei.hmf.tasks.e<TResult> eVar) {
        return a(new d(h.a(), eVar));
    }

    @Override // com.huawei.hmf.tasks.f
    public final com.huawei.hmf.tasks.f<TResult> a(com.huawei.hmf.tasks.d dVar) {
        return a(new c(h.a(), dVar));
    }
}
