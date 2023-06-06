package com.sankuai.meituan.bundle.service;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.bundle.service.k.a
            java.lang.String r11 = "dacdb340327554d2d6706a87a13fc128"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x009c: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r12 = "MD5"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
        L38:
            if (r5 < 0) goto L42
            r12.update(r4, r9, r5)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            goto L38
        L42:
            byte[] r12 = r12.digest()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r3 = r12.length     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r4 = r3 * 2
            char[] r4 = new char[r4]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r5 = 0
            r6 = 0
        L4d:
            if (r5 >= r3) goto L66
            r7 = r12[r5]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r8 = r6 + 1
            int r10 = r7 >>> 4
            r10 = r10 & 15
            char r10 = r0[r10]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r4[r6] = r10     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r6 = r8 + 1
            r7 = r7 & 15
            char r7 = r0[r7]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r4[r8] = r7     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            int r5 = r5 + 1
            goto L4d
        L66:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r12.<init>(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L94
            r1.close()     // Catch: java.io.IOException -> L6e
        L6e:
            return r12
        L6f:
            r12 = move-exception
            goto L76
        L71:
            r12 = move-exception
            r1 = r2
            goto L95
        L74:
            r12 = move-exception
            r1 = r2
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "getFileMd5 Exception:"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L94
            r0.append(r12)     // Catch: java.lang.Throwable -> L94
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L94
            a(r12, r0)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L93
            r1.close()     // Catch: java.io.IOException -> L93
        L93:
            return r2
        L94:
            r12 = move-exception
        L95:
            if (r1 == 0) goto L9a
            r1.close()     // Catch: java.io.IOException -> L9a
        L9a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.bundle.service.k.a(java.io.File):java.lang.String");
    }

    public static long a(File file, InputStream inputStream) throws IOException {
        Object[] objArr = {file, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedOutputStream bufferedOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff08efaa549f7ccdd203ac03273aff1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff08efaa549f7ccdd203ac03273aff1c")).longValue();
        }
        long j = 0;
        c(file);
        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        bufferedOutputStream2.write(bArr, 0, read);
                        j += read;
                    } else {
                        a(bufferedOutputStream2);
                        a(inputStream);
                        return j;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long a(ZipFile zipFile, String str) throws IOException {
        Object[] objArr = {zipFile, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4082111782037a31935840f61d35caa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4082111782037a31935840f61d35caa")).longValue();
        }
        long j = 0;
        if (!TextUtils.isEmpty(str)) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null) {
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    if (nextElement.isDirectory()) {
                        File file = new File(str, nextElement.getName());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } else {
                        j += a(new File(str, File.separator + nextElement.getName()), inputStream);
                    }
                }
            }
        }
        return j;
    }

    private static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "263ba6b5166b45a3de15089a59cf0546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "263ba6b5166b45a3de15089a59cf0546");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static long b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d7af4d80ee9a27a98638d4e432a046b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d7af4d80ee9a27a98638d4e432a046b")).longValue();
        }
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return 0L;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                j += b(file2);
            }
        }
        file.delete();
        return j;
    }

    public static boolean c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "326dcdabb3dd9ca95ecf52a3b6b2ee38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "326dcdabb3dd9ca95ecf52a3b6b2ee38")).booleanValue();
        }
        if (file.getParentFile().exists()) {
            return true;
        }
        return file.getParentFile().mkdirs();
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0661aac3971c62ae19e4d8adad89a086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0661aac3971c62ae19e4d8adad89a086");
        } else {
            Log.e("smartdownloader", String.format(str, objArr));
        }
    }
}
