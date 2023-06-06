package com.sankuai.waimai.mach.manager_new.common;

import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.m;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(AssetManager assetManager, String str, String str2) {
        InputStream inputStream;
        ZipInputStream zipInputStream;
        Object[] objArr = {assetManager, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipInputStream zipInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7385be81f30f0b0a6ce89af4940b5fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7385be81f30f0b0a6ce89af4940b5fa")).booleanValue();
        }
        try {
            inputStream = assetManager.open(str);
            try {
                Object[] objArr2 = {inputStream, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "00e8f9873630bb73967bf8309369838b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "00e8f9873630bb73967bf8309369838b");
                } else {
                    try {
                        try {
                            a(new File(str2));
                            zipInputStream = new ZipInputStream(inputStream);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        zipInputStream = zipInputStream2;
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            String name = nextEntry.getName();
                            if (!TextUtils.isEmpty(name) && !name.contains("../")) {
                                if (nextEntry.isDirectory()) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        File file = new File(str2, name);
                                        if (!file.isDirectory() && !file.mkdirs()) {
                                            c.b("BundleUtil::dirChecker=>mkdirs failed");
                                        }
                                    }
                                } else {
                                    File file2 = new File(str2, name);
                                    if (!file2.exists() && file2.createNewFile()) {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        while (true) {
                                            int read = zipInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        zipInputStream.closeEntry();
                                        a(fileOutputStream);
                                    }
                                }
                            }
                        }
                        a(zipInputStream);
                    } catch (Exception e2) {
                        e = e2;
                        zipInputStream2 = zipInputStream;
                        c.c("BundleUtil | unzip=>" + Log.getStackTraceString(e));
                        a(zipInputStream2);
                        com.sankuai.waimai.mach.utils.e.a(inputStream);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        a(zipInputStream);
                        throw th;
                    }
                }
                com.sankuai.waimai.mach.utils.e.a(inputStream);
                return true;
            } catch (Exception unused) {
                com.sankuai.waimai.mach.utils.e.a(inputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                com.sankuai.waimai.mach.utils.e.a(inputStream);
                throw th;
            }
        } catch (Exception unused2) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static boolean a(File file, String str, String str2) {
        int i = 0;
        Object[] objArr = {file, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipFile zipFile = null;
        boolean z = true;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "418953d815ee6ed89a4ad84d7468e3a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "418953d815ee6ed89a4ad84d7468e3a6")).booleanValue();
        }
        long s = m.s() != -1 ? m.s() : 3L;
        try {
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    boolean z2 = false;
                    while (true) {
                        try {
                            try {
                                z = a(zipFile2, str, str2);
                                if (z) {
                                    break;
                                }
                                i++;
                                try {
                                    c.b("unzipFileWithRetry | retryCount =  " + i);
                                    if (i > s) {
                                        break;
                                    }
                                    z2 = z;
                                } catch (Exception e) {
                                    e = e;
                                    zipFile = zipFile2;
                                    c.c("unzipFileWithRetry | " + file + " | " + e.getMessage());
                                    if (zipFile != null) {
                                        zipFile.close();
                                    }
                                    return z;
                                }
                            } catch (Throwable th) {
                                th = th;
                                zipFile = zipFile2;
                                if (zipFile != null) {
                                    try {
                                        zipFile.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z = z2;
                        }
                    }
                    zipFile2.close();
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return z;
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8350dabc5ab38337f50829192713ec77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8350dabc5ab38337f50829192713ec77");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            ZipFile zipFile = new ZipFile(str);
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(nextEntry)));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                    }
                    bufferedReader.close();
                }
            }
            zipInputStream.closeEntry();
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static InputStream b(String str) {
        ZipFile zipFile;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fad7c177a86b108a86e5660d0c3c061", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fad7c177a86b108a86e5660d0c3c061");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zipFile = new ZipFile(str);
            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        } catch (Exception unused) {
        }
        do {
            nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.closeEntry();
                return null;
            }
        } while (nextEntry.isDirectory());
        return zipFile.getInputStream(nextEntry);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0163 A[LOOP:1: B:83:0x00d4->B:74:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0158 A[EDGE_INSN: B:97:0x0158->B:68:0x0158 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.util.zip.ZipFile r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.manager_new.common.b.a(java.util.zip.ZipFile, java.lang.String, java.lang.String):boolean");
    }

    private static boolean a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa0fd29e0294242d9b9264d5b82fdd27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa0fd29e0294242d9b9264d5b82fdd27")).booleanValue();
        }
        boolean d = d(file);
        if (!d) {
            c.b("创建目录失败 " + str);
        }
        return d;
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fabdc3986b4ac882a9664307af02d23f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fabdc3986b4ac882a9664307af02d23f")).booleanValue();
        }
        boolean d = d(file);
        if (!d) {
            c.b("创建目录失败 " + file.getAbsolutePath());
        }
        return d;
    }

    public static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6a360b12b6fd808c893e203405d065c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6a360b12b6fd808c893e203405d065c")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else if (!c(file2)) {
                        c.b("删除文件失败 " + file2.getAbsolutePath());
                    }
                }
            }
            return file.delete();
        }
        return false;
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7abc5f46e4fbb2b55a2752b67f7d0ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7abc5f46e4fbb2b55a2752b67f7d0ec9")).longValue();
        }
        long j = 0;
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05c3e1402ec8a67e00ca3b755b067c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05c3e1402ec8a67e00ca3b755b067c60");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean d(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35a2e801a30cd8808455b4ebe14ce5ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35a2e801a30cd8808455b4ebe14ce5ae")).booleanValue();
        }
        long s = m.s() != -1 ? m.s() : 3L;
        if (file.exists()) {
            return true;
        }
        int i = 0;
        while (!file.mkdirs()) {
            i++;
            c.b("mkdirsWithRetry | retryCount =  " + i);
            if (i > s) {
                break;
            }
        }
        return ((long) i) <= s;
    }

    public static boolean c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f6f285867f306937f2081aad505b0c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f6f285867f306937f2081aad505b0c9")).booleanValue();
        }
        long s = m.s() != -1 ? m.s() : 3L;
        int i = 0;
        while (!file.delete()) {
            i++;
            c.b("deleteWithRetry | retryCount =  " + i);
            if (i > s) {
                break;
            }
        }
        return ((long) i) <= s;
    }
}
