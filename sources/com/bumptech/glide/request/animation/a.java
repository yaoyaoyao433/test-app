package com.bumptech.glide.request.animation;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.animation.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> implements f<T> {
    private final f<Drawable> a;

    protected abstract Bitmap a(T t);

    public a() {
        this(new c());
    }

    private a(f<Drawable> fVar) {
        this.a = fVar;
    }

    @Override // com.bumptech.glide.request.animation.f
    public final e<T> a(boolean z, boolean z2) {
        return new C0046a(this.a.a(z, z2));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.request.animation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0046a implements e<T> {
        private final e<Drawable> b;

        public C0046a(e<Drawable> eVar) {
            this.b = eVar;
        }

        @Override // com.bumptech.glide.request.animation.e
        public final boolean a(T t, e.a aVar) {
            return this.b.a(new BitmapDrawable(aVar.o_().getResources(), a.this.a(t)), aVar);
        }
    }
}
