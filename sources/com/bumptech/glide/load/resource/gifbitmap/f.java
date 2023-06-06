package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements com.bumptech.glide.load.g<a> {
    private final com.bumptech.glide.load.g<Bitmap> a;
    private final com.bumptech.glide.load.g<com.bumptech.glide.load.resource.gif.b> b;

    public f(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.g<Bitmap> gVar) {
        this(gVar, new com.bumptech.glide.load.resource.gif.e(gVar, cVar));
    }

    public f(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.g<Bitmap> gVar, com.bumptech.glide.load.g<Bitmap>... gVarArr) {
        this(gVar, new com.bumptech.glide.load.resource.gif.e(new com.bumptech.glide.load.d(gVarArr), cVar));
    }

    private f(com.bumptech.glide.load.g<Bitmap> gVar, com.bumptech.glide.load.g<com.bumptech.glide.load.resource.gif.b> gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public final l<a> a(l<a> lVar, int i, int i2) {
        l<Bitmap> lVar2 = lVar.a().b;
        l<com.bumptech.glide.load.resource.gif.b> lVar3 = lVar.a().a;
        if (lVar2 != null && this.a != null) {
            l<Bitmap> a = this.a.a(lVar2, i, i2);
            if (!lVar2.equals(a)) {
                return new b(new a(a, lVar.a().a));
            }
        } else if (lVar3 != null && this.b != null) {
            l<com.bumptech.glide.load.resource.gif.b> a2 = this.b.a(lVar3, i, i2);
            if (!lVar3.equals(a2)) {
                return new b(new a(lVar.a().b, a2));
            }
        }
        return lVar;
    }

    @Override // com.bumptech.glide.load.g
    public final String a() {
        return this.a.a();
    }
}
