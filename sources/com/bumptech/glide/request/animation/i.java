package com.bumptech.glide.request.animation;

import android.view.animation.Animation;
import com.bumptech.glide.request.animation.h;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i<R> implements f<R> {
    private final h.a a;
    private e<R> b;

    public i(Animation animation) {
        this(new a(animation));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h.a aVar) {
        this.a = aVar;
    }

    @Override // com.bumptech.glide.request.animation.f
    public final e<R> a(boolean z, boolean z2) {
        if (z || !z2) {
            return g.b();
        }
        if (this.b == null) {
            this.b = new h(this.a);
        }
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements h.a {
        private final Animation a;

        public a(Animation animation) {
            this.a = animation;
        }

        @Override // com.bumptech.glide.request.animation.h.a
        public final Animation a() {
            return this.a;
        }
    }
}
