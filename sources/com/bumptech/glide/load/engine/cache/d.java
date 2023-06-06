package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d implements a.InterfaceC0040a {
    private final int a;
    private final a b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0040a
    public final com.bumptech.glide.load.engine.cache.a a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return e.a(a2, this.a);
        }
        return null;
    }
}
