package com.bumptech.glide.disklrucache;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.DiskLruCache;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements Closeable {
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final int f;
    private long g;
    private final int h;
    private Writer j;
    private int l;
    private long i = 0;
    private final LinkedHashMap<String, b> k = new LinkedHashMap<>(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor a = com.sankuai.android.jarvis.c.a("glide-diskcache", 0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> n = new Callable<Void>() { // from class: com.bumptech.glide.disklrucache.a.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.j == null) {
                    return null;
                }
                a.this.f();
                if (a.this.d()) {
                    a.this.c();
                    a.a(a.this, 0);
                }
                return null;
            }
        }
    };

    static /* synthetic */ int a(a aVar, int i) {
        aVar.l = 0;
        return 0;
    }

    private a(File file, int i, int i2, long j) {
        this.b = file;
        this.f = i;
        this.c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.d = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.e = new File(file, "journal.bkp");
        this.h = i2;
        this.g = j;
    }

    public static a a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        a aVar = new a(file, 1, 1, j);
        if (aVar.c.exists()) {
            try {
                aVar.a();
                aVar.b();
                return aVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                aVar.close();
                com.bumptech.glide.disklrucache.c.a(aVar.b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, 1, 1, j);
        aVar2.c();
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        throw new java.io.IOException("unexpected journal line: " + r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.a.a():void");
    }

    private void b() throws IOException {
        a(this.d);
        Iterator<b> it = this.k.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.h) {
                    this.i += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.h) {
                    a(next.c[i]);
                    a(next.d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() throws IOException {
        if (this.j != null) {
            this.j.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), com.bumptech.glide.disklrucache.c.a));
        bufferedWriter.write(DiskLruCache.MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.k.values()) {
            if (bVar.f != null) {
                bufferedWriter.write("DIRTY " + bVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.a + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.c.exists()) {
            a(this.c, this.e, true);
        }
        a(this.d, this.c, false);
        this.e.delete();
        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), com.bumptech.glide.disklrucache.c.a));
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized c a(String str) throws IOException {
        e();
        b bVar = this.k.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.e) {
            for (File file : bVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.l++;
            this.j.append((CharSequence) "READ");
            this.j.append(Constants.SPACE);
            this.j.append((CharSequence) str);
            this.j.append('\n');
            if (d()) {
                this.a.submit(this.n);
            }
            return new c(str, bVar.g, bVar.c, bVar.b);
        }
        return null;
    }

    public synchronized C0035a a(String str, long j) throws IOException {
        e();
        b bVar = this.k.get(str);
        if (bVar == null) {
            bVar = new b(str);
            this.k.put(str, bVar);
        } else if (bVar.f != null) {
            return null;
        }
        C0035a c0035a = new C0035a(bVar);
        bVar.f = c0035a;
        this.j.append((CharSequence) "DIRTY");
        this.j.append(Constants.SPACE);
        this.j.append((CharSequence) str);
        this.j.append('\n');
        this.j.flush();
        return c0035a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.l >= 2000 && this.l >= this.k.size();
    }

    public final synchronized boolean b(String str) throws IOException {
        e();
        b bVar = this.k.get(str);
        if (bVar != null && bVar.f == null) {
            for (int i = 0; i < this.h; i++) {
                File file = bVar.c[i];
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                this.i -= bVar.b[i];
                bVar.b[i] = 0;
            }
            this.l++;
            this.j.append((CharSequence) "REMOVE");
            this.j.append(Constants.SPACE);
            this.j.append((CharSequence) str);
            this.j.append('\n');
            this.k.remove(str);
            if (d()) {
                this.a.submit(this.n);
            }
            return true;
        }
        return false;
    }

    private void e() {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.j == null) {
            return;
        }
        Iterator it = new ArrayList(this.k.values()).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f != null) {
                bVar.f.a();
            }
        }
        f();
        this.j.close();
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws IOException {
        while (this.i > this.g) {
            b(this.k.entrySet().iterator().next().getKey());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class c {
        public final File[] a;
        private final String c;
        private final long d;
        private final long[] e;

        private c(String str, long j, File[] fileArr, long[] jArr) {
            this.c = str;
            this.d = j;
            this.a = fileArr;
            this.e = jArr;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.disklrucache.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0035a {
        final b a;
        final boolean[] b;
        public boolean c;

        private C0035a(b bVar) {
            this.a = bVar;
            this.b = bVar.e ? null : new boolean[a.this.h];
        }

        public final File a(int i) throws IOException {
            File file;
            synchronized (a.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.e) {
                    this.b[0] = true;
                }
                file = this.a.d[0];
                if (!a.this.b.exists()) {
                    a.this.b.mkdirs();
                }
            }
            return file;
        }

        public final void a() throws IOException {
            a.this.a(this, false);
        }

        public final void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class b {
        final String a;
        final long[] b;
        File[] c;
        File[] d;
        boolean e;
        C0035a f;
        long g;

        private b(String str) {
            this.a = str;
            this.b = new long[a.this.h];
            this.c = new File[a.this.h];
            this.d = new File[a.this.h];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CommonConstant.Symbol.DOT_CHAR);
            int length = sb.length();
            for (int i = 0; i < a.this.h; i++) {
                sb.append(i);
                this.c[i] = new File(a.this.b, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(a.this.b, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(Constants.SPACE);
                sb.append(j);
            }
            return sb.toString();
        }

        void a(String[] strArr) throws IOException {
            if (strArr.length != a.this.h) {
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

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0035a c0035a, boolean z) throws IOException {
        b bVar = c0035a.a;
        if (bVar.f != c0035a) {
            throw new IllegalStateException();
        }
        if (z && !bVar.e) {
            for (int i = 0; i < this.h; i++) {
                if (!c0035a.b[i]) {
                    c0035a.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!bVar.d[i].exists()) {
                    c0035a.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            File file = bVar.d[i2];
            if (z) {
                if (file.exists()) {
                    File file2 = bVar.c[i2];
                    file.renameTo(file2);
                    long j = bVar.b[i2];
                    long length = file2.length();
                    bVar.b[i2] = length;
                    this.i = (this.i - j) + length;
                }
            } else {
                a(file);
            }
        }
        this.l++;
        bVar.f = null;
        if (!(bVar.e | z)) {
            this.k.remove(bVar.a);
            this.j.append((CharSequence) "REMOVE");
            this.j.append(Constants.SPACE);
            this.j.append((CharSequence) bVar.a);
            this.j.append('\n');
        } else {
            bVar.e = true;
            this.j.append((CharSequence) "CLEAN");
            this.j.append(Constants.SPACE);
            this.j.append((CharSequence) bVar.a);
            this.j.append((CharSequence) bVar.a());
            this.j.append('\n');
            if (z) {
                long j2 = this.m;
                this.m = 1 + j2;
                bVar.g = j2;
            }
        }
        this.j.flush();
        if (this.i > this.g || d()) {
            this.a.submit(this.n);
        }
    }
}
