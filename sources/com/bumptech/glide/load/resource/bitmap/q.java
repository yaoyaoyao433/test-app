package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q implements com.bumptech.glide.load.e<InputStream, Bitmap> {
    private final f a;
    private com.bumptech.glide.load.engine.bitmap_recycle.c b;
    private com.bumptech.glide.load.a c;
    private String d;

    public q(Context context) {
        this(com.bumptech.glide.k.a(context));
    }

    private q(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this(cVar, com.bumptech.glide.load.a.d);
    }

    public q(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this(f.a, cVar, aVar);
    }

    public q(f fVar, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.a aVar) {
        this.a = fVar;
        this.b = cVar;
        this.c = aVar;
    }

    @Override // com.bumptech.glide.load.e
    public final com.bumptech.glide.load.engine.l<Bitmap> a(InputStream inputStream, int i, int i2) {
        a.C0044a a = this.a.a(inputStream, this.b, i, i2, this.c);
        c a2 = c.a(a.a, a.b, this.b);
        if (a2 != null) {
            a2.a(a.c);
        }
        return a2;
    }

    @Override // com.bumptech.glide.load.e
    public final String a() {
        if (this.d == null) {
            this.d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.a.a() + this.c.name();
        }
        return this.d;
    }
}
