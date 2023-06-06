package com.tencent.mapsdk.core.utils.cache;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.ji;
import com.tencent.mapsdk.internal.jj;
import com.tencent.mapsdk.internal.jk;
import com.tencent.mapsdk.internal.jo;
import com.tencent.mapsdk.internal.kc;
import com.tencent.mapsdk.internal.ki;
import com.tencent.mapsdk.internal.kn;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class DiskCache<D extends jj> extends jo<D> {
    private static final String a = "DiskCache";
    private static final String b = ".disk_idx";
    private static final String c = ".disk_idx_root";
    private static final a k = new a() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.1
        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final File a(String str, String str2, byte[] bArr) {
            File file = new File(str2, str);
            kc.a(file, bArr);
            return file;
        }

        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final byte[] a(String str, File file) {
            return kc.c(file);
        }

        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final boolean a(File file) {
            return kc.b(file);
        }
    };
    private jk.a<b> d;
    private c e;
    private File f;
    private File g;
    private Map<String, String> h;
    private List<String> i;
    private boolean j;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        File a(String str, String str2, byte[] bArr);

        boolean a(File file);

        byte[] a(String str, File file);
    }

    @Keep
    public DiskCache(c cVar) {
        super(cVar);
        this.e = cVar;
        if (this.e != null) {
            this.f = kc.a(this.e.c, this.e.d);
            this.j = this.e.j == -1;
            if (!this.j) {
                this.d = new jk.a<>(this.e.j, this.e.g);
            }
            this.g = kc.b(this.f, c);
            this.i = new ArrayList();
            this.h = new HashMap();
            List<String> d = kc.d(this.g);
            if (d != null) {
                for (String str : d) {
                    if (str.length() > 0) {
                        String[] split = str.split("#");
                        if (split.length > 1) {
                            for (String str2 : split[1].split(CommonConstant.Symbol.COMMA)) {
                                this.h.put(str2, split[0]);
                            }
                        }
                    }
                }
            }
            kn.a("loadRootIndex count:" + this.h.size(), "disk_cache_dir:" + this.f);
        }
    }

    private c n() {
        return this.e;
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void a(String str, D d) {
        if (TextUtils.isEmpty(str) || d == null) {
            return;
        }
        kn.b(ki.p, str);
        String a2 = this.e.k.a(str);
        byte[] b2 = d.b();
        if (b2 != null) {
            File a3 = this.e.e.a(a2, this.f.getAbsolutePath(), b2);
            if (!this.j || this.e.f != -1) {
                b bVar = new b(a3, b2.length);
                if (!this.j) {
                    this.d.a((jk.a<b>) a2, (String) bVar);
                }
                if (bVar.a != null) {
                    File parentFile = bVar.a.getParentFile();
                    File b3 = kc.b(parentFile, b);
                    String str2 = a2 + "#" + bVar.toString();
                    if (kc.d(b3, str2) == -1) {
                        kn.f(a).a("index writeLine data:".concat(String.valueOf(str2)));
                        kc.c(b3, str2);
                    }
                    int d2 = kc.d(this.g, parentFile.getAbsolutePath());
                    if (d2 != -1) {
                        String concat = CommonConstant.Symbol.COMMA.concat(String.valueOf(a2));
                        String a4 = kc.a(this.g, d2);
                        if (a4 != null && !a4.contains(a2)) {
                            kn.f(a).a("root writeAppend data:".concat(String.valueOf(concat)));
                            kc.a(this.g, d2, CommonConstant.Symbol.COMMA.concat(String.valueOf(a2)));
                        }
                    } else {
                        String str3 = parentFile.getAbsolutePath() + "#" + a2;
                        kn.f(a).a("root writeLine data:".concat(String.valueOf(str3)));
                        kc.c(this.g, str3);
                    }
                    this.h.put(a2, parentFile.getAbsolutePath());
                }
            }
        }
        kn.a(ki.p, str, "put data length", Integer.valueOf(b2 != null ? b2.length : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mapsdk.internal.ji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D a(java.lang.String r8, java.lang.Class<D> r9) {
        /*
            r7 = this;
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r0 = r7.e
            com.tencent.mapsdk.internal.jo$b r0 = r0.k
            java.lang.String r0 = r0.a(r8)
            boolean r1 = r7.j
            r2 = 0
            if (r1 == 0) goto L17
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r1 = r7.e
            long r3 = r1.f
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
        L17:
            r7.c(r0)
            boolean r1 = r7.j
            if (r1 != 0) goto L2b
            com.tencent.mapsdk.internal.jk$a<com.tencent.mapsdk.core.utils.cache.DiskCache$b> r1 = r7.d
            java.lang.Object r1 = r1.b(r0)
            com.tencent.mapsdk.core.utils.cache.DiskCache$b r1 = (com.tencent.mapsdk.core.utils.cache.DiskCache.b) r1
            if (r1 == 0) goto L2b
            java.io.File r1 = r1.a
            goto L2c
        L2b:
            r1 = r2
        L2c:
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r3 = r7.e
            com.tencent.mapsdk.core.utils.cache.DiskCache$a r3 = r3.e
            byte[] r0 = r3.a(r0, r1)
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r9.newInstance()     // Catch: java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L66
            r2 = r1
            com.tencent.mapsdk.internal.jj r2 = (com.tencent.mapsdk.internal.jj) r2     // Catch: java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L66
            r2.a(r0)     // Catch: java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L66
            goto L8b
        L41:
            r8 = move-exception
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The "
            r1.<init>(r2)
            java.lang.String r9 = r9.getSimpleName()
            r1.append(r9)
            java.lang.String r9 = " must have a empty construct. #"
            r1.append(r9)
            java.lang.String r9 = r8.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r8)
            throw r0
        L66:
            r8 = move-exception
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The "
            r1.<init>(r2)
            java.lang.String r9 = r9.getSimpleName()
            r1.append(r9)
            java.lang.String r9 = " must have a empty construct. #"
            r1.append(r9)
            java.lang.String r9 = r8.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r8)
            throw r0
        L8b:
            java.lang.String r9 = "DC"
            java.lang.String r1 = "get data length"
            if (r0 != 0) goto L93
            r0 = 0
            goto L94
        L93:
            int r0 = r0.length
        L94:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.tencent.mapsdk.internal.kn.a(r9, r8, r1, r0)
            java.lang.String r9 = "DC"
            com.tencent.mapsdk.internal.kn.f(r9, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.core.utils.cache.DiskCache.a(java.lang.String, java.lang.Class):com.tencent.mapsdk.internal.jj");
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final boolean a(String str) {
        String str2;
        String a2;
        String a3 = this.e.k.a(str);
        if (!this.j || this.e.f != -1) {
            c(a3);
            if (!this.j) {
                b bVar = (b) this.d.b((jk.a<b>) a3);
                r1 = bVar != null ? bVar.a : null;
                if (r1 != null && r1.exists()) {
                    this.d.c(a3);
                }
            }
            if (r1 != null && r1.exists() && (str2 = this.h.get(a3)) != null) {
                kn.f(a).a("key：".concat(String.valueOf(a3)), "dir : ".concat(String.valueOf(str2)));
                File file = new File(new File(str2), b);
                int d = kc.d(file, a3);
                if (d != -1) {
                    kc.b(file, d);
                }
                int d2 = kc.d(this.g, str2);
                if (d2 != -1 && (a2 = kc.a(this.g, d2)) != null && a2.contains(a3)) {
                    kc.b(this.g, d2, a2.replaceAll(a3 + CommonConstant.Symbol.COMMA, ""));
                }
            }
        }
        return this.e.e.a(r1);
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final void b() {
        if (this.f != null) {
            if (this.j) {
                this.e.e.a(this.f);
                return;
            }
            this.d.a();
            this.e.e.a(this.f);
        }
    }

    public final void f() {
        if (this.e == null || this.e.f == -1 || this.h.size() <= this.e.f) {
            return;
        }
        kn.a("cached tile count:" + this.h.size());
        new StringBuilder("cached tile count:").append(this.h.size());
        b();
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long c() {
        if (this.j) {
            if (this.e == null || this.e.f == -1) {
                return -1L;
            }
            return this.h.size();
        }
        return this.d.d().size();
    }

    @Override // com.tencent.mapsdk.internal.ji
    public final long d() {
        if (this.j) {
            return -1L;
        }
        return this.d.b();
    }

    @Override // com.tencent.mapsdk.internal.ji, com.tencent.mapsdk.internal.jp
    public final long e() {
        if (this.j) {
            return -1L;
        }
        return this.d.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c extends jo.c {
        static final long b = -1;
        public File c;
        public String d;
        public a e;
        long f;
        final ji.b<b> g;
        ji.b<File> h;

        public c() {
            super(jo.a.DISK);
            this.c = kc.d;
            this.d = "tmp";
            this.e = DiskCache.k;
            this.f = -1L;
            this.g = new ji.b<b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.ji.b
                public final /* synthetic */ boolean a(b bVar) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        boolean a = c.this.h != null ? c.this.h.a(bVar2.a) : false;
                        if (a) {
                            return a;
                        }
                        kc.b(bVar2.a);
                        return true;
                    }
                    return false;
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                private boolean a2(b bVar) {
                    if (bVar != null) {
                        boolean a = c.this.h != null ? c.this.h.a(bVar.a) : false;
                        if (a) {
                            return a;
                        }
                        kc.b(bVar.a);
                        return true;
                    }
                    return false;
                }
            };
        }

        private c(String str) {
            super(jo.a.DISK);
            this.c = kc.d;
            this.d = "tmp";
            this.e = DiskCache.k;
            this.f = -1L;
            this.g = new ji.b<b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.ji.b
                public final /* synthetic */ boolean a(b bVar) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        boolean a = c.this.h != null ? c.this.h.a(bVar2.a) : false;
                        if (a) {
                            return a;
                        }
                        kc.b(bVar2.a);
                        return true;
                    }
                    return false;
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                private boolean a2(b bVar) {
                    if (bVar != null) {
                        boolean a = c.this.h != null ? c.this.h.a(bVar.a) : false;
                        if (a) {
                            return a;
                        }
                        kc.b(bVar.a);
                        return true;
                    }
                    return false;
                }
            };
            this.d = str;
        }

        private c a(ji.b<File> bVar) {
            this.h = bVar;
            return this;
        }

        private c a(a aVar) {
            this.e = aVar;
            return this;
        }

        public final c b() {
            this.f = 1024L;
            return this;
        }

        private c a(File file) {
            this.c = file;
            return this;
        }

        private c a(String str) {
            this.d = str;
            return this;
        }

        private File c() {
            return new File(this.c, this.d);
        }

        @Override // com.tencent.mapsdk.internal.jo.c
        public final String toString() {
            return "Options{mCacheDirectory=" + this.c + ", mCacheName='" + this.d + "', fileAccessStrategy=" + this.e + "} " + super.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends jj {
        File a;
        private int b;

        @Override // com.tencent.mapsdk.internal.jj
        public final void a(byte[] bArr) {
        }

        b(File file, int i) {
            this.a = file;
            this.b = i;
        }

        @Override // com.tencent.mapsdk.internal.jj
        public final int a() {
            return this.b;
        }

        @Override // com.tencent.mapsdk.internal.jj
        public final byte[] b() {
            return new byte[this.b];
        }

        public final String toString() {
            return this.a.getName() + CommonConstant.Symbol.COMMA + this.b;
        }
    }

    private void o() {
        this.g = kc.b(this.f, c);
        this.i = new ArrayList();
        this.h = new HashMap();
        List<String> d = kc.d(this.g);
        if (d != null) {
            for (String str : d) {
                if (str.length() > 0) {
                    String[] split = str.split("#");
                    if (split.length > 1) {
                        for (String str2 : split[1].split(CommonConstant.Symbol.COMMA)) {
                            this.h.put(str2, split[0]);
                        }
                    }
                }
            }
        }
        kn.a("loadRootIndex count:" + this.h.size(), "disk_cache_dir:" + this.f);
    }

    private void c(String str) {
        String str2 = this.h.get(str);
        if (str2 == null || this.i.contains(str2)) {
            return;
        }
        kn.f(a).a("key：".concat(String.valueOf(str)), "dir : ".concat(String.valueOf(str2)));
        List<String> d = kc.d(kc.b(new File(str2), b));
        if (d == null || d.isEmpty()) {
            return;
        }
        kn.f(a).a(d.toArray());
        if (this.d != null) {
            for (String str3 : d) {
                String[] split = str3.split("#");
                String[] split2 = split[1].split(CommonConstant.Symbol.COMMA);
                this.d.a((jk.a<b>) split[0], (String) new b(new File(str2, split2[0]), Integer.parseInt(split2[1])));
            }
        }
        if (d.size() > 0) {
            this.i.add(str2);
        }
    }

    private void d(String str) {
        String a2;
        String str2 = this.h.get(str);
        if (str2 != null) {
            kn.f(a).a("key：".concat(String.valueOf(str)), "dir : ".concat(String.valueOf(str2)));
            File file = new File(new File(str2), b);
            int d = kc.d(file, str);
            if (d != -1) {
                kc.b(file, d);
            }
            int d2 = kc.d(this.g, str2);
            if (d2 == -1 || (a2 = kc.a(this.g, d2)) == null || !a2.contains(str)) {
                return;
            }
            kc.b(this.g, d2, a2.replaceAll(str + CommonConstant.Symbol.COMMA, ""));
        }
    }

    private void a(String str, b bVar) {
        if (bVar.a == null) {
            return;
        }
        File parentFile = bVar.a.getParentFile();
        File b2 = kc.b(parentFile, b);
        String str2 = str + "#" + bVar.toString();
        if (kc.d(b2, str2) == -1) {
            kn.f(a).a("index writeLine data:".concat(String.valueOf(str2)));
            kc.c(b2, str2);
        }
        int d = kc.d(this.g, parentFile.getAbsolutePath());
        if (d != -1) {
            String concat = CommonConstant.Symbol.COMMA.concat(String.valueOf(str));
            String a2 = kc.a(this.g, d);
            if (a2 != null && !a2.contains(str)) {
                kn.f(a).a("root writeAppend data:".concat(String.valueOf(concat)));
                kc.a(this.g, d, CommonConstant.Symbol.COMMA.concat(String.valueOf(str)));
            }
        } else {
            String str3 = parentFile.getAbsolutePath() + "#" + str;
            kn.f(a).a("root writeLine data:".concat(String.valueOf(str3)));
            kc.c(this.g, str3);
        }
        this.h.put(str, parentFile.getAbsolutePath());
    }

    @Override // com.tencent.mapsdk.internal.jo
    public final /* bridge */ /* synthetic */ jo.c g() {
        return this.e;
    }
}
