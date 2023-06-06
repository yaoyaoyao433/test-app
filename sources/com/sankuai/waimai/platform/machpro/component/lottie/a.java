package com.sankuai.waimai.platform.machpro.component.lottie;

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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Closeable {
    public static ChangeQuickRedirect a;
    public static final Charset b = Charset.forName("US-ASCII");
    public static final Charset c = Charset.forName("UTF-8");
    public final ThreadPoolExecutor d;
    private final File e;
    private final File f;
    private final File g;
    private final File h;
    private final int i;
    private long j;
    private final int k;
    private long l;
    private Writer m;
    private final LinkedHashMap<String, b> n;
    private int o;
    private long p;
    private final Callable<Void> q;

    public static /* synthetic */ int a(a aVar, int i) {
        aVar.o = 0;
        return 0;
    }

    private a(File file, int i, int i2, long j) {
        Object[] objArr = {file, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30dfbc9c97ddc19c63c41451a58dda60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30dfbc9c97ddc19c63c41451a58dda60");
            return;
        }
        this.l = 0L;
        this.n = new LinkedHashMap<>(0, 0.75f, true);
        this.p = 0L;
        this.d = com.sankuai.android.jarvis.c.a("mp-diskcache", 0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.q = new Callable<Void>() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.a.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7e9aa0d286e33ee2940a16588fff5d9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7e9aa0d286e33ee2940a16588fff5d9");
                }
                synchronized (a.this) {
                    if (a.this.m == null) {
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
        this.e = file;
        this.i = i;
        this.f = new File(file, DiskLruCache.JOURNAL_FILE);
        this.g = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.h = new File(file, "journal.bkp");
        this.k = i2;
        this.j = j;
    }

    public static a a(File file, int i, int i2, long j) throws IOException {
        Object[] objArr = {file, 1, 1, 1048576L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "121b983249c50278f18934ed13eba03b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "121b983249c50278f18934ed13eba03b");
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
        a aVar = new a(file, 1, 1, 1048576L);
        if (aVar.f.exists()) {
            try {
                aVar.a();
                aVar.b();
                return aVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "88dac3804a2811f1a8127b2fcbf32ebe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "88dac3804a2811f1a8127b2fcbf32ebe");
                } else {
                    aVar.close();
                    b(aVar.e);
                }
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, 1, 1, 1048576L);
        aVar2.c();
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
        throw new java.io.IOException("unexpected journal line: " + r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.component.lottie.a.a():void");
    }

    private void b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74120c947d695776667960694157f3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74120c947d695776667960694157f3c4");
            return;
        }
        a(this.g);
        Iterator<b> it = this.n.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.g == null) {
                for (int i = 0; i < this.k; i++) {
                    this.l += next.c[i];
                }
            } else {
                next.g = null;
                for (int i2 = 0; i2 < this.k; i2++) {
                    a(next.d[i2]);
                    a(next.e[i2]);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e84092105c3554daf0cc5ad252c9d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e84092105c3554daf0cc5ad252c9d5b");
            return;
        }
        if (this.m != null) {
            this.m.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), b));
        bufferedWriter.write(DiskLruCache.MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b bVar : this.n.values()) {
            if (bVar.g != null) {
                bufferedWriter.write("DIRTY " + bVar.b + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.b + bVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f.exists()) {
            a(this.f, this.h, true);
        }
        a(this.g, this.f, false);
        this.h.delete();
        this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), b));
    }

    private static void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f0353684109a350ab241742c5cb509b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f0353684109a350ab241742c5cb509b");
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        Object[] objArr = {file, file2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c37161f460078cf6967f67d47a9e604f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c37161f460078cf6967f67d47a9e604f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305a6937dead816d39c6e413b17859d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305a6937dead816d39c6e413b17859d3");
        }
        e();
        b bVar = this.n.get(str);
        if (bVar == null) {
            return null;
        }
        if (bVar.f) {
            for (File file : bVar.d) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.o++;
            this.m.append((CharSequence) "READ");
            this.m.append(Constants.SPACE);
            this.m.append((CharSequence) str);
            this.m.append('\n');
            if (d()) {
                this.d.submit(this.q);
            }
            return new c(str, bVar.h, bVar.d, bVar.c);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized C1061a a(String str, long j) throws IOException {
        Object[] objArr = {str, -1L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bedad5a200e5dcfe3a3aefc9b13f55b", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1061a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bedad5a200e5dcfe3a3aefc9b13f55b");
        }
        e();
        b bVar = this.n.get(str);
        if (bVar == null) {
            bVar = new b(str);
            this.n.put(str, bVar);
        } else if (bVar.g != null) {
            return null;
        }
        C1061a c1061a = new C1061a(bVar);
        bVar.g = c1061a;
        this.m.append((CharSequence) "DIRTY");
        this.m.append(Constants.SPACE);
        this.m.append((CharSequence) str);
        this.m.append('\n');
        this.m.flush();
        return c1061a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce3cae4ec785bf6197ed61789e67d01", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce3cae4ec785bf6197ed61789e67d01")).booleanValue() : this.o >= 2000 && this.o >= this.n.size();
    }

    private synchronized boolean b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6649b705e1b08df10106e0088c3b6203", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6649b705e1b08df10106e0088c3b6203")).booleanValue();
        }
        e();
        b bVar = this.n.get(str);
        if (bVar != null && bVar.g == null) {
            for (int i = 0; i < this.k; i++) {
                File file = bVar.d[i];
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                this.l -= bVar.c[i];
                bVar.c[i] = 0;
            }
            this.o++;
            this.m.append((CharSequence) "REMOVE");
            this.m.append(Constants.SPACE);
            this.m.append((CharSequence) str);
            this.m.append('\n');
            this.n.remove(str);
            if (d()) {
                this.d.submit(this.q);
            }
            return true;
        }
        return false;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f1d1b88ca069b7919c77efd3ac0295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f1d1b88ca069b7919c77efd3ac0295");
        } else if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f12f488ee0aaf65059d45853b612aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f12f488ee0aaf65059d45853b612aa");
        } else if (this.m == null) {
        } else {
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.g != null) {
                    bVar.g.a();
                }
            }
            f();
            this.m.close();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f97c02e4bd93830842b098adc23874b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f97c02e4bd93830842b098adc23874b");
            return;
        }
        while (this.l > this.j) {
            b(this.n.entrySet().iterator().next().getKey());
        }
    }

    private static void b(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "176467939ec30e58da1306cdd6ea9247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "176467939ec30e58da1306cdd6ea9247");
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class c {
        public static ChangeQuickRedirect a;
        final File[] b;
        private final String d;
        private final long e;
        private final long[] f;

        private c(String str, long j, File[] fileArr, long[] jArr) {
            Object[] objArr = {a.this, str, new Long(j), fileArr, jArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541d8d93b79139daca1146b292fd89cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541d8d93b79139daca1146b292fd89cb");
                return;
            }
            this.d = str;
            this.e = j;
            this.b = fileArr;
            this.f = jArr;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.machpro.component.lottie.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C1061a {
        public static ChangeQuickRedirect a;
        final b b;
        final boolean[] c;
        boolean d;

        private C1061a(b bVar) {
            Object[] objArr = {a.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab69383cd0855b1c32e72f4c0cdd62c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab69383cd0855b1c32e72f4c0cdd62c1");
                return;
            }
            this.b = bVar;
            this.c = bVar.f ? null : new boolean[a.this.k];
        }

        public final File a(int i) throws IOException {
            File file;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c26172b4bc40c397e79450f01e0f7cd", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c26172b4bc40c397e79450f01e0f7cd");
            }
            synchronized (a.this) {
                if (this.b.g != this) {
                    throw new IllegalStateException();
                }
                if (!this.b.f) {
                    this.c[i] = true;
                }
                file = this.b.e[i];
                if (!a.this.e.exists()) {
                    a.this.e.mkdirs();
                }
            }
            return file;
        }

        public final void a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118f7064b1f428fdd1410f3d375258c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118f7064b1f428fdd1410f3d375258c0");
            } else {
                a.this.a(this, false);
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0bb8392d5c448ee93ab6c03783e50ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0bb8392d5c448ee93ab6c03783e50ae");
            } else if (this.d) {
            } else {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class b {
        public static ChangeQuickRedirect a;
        final String b;
        final long[] c;
        public File[] d;
        public File[] e;
        boolean f;
        C1061a g;
        long h;

        private b(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7855cecb8ef0049066f3ae16b0e5ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7855cecb8ef0049066f3ae16b0e5ff");
                return;
            }
            this.b = str;
            this.c = new long[a.this.k];
            this.d = new File[a.this.k];
            this.e = new File[a.this.k];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CommonConstant.Symbol.DOT_CHAR);
            int length = sb.length();
            for (int i = 0; i < a.this.k; i++) {
                sb.append(i);
                this.d[i] = new File(a.this.e, sb.toString());
                sb.append(".tmp");
                this.e[i] = new File(a.this.e, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            long[] jArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3d02316ea66db1b189d43cb68acee1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3d02316ea66db1b189d43cb68acee1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56df430be2f64f0cd517274fbf65cd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56df430be2f64f0cd517274fbf65cd9");
            } else if (strArr.length != a.this.k) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d9716d6e19cb74e520e507b66e2b30", RobustBitConfig.DEFAULT_VALUE)) {
                return (IOException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d9716d6e19cb74e520e507b66e2b30");
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(C1061a c1061a, boolean z) throws IOException {
        Object[] objArr = {c1061a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cbaff12f63da012a85e5e9cb953b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cbaff12f63da012a85e5e9cb953b31");
            return;
        }
        b bVar = c1061a.b;
        if (bVar.g != c1061a) {
            throw new IllegalStateException();
        }
        if (z && !bVar.f) {
            for (int i = 0; i < this.k; i++) {
                if (!c1061a.c[i]) {
                    c1061a.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                } else if (!bVar.e[i].exists()) {
                    c1061a.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            File file = bVar.e[i2];
            if (z) {
                if (file.exists()) {
                    File file2 = bVar.d[i2];
                    file.renameTo(file2);
                    long j = bVar.c[i2];
                    long length = file2.length();
                    bVar.c[i2] = length;
                    this.l = (this.l - j) + length;
                }
            } else {
                a(file);
            }
        }
        this.o++;
        bVar.g = null;
        if (!((bVar.f ? 1 : 0) | (z ? 1 : 0))) {
            this.n.remove(bVar.b);
            this.m.append((CharSequence) "REMOVE");
            this.m.append(Constants.SPACE);
            this.m.append((CharSequence) bVar.b);
            this.m.append('\n');
        } else {
            bVar.f = true;
            this.m.append((CharSequence) "CLEAN");
            this.m.append(Constants.SPACE);
            this.m.append((CharSequence) bVar.b);
            this.m.append((CharSequence) bVar.a());
            this.m.append('\n');
            if (z) {
                long j2 = this.p;
                this.p = 1 + j2;
                bVar.h = j2;
            }
        }
        this.m.flush();
        if (this.l > this.j || d()) {
            this.d.submit(this.q);
        }
    }
}
