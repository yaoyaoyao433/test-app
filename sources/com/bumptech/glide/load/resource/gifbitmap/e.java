package com.bumptech.glide.load.resource.gifbitmap;

import com.bumptech.glide.load.engine.l;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.e<InputStream, a> {
    private final com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, a> a;

    @Override // com.bumptech.glide.load.e
    public final /* synthetic */ l<a> a(InputStream inputStream, int i, int i2) throws IOException {
        return this.a.a(new com.bumptech.glide.load.model.g(inputStream, null), i, i2);
    }

    public e(com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, a> eVar) {
        this.a = eVar;
    }

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return this.a.a();
    }
}
