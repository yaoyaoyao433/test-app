package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n implements com.bumptech.glide.provider.b<com.bumptech.glide.load.model.g, Bitmap> {
    private final m a;
    private final com.bumptech.glide.load.e<File, Bitmap> b;
    private final com.bumptech.glide.load.f<Bitmap> c;
    private final com.bumptech.glide.load.model.h d;

    public n(com.bumptech.glide.provider.b<InputStream, Bitmap> bVar, com.bumptech.glide.provider.b<ParcelFileDescriptor, Bitmap> bVar2) {
        this.c = bVar.d();
        this.d = new com.bumptech.glide.load.model.h(bVar.c(), bVar2.c());
        this.b = bVar.a();
        this.a = new m(bVar.b(), bVar2.b());
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, Bitmap> a() {
        return this.b;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> b() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<com.bumptech.glide.load.model.g> c() {
        return this.d;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<Bitmap> d() {
        return this.c;
    }
}
