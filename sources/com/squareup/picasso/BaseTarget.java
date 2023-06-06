package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.l;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BaseTarget {
    public l target;

    public void onBitmapFailed(Exception exc, Drawable drawable) {
    }

    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    public void onPrepareLoad(Drawable drawable) {
    }

    public void setTarget(l lVar) {
        this.target = lVar;
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
