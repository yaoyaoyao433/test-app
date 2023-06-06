package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.engine.cache.h;
import com.bumptech.glide.load.engine.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends com.bumptech.glide.util.e<com.bumptech.glide.load.c, l<?>> implements h {
    private h.a a;

    @Override // com.bumptech.glide.util.e
    public final /* synthetic */ int a(l<?> lVar) {
        return lVar.c();
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public final /* synthetic */ l a(com.bumptech.glide.load.c cVar) {
        return (l) super.c(cVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.cache.h
    public final /* synthetic */ l a(com.bumptech.glide.load.c cVar, l lVar) {
        return (l) super.b(cVar, lVar);
    }

    @Override // com.bumptech.glide.util.e
    public final /* synthetic */ void a(com.bumptech.glide.load.c cVar, l<?> lVar) {
        l<?> lVar2 = lVar;
        if (this.a != null) {
            this.a.b(lVar2);
        }
    }

    public g(int i) {
        super(i);
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    public final void a(h.a aVar) {
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.h
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (i >= 60) {
            a();
        } else if (i >= 40) {
            b(this.b / 2);
        }
    }
}
