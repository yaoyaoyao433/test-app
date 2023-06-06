package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.ji;
import com.tencent.mapsdk.internal.jj;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class jo<D extends jj> extends jh<D> {
    private static b a = new b() { // from class: com.tencent.mapsdk.internal.jo.1
        @Override // com.tencent.mapsdk.internal.jo.b
        public final String a(String str) {
            return jm.a(str);
        }
    };
    private c b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        DISK,
        DB
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        String a(String str);
    }

    public jo(c cVar) {
        this.b = cVar;
    }

    public c g() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class c implements ji.a {
        a i;
        public int j = p.JCE_MAX_STRING_LENGTH;
        public b k = jo.a;

        public c(a aVar) {
            this.i = aVar;
        }

        private c b() {
            this.j = -1;
            return this;
        }

        private c a(b bVar) {
            this.k = bVar;
            return this;
        }

        private a c() {
            return this.i;
        }

        private b d() {
            return this.k;
        }

        @Override // com.tencent.mapsdk.internal.ji.a
        public final int a() {
            return this.j;
        }

        public String toString() {
            return "Options{mType=" + this.i + ", mCacheSize=" + this.j + ", keyGenerator=" + this.k + '}';
        }
    }
}
