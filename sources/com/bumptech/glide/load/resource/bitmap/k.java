package com.bumptech.glide.load.resource.bitmap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends com.bumptech.glide.load.resource.drawable.a<j> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.c c;

    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return null;
    }

    public k(j jVar, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        super(jVar);
        this.c = cVar;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        return com.bumptech.glide.util.h.a(((j) this.a).a.a);
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
        this.c.a(((j) this.a).a.a);
    }
}
