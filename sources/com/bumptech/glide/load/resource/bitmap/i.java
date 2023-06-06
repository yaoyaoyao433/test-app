package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends d {
    @Override // com.bumptech.glide.load.g
    public final String a() {
        return "FitCenter.com.bumptech.glide.load.resource.bitmap";
    }

    public i(Context context) {
        super(context);
    }

    public i(com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.d
    protected final Bitmap a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, Bitmap bitmap, int i, int i2) {
        return r.a(bitmap, cVar, i, i2);
    }
}
