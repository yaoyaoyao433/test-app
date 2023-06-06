package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements a.InterfaceC0036a {
    private final com.bumptech.glide.load.engine.bitmap_recycle.c a;

    public a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this.a = cVar;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0036a
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.b(i, i2, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0036a
    public final void a(Bitmap bitmap) {
        if (this.a.a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }
}
