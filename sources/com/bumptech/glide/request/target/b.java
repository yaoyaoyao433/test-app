package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<Z> implements l<Z> {
    private com.bumptech.glide.request.c a;

    @Override // com.bumptech.glide.request.target.l
    public void a(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.l
    public void a(Exception exc, Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.l
    public void b(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.h
    public void c() {
    }

    @Override // com.bumptech.glide.manager.h
    public void d() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void e() {
    }

    @Override // com.bumptech.glide.request.target.l
    public void a(com.bumptech.glide.request.c cVar) {
        this.a = cVar;
    }

    @Override // com.bumptech.glide.request.target.l
    public com.bumptech.glide.request.c a() {
        return this.a;
    }
}
