package com.meituan.mmp.lib.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
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
public final class bg {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, String str2) {
        FileInputStream fileInputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fe0f0e6667e00491f820133443f3403", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fe0f0e6667e00491f820133443f3403")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        fileInputStream = new FileInputStream(str);
                    } catch (FileNotFoundException e) {
                        e = e;
                    }
                    try {
                        boolean a2 = a(fileInputStream, str2);
                        x.a(fileInputStream);
                        return a2;
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream2 = fileInputStream;
                        Log.e("Hera", "unzip from file exception, " + e.getMessage());
                        if (fileInputStream2 != null) {
                            x.a(fileInputStream2);
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            x.a(fileInputStream2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static boolean a(InputStream inputStream, String str) {
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e57715b20f3eb66a6140b59b4465f092", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e57715b20f3eb66a6140b59b4465f092")).booleanValue();
        }
        if (inputStream == null || TextUtils.isEmpty(str)) {
            return false;
        }
        s.a(str);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(inputStream);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    long j = 0;
                    long j2 = 0;
                    zipInputStream2 = zipInputStream2;
                    while (true) {
                        ZipEntry nextEntry = zipInputStream2.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        String name = nextEntry.getName();
                        try {
                            if (name != null && !name.contains("../")) {
                                if (nextEntry.isDirectory()) {
                                    try {
                                        new File(str, name).mkdirs();
                                        zipInputStream = zipInputStream2;
                                    } catch (IOException e) {
                                        e = e;
                                        fileOutputStream = fileOutputStream2;
                                        fileOutputStream2 = zipInputStream2;
                                        try {
                                            com.meituan.mmp.lib.trace.b.d("Hera", "unzip from inputStream exception, " + e.getMessage());
                                            e.printStackTrace();
                                            x.a(fileOutputStream2, fileOutputStream);
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            zipInputStream = fileOutputStream2;
                                            fileOutputStream2 = fileOutputStream;
                                            x.a(zipInputStream, fileOutputStream2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    j += nextEntry.getCompressedSize();
                                    File file2 = new File(str, name);
                                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    fileOutputStream = new FileOutputStream(file2);
                                    ZipInputStream zipInputStream3 = zipInputStream2;
                                    while (true) {
                                        try {
                                            int read = zipInputStream3.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                            j2 += read;
                                            zipInputStream3 = zipInputStream3;
                                        } catch (IOException e2) {
                                            e = e2;
                                            zipInputStream = zipInputStream3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zipInputStream = zipInputStream3;
                                        }
                                    }
                                    zipInputStream = zipInputStream3;
                                    try {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        fileOutputStream2 = fileOutputStream;
                                    } catch (IOException e3) {
                                        e = e3;
                                        fileOutputStream2 = zipInputStream;
                                        com.meituan.mmp.lib.trace.b.d("Hera", "unzip from inputStream exception, " + e.getMessage());
                                        e.printStackTrace();
                                        x.a(fileOutputStream2, fileOutputStream);
                                        return false;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream2 = fileOutputStream;
                                        x.a(zipInputStream, fileOutputStream2);
                                        throw th;
                                    }
                                }
                                zipInputStream2 = zipInputStream;
                            }
                            com.meituan.mmp.lib.trace.b.d(String.format("access file %s denied", name));
                            zipInputStream2 = zipInputStream;
                        } catch (IOException e4) {
                            e = e4;
                            fileOutputStream = fileOutputStream2;
                            fileOutputStream2 = zipInputStream;
                            com.meituan.mmp.lib.trace.b.d("Hera", "unzip from inputStream exception, " + e.getMessage());
                            e.printStackTrace();
                            x.a(fileOutputStream2, fileOutputStream);
                            return false;
                        } catch (Throwable th4) {
                            th = th4;
                            x.a(zipInputStream, fileOutputStream2);
                            throw th;
                        }
                        zipInputStream = zipInputStream2;
                    }
                    zipInputStream = zipInputStream2;
                    StringBuilder sb = new StringBuilder("unzip done: ");
                    sb.append(j != 0 ? Long.valueOf(j / 1024) : CommonConstant.Symbol.QUESTION_MARK);
                    sb.append("KB -> ");
                    sb.append(j2 / 1024);
                    sb.append("KB, ");
                    sb.append(str);
                    com.meituan.mmp.lib.trace.b.b("ZipUtil", sb.toString());
                    x.a(zipInputStream, fileOutputStream2);
                    return true;
                } catch (Throwable th5) {
                    th = th5;
                    zipInputStream = zipInputStream2;
                }
            } catch (IOException e5) {
                e = e5;
                zipInputStream = zipInputStream2;
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            zipInputStream = null;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce8ecbaab710cbf89f41181b5fc8dd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce8ecbaab710cbf89f41181b5fc8dd7")).booleanValue();
        }
        if (a(str, str2)) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    if (new File(str2, str3).createNewFile()) {
                    }
                }
                return true;
            } catch (IOException unused) {
                return new File(str2, str3).exists();
            }
        }
        return false;
    }

    public static boolean a(InputStream inputStream, String str, String str2) {
        Object[] objArr = {inputStream, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6842eccc58a58175db0d7423319eccf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6842eccc58a58175db0d7423319eccf2")).booleanValue();
        }
        if (a(inputStream, str)) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (new File(str, str2).createNewFile()) {
                    }
                }
                return true;
            } catch (IOException unused) {
                return new File(str, str2).exists();
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        String[] list;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eeeb090c403177808b12495663879c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eeeb090c403177808b12495663879c1c")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && (list = file.list()) != null && list.length > 0 && (TextUtils.isEmpty(str2) || new File(str, str2).exists());
    }
}
