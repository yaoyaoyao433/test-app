package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.j;
import com.squareup.picasso.PicassoDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements c<com.bumptech.glide.load.resource.gifbitmap.a, PicassoDrawable> {
    private final c<Bitmap, j> a;

    @Override // com.bumptech.glide.load.resource.transcode.c
    public final String a() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public a(c<Bitmap, j> cVar) {
        this.a = cVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.c
    public final l<PicassoDrawable> a(l<com.bumptech.glide.load.resource.gifbitmap.a> lVar) {
        com.bumptech.glide.load.resource.gifbitmap.a a = lVar.a();
        l<Bitmap> lVar2 = a.b;
        if (lVar2 != null) {
            return this.a.a(lVar2);
        }
        return a.a;
    }
}
