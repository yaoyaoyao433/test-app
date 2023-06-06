package com.squareup.okhttp.internal.framed;

import android.support.v4.internal.view.SupportMenu;
import com.squareup.okhttp.internal.framed.b;
import com.squareup.okhttp.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements Closeable {
    static final /* synthetic */ boolean k = !d.class.desiredAssertionStatus();
    private static final ExecutorService l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.squareup.okhttp.internal.j.a("OkHttp FramedConnection", true));
    public final w a;
    final boolean b;
    long c;
    long d;
    public n e;
    final n f;
    final p g;
    final Socket h;
    public final com.squareup.okhttp.internal.framed.c i;
    final c j;
    private final b m;
    private final Map<Integer, e> n;
    private final String o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private final ExecutorService t;
    private Map<Integer, l> u;
    private final m v;
    private int w;
    private boolean x;
    private final Set<Integer> y;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class b {
        public static final b a = new b() { // from class: com.squareup.okhttp.internal.framed.d.b.1
            @Override // com.squareup.okhttp.internal.framed.d.b
            public final void a(e eVar) throws IOException {
                eVar.a(com.squareup.okhttp.internal.framed.a.REFUSED_STREAM);
            }
        };

        public abstract void a(e eVar) throws IOException;
    }

    static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.x = true;
        return true;
    }

    static /* synthetic */ boolean b(d dVar, boolean z) {
        dVar.r = true;
        return true;
    }

    private d(a aVar) throws IOException {
        this.n = new HashMap();
        this.s = System.nanoTime();
        this.c = 0L;
        this.e = new n();
        this.f = new n();
        this.x = false;
        this.y = new LinkedHashSet();
        this.a = aVar.f;
        this.v = aVar.g;
        this.b = aVar.h;
        this.m = aVar.e;
        this.q = aVar.h ? 1 : 2;
        if (aVar.h && this.a == w.HTTP_2) {
            this.q += 2;
        }
        this.w = aVar.h ? 1 : 2;
        if (aVar.h) {
            this.e.a(7, 0, 16777216);
        }
        this.o = aVar.b;
        if (this.a == w.HTTP_2) {
            this.g = new i();
            this.t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.squareup.okhttp.internal.j.a(String.format("OkHttp %s Push Observer", this.o), true));
            this.f.a(7, 0, SupportMenu.USER_MASK);
            this.f.a(5, 0, 16384);
        } else if (this.a == w.SPDY_3) {
            this.g = new o();
            this.t = null;
        } else {
            throw new AssertionError(this.a);
        }
        this.d = this.f.c(65536);
        this.h = aVar.a;
        this.i = this.g.a(aVar.d, this.b);
        this.j = new c(this.g.a(aVar.c, this.b));
        new Thread(this.j).start();
    }

    final synchronized e a(int i) {
        return this.n.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized e b(int i) {
        e remove;
        remove = this.n.remove(Integer.valueOf(i));
        if (remove != null && this.n.isEmpty()) {
            a(true);
        }
        notifyAll();
        return remove;
    }

    private synchronized void a(boolean z) {
        long nanoTime;
        if (z) {
            try {
                nanoTime = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            nanoTime = Long.MAX_VALUE;
        }
        this.s = nanoTime;
    }

    public final synchronized int a() {
        n nVar = this.f;
        if ((nVar.a & 16) != 0) {
            return nVar.d[4];
        }
        return Integer.MAX_VALUE;
    }

    public e a(int i, List<f> list, boolean z, boolean z2) throws IOException {
        int i2;
        e eVar;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.i) {
            synchronized (this) {
                if (this.r) {
                    throw new IOException("shutdown");
                }
                i2 = this.q;
                this.q += 2;
                eVar = new e(i2, this, z3, z4, list);
                if (eVar.a()) {
                    this.n.put(Integer.valueOf(i2), eVar);
                    a(false);
                }
            }
            this.i.a(z3, z4, i2, 0, list);
        }
        if (!z) {
            this.i.b();
        }
        return eVar;
    }

    public final void a(int i, boolean z, okio.c cVar, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.i.a(z, i, cVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.d <= 0) {
                    try {
                        if (!this.n.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.d), this.i.c());
                j2 = min;
                this.d -= j2;
            }
            j -= j2;
            this.i.a(z && j == 0, i, cVar, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final com.squareup.okhttp.internal.framed.a aVar) {
        l.submit(new com.squareup.okhttp.internal.f("OkHttp %s stream %d", new Object[]{this.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.1
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                try {
                    d.this.b(i, aVar);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, com.squareup.okhttp.internal.framed.a aVar) throws IOException {
        this.i.a(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final long j) {
        l.execute(new com.squareup.okhttp.internal.f("OkHttp Window Update %s stream %d", new Object[]{this.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.2
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                try {
                    d.this.i.a(i, j);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized l c(int i) {
        if (this.u != null) {
            return this.u.remove(Integer.valueOf(i));
        }
        return null;
    }

    public final void b() throws IOException {
        this.i.b();
    }

    private void a(com.squareup.okhttp.internal.framed.a aVar) throws IOException {
        synchronized (this.i) {
            synchronized (this) {
                if (this.r) {
                    return;
                }
                this.r = true;
                this.i.a(this.p, aVar, com.squareup.okhttp.internal.j.a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(com.squareup.okhttp.internal.framed.a.NO_ERROR, com.squareup.okhttp.internal.framed.a.CANCEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.squareup.okhttp.internal.framed.a aVar, com.squareup.okhttp.internal.framed.a aVar2) throws IOException {
        int i;
        e[] eVarArr;
        if (!k && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        l[] lVarArr = null;
        try {
            a(aVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (this.n.isEmpty()) {
                eVarArr = null;
            } else {
                eVarArr = (e[]) this.n.values().toArray(new e[this.n.size()]);
                this.n.clear();
                a(false);
            }
            if (this.u != null) {
                this.u = null;
                lVarArr = (l[]) this.u.values().toArray(new l[this.u.size()]);
            }
        }
        if (eVarArr != null) {
            IOException iOException = e;
            for (e eVar : eVarArr) {
                try {
                    eVar.a(aVar2);
                } catch (IOException e2) {
                    if (iOException != null) {
                        iOException = e2;
                    }
                }
            }
            e = iOException;
        }
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                lVar.cancel();
            }
        }
        try {
            this.i.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.h.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public Socket a;
        public String b;
        public okio.e c;
        public okio.d d;
        b e = b.a;
        public w f = w.SPDY_3;
        m g = m.a;
        boolean h = true;

        public a(boolean z) throws IOException {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c extends com.squareup.okhttp.internal.f implements b.a {
        final com.squareup.okhttp.internal.framed.b a;

        private c(com.squareup.okhttp.internal.framed.b bVar) {
            super("OkHttp %s", d.this.o);
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.squareup.okhttp.internal.framed.a] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4, types: [com.squareup.okhttp.internal.framed.d] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // com.squareup.okhttp.internal.f
        public final void c() {
            com.squareup.okhttp.internal.framed.a aVar;
            com.squareup.okhttp.internal.framed.a aVar2;
            com.squareup.okhttp.internal.framed.a aVar3 = com.squareup.okhttp.internal.framed.a.INTERNAL_ERROR;
            com.squareup.okhttp.internal.framed.a aVar4 = com.squareup.okhttp.internal.framed.a.INTERNAL_ERROR;
            try {
                try {
                    try {
                        try {
                            if (!d.this.b) {
                                this.a.a();
                            }
                            do {
                            } while (this.a.a(this));
                            aVar = com.squareup.okhttp.internal.framed.a.NO_ERROR;
                        } catch (Throwable th) {
                            com.squareup.okhttp.internal.framed.a aVar5 = aVar;
                            th = th;
                            aVar3 = aVar5;
                            try {
                                d.this.a(aVar3, aVar4);
                            } catch (IOException unused) {
                            }
                            com.squareup.okhttp.internal.j.a(this.a);
                            throw th;
                        }
                    } catch (IOException unused2) {
                    }
                    try {
                        aVar2 = com.squareup.okhttp.internal.framed.a.CANCEL;
                        aVar4 = d.this;
                    } catch (IOException unused3) {
                        aVar3 = aVar;
                        aVar = com.squareup.okhttp.internal.framed.a.PROTOCOL_ERROR;
                        aVar2 = com.squareup.okhttp.internal.framed.a.PROTOCOL_ERROR;
                        aVar4 = d.this;
                        aVar4.a(aVar, aVar2);
                        com.squareup.okhttp.internal.j.a(this.a);
                    }
                    aVar4.a(aVar, aVar2);
                } catch (Throwable th2) {
                    th = th2;
                    d.this.a(aVar3, aVar4);
                    com.squareup.okhttp.internal.j.a(this.a);
                    throw th;
                }
            } catch (IOException unused4) {
            }
            com.squareup.okhttp.internal.j.a(this.a);
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(boolean z, int i, okio.e eVar, int i2) throws IOException {
            if (d.a(d.this, i)) {
                d.a(d.this, i, eVar, i2, z);
                return;
            }
            e a = d.this.a(i);
            if (a == null) {
                d.this.a(i, com.squareup.okhttp.internal.framed.a.INVALID_STREAM);
                eVar.i(i2);
            } else if (!e.j && Thread.holdsLock(a)) {
                throw new AssertionError();
            } else {
                a.f.a(eVar, i2);
                if (z) {
                    a.e();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:8:0x001a, B:10:0x0022, B:12:0x0024, B:14:0x002e, B:16:0x0032, B:22:0x003c, B:23:0x0043, B:25:0x0045, B:27:0x004d, B:29:0x004f, B:31:0x005b, B:33:0x005d, B:34:0x009c, B:36:0x009e), top: B:81:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[Catch: all -> 0x0110, TryCatch #0 {, blocks: (B:8:0x001a, B:10:0x0022, B:12:0x0024, B:14:0x002e, B:16:0x0032, B:22:0x003c, B:23:0x0043, B:25:0x0045, B:27:0x004d, B:29:0x004f, B:31:0x005b, B:33:0x005d, B:34:0x009c, B:36:0x009e), top: B:81:0x001a }] */
        @Override // com.squareup.okhttp.internal.framed.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(boolean r15, boolean r16, int r17, int r18, java.util.List<com.squareup.okhttp.internal.framed.f> r19, com.squareup.okhttp.internal.framed.g r20) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.d.c.a(boolean, boolean, int, int, java.util.List, com.squareup.okhttp.internal.framed.g):void");
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(int i, com.squareup.okhttp.internal.framed.a aVar) {
            if (d.a(d.this, i)) {
                d.a(d.this, i, aVar);
                return;
            }
            e b = d.this.b(i);
            if (b != null) {
                b.c(aVar);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(boolean z, final n nVar) {
            int i;
            e[] eVarArr;
            long j;
            synchronized (d.this) {
                int c = d.this.f.c(65536);
                if (z) {
                    n nVar2 = d.this.f;
                    nVar2.c = 0;
                    nVar2.b = 0;
                    nVar2.a = 0;
                    Arrays.fill(nVar2.d, 0);
                }
                n nVar3 = d.this.f;
                for (int i2 = 0; i2 < 10; i2++) {
                    if (nVar.a(i2)) {
                        nVar3.a(i2, nVar.b(i2), nVar.d[i2]);
                    }
                }
                if (d.this.a == w.HTTP_2) {
                    d.l.execute(new com.squareup.okhttp.internal.f("OkHttp %s ACK Settings", new Object[]{d.this.o}) { // from class: com.squareup.okhttp.internal.framed.d.c.3
                        @Override // com.squareup.okhttp.internal.f
                        public final void c() {
                            try {
                                d.this.i.a(nVar);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
                int c2 = d.this.f.c(65536);
                eVarArr = null;
                if (c2 == -1 || c2 == c) {
                    j = 0;
                } else {
                    j = c2 - c;
                    if (!d.this.x) {
                        d dVar = d.this;
                        dVar.d += j;
                        if (j > 0) {
                            dVar.notifyAll();
                        }
                        d.a(d.this, true);
                    }
                    if (!d.this.n.isEmpty()) {
                        eVarArr = (e[]) d.this.n.values().toArray(new e[d.this.n.size()]);
                    }
                }
                d.l.execute(new com.squareup.okhttp.internal.f("OkHttp %s settings", d.this.o) { // from class: com.squareup.okhttp.internal.framed.d.c.2
                    @Override // com.squareup.okhttp.internal.f
                    public final void c() {
                        b unused = d.this.m;
                    }
                });
            }
            if (eVarArr == null || j == 0) {
                return;
            }
            for (e eVar : eVarArr) {
                synchronized (eVar) {
                    eVar.a(j);
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(boolean z, int i, int i2) {
            if (z) {
                l c = d.this.c(i);
                if (c != null) {
                    if (c.c != -1 || c.b == -1) {
                        throw new IllegalStateException();
                    }
                    c.c = System.nanoTime();
                    c.a.countDown();
                    return;
                }
                return;
            }
            d.b(d.this, true, i, i2, null);
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(int i, com.squareup.okhttp.internal.framed.a aVar, okio.f fVar) {
            e[] eVarArr;
            synchronized (d.this) {
                eVarArr = (e[]) d.this.n.values().toArray(new e[d.this.n.size()]);
                d.b(d.this, true);
            }
            for (e eVar : eVarArr) {
                if (eVar.c > i && eVar.b()) {
                    eVar.c(com.squareup.okhttp.internal.framed.a.REFUSED_STREAM);
                    d.this.b(eVar.c);
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (d.this) {
                    d.this.d += j;
                    d.this.notifyAll();
                }
                return;
            }
            e a = d.this.a(i);
            if (a != null) {
                synchronized (a) {
                    a.a(j);
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.b.a
        public final void a(int i, int i2, List<f> list) {
            d.a(d.this, i2, list);
        }
    }

    static /* synthetic */ void a(d dVar, boolean z, int i, int i2, l lVar) throws IOException {
        synchronized (dVar.i) {
            if (lVar != null) {
                try {
                    if (lVar.b != -1) {
                        throw new IllegalStateException();
                    }
                    lVar.b = System.nanoTime();
                } catch (Throwable th) {
                    throw th;
                }
            }
            dVar.i.a(z, i, i2);
        }
    }

    static /* synthetic */ boolean a(d dVar, int i) {
        return dVar.a == w.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ void a(d dVar, final int i, okio.e eVar, final int i2, final boolean z) throws IOException {
        final okio.c cVar = new okio.c();
        long j = i2;
        eVar.a(j);
        eVar.read(cVar, j);
        if (cVar.b != j) {
            throw new IOException(cVar.b + " != " + i2);
        }
        dVar.t.execute(new com.squareup.okhttp.internal.f("OkHttp %s Push Data[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.6
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                try {
                    d.this.v.a(i, cVar, i2, z);
                    d.this.i.a(i, com.squareup.okhttp.internal.framed.a.CANCEL);
                    synchronized (d.this) {
                        d.this.y.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    static /* synthetic */ void a(d dVar, final int i, final List list, final boolean z) {
        dVar.t.execute(new com.squareup.okhttp.internal.f("OkHttp %s Push Headers[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.5
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                m unused = d.this.v;
                try {
                    d.this.i.a(i, com.squareup.okhttp.internal.framed.a.CANCEL);
                    synchronized (d.this) {
                        d.this.y.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused2) {
                }
            }
        });
    }

    static /* synthetic */ void a(d dVar, final int i, final com.squareup.okhttp.internal.framed.a aVar) {
        dVar.t.execute(new com.squareup.okhttp.internal.f("OkHttp %s Push Reset[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.7
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                m unused = d.this.v;
                synchronized (d.this) {
                    d.this.y.remove(Integer.valueOf(i));
                }
            }
        });
    }

    static /* synthetic */ void b(d dVar, boolean z, final int i, final int i2, l lVar) {
        l.execute(new com.squareup.okhttp.internal.f("OkHttp %s ping %08x%08x", new Object[]{dVar.o, Integer.valueOf(i), Integer.valueOf(i2)}) { // from class: com.squareup.okhttp.internal.framed.d.3
            @Override // com.squareup.okhttp.internal.f
            public final void c() {
                try {
                    d.a(d.this, r4, i, i2, r7);
                } catch (IOException unused) {
                }
            }
        });
    }

    static /* synthetic */ void a(d dVar, final int i, final List list) {
        synchronized (dVar) {
            if (dVar.y.contains(Integer.valueOf(i))) {
                dVar.a(i, com.squareup.okhttp.internal.framed.a.PROTOCOL_ERROR);
                return;
            }
            dVar.y.add(Integer.valueOf(i));
            dVar.t.execute(new com.squareup.okhttp.internal.f("OkHttp %s Push Request[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.squareup.okhttp.internal.framed.d.4
                @Override // com.squareup.okhttp.internal.f
                public final void c() {
                    m unused = d.this.v;
                    try {
                        d.this.i.a(i, com.squareup.okhttp.internal.framed.a.CANCEL);
                        synchronized (d.this) {
                            d.this.y.remove(Integer.valueOf(i));
                        }
                    } catch (IOException unused2) {
                    }
                }
            });
        }
    }
}
