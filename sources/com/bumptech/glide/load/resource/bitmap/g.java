package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements com.bumptech.glide.provider.b<ParcelFileDescriptor, Bitmap> {
    private final com.bumptech.glide.load.e<File, Bitmap> a;
    private final h b;
    private final b c = new b();
    private final com.bumptech.glide.load.b<ParcelFileDescriptor> d = com.bumptech.glide.load.resource.a.b();

    public g(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this.a = new com.bumptech.glide.load.resource.file.c(new q(cVar, aVar));
        this.b = new h(cVar, aVar);
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, Bitmap> a() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<ParcelFileDescriptor, Bitmap> b() {
        return this.b;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<ParcelFileDescriptor> c() {
        return this.d;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<Bitmap> d() {
        return this.c;
    }
}
