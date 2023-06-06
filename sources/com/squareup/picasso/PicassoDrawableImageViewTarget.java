package com.squareup.picasso;

import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoDrawableImageViewTarget extends PicassoDrawableTarget {
    private ImageView imageView;

    public PicassoDrawableImageViewTarget(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getTarget() {
        return this.imageView;
    }
}
