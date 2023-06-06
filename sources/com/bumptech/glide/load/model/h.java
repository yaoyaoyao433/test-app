package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.b<g> {
    private final com.bumptech.glide.load.b<InputStream> a;
    private final com.bumptech.glide.load.b<ParcelFileDescriptor> b;
    private String c;

    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(g gVar, OutputStream outputStream) {
        g gVar2 = gVar;
        if (gVar2.a != null) {
            return this.a.a(gVar2.a, outputStream);
        }
        return this.b.a(gVar2.b, outputStream);
    }

    public h(com.bumptech.glide.load.b<InputStream> bVar, com.bumptech.glide.load.b<ParcelFileDescriptor> bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // com.bumptech.glide.load.b
    public final String a() {
        if (this.c == null) {
            this.c = this.a.a() + this.b.a();
        }
        return this.c;
    }
}
