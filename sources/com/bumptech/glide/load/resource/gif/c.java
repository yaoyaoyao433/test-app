package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import com.bumptech.glide.load.model.o;
import java.io.File;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.provider.b<InputStream, b> {
    private final j a;
    private final k b;
    private final o c = new o();
    private final com.bumptech.glide.load.resource.file.c<b> d;

    public c(Context context, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = new j(context, cVar);
        this.d = new com.bumptech.glide.load.resource.file.c<>(this.a);
        this.b = new k(cVar);
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<File, b> a() {
        return this.d;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.e<InputStream, b> b() {
        return this.a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<InputStream> c() {
        return this.c;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.f<b> d() {
        return this.b;
    }
}
