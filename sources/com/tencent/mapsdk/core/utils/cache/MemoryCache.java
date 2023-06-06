package com.tencent.mapsdk.core.utils.cache;

import android.support.annotation.Keep;
import com.tencent.mapsdk.internal.ji;
import com.tencent.mapsdk.internal.jj;
import com.tencent.mapsdk.internal.jk;
import com.tencent.mapsdk.internal.jq;
import com.tencent.mapsdk.internal.kn;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class MemoryCache<D extends jj> extends jq<D> {
    private static final float a = 0.9f;
    private static final float b = 0.15f;
    private final a c;
    private final jk.a<D> d;

    @Keep
    public MemoryCache(a aVar) {
        this.c = aVar;
        int i = (int) (((float) Runtime.getRuntime().totalMemory()) * a);
        this.d = new jk.a<>(this.c != null ? Math.min(Math.max(this.c.b, (int) (((float) Runtime.getRuntime().freeMemory()) * b)), i) : i, aVar.c);
    }

    private int a() {
        int i = (int) (((float) Runtime.getRuntime().totalMemory()) * a);
        return this.c != null ? Math.min(Math.max(this.c.b, (int) (((float) Runtime.getRuntime().freeMemory()) * b)), i) : i;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void a(String str, D d) {
        kn.b("MC", str);
        this.d.a((jk.a<D>) str, (String) d);
        kn.a("MC", str, "put data length", Integer.valueOf(d.a()));
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final D a(String str, Class<D> cls) {
        D d = (D) this.d.b((jk.a<D>) str);
        kn.a("MC", str, "get data length", Integer.valueOf(d == null ? 0 : d.a()));
        kn.f("MC", str);
        return d;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final boolean a(String str) {
        return this.d.c(str) != 0;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void b() {
        this.d.a();
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long c() {
        return this.d.d().size();
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long d() {
        return this.d.b();
    }

    @Override // com.tencent.mapsdk.internal.ji, com.tencent.mapsdk.internal.jp
    public final long e() {
        return this.d.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements ji.a {
        public int b;
        public ji.b c;

        private a a(int i) {
            this.b = i;
            return this;
        }

        private <D> a a(ji.b<D> bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.tencent.mapsdk.internal.ji.a
        public final int a() {
            return this.b;
        }

        public final String toString() {
            return "Options{mMaxCacheSize=" + this.b + '}';
        }

        private <D> ji.b<D> b() {
            return this.c;
        }
    }
}
