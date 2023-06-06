package com.bumptech.glide.request.animation;

import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.animation.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h<R> implements e<R> {
    private final a a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        Animation a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a aVar) {
        this.a = aVar;
    }

    @Override // com.bumptech.glide.request.animation.e
    public final boolean a(R r, e.a aVar) {
        View o_ = aVar.o_();
        if (o_ != null) {
            o_.clearAnimation();
            o_.startAnimation(this.a.a());
            return false;
        }
        return false;
    }
}
