package com.bumptech.glide.request.animation;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bumptech.glide.request.animation.h;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c<T extends Drawable> implements f<T> {
    private final i<T> a;
    private final int b;
    private d<T> c;
    private d<T> d;

    public c() {
        this(300);
    }

    private c(int i) {
        this(new i(new a(300)), 300);
    }

    private c(i<T> iVar, int i) {
        this.a = iVar;
        this.b = i;
    }

    @Override // com.bumptech.glide.request.animation.f
    public final e<T> a(boolean z, boolean z2) {
        if (z) {
            return g.b();
        }
        if (z2) {
            if (this.c == null) {
                this.c = new d<>(this.a.a(false, true), this.b);
            }
            return this.c;
        }
        if (this.d == null) {
            this.d = new d<>(this.a.a(false, false), this.b);
        }
        return this.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements h.a {
        private final int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.bumptech.glide.request.animation.h.a
        public final Animation a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.a);
            return alphaAnimation;
        }
    }
}
