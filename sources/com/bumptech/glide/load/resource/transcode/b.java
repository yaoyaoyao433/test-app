package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements c<Bitmap, j> {
    private final Resources a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c b;

    @Override // com.bumptech.glide.load.resource.transcode.c
    public final String a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public b(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = resources;
        this.b = cVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.c
    public final l<j> a(l<Bitmap> lVar) {
        return new k(new j(this.a, lVar.a()), this.b);
    }
}
