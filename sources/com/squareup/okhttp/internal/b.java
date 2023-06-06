package com.squareup.okhttp.internal;

import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.DiskLruCache;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.m;
import okio.r;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements Closeable {
    private final com.squareup.okhttp.internal.io.a c;
    private final File d;
    private final File e;
    private final File f;
    private final File g;
    private final int h;
    private long i;
    private final int j;
    private okio.d l;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final Executor u;
    static final /* synthetic */ boolean b = !b.class.desiredAssertionStatus();
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final r w = new r() { // from class: com.squareup.okhttp.internal.b.3
        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // okio.r, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // okio.r
        public final void write(okio.c cVar, long j) throws IOException {
            cVar.i(j);
        }

        @Override // okio.r
        public final t timeout() {
            return t.NONE;
        }
    };
    private long k = 0;
    private final LinkedHashMap<String, C1424b> m = new LinkedHashMap<>(0, 0.75f, true);
    private long t = 0;
    private final Runnable v = new Runnable() { // from class: com.squareup.okhttp.internal.b.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                if ((!b.this.p) || b.this.q) {
                    return;
                }
                try {
                    b.this.j();
                } catch (IOException unused) {
                    b.a(b.this, true);
                }
                try {
                    if (b.this.g()) {
                        b.this.f();
                        b.a(b.this, 0);
                    }
                } catch (IOException unused2) {
                    b.b(b.this, true);
                    b.this.l = m.a(b.w);
                }
            }
        }
    };

    static /* synthetic */ int a(b bVar, int i) {
        bVar.n = 0;
        return 0;
    }

    public static /* synthetic */ a a(b bVar, String str, long j) throws IOException {
        return bVar.a(str, j);
    }

    static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.r = true;
        return true;
    }

    static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.s = true;
        return true;
    }

    static /* synthetic */ boolean c(b bVar, boolean z) {
        bVar.o = true;
        return true;
    }

    private b(com.squareup.okhttp.internal.io.a aVar, File file, int i, int i2, long j, Executor executor) {
        this.c = aVar;
        this.d = file;
        this.h = i;
        this.e = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.g = new File(file, "journal.bkp");
        this.j = i2;
        this.i = j;
        this.u = executor;
    }

    private synchronized void b() throws IOException {
        if (!b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.p) {
            return;
        }
        if (this.c.e(this.g)) {
            if (this.c.e(this.e)) {
                this.c.d(this.g);
            } else {
                this.c.a(this.g, this.e);
            }
        }
        if (this.c.e(this.e)) {
            try {
                c();
                e();
                this.p = true;
                return;
            } catch (IOException e) {
                h.a();
                h.a("DiskLruCache " + this.d + " is corrupt: " + e.getMessage() + ", removing");
                close();
                this.c.g(this.d);
                this.q = false;
            }
        }
        f();
        this.p = true;
    }

    public static b a(com.squareup.okhttp.internal.io.a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        return new b(aVar, file, 201105, 2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), j.a("OkHttp DiskLruCache", true)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        throw new java.io.IOException("unexpected journal line: " + r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.c():void");
    }

    private okio.d d() throws FileNotFoundException {
        return m.a(new com.squareup.okhttp.internal.c(this.c.c(this.e)) { // from class: com.squareup.okhttp.internal.b.2
            static final /* synthetic */ boolean a = !b.class.desiredAssertionStatus();

            @Override // com.squareup.okhttp.internal.c
            protected final void a(IOException iOException) {
                if (!a && !Thread.holdsLock(b.this)) {
                    throw new AssertionError();
                }
                b.c(b.this, true);
            }
        });
    }

    private void e() throws IOException {
        this.c.d(this.f);
        Iterator<C1424b> it = this.m.values().iterator();
        while (it.hasNext()) {
            C1424b next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.j) {
                    this.k += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.j) {
                    this.c.d(next.c[i]);
                    this.c.d(next.d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() throws IOException {
        if (this.l != null) {
            this.l.close();
        }
        okio.d a2 = m.a(this.c.b(this.f));
        a2.b(DiskLruCache.MAGIC).h(10);
        a2.b("1").h(10);
        a2.n(this.h).h(10);
        a2.n(this.j).h(10);
        a2.h(10);
        for (C1424b c1424b : this.m.values()) {
            if (c1424b.f != null) {
                a2.b("DIRTY").h(32);
                a2.b(c1424b.a);
                a2.h(10);
            } else {
                a2.b("CLEAN").h(32);
                a2.b(c1424b.a);
                c1424b.a(a2);
                a2.h(10);
            }
        }
        a2.close();
        if (this.c.e(this.e)) {
            this.c.a(this.e, this.g);
        }
        this.c.a(this.f, this.e);
        this.c.d(this.g);
        this.l = d();
        this.o = false;
        this.s = false;
    }

    public final synchronized c a(String str) throws IOException {
        b();
        i();
        c(str);
        C1424b c1424b = this.m.get(str);
        if (c1424b != null && c1424b.e) {
            c a2 = c1424b.a();
            if (a2 == null) {
                return null;
            }
            this.n++;
            this.l.b("READ").h(32).b(str).h(10);
            if (g()) {
                com.sankuai.waimai.launcher.util.aop.b.a(this.u, this.v);
            }
            return a2;
        }
        return null;
    }

    public synchronized a a(String str, long j) throws IOException {
        b();
        i();
        c(str);
        C1424b c1424b = this.m.get(str);
        if (j == -1 || (c1424b != null && c1424b.g == j)) {
            if (c1424b == null || c1424b.f == null) {
                if (!this.r && !this.s) {
                    this.l.b("DIRTY").h(32).b(str).h(10);
                    this.l.flush();
                    if (this.o) {
                        return null;
                    }
                    if (c1424b == null) {
                        c1424b = new C1424b(str);
                        this.m.put(str, c1424b);
                    }
                    a aVar = new a(c1424b);
                    c1424b.f = aVar;
                    return aVar;
                }
                com.sankuai.waimai.launcher.util.aop.b.a(this.u, this.v);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.n >= 2000 && this.n >= this.m.size();
    }

    public final synchronized boolean b(String str) throws IOException {
        b();
        i();
        c(str);
        C1424b c1424b = this.m.get(str);
        if (c1424b == null) {
            return false;
        }
        a(c1424b);
        if (this.k <= this.i) {
            this.r = false;
        }
        return true;
    }

    private synchronized boolean h() {
        return this.q;
    }

    private synchronized void i() {
        if (h()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        C1424b[] c1424bArr;
        if (this.p && !this.q) {
            for (C1424b c1424b : (C1424b[]) this.m.values().toArray(new C1424b[this.m.size()])) {
                if (c1424b.f != null) {
                    c1424b.f.b();
                }
            }
            j();
            this.l.close();
            this.l = null;
            this.q = true;
            return;
        }
        this.q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws IOException {
        while (this.k > this.i) {
            a(this.m.values().iterator().next());
        }
        this.r = false;
    }

    private static void c(String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + CommonConstant.Symbol.DOUBLE_QUOTES);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class c implements Closeable {
        public final String a;
        public final long b;
        public final s[] c;
        private final long[] e;

        private c(String str, long j, s[] sVarArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = sVarArr;
            this.e = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (s sVar : this.c) {
                j.a(sVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a {
        final C1424b a;
        final boolean[] b;
        boolean c;
        private boolean e;

        private a(C1424b c1424b) {
            this.a = c1424b;
            this.b = c1424b.e ? null : new boolean[b.this.j];
        }

        public final r a(int i) throws IOException {
            com.squareup.okhttp.internal.c cVar;
            synchronized (b.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    this.b[i] = true;
                }
                try {
                    cVar = new com.squareup.okhttp.internal.c(b.this.c.b(this.a.d[i])) { // from class: com.squareup.okhttp.internal.b.a.1
                        @Override // com.squareup.okhttp.internal.c
                        protected final void a(IOException iOException) {
                            synchronized (b.this) {
                                a.this.c = true;
                            }
                        }
                    };
                } catch (FileNotFoundException unused) {
                    return b.w;
                }
            }
            return cVar;
        }

        public final void a() throws IOException {
            synchronized (b.this) {
                if (this.c) {
                    b.this.a(this, false);
                    b.this.a(this.a);
                } else {
                    b.this.a(this, true);
                }
                this.e = true;
            }
        }

        public final void b() throws IOException {
            synchronized (b.this) {
                b.this.a(this, false);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.okhttp.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C1424b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;
        long g;

        private C1424b(String str) {
            this.a = str;
            this.b = new long[b.this.j];
            this.c = new File[b.this.j];
            this.d = new File[b.this.j];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CommonConstant.Symbol.DOT_CHAR);
            int length = sb.length();
            for (int i = 0; i < b.this.j; i++) {
                sb.append(i);
                this.c[i] = new File(b.this.d, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(b.this.d, sb.toString());
                sb.setLength(length);
            }
        }

        void a(String[] strArr) throws IOException {
            if (strArr.length != b.this.j) {
                throw b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            }
        }

        final void a(okio.d dVar) throws IOException {
            for (long j : this.b) {
                dVar.h(32).n(j);
            }
        }

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        final c a() {
            if (Thread.holdsLock(b.this)) {
                s[] sVarArr = new s[b.this.j];
                long[] jArr = (long[]) this.b.clone();
                for (int i = 0; i < b.this.j; i++) {
                    try {
                        sVarArr[i] = b.this.c.a(this.c[i]);
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < b.this.j && sVarArr[i2] != null; i2++) {
                            j.a(sVarArr[i2]);
                        }
                        try {
                            b.this.a(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new c(this.a, this.g, sVarArr, jArr);
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar, boolean z) throws IOException {
        C1424b c1424b = aVar.a;
        if (c1424b.f != aVar) {
            throw new IllegalStateException();
        }
        if (z && !c1424b.e) {
            for (int i = 0; i < this.j; i++) {
                if (!aVar.b[i]) {
                    aVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!this.c.e(c1424b.d[i])) {
                    aVar.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            File file = c1424b.d[i2];
            if (z) {
                if (this.c.e(file)) {
                    File file2 = c1424b.c[i2];
                    this.c.a(file, file2);
                    long j = c1424b.b[i2];
                    long f = this.c.f(file2);
                    c1424b.b[i2] = f;
                    this.k = (this.k - j) + f;
                }
            } else {
                this.c.d(file);
            }
        }
        this.n++;
        c1424b.f = null;
        if (!(c1424b.e | z)) {
            this.m.remove(c1424b.a);
            this.l.b("REMOVE").h(32);
            this.l.b(c1424b.a);
            this.l.h(10);
        } else {
            c1424b.e = true;
            this.l.b("CLEAN").h(32);
            this.l.b(c1424b.a);
            c1424b.a(this.l);
            this.l.h(10);
            if (z) {
                long j2 = this.t;
                this.t = 1 + j2;
                c1424b.g = j2;
            }
        }
        this.l.flush();
        if (this.k > this.i || g()) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.u, this.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(C1424b c1424b) throws IOException {
        if (c1424b.f != null) {
            c1424b.f.c = true;
        }
        for (int i = 0; i < this.j; i++) {
            this.c.d(c1424b.c[i]);
            this.k -= c1424b.b[i];
            c1424b.b[i] = 0;
        }
        this.n++;
        this.l.b("REMOVE").h(32).b(c1424b.a).h(10);
        this.m.remove(c1424b.a);
        if (g()) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.u, this.v);
        }
        return true;
    }
}
