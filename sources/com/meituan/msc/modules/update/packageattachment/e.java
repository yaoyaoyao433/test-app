package com.meituan.msc.modules.update.packageattachment;

import android.content.Context;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.service.codecache.CodeCacheConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e c;
    public final com.meituan.msc.modules.preload.executor.e b;
    private final Context d;
    private File e;
    private File f;
    private final Object g;

    public static e a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57767a231b1935acefa6b592c1ac9aae", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57767a231b1935acefa6b592c1ac9aae");
        }
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e(context);
                }
            }
        }
        return c;
    }

    public static synchronized e a() {
        synchronized (e.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84e89f4fdbed0243f5df391770479c55", RobustBitConfig.DEFAULT_VALUE)) {
                return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84e89f4fdbed0243f5df391770479c55");
            } else if (c == null) {
                throw new IllegalStateException("createInstance() needs to be called before getInstance()");
            } else {
                return c;
            }
        }
    }

    private e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19854538ec0d66bda4c18f8f00d975f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19854538ec0d66bda4c18f8f00d975f");
            return;
        }
        this.g = new Object();
        this.d = context;
        this.b = new com.meituan.msc.modules.preload.executor.b("PackageAttachmentManager");
    }

    private File d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "010498c14a7b351a929a81ffa29a20b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "010498c14a7b351a929a81ffa29a20b8");
        }
        if (this.f == null) {
            this.f = new File(b(), "record.txt");
        }
        return this.f;
    }

    public final File b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af335c9da4c3978411d9243c815db640", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af335c9da4c3978411d9243c815db640");
        }
        if (this.e == null) {
            this.e = com.meituan.msc.common.utils.e.a(this.d, "PackageAttachment");
        }
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[]] */
    public final void a(a aVar) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294e1dda0aeea5b9c24ea96b3116667e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294e1dda0aeea5b9c24ea96b3116667e");
        } else if (aVar == null) {
        } else {
            synchronized (this.g) {
                FileOutputStream fileOutputStream2 = 0;
                FileOutputStream fileOutputStream3 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(d(), true);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    fileOutputStream.write(aVar.a().getBytes());
                    com.meituan.dio.utils.c.a(fileOutputStream);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream3 = fileOutputStream;
                    g.a("PackageAttachmentManager", e);
                    com.meituan.dio.utils.c.a(fileOutputStream3);
                    fileOutputStream2 = new Object[]{"Attach attachment directory, packageFile: ", aVar.b, ", directory: ", aVar.c};
                    g.d("PackageAttachmentManager", fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    com.meituan.dio.utils.c.a((Closeable) fileOutputStream2);
                    throw th;
                }
                fileOutputStream2 = new Object[]{"Attach attachment directory, packageFile: ", aVar.b, ", directory: ", aVar.c};
                g.d("PackageAttachmentManager", fileOutputStream2);
            }
        }
    }

    public final void c() throws IOException {
        List<a> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee854defe489cd8bc38768f2fb34ae78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee854defe489cd8bc38768f2fb34ae78");
            return;
        }
        synchronized (this.g) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d55d5b786bc76a3392643c6ed3b57c5b", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d55d5b786bc76a3392643c6ed3b57c5b");
            } else {
                File d = d();
                if (!d.exists()) {
                    list = Collections.emptyList();
                } else {
                    String str = new String(com.meituan.dio.utils.c.a((InputStream) new FileInputStream(d)));
                    g.d("PackageAttachmentManager", "record.txt:", str);
                    String[] split = str.split("\n");
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : split) {
                        a aVar = new a(str2);
                        if (aVar.b != null && aVar.c != null) {
                            arrayList.add(aVar);
                        }
                    }
                    list = arrayList;
                }
            }
            Iterator<a> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                a next = it.next();
                if (!new File(next.b).exists()) {
                    r.a(next.c);
                    it.remove();
                    g.d("PackageAttachmentManager", "Remove abandoned attachment, packageFile: ", next.b, "attachmentDirectory: ", next.c);
                    z = true;
                }
            }
            if (z) {
                CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
                if (CodeCacheConfig.i()) {
                    a(list);
                } else {
                    b(list);
                }
            }
        }
        CodeCacheConfig codeCacheConfig2 = CodeCacheConfig.d;
        if (CodeCacheConfig.j()) {
            String path = b().getPath();
            CodeCacheConfig codeCacheConfig3 = CodeCacheConfig.d;
            c.a(path, CodeCacheConfig.k(), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.meituan.msc.modules.update.packageattachment.e.a> r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.modules.update.packageattachment.e.a
            java.lang.String r11 = "a291e205dddd0144f056e9030f70dd09"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r12.b()
            java.lang.String r3 = "temporary.txt"
            r1.<init>(r2, r3)
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
        L36:
            boolean r2 = r13.hasNext()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r13.next()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            com.meituan.msc.modules.update.packageattachment.e$a r2 = (com.meituan.msc.modules.update.packageattachment.e.a) r2     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r4 = "PackageAttachmentManager"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r7 = "write record entry:"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r7 = r2.a()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r6.append(r7)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r5[r9] = r6     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            com.meituan.msc.modules.reporter.g.d(r4, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r3.write(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            goto L36
        L6a:
            com.meituan.dio.utils.c.a(r3)
            r0 = 0
            goto L87
        L6f:
            r13 = move-exception
            goto La1
        L71:
            r13 = move-exception
            r2 = r3
            goto L78
        L74:
            r13 = move-exception
            r3 = r2
            goto La1
        L77:
            r13 = move-exception
        L78:
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L74
            com.meituan.msc.common.utils.r.a(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "PackageAttachmentManager"
            com.meituan.msc.modules.reporter.g.a(r3, r13)     // Catch: java.lang.Throwable -> L74
            com.meituan.dio.utils.c.a(r2)
        L87:
            if (r0 != 0) goto La0
            java.io.File r13 = r12.d()
            boolean r13 = r1.renameTo(r13)
            if (r13 == 0) goto L9a
            java.lang.String r13 = "rename temporary file success"
            com.meituan.msc.modules.reporter.g.b(r13)
            return
        L9a:
            java.lang.String r13 = "rename temporay file fail"
            com.meituan.msc.modules.reporter.g.d(r13)
        La0:
            return
        La1:
            com.meituan.dio.utils.c.a(r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.update.packageattachment.e.a(java.util.List):void");
    }

    private void b(List<a> list) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4935b5be04ff885a0249958decadbad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4935b5be04ff885a0249958decadbad4");
            return;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d()));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            for (a aVar : list) {
                g.d("PackageAttachmentManager", "write record entry:" + aVar.a());
                bufferedOutputStream.write(aVar.a().getBytes());
            }
            com.meituan.dio.utils.c.a(bufferedOutputStream);
        } catch (IOException e2) {
            e = e2;
            bufferedOutputStream2 = bufferedOutputStream;
            g.a("PackageAttachmentManager", e);
            com.meituan.dio.utils.c.a(bufferedOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            com.meituan.dio.utils.c.a(bufferedOutputStream);
            throw th;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60473d1ecb3979272d6f2347c48670e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60473d1ecb3979272d6f2347c48670e");
                return;
            }
            String[] split = str.split(CommonConstant.Symbol.COLON);
            if (split.length == 2) {
                this.b = split[0];
                this.c = split[1];
                return;
            }
            this.b = null;
            this.c = null;
        }

        public a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a42dce399412b1bc58b51abf39fa8c5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a42dce399412b1bc58b51abf39fa8c5");
                return;
            }
            this.b = str;
            this.c = str2;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6556eb8639954e1ce04a1924b8861cb0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6556eb8639954e1ce04a1924b8861cb0");
            }
            return this.b + CommonConstant.Symbol.COLON + this.c + "\n";
        }
    }
}
