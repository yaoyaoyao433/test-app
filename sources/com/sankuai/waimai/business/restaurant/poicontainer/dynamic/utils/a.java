package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "413566eb93d56558ff9339c7ac03835a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "413566eb93d56558ff9339c7ac03835a") : new String(b(inputStream), "UTF-8");
    }

    private static byte[] b(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39fd62e524668e643ce387c7d55bd196", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39fd62e524668e643ce387c7d55bd196");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(File file, String str, boolean z) {
        FileWriter fileWriter;
        Object[] objArr = {file, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileWriter fileWriter2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5b37444e964595356197676f82373f7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5b37444e964595356197676f82373f7")).booleanValue();
            }
            try {
                fileWriter = new FileWriter(file, false);
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(str);
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException unused) {
                }
                return true;
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                e.printStackTrace();
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException unused2) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8800b95f1e991fd6727625c863eefed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8800b95f1e991fd6727625c863eefed");
        } else if (file == null || !file.exists()) {
        } else {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.a
            java.lang.String r10 = "ca9adb1456ec35f80ff2cf94ce78c809"
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
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L30
            java.lang.String r11 = a(r0)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L3b
            r0.close()     // Catch: java.io.IOException -> L2a
        L2a:
            return r11
        L2b:
            r11 = move-exception
            goto L32
        L2d:
            r11 = move-exception
            r0 = r2
            goto L3c
        L30:
            r11 = move-exception
            r0 = r2
        L32:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.io.IOException -> L3a
        L3a:
            return r2
        L3b:
            r11 = move-exception
        L3c:
            if (r0 == 0) goto L41
            r0.close()     // Catch: java.io.IOException -> L41
        L41:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils.a.b(java.io.File):java.lang.String");
    }
}
