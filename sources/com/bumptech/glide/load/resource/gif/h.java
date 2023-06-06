package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.e<com.bumptech.glide.gifdecoder.a, Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.c a;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }

    @Override // com.bumptech.glide.load.e
    public final /* synthetic */ l<Bitmap> a(com.bumptech.glide.gifdecoder.a aVar, int i, int i2) throws IOException {
        return com.bumptech.glide.load.resource.bitmap.c.a(aVar.e(), null, this.a);
    }

    public h(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = cVar;
    }
}
