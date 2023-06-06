package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.h;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<T extends h> {
    private final Queue<T> a = com.bumptech.glide.util.h.a(20);

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public final void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
