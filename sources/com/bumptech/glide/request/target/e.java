package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.animation.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e<Z> extends m<ImageView, Z> implements e.a {
    protected abstract void a(Z z);

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.animation.e.a
    public final Drawable b() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // com.bumptech.glide.request.animation.e.a
    public void c(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public void a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public void a(Exception exc, Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
    public void b(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.l
    public void a(Z z, com.bumptech.glide.request.animation.e<? super Z> eVar) {
        if (eVar == null || !eVar.a(z, this)) {
            a((e<Z>) z);
        }
    }
}
