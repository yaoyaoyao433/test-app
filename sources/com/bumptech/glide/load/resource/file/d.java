package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.model.o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.provider.b<InputStream, File> {
    private static final a a = new a();
    private final e<File, File> b = new com.bumptech.glide.load.resource.file.a();
    private final com.bumptech.glide.load.b<InputStream> c = new o();

    @Override // com.bumptech.glide.provider.b
    public final e<File, File> a() {
        return this.b;
    }

    @Override // com.bumptech.glide.provider.b
    public final e<InputStream, File> b() {
        return a;
    }

    @Override // com.bumptech.glide.provider.b
    public final com.bumptech.glide.load.b<InputStream> c() {
        return this.c;
    }

    @Override // com.bumptech.glide.provider.b
    public final f<File> d() {
        return com.bumptech.glide.load.resource.b.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements e<InputStream, File> {
        @Override // com.bumptech.glide.load.e
        public final String a() {
            return "";
        }

        private a() {
        }

        @Override // com.bumptech.glide.load.e
        public final /* synthetic */ l<File> a(InputStream inputStream, int i, int i2) throws IOException {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }
    }
}
