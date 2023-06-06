package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.squareup.picasso.MonitorData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.engine.l<Bitmap> {
    private final Bitmap a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c b;
    private final String c;
    private MonitorData d;

    public static c a(Bitmap bitmap, String str, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, str, cVar);
    }

    public c(Bitmap bitmap, String str, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (cVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.a = bitmap;
        this.b = cVar;
        this.c = str;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        return com.bumptech.glide.util.h.a(this.a);
    }

    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
        if (this.b.a(this.a)) {
            return;
        }
        this.a.recycle();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final MonitorData e() {
        return this.d;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void a(MonitorData monitorData) {
        this.d = monitorData;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final /* bridge */ /* synthetic */ Bitmap a() {
        return this.a;
    }
}
