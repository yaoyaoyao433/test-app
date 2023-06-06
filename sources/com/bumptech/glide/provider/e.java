package com.bumptech.glide.provider;

import com.bumptech.glide.load.model.l;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<A, T, Z, R> implements f<A, T, Z, R> {
    private final l<A, T> a;
    private final com.bumptech.glide.load.resource.transcode.c<Z, R> b;
    private final b<T, Z> c;

    public e(l<A, T> lVar, com.bumptech.glide.load.resource.transcode.c<Z, R> cVar, b<T, Z> bVar) {
        if (lVar == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.a = lVar;
        if (cVar == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.b = cVar;
        if (bVar == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.c = bVar;
    }

    @Override // com.bumptech.glide.provider.f
    public final l<A, T> e() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.f
    public final com.bumptech.glide.load.resource.transcode.c<Z, R> f() {
        return this.b;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, Z> a() {
        return this.c.a();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<T, Z> b() {
        return this.c.b();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<T> c() {
        return this.c.c();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<Z> d() {
        return this.c.d();
    }
}
