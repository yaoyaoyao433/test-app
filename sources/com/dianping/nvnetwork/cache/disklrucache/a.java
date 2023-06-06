package com.dianping.nvnetwork.cache.disklrucache;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.DiskLruCache;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements Closeable {
    public static ChangeQuickRedirect a;
    public static final Pattern b = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final OutputStream q = new OutputStream() { // from class: com.dianping.nvnetwork.cache.disklrucache.a.2
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    };
    public final File c;
    public final ThreadPoolExecutor d;
    private final File e;
    private final File f;
    private final File g;
    private final int h;
    private long i;
    private final int j;
    private long k;
    private Writer l;
    private final LinkedHashMap<String, b> m;
    private int n;
    private long o;
    private final Callable<Void> p;

    public static /* synthetic */ int a(a aVar, int i) {
        aVar.n = 0;
        return 0;
    }

    public static /* synthetic */ String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f9d469c2bdfda0cd186ddd8deeb77ac", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f9d469c2bdfda0cd186ddd8deeb77ac") : com.dianping.nvnetwork.cache.disklrucache.c.a((Reader) new InputStreamReader(inputStream, com.dianping.nvnetwork.cache.disklrucache.c.c));
    }

    private a(File file, int i, int i2, long j) {
        Object[] objArr = {file, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2b8b2016cf99b365c9083eabc44f5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2b8b2016cf99b365c9083eabc44f5b");
            return;
        }
        this.k = 0L;
        this.m = new LinkedHashMap<>(0, 0.75f, true);
        this.o = 0L;
        this.d = com.sankuai.android.jarvis.c.a("disk_lru", 0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.p = new Callable<Void>() { // from class: com.dianping.nvnetwork.cache.disklrucache.a.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d0c9fd8a9353012e01bcc03d865feb1", 6917529027641081856L)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d0c9fd8a9353012e01bcc03d865feb1");
                }
                synchronized (a.this) {
                    if (a.this.l == null) {
                        return null;
                    }
                    a.this.g();
                    if (a.this.e()) {
                        a.this.d();
                        a.a(a.this, 0);
                    }
                    return null;
                }
            }
        };
        this.c = file;
        this.h = i;
        this.e = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.g = new File(file, "journal.bkp");
        this.j = i2;
        this.i = j;
    }

    public static a a(File file, int i, int i2, long j) throws IOException {
        Object[] objArr = {file, 2, 4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f236c01eaf1ed9554db70f6177a224a4", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f236c01eaf1ed9554db70f6177a224a4");
        }
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
        a aVar = new a(file, 2, 4, j);
        if (aVar.e.exists()) {
            try {
                aVar.b();
                aVar.c();
                return aVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "dc99c99eb2f0b0cd32c576d6f313f4df", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "dc99c99eb2f0b0cd32c576d6f313f4df");
                } else {
                    aVar.close();
                    com.dianping.nvnetwork.cache.disklrucache.c.a(aVar.c);
                }
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, 2, 4, j);
        aVar2.d();
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
        throw new java.io.IOException("unexpected journal line: " + r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.cache.disklrucache.a.b():void");
    }

    private void c() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57414c20c43bd8bcd235c7df460dc5ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57414c20c43bd8bcd235c7df460dc5ba");
            return;
        }
        a(this.f);
        Iterator<b> it = this.m.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.e == null) {
                for (int i = 0; i < this.j; i++) {
                    this.k += next.c[i];
                }
            } else {
                next.e = null;
                for (int i2 = 0; i2 < this.j; i2++) {
                    a(next.a(i2));
                    a(next.b(i2));
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8755ab57ea6e0181e3440b5d5a7faa41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8755ab57ea6e0181e3440b5d5a7faa41");
            return;
        }
        if (this.l != null) {
            this.l.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f), com.dianping.nvnetwork.cache.disklrucache.c.b));
        bufferedWriter.write(DiskLruCache.MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.j));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.m.values()) {
            if (bVar.e != null) {
                bufferedWriter.write("DIRTY " + bVar.b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.b + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.e.exists()) {
            a(this.e, this.g, true);
        }
        a(this.f, this.e, false);
        this.g.delete();
        this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e, true), com.dianping.nvnetwork.cache.disklrucache.c.b));
    }

    private static void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39e61b586becd4b6f3dc53d325addc3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39e61b586becd4b6f3dc53d325addc3b");
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        Object[] objArr = {file, file2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8efcf8b3674794094c53889124edb563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8efcf8b3674794094c53889124edb563");
            return;
        }
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized c a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a7cb45175cb030fcd4b757eaa3d00e", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a7cb45175cb030fcd4b757eaa3d00e");
        }
        f();
        c(str);
        b bVar = this.m.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.d) {
            InputStream[] inputStreamArr = new InputStream[this.j];
            for (int i = 0; i < this.j; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(bVar.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.j && inputStreamArr[i2] != null; i2++) {
                        com.dianping.nvnetwork.cache.disklrucache.c.a(inputStreamArr[i2]);
                    }
                    return null;
                }
            }
            this.n++;
            this.l.append((CharSequence) ("READ " + str + '\n'));
            if (e()) {
                this.d.submit(this.p);
            }
            return new c(str, bVar.f, inputStreamArr, bVar.c);
        }
        return null;
    }

    public synchronized C0094a a(String str, long j) throws IOException {
        Object[] objArr = {str, -1L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e250cfa394ef441a566ef65d80f9ff79", 6917529027641081856L)) {
            return (C0094a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e250cfa394ef441a566ef65d80f9ff79");
        }
        f();
        c(str);
        b bVar = this.m.get(str);
        if (bVar == null) {
            bVar = new b(str);
            this.m.put(str, bVar);
        } else if (bVar.e != null) {
            return null;
        }
        C0094a c0094a = new C0094a(bVar);
        bVar.e = c0094a;
        Writer writer = this.l;
        writer.write("DIRTY " + str + '\n');
        this.l.flush();
        return c0094a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467591f4c7dcfff216ed215635f5649b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467591f4c7dcfff216ed215635f5649b")).booleanValue() : this.n >= 2000 && this.n >= this.m.size();
    }

    public final synchronized boolean b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78f2f6a5345b82feedb924885e9364b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78f2f6a5345b82feedb924885e9364b")).booleanValue();
        }
        f();
        c(str);
        b bVar = this.m.get(str);
        if (bVar != null && bVar.e == null) {
            for (int i = 0; i < this.j; i++) {
                File a2 = bVar.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                this.k -= bVar.c[i];
                bVar.c[i] = 0;
            }
            this.n++;
            this.l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.m.remove(str);
            if (e()) {
                this.d.submit(this.p);
            }
            return true;
        }
        return false;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870542fc28ae92b3762220323511e1ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870542fc28ae92b3762220323511e1ac");
        } else if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "928b6a51f95943e043a67db10908b1fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "928b6a51f95943e043a67db10908b1fa");
        } else if (this.l == null) {
        } else {
            Iterator it = new ArrayList(this.m.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.e != null) {
                    bVar.e.a();
                }
            }
            g();
            this.l.close();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc52920267e9fb7fb7824870674aca57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc52920267e9fb7fb7824870674aca57");
            return;
        }
        while (this.k > this.i) {
            b(this.m.entrySet().iterator().next().getKey());
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ced9b8779dcce892c0cdc85e7098018", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ced9b8779dcce892c0cdc85e7098018");
        } else if (b.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + CommonConstant.Symbol.DOUBLE_QUOTES);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class c implements Closeable {
        public static ChangeQuickRedirect a;
        public final InputStream[] b;
        private final String d;
        private final long e;
        private final long[] f;

        private c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            Object[] objArr = {a.this, str, new Long(j), inputStreamArr, jArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b86ef552df8e72c0cd8f83d024b4928", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b86ef552df8e72c0cd8f83d024b4928");
                return;
            }
            this.d = str;
            this.e = j;
            this.b = inputStreamArr;
            this.f = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0838893e37bce9cc3a5eaf17a7dd683", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0838893e37bce9cc3a5eaf17a7dd683");
                return;
            }
            for (InputStream inputStream : this.b) {
                com.dianping.nvnetwork.cache.disklrucache.c.a(inputStream);
            }
        }

        public final String a(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1323739c26ec084069b396d5fe7e5564", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1323739c26ec084069b396d5fe7e5564") : a.a(this.b[i]);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.cache.disklrucache.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0094a {
        public static ChangeQuickRedirect a;
        public final b b;
        final boolean[] c;
        public boolean d;
        public boolean e;

        private C0094a(b bVar) {
            Object[] objArr = {a.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb4fc9f7384ac9b883210e89b248eee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb4fc9f7384ac9b883210e89b248eee");
                return;
            }
            this.b = bVar;
            this.c = bVar.d ? null : new boolean[a.this.j];
        }

        public final OutputStream a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0095a c0095a;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57202e3274ada1b8d52fbf46b98247c8", 6917529027641081856L)) {
                return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57202e3274ada1b8d52fbf46b98247c8");
            }
            if (i < 0 || i >= a.this.j) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + a.this.j);
            }
            synchronized (a.this) {
                if (this.b.e != this) {
                    throw new IllegalStateException();
                }
                if (!this.b.d) {
                    this.c[i] = true;
                }
                File b = this.b.b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    a.this.c.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return a.q;
                    }
                }
                c0095a = new C0095a(fileOutputStream);
            }
            return c0095a;
        }

        public final void a(int i, String str) throws IOException {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39125bd5a7f6a954615bb517bbec4b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39125bd5a7f6a954615bb517bbec4b8");
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i), com.dianping.nvnetwork.cache.disklrucache.c.c);
                try {
                    outputStreamWriter2.write(str);
                    com.dianping.nvnetwork.cache.disklrucache.c.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.dianping.nvnetwork.cache.disklrucache.c.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0321d9bfb5233ef543c2116e4453aee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0321d9bfb5233ef543c2116e4453aee");
            } else {
                a.this.a(this, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.dianping.nvnetwork.cache.disklrucache.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0095a extends FilterOutputStream {
            public static ChangeQuickRedirect a;

            private C0095a(OutputStream outputStream) {
                super(outputStream);
                Object[] objArr = {C0094a.this, outputStream};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74555b87eae59091066d28aa549628bb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74555b87eae59091066d28aa549628bb");
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e93bb71bcab9cda37090bc945ae598", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e93bb71bcab9cda37090bc945ae598");
                    return;
                }
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0094a.this.d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9b9b0f53ad448ef93cf426ec478293", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9b9b0f53ad448ef93cf426ec478293");
                    return;
                }
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0094a.this.d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3738f9cb4625b7938c9589e962974cf7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3738f9cb4625b7938c9589e962974cf7");
                    return;
                }
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0094a.this.d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7be8a9366a36425a29e1616d99109c5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7be8a9366a36425a29e1616d99109c5");
                    return;
                }
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0094a.this.d = true;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class b {
        public static ChangeQuickRedirect a;
        public final String b;
        final long[] c;
        boolean d;
        C0094a e;
        long f;

        private b(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e105c2c973e3eade159083a87b32c3cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e105c2c973e3eade159083a87b32c3cb");
                return;
            }
            this.b = str;
            this.c = new long[a.this.j];
        }

        public final String a() throws IOException {
            long[] jArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c57100e1b05c8198a7aa33f12a145eb", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c57100e1b05c8198a7aa33f12a145eb");
            }
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(Constants.SPACE);
                sb.append(j);
            }
            return sb.toString();
        }

        void a(String[] strArr) throws IOException {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df34d51ba75557f85e6da8ba0d260a6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df34d51ba75557f85e6da8ba0d260a6c");
            } else if (strArr.length != a.this.j) {
                throw b(strArr);
            } else {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
            }
        }

        private IOException b(String[] strArr) throws IOException {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300412952d5fae4251fe798bcb19f648", 6917529027641081856L)) {
                return (IOException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300412952d5fae4251fe798bcb19f648");
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4bc069c3adcfe6b569be88aa523221", 6917529027641081856L)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4bc069c3adcfe6b569be88aa523221");
            }
            File file = a.this.c;
            return new File(file, this.b + CommonConstant.Symbol.DOT + i);
        }

        public final File b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3994f3d9bbe29b0c0cedabcf566892ae", 6917529027641081856L)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3994f3d9bbe29b0c0cedabcf566892ae");
            }
            File file = a.this.c;
            return new File(file, this.b + CommonConstant.Symbol.DOT + i + ".tmp");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C0094a c0094a, boolean z) throws IOException {
        Object[] objArr = {c0094a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf95b0b542a07e7f771a2416c16f9a15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf95b0b542a07e7f771a2416c16f9a15");
            return;
        }
        b bVar = c0094a.b;
        if (bVar.e != c0094a) {
            throw new IllegalStateException();
        }
        if (z && !bVar.d) {
            for (int i = 0; i < this.j; i++) {
                if (!c0094a.c[i]) {
                    c0094a.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!bVar.b(i).exists()) {
                    c0094a.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            File b2 = bVar.b(i2);
            if (z) {
                if (b2.exists()) {
                    File a2 = bVar.a(i2);
                    b2.renameTo(a2);
                    long j = bVar.c[i2];
                    long length = a2.length();
                    bVar.c[i2] = length;
                    this.k = (this.k - j) + length;
                }
            } else {
                a(b2);
            }
        }
        this.n++;
        bVar.e = null;
        if (!((bVar.d ? 1 : 0) | (z ? 1 : 0))) {
            this.m.remove(bVar.b);
            this.l.write("REMOVE " + bVar.b + '\n');
        } else {
            bVar.d = true;
            this.l.write("CLEAN " + bVar.b + bVar.a() + '\n');
            if (z) {
                long j2 = this.o;
                this.o = 1 + j2;
                bVar.f = j2;
            }
        }
        this.l.flush();
        if (this.k > this.i || e()) {
            this.d.submit(this.p);
        }
    }
}
