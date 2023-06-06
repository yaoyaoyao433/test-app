package com.squareup.picasso;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.animation.e;
import com.bumptech.glide.request.target.l;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoDrawableTarget {
    e<? super PicassoDrawable> animation;
    boolean isUserControl;
    l target;

    public void onLoadCleared(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public void setRequest(RequestProxy requestProxy) {
    }

    public PicassoDrawableTarget() {
    }

    public PicassoDrawableTarget(boolean z) {
        this.isUserControl = z;
    }

    public void userControl(boolean z) {
        this.isUserControl = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTarget(l lVar) {
        this.target = lVar;
    }

    public void onLoadFailed(Exception exc, Drawable drawable) {
        if (this.isUserControl && this.target != null && (this.target instanceof DrawableImageViewTarget)) {
            ((DrawableImageViewTarget) this.target).d(drawable);
        }
    }

    public void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
        if (this.isUserControl && this.target != null && (this.target instanceof DrawableImageViewTarget)) {
            ((DrawableImageViewTarget) this.target).b(picassoDrawable, this.animation);
        }
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
