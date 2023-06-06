package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d implements com.bumptech.glide.load.g<Bitmap> {
    private com.bumptech.glide.load.engine.bitmap_recycle.c a;

    protected abstract Bitmap a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, Bitmap bitmap, int i, int i2);

    public d(Context context) {
        this(com.bumptech.glide.k.a(context));
    }

    public d(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = cVar;
    }

    @Override // com.bumptech.glide.load.g
    public final com.bumptech.glide.load.engine.l<Bitmap> a(com.bumptech.glide.load.engine.l<Bitmap> lVar, int i, int i2) {
        if (!com.bumptech.glide.util.h.a(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Bitmap a = lVar.a();
        if (i == Integer.MIN_VALUE) {
            i = a.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = a.getHeight();
        }
        Bitmap a2 = a(this.a, a, i, i2);
        return a.equals(a2) ? lVar : c.a(a2, null, this.a);
    }
}
