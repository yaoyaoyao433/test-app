package com.bumptech.glide.request;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements c, d {
    private c a;
    private c b;
    private d c;

    public h() {
        this(null);
    }

    public h(d dVar) {
        this.c = dVar;
    }

    public final void a(c cVar, c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    @Override // com.bumptech.glide.request.d
    public final boolean i() {
        return j() || g();
    }

    @Override // com.bumptech.glide.request.d
    public final void c(c cVar) {
        if (cVar.equals(this.b)) {
            return;
        }
        if (this.c != null) {
            this.c.c(this);
        }
        if (this.b.f()) {
            return;
        }
        this.b.c();
    }

    private boolean j() {
        return this.c != null && this.c.i();
    }

    @Override // com.bumptech.glide.request.c
    public final void b() {
        if (!this.b.e()) {
            this.b.b();
        }
        if (this.a.e()) {
            return;
        }
        this.a.b();
    }

    @Override // com.bumptech.glide.request.c
    public final void d() {
        this.a.d();
        this.b.d();
    }

    @Override // com.bumptech.glide.request.c
    public final void c() {
        this.b.c();
        this.a.c();
    }

    @Override // com.bumptech.glide.request.c
    public final boolean e() {
        return this.a.e();
    }

    @Override // com.bumptech.glide.request.c
    public final boolean f() {
        return this.a.f() || this.b.f();
    }

    @Override // com.bumptech.glide.request.c
    public final boolean g() {
        return this.a.g() || this.b.g();
    }

    @Override // com.bumptech.glide.request.c
    public final boolean h() {
        return this.a.h();
    }

    @Override // com.bumptech.glide.request.c
    public final void a() {
        this.a.a();
        this.b.a();
    }

    @Override // com.bumptech.glide.request.d
    public final boolean a(c cVar) {
        return (this.c == null || this.c.a(this)) && (cVar.equals(this.a) || !this.a.g());
    }

    @Override // com.bumptech.glide.request.d
    public final boolean b(c cVar) {
        return (this.c == null || this.c.b(this)) && cVar.equals(this.a) && !i();
    }
}
