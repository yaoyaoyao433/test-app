package com.dianping.imagemanager.image.cache.disklrucache;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
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
public final class b implements Closeable {
    public static ChangeQuickRedirect a;
    public final ThreadPoolExecutor b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g;
    private long h;
    private final int i;
    private long j;
    private Writer k;
    private final LinkedHashMap<String, C0079b> l;
    private int m;
    private long n;
    private final Callable<Void> o;

    public static /* synthetic */ int a(b bVar, int i) {
        bVar.m = 0;
        return 0;
    }

    public static /* synthetic */ void a(b bVar, a aVar, boolean z) throws IOException {
        bVar.a(aVar, z);
    }

    private b(File file, int i, int i2, long j) {
        Object[] objArr = {file, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640d4ea105a4db871caa5e2775ee3a54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640d4ea105a4db871caa5e2775ee3a54");
            return;
        }
        this.j = 0L;
        this.l = new LinkedHashMap<>(0, 0.75f, true);
        this.n = 0L;
        this.b = com.sankuai.android.jarvis.c.a("dpimage-disklru", 0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.o = new Callable<Void>() { // from class: com.dianping.imagemanager.image.cache.disklrucache.b.1
            public static ChangeQuickRedirect a;

            {
                b.this = this;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6415e9ea6b0f217f9247d30933e808f4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6415e9ea6b0f217f9247d30933e808f4");
                }
                synchronized (b.this) {
                    if (b.this.k == null) {
                        return null;
                    }
                    b.this.f();
                    if (b.this.d()) {
                        b.this.c();
                        b.a(b.this, 0);
                    }
                    return null;
                }
            }
        };
        this.c = file;
        this.g = i;
        this.d = new File(file, DiskLruCache.JOURNAL_FILE);
        this.e = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.f = new File(file, "journal.bkp");
        this.i = i2;
        this.h = j;
    }

    public static b a(File file, int i, int i2, long j) throws IOException {
        Object[] objArr = {file, 1, 1, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f773fb1f28608706e458ebba8dc52c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f773fb1f28608706e458ebba8dc52c");
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
        b bVar = new b(file, 1, 1, j);
        if (bVar.d.exists()) {
            try {
                bVar.a();
                bVar.b();
                return bVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f04e5cd712948162f0c20349ee085cc1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f04e5cd712948162f0c20349ee085cc1");
                } else {
                    bVar.close();
                    e.a(bVar.c);
                }
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, 1, 1, j);
        bVar2.c();
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x012b, code lost:
        throw new java.io.IOException("unexpected journal line: " + r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.cache.disklrucache.b.a():void");
    }

    private void b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969dbc835811b3852746c1e2ad5bf08e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969dbc835811b3852746c1e2ad5bf08e");
            return;
        }
        a(this.e);
        Iterator<C0079b> it = this.l.values().iterator();
        while (it.hasNext()) {
            C0079b next = it.next();
            if (next.g == null) {
                for (int i = 0; i < this.i; i++) {
                    this.j += next.c[i];
                }
            } else {
                next.g = null;
                for (int i2 = 0; i2 < this.i; i2++) {
                    a(next.d[i2]);
                    a(next.e[i2]);
                }
                it.remove();
            }
        }
    }

    public synchronized void c() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a81759428f95b97a03d332b0eb7bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a81759428f95b97a03d332b0eb7bfc");
            return;
        }
        if (this.k != null) {
            this.k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), e.b));
        bufferedWriter.write(DiskLruCache.MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C0079b c0079b : this.l.values()) {
            if (c0079b.g != null) {
                bufferedWriter.write("DIRTY " + c0079b.b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c0079b.b + c0079b.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.d.exists()) {
            a(this.d, this.f, true);
        }
        a(this.e, this.d, false);
        this.f.delete();
        this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), e.b));
    }

    private static void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9104d04e0e97ebe39355b391eed2ad9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9104d04e0e97ebe39355b391eed2ad9b");
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        Object[] objArr = {file, file2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9222d481dd50062f3ba3af3991a320c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9222d481dd50062f3ba3af3991a320c0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78eb24d07927f80943de6c43727d3cfa", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78eb24d07927f80943de6c43727d3cfa");
        } else if (e()) {
            com.dianping.imagemanager.utils.a.b(com.dianping.imagemanager.image.cache.disklrucache.c.class, "isCacheClosed while get()!");
            return null;
        } else {
            C0079b c0079b = this.l.get(str);
            if (c0079b == null) {
                return null;
            }
            if (c0079b.f) {
                for (File file : c0079b.d) {
                    if (!file.exists()) {
                        return null;
                    }
                }
                this.m++;
                this.k.append((CharSequence) "READ");
                this.k.append(Constants.SPACE);
                this.k.append((CharSequence) str);
                this.k.append('\n');
                if (d()) {
                    this.b.submit(this.o);
                }
                return new c(str, c0079b.h, c0079b.d, c0079b.c);
            }
            return null;
        }
    }

    public synchronized a a(String str, long j) throws IOException {
        Object[] objArr = {str, -1L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c657c2675932a42a0d0fe1000e4bb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c657c2675932a42a0d0fe1000e4bb2");
        } else if (e()) {
            com.dianping.imagemanager.utils.a.b(com.dianping.imagemanager.image.cache.disklrucache.c.class, "isCacheClosed while edit()!");
            return null;
        } else {
            C0079b c0079b = this.l.get(str);
            if (c0079b == null) {
                c0079b = new C0079b(str);
                this.l.put(str, c0079b);
            } else if (c0079b.g != null) {
                com.dianping.imagemanager.utils.a.b(com.dianping.imagemanager.image.cache.disklrucache.c.class, "Another edit is in progress!");
                return null;
            }
            a aVar = new a(c0079b);
            c0079b.g = aVar;
            this.k.append((CharSequence) "DIRTY");
            this.k.append(Constants.SPACE);
            this.k.append((CharSequence) str);
            this.k.append('\n');
            this.k.flush();
            return aVar;
        }
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad66f839d5d1523d3a8561a8b61a794", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad66f839d5d1523d3a8561a8b61a794")).booleanValue() : this.m >= 2000 && this.m >= this.l.size();
    }

    private synchronized boolean b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2059194ddac2621feccb9b350df9ce95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2059194ddac2621feccb9b350df9ce95")).booleanValue();
        } else if (e()) {
            return false;
        } else {
            C0079b c0079b = this.l.get(str);
            if (c0079b != null && c0079b.g == null) {
                for (int i = 0; i < this.i; i++) {
                    File file = c0079b.d[i];
                    if (file.exists() && !file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                    this.j -= c0079b.c[i];
                    c0079b.c[i] = 0;
                }
                this.m++;
                this.k.append((CharSequence) "REMOVE");
                this.k.append(Constants.SPACE);
                this.k.append((CharSequence) str);
                this.k.append('\n');
                this.l.remove(str);
                if (d()) {
                    this.b.submit(this.o);
                }
                return true;
            }
            return false;
        }
    }

    private boolean e() {
        return this.k == null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030b81ba792b48b71d9772c46b9bcd76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030b81ba792b48b71d9772c46b9bcd76");
        } else if (this.k == null) {
        } else {
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                C0079b c0079b = (C0079b) it.next();
                if (c0079b.g != null) {
                    c0079b.g.a();
                }
            }
            f();
            this.k.close();
            this.k = null;
        }
    }

    public void f() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddba6e66ae8a68e764ada213b79fcaf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddba6e66ae8a68e764ada213b79fcaf7");
            return;
        }
        while (this.j > this.h) {
            b(this.l.entrySet().iterator().next().getKey());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class c {
        public static ChangeQuickRedirect a;
        final File[] b;
        private final String d;
        private final long e;
        private final long[] f;

        private c(String str, long j, File[] fileArr, long[] jArr) {
            b.this = r19;
            Object[] objArr = {r19, str, new Long(j), fileArr, jArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be598cd936029dbc86d191880907d27f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be598cd936029dbc86d191880907d27f");
                return;
            }
            this.d = str;
            this.e = j;
            this.b = fileArr;
            this.f = jArr;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class a {
        public static ChangeQuickRedirect a;
        final C0079b b;
        final boolean[] c;
        public boolean d;

        private a(C0079b c0079b) {
            b.this = r12;
            Object[] objArr = {r12, c0079b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0ec8e5caf8c8e6edeaa910dc28f260", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0ec8e5caf8c8e6edeaa910dc28f260");
                return;
            }
            this.b = c0079b;
            this.c = c0079b.f ? null : new boolean[r12.i];
        }

        public final File a(int i) throws IOException {
            File file;
            Object[] objArr = {0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c31aab1f6d5f61eefe33d2bfda52ab57", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c31aab1f6d5f61eefe33d2bfda52ab57");
            }
            synchronized (b.this) {
                if (this.b.g != this) {
                    throw new IllegalStateException();
                }
                if (!this.b.f) {
                    this.c[0] = true;
                }
                file = this.b.e[0];
                if (!b.this.c.exists()) {
                    b.this.c.mkdirs();
                }
            }
            return file;
        }

        public final void a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b318f019acbdea3054d33ea34dddd164", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b318f019acbdea3054d33ea34dddd164");
            } else {
                b.this.a(this, false);
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768c157596d4e9f49324a0de9e563bcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768c157596d4e9f49324a0de9e563bcb");
            } else if (this.d) {
            } else {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.image.cache.disklrucache.b$b */
    /* loaded from: classes.dex */
    public final class C0079b {
        public static ChangeQuickRedirect a;
        final String b;
        final long[] c;
        public File[] d;
        public File[] e;
        boolean f;
        a g;
        long h;

        private C0079b(String str) {
            b.this = r12;
            Object[] objArr = {r12, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc5b614eef26d5ff34aa5da31c48dff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc5b614eef26d5ff34aa5da31c48dff");
                return;
            }
            this.b = str;
            this.c = new long[r12.i];
            this.d = new File[r12.i];
            this.e = new File[r12.i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CommonConstant.Symbol.DOT_CHAR);
            int length = sb.length();
            for (int i = 0; i < r12.i; i++) {
                sb.append(i);
                this.d[i] = new File(r12.c, sb.toString());
                sb.append(".tmp");
                this.e[i] = new File(r12.c, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            long[] jArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3c8266867b26adc6132eab2606612a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3c8266867b26adc6132eab2606612a");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4706c9d418d72341a18576542afcd914", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4706c9d418d72341a18576542afcd914");
            } else if (strArr.length != b.this.i) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ecdb6d7e7d1e8faa892632033ed61b", RobustBitConfig.DEFAULT_VALUE)) {
                return (IOException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ecdb6d7e7d1e8faa892632033ed61b");
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    public synchronized void a(a aVar, boolean z) throws IOException {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc19dc306da97ac3c8c02c8ddf2018a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc19dc306da97ac3c8c02c8ddf2018a6");
            return;
        }
        C0079b c0079b = aVar.b;
        if (c0079b.g != aVar) {
            return;
        }
        if (z && !c0079b.f) {
            for (int i = 0; i < this.i; i++) {
                if (!aVar.c[i]) {
                    aVar.a();
                    com.dianping.imagemanager.utils.a.b(b.class, "Newly created entry didn't create value for index " + i);
                    return;
                } else if (!c0079b.e[i].exists()) {
                    aVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            File file = c0079b.e[i2];
            if (z) {
                if (file.exists()) {
                    File file2 = c0079b.d[i2];
                    file.renameTo(file2);
                    long j = c0079b.c[i2];
                    long length = file2.length();
                    c0079b.c[i2] = length;
                    this.j = (this.j - j) + length;
                }
            } else {
                a(file);
            }
        }
        this.m++;
        c0079b.g = null;
        if (!((c0079b.f ? 1 : 0) | (z ? 1 : 0))) {
            this.l.remove(c0079b.b);
            this.k.append((CharSequence) "REMOVE");
            this.k.append(Constants.SPACE);
            this.k.append((CharSequence) c0079b.b);
            this.k.append('\n');
        } else {
            c0079b.f = true;
            this.k.append((CharSequence) "CLEAN");
            this.k.append(Constants.SPACE);
            this.k.append((CharSequence) c0079b.b);
            this.k.append((CharSequence) c0079b.a());
            this.k.append('\n');
            if (z) {
                long j2 = this.n;
                this.n = 1 + j2;
                c0079b.h = j2;
            }
        }
        this.k.flush();
        if (this.j > this.h || d()) {
            this.b.submit(this.o);
        }
    }
}
