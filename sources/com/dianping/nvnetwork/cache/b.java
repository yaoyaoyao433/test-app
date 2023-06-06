package com.dianping.nvnetwork.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.dianping.nvnetwork.cache.disklrucache.a;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private com.dianping.nvnetwork.cache.disklrucache.a b;
    private LruCache<String, a> c;

    private b(File file, long j, int i) {
        Object[] objArr = {file, 10485760L, 100};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409710396d3c6b976db5a3dd73318c13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409710396d3c6b976db5a3dd73318c13");
            return;
        }
        try {
            this.b = com.dianping.nvnetwork.cache.disklrucache.a.a(file, 2, 4, 10485760L);
        } catch (IOException e) {
            com.dianping.nvnetwork.util.g.b("CacheOperateImpl", e.getMessage());
            this.b = null;
        }
        this.c = new LruCache<>(100);
    }

    public static b a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c1bc7be6079512c87b31a1fc4051e12", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c1bc7be6079512c87b31a1fc4051e12");
        }
        String str2 = "dpplatform_shark";
        Object[] objArr2 = {context, "dpplatform_shark"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2adf1d0b77b4b5759b1985d18371c36b", 6917529027641081856L)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2adf1d0b77b4b5759b1985d18371c36b");
        } else {
            String a2 = com.dianping.nvtunnelkit.utils.d.a(context);
            if (!TextUtils.isEmpty(a2)) {
                str2 = "dpplatform_shark" + a2;
            }
        }
        return new b(q.a(context, str2, str), 10485760L, 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.dianping.nvnetwork.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.nvnetwork.cache.a a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.nvnetwork.cache.b.a
            java.lang.String r11 = "1661c0d581563f300b538c49156961d5"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.dianping.nvnetwork.cache.a r13 = (com.dianping.nvnetwork.cache.a) r13
            return r13
        L1e:
            java.lang.String r1 = com.dianping.nvnetwork.cache.e.a(r13)
            android.util.LruCache<java.lang.String, com.dianping.nvnetwork.cache.a> r2 = r12.c
            java.lang.Object r2 = r2.get(r1)
            com.dianping.nvnetwork.cache.a r2 = (com.dianping.nvnetwork.cache.a) r2
            if (r2 == 0) goto L34
            java.lang.String r13 = "CacheOperateImpl"
            java.lang.String r0 = "memory hit!"
            com.dianping.nvnetwork.util.g.a(r13, r0)
            return r2
        L34:
            r2 = 0
            com.dianping.nvnetwork.cache.disklrucache.a r3 = r12.b     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r3 != 0) goto L3a
            return r2
        L3a:
            com.dianping.nvnetwork.cache.disklrucache.a r3 = r12.b     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            com.dianping.nvnetwork.cache.disklrucache.a$c r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r1 == 0) goto L7c
            java.lang.String r3 = "CacheOperateImpl"
            java.lang.String r4 = "disk hit!"
            com.dianping.nvnetwork.util.g.a(r3, r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r3 = r1.a(r9)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            long r7 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            java.lang.String r9 = r1.a(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r0 = 2
            java.lang.String r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r0 <= 0) goto L7c
            r3 = 3
            java.io.InputStream[] r1 = r1.b     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            byte[] r6 = new byte[r0]     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8e
            int r3 = r1.read(r6)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8e
            if (r3 != r0) goto L7d
            com.dianping.nvnetwork.cache.a r0 = new com.dianping.nvnetwork.cache.a     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8e
            r4 = r0
            r5 = r13
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L8e
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.io.IOException -> L79
        L79:
            return r0
        L7a:
            r13 = move-exception
            goto L87
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto L8d
        L7f:
            r1.close()     // Catch: java.io.IOException -> L8d
            goto L8d
        L83:
            r13 = move-exception
            goto L90
        L85:
            r13 = move-exception
            r1 = r2
        L87:
            r13.printStackTrace()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8d
            goto L7f
        L8d:
            return r2
        L8e:
            r13 = move-exception
            r2 = r1
        L90:
            if (r2 == 0) goto L95
            r2.close()     // Catch: java.io.IOException -> L95
        L95:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.cache.b.a(java.lang.String):com.dianping.nvnetwork.cache.a");
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final synchronized int a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c57f5d2374ff85f0fad12bad3da3610", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c57f5d2374ff85f0fad12bad3da3610")).intValue();
        } else if (aVar == null) {
            return -1;
        } else {
            String a2 = e.a(aVar.a);
            this.c.put(a2, aVar);
            if (this.b != null) {
                OutputStream outputStream = null;
                try {
                    try {
                        com.dianping.nvnetwork.cache.disklrucache.a aVar2 = this.b;
                        Object[] objArr2 = {a2};
                        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.cache.disklrucache.a.a;
                        a.C0094a a3 = PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "e20c90843614e4967802bdfb89cc297f", 6917529027641081856L) ? (a.C0094a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "e20c90843614e4967802bdfb89cc297f") : aVar2.a(a2, -1L);
                        if (a3 != null) {
                            a3.a(0, String.valueOf(aVar.c));
                            a3.a(1, aVar.d);
                            byte[] bArr = aVar.b;
                            a3.a(2, String.valueOf(bArr == null ? 0 : bArr.length));
                            OutputStream a4 = a3.a(3);
                            try {
                                a4.write(aVar.b);
                                a4.close();
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a.C0094a.a;
                                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "975f0d12ab6984b67f8517a86b5c7a9d", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "975f0d12ab6984b67f8517a86b5c7a9d");
                                } else {
                                    if (a3.d) {
                                        com.dianping.nvnetwork.cache.disklrucache.a.this.a(a3, false);
                                        com.dianping.nvnetwork.cache.disklrucache.a.this.b(a3.b.b);
                                    } else {
                                        com.dianping.nvnetwork.cache.disklrucache.a.this.a(a3, true);
                                    }
                                    a3.e = true;
                                }
                                if (a4 != null) {
                                    try {
                                        a4.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                return 1;
                            } catch (Exception e) {
                                e = e;
                                outputStream = a4;
                                e.printStackTrace();
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                return 0;
                            } catch (Throwable th) {
                                th = th;
                                outputStream = a4;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return 0;
        }
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43343ab8cdb75aa0274fabc0f943a09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43343ab8cdb75aa0274fabc0f943a09");
            return;
        }
        this.c.remove(str);
        if (this.b != null) {
            try {
                this.b.b(e.a(str));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20fbc61749d3839e22158ce3bcad00c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20fbc61749d3839e22158ce3bcad00c0");
            return;
        }
        this.c.evictAll();
        if (this.b != null) {
            try {
                a(this.b.c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c759d1f127477fc4c9d8e1b150d6781", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c759d1f127477fc4c9d8e1b150d6781");
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
