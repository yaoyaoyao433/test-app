package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements com.bumptech.glide.provider.b<com.bumptech.glide.load.model.g, a> {
    private final com.bumptech.glide.load.e<File, a> a;
    private final com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, a> b;
    private final com.bumptech.glide.load.f<a> c;
    private final com.bumptech.glide.load.b<com.bumptech.glide.load.model.g> d;

    public g(com.bumptech.glide.provider.b<com.bumptech.glide.load.model.g, Bitmap> bVar, com.bumptech.glide.provider.b<InputStream, com.bumptech.glide.load.resource.gif.b> bVar2, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        c cVar2 = new c(bVar.b(), bVar2.b(), cVar);
        this.a = new com.bumptech.glide.load.resource.file.c(new e(cVar2));
        this.b = cVar2;
        this.c = new d(bVar.d(), bVar2.d());
        this.d = bVar.c();
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, a> a() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, a> b() {
        return this.b;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<com.bumptech.glide.load.model.g> c() {
        return this.d;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<a> d() {
        return this.c;
    }
}
