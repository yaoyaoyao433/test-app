package com.bumptech.glide.load.engine.prefill;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.bitmap_recycle.c;
import com.bumptech.glide.load.engine.cache.h;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private final h a;
    private final c b;
    private final com.bumptech.glide.load.a c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public a(h hVar, c cVar, com.bumptech.glide.load.a aVar) {
        this.a = hVar;
        this.b = cVar;
        this.c = aVar;
    }
}
