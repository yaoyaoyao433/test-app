package com.bumptech.glide.load.resource.gif;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.bumptech.glide.load.resource.drawable.a<b> {
    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return null;
    }

    public d(b bVar) {
        super(bVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        return ((b) this.a).a.b.length + com.bumptech.glide.util.h.a(((b) this.a).a.i);
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
        ((b) this.a).stop();
        b bVar = (b) this.a;
        bVar.d = true;
        bVar.a.h.a(bVar.a.i);
        bVar.c.b();
        bVar.c.d = false;
    }
}
