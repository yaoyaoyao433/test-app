package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.g<b> {
    private final com.bumptech.glide.load.g<Bitmap> a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c b;

    public e(com.bumptech.glide.load.g<Bitmap> gVar, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = gVar;
        this.b = cVar;
    }

    @Override // com.bumptech.glide.load.g
    public final l<b> a(l<b> lVar, int i, int i2) {
        b a = lVar.a();
        Bitmap bitmap = lVar.a().a.i;
        Bitmap a2 = this.a.a(new com.bumptech.glide.load.resource.bitmap.c(bitmap, null, this.b), i, i2).a();
        return !a2.equals(bitmap) ? new d(new b(a, a2, this.a)) : lVar;
    }

    @Override // com.bumptech.glide.load.g
    public final String a() {
        return this.a.a();
    }
}
