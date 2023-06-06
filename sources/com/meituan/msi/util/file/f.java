package com.meituan.msi.util.file;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.msi.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbc3276d77e56bc3be707b56f0abb80b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbc3276d77e56bc3be707b56f0abb80b")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            return a(new FileInputStream(str), str2);
        } catch (FileNotFoundException e) {
            Log.e("Hera", "unzip from file exception, " + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.FileOutputStream] */
    private static boolean a(InputStream inputStream, String str) {
        ZipInputStream zipInputStream;
        ?? r4;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipInputStream zipInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c3a0a169acfcd7837223910f2c80665", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c3a0a169acfcd7837223910f2c80665")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.e(str);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            zipInputStream = new ZipInputStream(inputStream);
        } catch (IOException e) {
            e = e;
            r4 = 0;
        } catch (Throwable th) {
            th = th;
            zipInputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    h.a(zipInputStream, zipInputStream2);
                    return true;
                }
                String name = nextEntry.getName();
                if (name != null && !name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        new File(str, name).mkdirs();
                    } else {
                        nextEntry.getCompressedSize();
                        File file2 = new File(str, name);
                        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                            file2.getParentFile().mkdirs();
                        }
                        r4 = new FileOutputStream(file2);
                        while (true) {
                            try {
                                int read = zipInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                r4.write(bArr, 0, read);
                            } catch (IOException e2) {
                                e = e2;
                                zipInputStream2 = zipInputStream;
                                r4 = r4;
                                try {
                                    e.printStackTrace();
                                    h.a((Closeable[]) new Closeable[]{zipInputStream2, r4});
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zipInputStream = zipInputStream2;
                                    zipInputStream2 = r4;
                                    h.a(zipInputStream, zipInputStream2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zipInputStream2 = r4;
                                h.a(zipInputStream, zipInputStream2);
                                throw th;
                            }
                        }
                        r4.flush();
                        r4.close();
                        zipInputStream2 = r4;
                    }
                }
            }
        } catch (IOException e3) {
            e = e3;
            r4 = zipInputStream2;
        } catch (Throwable th4) {
            th = th4;
            h.a(zipInputStream, zipInputStream2);
            throw th;
        }
    }
}
