package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.a;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.c;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements a {
    private static e a;
    private final c b = new c();
    private final j c = new j();
    private final File d;
    private final int e;
    private com.bumptech.glide.disklrucache.a f;

    public static synchronized a a(File file, int i) {
        e eVar;
        synchronized (e.class) {
            if (a == null) {
                a = new e(file, i);
            }
            eVar = a;
        }
        return eVar;
    }

    private e(File file, int i) {
        this.d = file;
        this.e = i;
    }

    private synchronized com.bumptech.glide.disklrucache.a a() throws IOException {
        if (this.f == null) {
            this.f = com.bumptech.glide.disklrucache.a.a(this.d, 1, 1, this.e);
        }
        return this.f;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final File a(com.bumptech.glide.load.c cVar) {
        try {
            a.c a2 = a().a(this.c.a(cVar));
            if (a2 != null) {
                return a2.a[0];
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final void a(com.bumptech.glide.load.c cVar, a.b bVar) {
        c.a aVar;
        String a2 = this.c.a(cVar);
        c cVar2 = this.b;
        synchronized (cVar2) {
            aVar = cVar2.a.get(cVar);
            if (aVar == null) {
                aVar = cVar2.b.a();
                cVar2.a.put(cVar, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            try {
                a.C0035a a3 = a().a(a2, -1L);
                if (a3 != null) {
                    try {
                        if (bVar.a(a3.a(0))) {
                            com.bumptech.glide.disklrucache.a.this.a(a3, true);
                            a3.c = true;
                        }
                        a3.b();
                    } catch (Throwable th) {
                        a3.b();
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.b.a(cVar);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final void b(com.bumptech.glide.load.c cVar) {
        try {
            a().b(this.c.a(cVar));
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e);
            }
        }
    }
}
