package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qv implements fi {
    public mn a;
    public qu b = null;
    public le c;

    public qv(mn mnVar, le leVar) {
        this.a = null;
        this.c = null;
        this.a = mnVar;
        this.c = leVar;
    }

    private void d() {
        if (this.a == null) {
            return;
        }
        this.a.i.a(this);
        if (this.b == null) {
            this.b = new qu(this.a, this.c);
        }
        try {
            this.b.start();
        } catch (Exception unused) {
        }
    }

    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void b() {
        if (this.b != null) {
            this.b.b();
            u();
        }
    }

    public final void c() {
        if (this.a == null) {
            return;
        }
        this.a.i.b(this);
        if (this.b != null) {
            this.b.c();
            this.b = null;
        }
    }

    private void a(qs qsVar) {
        if (this.b == null || qsVar == null) {
            return;
        }
        qu quVar = this.b;
        if (quVar.a == null || qsVar == null) {
            return;
        }
        quVar.a.add(qsVar);
    }

    private void b(qs qsVar) {
        if (this.b == null || qsVar == null) {
            return;
        }
        qu quVar = this.b;
        if (quVar.a == null || qsVar == null) {
            return;
        }
        quVar.a.remove(qsVar);
    }

    @Override // com.tencent.mapsdk.internal.fi
    public final void u() {
        if (this.b != null) {
            synchronized (this.b) {
                this.b.notify();
            }
        }
    }

    private void e() {
        c();
    }
}
