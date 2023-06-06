package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.l;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoTarget implements Target {
    public int a = Integer.MIN_VALUE;
    l b;

    @Override // com.squareup.picasso.Target
    public void onBitmapFailed(Drawable drawable) {
    }

    @Override // com.squareup.picasso.Target
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    @Override // com.squareup.picasso.Target
    public void onPrepareLoad(Drawable drawable) {
    }

    public PicassoTarget(l lVar) {
        this.b = lVar;
    }
}
