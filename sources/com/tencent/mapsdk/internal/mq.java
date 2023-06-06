package com.tencent.mapsdk.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.tencent.mapsdk.internal.mr;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class mq<T extends mr> {
    protected sh a;
    private int i = 0;
    protected SparseArray<mp<T>> b = new SparseArray<>();
    protected SparseArray<mp<T>> c = new SparseArray<>();
    protected SparseArray<mp<T>> d = new SparseArray<>();
    protected SparseArray<mp<T>> e = new SparseArray<>();
    protected SparseArray<mp<T>> f = new SparseArray<>();
    protected SparseArray<mp<T>> g = new SparseArray<>();
    protected SparseArray<mp<T>> h = new SparseArray<>();

    protected abstract mp<T> a(T t);

    protected void c() {
    }

    protected void e() {
    }

    protected abstract void f();

    protected abstract void g();

    protected abstract void h();

    public mq(sh shVar) {
        this.a = shVar;
    }

    public synchronized mp<T> a(int i) {
        return this.b.get(i);
    }

    public synchronized mp<T> b(@NonNull T t) {
        mp<T> a;
        SparseArray<mp<T>> sparseArray;
        int i;
        a = a((mq<T>) t);
        do {
            sparseArray = this.b;
            i = this.i + 1;
            this.i = i;
        } while (sparseArray.get(i) != null);
        a.a = this.i;
        this.b.append(a.a, a);
        this.d.append(a.a, a);
        this.a.g(true);
        return a;
    }

    public final synchronized void a(@NonNull mp<T> mpVar) {
        if (this.b.get(mpVar.a) == null) {
            return;
        }
        this.f.append(mpVar.a, mpVar);
        this.a.g(true);
    }

    public final synchronized void b(@NonNull mp<T> mpVar) {
        if (this.b.get(mpVar.a) == null) {
            return;
        }
        if (this.d.get(mpVar.a) == null) {
            this.h.append(mpVar.a, mpVar);
        }
        this.b.remove(mpVar.a);
        this.d.remove(mpVar.a);
        this.f.remove(mpVar.a);
        this.a.g(true);
    }

    private synchronized void i() {
        this.h.clear();
        this.d.clear();
        this.f.clear();
        this.b.clear();
    }

    public final Context a() {
        if (this.a == null) {
            return null;
        }
        return this.a.z();
    }

    public final synchronized void b() {
        i();
    }

    public final synchronized void d() {
        c();
        SparseArray<mp<T>> sparseArray = this.g;
        this.g = this.h;
        this.h = sparseArray;
        SparseArray<mp<T>> sparseArray2 = this.e;
        this.e = this.f;
        this.f = sparseArray2;
        SparseArray<mp<T>> sparseArray3 = this.c;
        this.c = this.d;
        this.d = sparseArray3;
        this.d.clear();
        this.f.clear();
        this.h.clear();
        f();
        g();
        h();
        this.g.clear();
        this.e.clear();
        this.c.clear();
        e();
    }
}
