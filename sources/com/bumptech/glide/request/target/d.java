package com.bumptech.glide.request.target;

import android.widget.ImageView;
import com.squareup.picasso.PicassoDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d extends e<PicassoDrawable> {
    private int b;
    private PicassoDrawable c;

    @Override // com.bumptech.glide.request.target.e
    protected final /* synthetic */ void a(PicassoDrawable picassoDrawable) {
        ((ImageView) this.a).setImageDrawable(picassoDrawable);
    }

    @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
    public /* bridge */ /* synthetic */ void a(Object obj, com.bumptech.glide.request.animation.e eVar) {
        a((PicassoDrawable) obj, (com.bumptech.glide.request.animation.e<? super PicassoDrawable>) eVar);
    }

    public void a(PicassoDrawable picassoDrawable, com.bumptech.glide.request.animation.e<? super PicassoDrawable> eVar) {
        if (!picassoDrawable.a()) {
            float width = ((ImageView) this.a).getWidth() / ((ImageView) this.a).getHeight();
            float intrinsicWidth = picassoDrawable.getIntrinsicWidth() / picassoDrawable.getIntrinsicHeight();
            if (Math.abs(width - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                picassoDrawable = new k(picassoDrawable, ((ImageView) this.a).getWidth());
            }
        }
        super.a((d) picassoDrawable, (com.bumptech.glide.request.animation.e<? super d>) eVar);
        this.c = picassoDrawable;
        picassoDrawable.a(this.b);
        picassoDrawable.start();
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
