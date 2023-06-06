package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p implements com.bumptech.glide.provider.b<InputStream, Bitmap> {
    private final q a;
    private final com.bumptech.glide.load.resource.file.c<Bitmap> d;
    private final com.bumptech.glide.load.model.o c = new com.bumptech.glide.load.model.o();
    private final b b = new b();

    public p(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this.a = new q(cVar, aVar);
        this.d = new com.bumptech.glide.load.resource.file.c<>(this.a);
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, Bitmap> a() {
        return this.d;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<InputStream, Bitmap> b() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<InputStream> c() {
        return this.c;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<Bitmap> d() {
        return this.b;
    }
}
