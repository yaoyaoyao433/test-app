package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.f<a> {
    private final com.bumptech.glide.load.f<Bitmap> a;
    private final com.bumptech.glide.load.f<com.bumptech.glide.load.resource.gif.b> b;
    private String c;

    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        a aVar = (a) ((l) obj).a();
        l<Bitmap> lVar = aVar.b;
        if (lVar != null) {
            return this.a.a(lVar, outputStream);
        }
        return this.b.a(aVar.a, outputStream);
    }

    public d(com.bumptech.glide.load.f<Bitmap> fVar, com.bumptech.glide.load.f<com.bumptech.glide.load.resource.gif.b> fVar2) {
        this.a = fVar;
        this.b = fVar2;
    }

    @Override // com.bumptech.glide.load.b
    public final String a() {
        if (this.c == null) {
            this.c = this.a.a() + this.b.a();
        }
        return this.c;
    }
}
