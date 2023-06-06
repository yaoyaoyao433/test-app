package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface Target {
    void onBitmapFailed(Drawable drawable);

    void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    void onPrepareLoad(Drawable drawable);
}
