package com.bumptech.glide.provider;

import com.bumptech.glide.load.model.l;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<A, T, Z, R> implements f<A, T, Z, R>, Cloneable {
    public com.bumptech.glide.load.e<File, Z> a;
    public com.bumptech.glide.load.e<T, Z> b;
    public com.bumptech.glide.load.b<T> c;
    private final f<A, T, Z, R> d;
    private com.bumptech.glide.load.f<Z> e;
    private com.bumptech.glide.load.resource.transcode.c<Z, R> f;

    public a(f<A, T, Z, R> fVar) {
        this.d = fVar;
    }

    @Override // com.bumptech.glide.provider.f
    public final l<A, T> e() {
        return this.d.e();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, Z> a() {
        if (this.a != null) {
            return this.a;
        }
        return this.d.a();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<T, Z> b() {
        if (this.b != null) {
            return this.b;
        }
        return this.d.b();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<T> c() {
        if (this.c != null) {
            return this.c;
        }
        return this.d.c();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<Z> d() {
        if (this.e != null) {
            return this.e;
        }
        return this.d.d();
    }

    @Override // com.bumptech.glide.provider.f
    public final com.bumptech.glide.load.resource.transcode.c<Z, R> f() {
        if (this.f != null) {
            return this.f;
        }
        return this.d.f();
    }

    /* renamed from: g */
    public final a<A, T, Z, R> clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
