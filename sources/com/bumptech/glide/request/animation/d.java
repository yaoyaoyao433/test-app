package com.bumptech.glide.request.animation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.animation.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d<T extends Drawable> implements e<T> {
    private final e<T> a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.animation.e
    public final /* synthetic */ boolean a(Object obj, e.a aVar) {
        Drawable drawable = (Drawable) obj;
        Drawable b = aVar.b();
        if (b != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{b, drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.b);
            aVar.c(transitionDrawable);
            return true;
        }
        this.a.a(drawable, aVar);
        return false;
    }

    public d(e<T> eVar, int i) {
        this.a = eVar;
        this.b = i;
    }
}
