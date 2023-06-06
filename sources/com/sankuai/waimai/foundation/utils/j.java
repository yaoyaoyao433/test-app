package com.sankuai.waimai.foundation.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d47c406b169fe9faaa87895fefd8984", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d47c406b169fe9faaa87895fefd8984")).booleanValue();
        }
        try {
            return new File(str).delete();
        } catch (SecurityException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    public static boolean b(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93bb7162280ecaf624de4d9cb1acf5b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93bb7162280ecaf624de4d9cb1acf5b7")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (File file : new File(str).listFiles()) {
                if (file.isDirectory()) {
                    b(file.getPath());
                }
                file.delete();
            }
            return true;
        } catch (SecurityException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[Catch: IOException -> 0x0072, TRY_LEAVE, TryCatch #1 {IOException -> 0x0072, blocks: (B:40:0x006e, B:44:0x0076), top: B:48:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.foundation.utils.j.a
            java.lang.String r10 = "28ee0901c1ba5f4d931bd9abfd8c3baf"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L2d:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            if (r3 == 0) goto L37
            r0.append(r3)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            goto L2d
        L37:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L42
            r11.close()     // Catch: java.io.IOException -> L42
            goto L69
        L42:
            r11 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r11)
            goto L69
        L47:
            r0 = move-exception
            goto L54
        L49:
            r0 = move-exception
            goto L6c
        L4b:
            r0 = move-exception
            r11 = r2
            goto L54
        L4e:
            r0 = move-exception
            r1 = r2
            goto L6c
        L51:
            r0 = move-exception
            r11 = r2
            r1 = r11
        L54:
            com.sankuai.waimai.foundation.utils.log.a.a(r0)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L5f
        L5d:
            r11 = move-exception
            goto L65
        L5f:
            if (r11 == 0) goto L68
            r11.close()     // Catch: java.io.IOException -> L5d
            goto L68
        L65:
            com.sankuai.waimai.foundation.utils.log.a.a(r11)
        L68:
            r0 = r2
        L69:
            return r0
        L6a:
            r0 = move-exception
            r2 = r11
        L6c:
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.io.IOException -> L72
            goto L74
        L72:
            r11 = move-exception
            goto L7a
        L74:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L72
            goto L7d
        L7a:
            com.sankuai.waimai.foundation.utils.log.a.a(r11)
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.foundation.utils.j.a(java.io.File):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.FileInputStream] */
    public static byte[] c(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "287706fd40b908485d3e5e9f49d3c988", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "287706fd40b908485d3e5e9f49d3c988");
            }
            try {
                str = new FileInputStream(new File(str));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = str.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            str.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return byteArray;
                        }
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused6) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                str = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = 1;
        }
    }
}
