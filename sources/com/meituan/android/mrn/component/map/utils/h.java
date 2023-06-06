package com.meituan.android.mrn.component.map.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public Context c;
    public File d;
    public ExecutorService f;
    private static final Pattern g = Pattern.compile("data:base64,([a-zA-Z0-9\\+/=]+)");
    private static final int h = 22;
    public static Map<String, String> b = new HashMap();
    public static boolean e = false;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    private h(Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae479fc0f988b0770bcf408c8b5eb37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae479fc0f988b0770bcf408c8b5eb37");
            return;
        }
        this.c = context.getApplicationContext();
        this.f = com.sankuai.android.jarvis.c.a("FileLoader");
        this.d = file;
        if (this.c == null) {
            this.d = null;
            return;
        }
        try {
            if (this.d == null) {
                this.d = q.b(context, "map_mrnmap_sdk_file", null, u.b);
            }
            if (this.d != null && !this.d.exists()) {
                this.d.mkdirs();
            }
            if (this.d == null || this.d.isDirectory()) {
                return;
            }
            this.d = null;
            e.a(new IllegalArgumentException("Cache dir is not a directory"), "param");
        } catch (Exception e2) {
            this.d = null;
            e.a(e2, "other");
        }
    }

    public static h a(Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9760e228fc8c075e5a31ff70f84ad4cc", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9760e228fc8c075e5a31ff70f84ad4cc") : new h(context, file);
    }

    public static File a(Context context, String str) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21298850c87da60dddaba53295faab3e", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21298850c87da60dddaba53295faab3e") : q.b(context, "map_mrnmap_sdk_file", null, u.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: IOException -> 0x008b, TRY_LEAVE, TryCatch #8 {IOException -> 0x008b, blocks: (B:39:0x0082, B:41:0x0087), top: B:56:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: IOException -> 0x0097, TRY_LEAVE, TryCatch #0 {IOException -> 0x0097, blocks: (B:45:0x008f, B:47:0x0094), top: B:51:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r12, java.io.File r13, com.meituan.android.mrn.component.map.utils.h.a r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.mrn.component.map.utils.h.a
            java.lang.String r10 = "1d4f554c7dc6bb37ff627a9a6f797918"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            int r0 = com.meituan.android.mrn.component.map.utils.h.h
            java.lang.String r0 = r12.substring(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2e
            return
        L2e:
            r1 = 0
            android.content.Context r2 = r11.c     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            java.io.InputStream r0 = r2.open(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L71
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
        L42:
            int r5 = r0.read(r4, r8, r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r6 = -1
            if (r5 == r6) goto L4d
            r2.write(r4, r8, r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            goto L42
        L4d:
            r0.close()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r2.flush()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8c
            r2.close()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8c
            java.lang.String r0 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            r14.a(r0)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            java.util.Map<java.lang.String, java.lang.String> r14 = com.meituan.android.mrn.component.map.utils.h.b     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            r14.put(r12, r13)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            return
        L67:
            r12 = move-exception
            goto L7a
        L69:
            r12 = move-exception
            goto L6f
        L6b:
            r12 = move-exception
            goto L73
        L6d:
            r12 = move-exception
            r2 = r1
        L6f:
            r1 = r0
            goto L8d
        L71:
            r12 = move-exception
            r2 = r1
        L73:
            r1 = r0
            goto L7a
        L75:
            r12 = move-exception
            r2 = r1
            goto L8d
        L78:
            r12 = move-exception
            r2 = r1
        L7a:
            java.lang.String r13 = "other"
            com.meituan.android.mrn.component.map.utils.e.a(r12, r13)     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L85
            r1.close()     // Catch: java.io.IOException -> L8b
        L85:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.io.IOException -> L8b
        L8b:
            return
        L8c:
            r12 = move-exception
        L8d:
            if (r1 == 0) goto L92
            r1.close()     // Catch: java.io.IOException -> L97
        L92:
            if (r2 == 0) goto L97
            r2.close()     // Catch: java.io.IOException -> L97
        L97:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.map.utils.h.a(java.lang.String, java.io.File, com.meituan.android.mrn.component.map.utils.h$a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[Catch: IOException -> 0x007f, TRY_LEAVE, TryCatch #6 {IOException -> 0x007f, blocks: (B:36:0x0076, B:38:0x007b), top: B:51:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.mrn.component.map.utils.h r11, java.lang.String r12, java.io.File r13, com.meituan.android.mrn.component.map.utils.h.a r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.mrn.component.map.utils.h.a
            java.lang.String r10 = "df5d683d2e09f047ad52653ac01acc10"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            r11 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.InputStream r0 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapOpenStream(r0)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
        L34:
            int r4 = r0.read(r3, r8, r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r5 = -1
            if (r4 == r5) goto L3f
            r1.write(r3, r8, r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            goto L34
        L3f:
            r0.close()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r1.flush()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L80
            r1.close()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L80
            java.lang.String r0 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r14.a(r0)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.util.Map<java.lang.String, java.lang.String> r14 = com.meituan.android.mrn.component.map.utils.h.b     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r14.put(r12, r13)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            return
        L59:
            r12 = move-exception
            goto L6e
        L5b:
            r11 = move-exception
            r12 = r11
            goto L63
        L5e:
            r11 = move-exception
            r12 = r11
            goto L67
        L61:
            r12 = move-exception
            r1 = r11
        L63:
            r11 = r0
            goto L81
        L65:
            r12 = move-exception
            r1 = r11
        L67:
            r11 = r0
            goto L6e
        L69:
            r12 = move-exception
            r1 = r11
            goto L81
        L6c:
            r12 = move-exception
            r1 = r11
        L6e:
            java.lang.String r13 = "other"
            com.meituan.android.mrn.component.map.utils.e.a(r12, r13)     // Catch: java.lang.Throwable -> L80
            if (r11 == 0) goto L79
            r11.close()     // Catch: java.io.IOException -> L7f
        L79:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.io.IOException -> L7f
        L7f:
            return
        L80:
            r12 = move-exception
        L81:
            if (r11 == 0) goto L86
            r11.close()     // Catch: java.io.IOException -> L8b
        L86:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L8b
        L8b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.map.utils.h.a(com.meituan.android.mrn.component.map.utils.h, java.lang.String, java.io.File, com.meituan.android.mrn.component.map.utils.h$a):void");
    }

    public static /* synthetic */ void b(h hVar, String str, File file, a aVar) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {str, file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "fadf316b0d8d4e3f2c6f0a846b6f9ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "fadf316b0d8d4e3f2c6f0a846b6f9ef2");
            return;
        }
        Matcher matcher = g.matcher(str);
        if (matcher == null || !matcher.find()) {
            return;
        }
        String group = matcher.group(1);
        FileOutputStream fileOutputStream2 = null;
        byte[] decode = !TextUtils.isEmpty(group) ? Base64.decode(group, 0) : null;
        if (decode == null || decode.length <= 0) {
            return;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
            aVar.a(file.getAbsolutePath());
            b.put(str, file.getAbsolutePath());
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.a(e, "other");
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ void a(h hVar) {
        File[] listFiles;
        String name;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "2f6a068e4fc8ba41573dba5f01ae9066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "2f6a068e4fc8ba41573dba5f01ae9066");
        } else if (hVar.d != null && (listFiles = hVar.d.listFiles()) != null && listFiles.length > 0) {
            try {
                for (File file : listFiles) {
                    if (file != null && !b.containsValue(file.getAbsolutePath()) && (name = file.getName()) != null && name.startsWith("MRNMapCustomStyle") && name.endsWith(".data")) {
                        file.delete();
                    }
                }
            } catch (Exception e2) {
                e.a(e2, "other");
            }
        }
    }
}
