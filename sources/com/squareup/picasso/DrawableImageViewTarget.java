package com.squareup.picasso;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.e;
import com.bumptech.glide.request.target.k;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DrawableImageViewTarget extends e<PicassoDrawable> {
    private int b;
    private PicassoDrawable c;

    @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
    public /* bridge */ /* synthetic */ void a(Object obj, com.bumptech.glide.request.animation.e eVar) {
        a((PicassoDrawable) obj, (com.bumptech.glide.request.animation.e<? super PicassoDrawable>) eVar);
    }

    public DrawableImageViewTarget(ImageView imageView, int i) {
        super(imageView);
        this.b = i;
    }

    public void a(PicassoDrawable picassoDrawable, com.bumptech.glide.request.animation.e<? super PicassoDrawable> eVar) {
        b(picassoDrawable, eVar);
    }

    @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public void a(Exception exc, Drawable drawable) {
        d(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(PicassoDrawable picassoDrawable, com.bumptech.glide.request.animation.e<? super PicassoDrawable> eVar) {
        if (!picassoDrawable.a()) {
            float width = ((ImageView) this.a).getWidth() / ((ImageView) this.a).getHeight();
            float intrinsicWidth = picassoDrawable.getIntrinsicWidth() / picassoDrawable.getIntrinsicHeight();
            if (Math.abs(width - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                picassoDrawable = new k(picassoDrawable, ((ImageView) this.a).getWidth());
            }
        }
        if (eVar == null || !eVar.a(picassoDrawable, this)) {
            a(picassoDrawable);
        }
        this.c = picassoDrawable;
        picassoDrawable.a(this.b);
        picassoDrawable.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bumptech.glide.request.target.e
    public void a(PicassoDrawable picassoDrawable) {
        ((ImageView) this.a).setImageDrawable(picassoDrawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.h
    public final void c() {
        if (this.c != null) {
            this.c.start();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.h
    public final void d() {
        if (this.c != null) {
            this.c.stop();
        }
    }
}
