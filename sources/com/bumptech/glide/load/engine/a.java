package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.engine.cache.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<A, T, Z> {
    private static final b d = new b();
    final f a;
    final com.bumptech.glide.load.g<T> b;
    final com.bumptech.glide.load.engine.b c;
    private final int e;
    private final int f;
    private final com.bumptech.glide.load.data.c<A> g;
    private final com.bumptech.glide.provider.b<A, T> h;
    private final com.bumptech.glide.load.resource.transcode.c<T, Z> i;
    private final InterfaceC0037a j;
    private final int k;
    private final b l;
    private volatile boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037a {
        com.bumptech.glide.load.engine.cache.a a();
    }

    public a(f fVar, int i, int i2, com.bumptech.glide.load.data.c<A> cVar, com.bumptech.glide.provider.b<A, T> bVar, com.bumptech.glide.load.g<T> gVar, com.bumptech.glide.load.resource.transcode.c<T, Z> cVar2, InterfaceC0037a interfaceC0037a, com.bumptech.glide.load.engine.b bVar2, int i3) {
        this(fVar, i, i2, cVar, bVar, gVar, cVar2, interfaceC0037a, bVar2, i3, d);
    }

    private a(f fVar, int i, int i2, com.bumptech.glide.load.data.c<A> cVar, com.bumptech.glide.provider.b<A, T> bVar, com.bumptech.glide.load.g<T> gVar, com.bumptech.glide.load.resource.transcode.c<T, Z> cVar2, InterfaceC0037a interfaceC0037a, com.bumptech.glide.load.engine.b bVar2, int i3, b bVar3) {
        this.a = fVar;
        this.e = i;
        this.f = i2;
        this.g = cVar;
        this.h = bVar;
        this.b = gVar;
        this.i = cVar2;
        this.j = interfaceC0037a;
        this.c = bVar2;
        this.k = i3;
        this.l = bVar3;
    }

    public final void cancel() {
        this.m = true;
        this.g.cancel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<Z> a(l<T> lVar) {
        long a = com.bumptech.glide.util.d.a();
        l<T> b2 = b(lVar);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transformed resource from source", a);
        }
        d(b2);
        long a2 = com.bumptech.glide.util.d.a();
        l<Z> c2 = c(b2);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transcoded transformed from source", a2);
        }
        return c2;
    }

    private void d(l<T> lVar) {
        if (lVar == null || !this.c.f) {
            return;
        }
        long a = com.bumptech.glide.util.d.a();
        this.j.a().a(this.a, new c(this.h.d(), lVar));
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Wrote transformed from source to cache", a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<T> a() throws Exception {
        l<T> lVar;
        try {
            long a = com.bumptech.glide.util.d.a();
            A a2 = this.g.a(this.k);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Fetched data", a);
            }
            if (this.m) {
                this.g.a();
                return null;
            }
            if (this.c.e) {
                int i = 0;
                if (a2 instanceof com.bumptech.glide.load.model.g) {
                    InputStream inputStream = ((com.bumptech.glide.load.model.g) a2).a;
                    if (inputStream instanceof com.bumptech.glide.load.resource.bitmap.l) {
                        i = ((com.bumptech.glide.load.resource.bitmap.l) inputStream).a;
                    }
                }
                long a3 = com.bumptech.glide.util.d.a();
                this.j.a().a(this.a.a(), new c(this.h.c(), a2));
                if (Log.isLoggable("DecodeJob", 2)) {
                    a("Wrote source to cache", a3);
                }
                long a4 = com.bumptech.glide.util.d.a();
                lVar = a(this.a.a(), i);
                if (Log.isLoggable("DecodeJob", 2) && lVar != null) {
                    a("Decoded source from cache", a4);
                }
            } else {
                long a5 = com.bumptech.glide.util.d.a();
                l<T> a6 = this.h.b().a(a2, this.e, this.f);
                if (Log.isLoggable("DecodeJob", 2)) {
                    a("Decoded from source", a5);
                }
                lVar = a6;
            }
            return lVar;
        } finally {
            this.g.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<T> a(com.bumptech.glide.load.c cVar, int i) throws IOException {
        l<T> a;
        File a2 = this.j.a().a(cVar);
        if (a2 == null) {
            return null;
        }
        try {
            com.bumptech.glide.load.e<File, T> a3 = this.h.a();
            if (a3 instanceof com.bumptech.glide.load.resource.file.c) {
                a = ((com.bumptech.glide.load.resource.file.c) a3).a(a2, this.e, this.f, i);
            } else {
                a = this.h.a().a(a2, this.e, this.f);
            }
            if (a == null) {
            }
            return a;
        } finally {
            this.j.a().b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<T> b(l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        l<T> a = this.b.a(lVar, this.e, this.f);
        if (!lVar.equals(a)) {
            lVar.d();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<Z> c(l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        l<Z> a = this.i.a(lVar);
        if (lVar.e() != null && a != null) {
            a.a(lVar.e());
            lVar.a(null);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.util.d.a(j));
        sb.append(", key: ");
        sb.append(this.a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c<DataType> implements a.b {
        private final com.bumptech.glide.load.b<DataType> b;
        private final DataType c;

        public c(com.bumptech.glide.load.b<DataType> bVar, DataType datatype) {
            this.b = bVar;
            this.c = datatype;
        }

        @Override // com.bumptech.glide.load.engine.cache.a.b
        public final boolean a(File file) {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    b unused = a.this.l;
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            }
            try {
                boolean a = this.b.a(this.c, bufferedOutputStream);
                try {
                    bufferedOutputStream.close();
                    return a;
                } catch (IOException unused2) {
                    return a;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "Failed to find file to write to disk cache", e);
                }
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }
    }
}
