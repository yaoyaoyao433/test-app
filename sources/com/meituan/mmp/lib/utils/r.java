package com.meituan.mmp.lib.utils;

import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static double a(String str, int i) {
        long j;
        Object[] objArr = {str, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "793b9a0055f97a8cc830dee36eefdc86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "793b9a0055f97a8cc830dee36eefdc86")).doubleValue();
        }
        DioFile dioFile = new DioFile(str);
        try {
            if (dioFile.j()) {
                if (dioFile.o()) {
                    j = a(dioFile);
                } else {
                    j = b(dioFile);
                }
            } else {
                j = a(dioFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.meituan.mmp.lib.trace.b.d("获取文件大小", "获取失败!");
            j = 0;
        }
        Object[] objArr2 = {new Long(j), 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4806a2a88c945332a5dd28cb0c299bb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4806a2a88c945332a5dd28cb0c299bb2")).doubleValue();
        }
        switch (1) {
            case 1:
                return j;
            case 2:
                return Math.round((j * 100.0d) / 1024.0d) / 100.0d;
            case 3:
                return Math.round((j * 100.0d) / 1048576.0d) / 100.0d;
            case 4:
                return Math.round((j * 100.0d) / 1.073741824E9d) / 100.0d;
            default:
                return 0.0d;
        }
    }

    public static long a(File file) throws Exception {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fcdfe98b20f4cef8625fe7fc38519da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fcdfe98b20f4cef8625fe7fc38519da")).longValue();
        }
        if (file.exists()) {
            return new FileInputStream(file).available();
        }
        file.createNewFile();
        com.meituan.mmp.lib.trace.b.d("获取文件大小", "文件不存在!");
        return 0L;
    }

    private static long a(DioFile dioFile) throws Exception {
        InputStream inputStream;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e098fd39954bc56247a41ff8a32652d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e098fd39954bc56247a41ff8a32652d0")).longValue();
        }
        long j = 0;
        if (dioFile.c()) {
            try {
                inputStream = dioFile.b();
                try {
                    j = inputStream.available();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } else {
            com.meituan.mmp.lib.trace.b.d("获取文件大小", "文件不存在!");
        }
        return j;
    }

    private static long b(DioFile dioFile) throws Exception {
        long a2;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c13e465b54b89b1e26be0b6b6ed19686", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c13e465b54b89b1e26be0b6b6ed19686")).longValue();
        }
        long j = 0;
        DioFile[] m = dioFile.m();
        for (int i = 0; i < m.length; i++) {
            if (m[i].j() && !m[i].o()) {
                a2 = b(m[i]);
            } else {
                a2 = a(m[i]);
            }
            j += a2;
        }
        return j;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5b9e4e9f60128805871f29e8bf4c77d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5b9e4e9f60128805871f29e8bf4c77d");
        }
        return a(str == null ? 0L : str.length());
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4354d5f29085f70c5077a3f81a562434", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4354d5f29085f70c5077a3f81a562434");
        }
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return j + ErrorCode.ERROR_TYPE_B;
        } else if (j < 1048576) {
            return (Math.round((j * 100.0d) / 1024.0d) / 100.0d) + "KB";
        } else if (j < 1073741824) {
            return (Math.round((j * 100.0d) / 1048576.0d) / 100.0d) + "MB";
        } else {
            return (Math.round((j * 100.0d) / 1.073741824E9d) / 100.0d) + "GB";
        }
    }

    public static long b(String str) {
        ZipFile zipFile;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipFile zipFile2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ee0c941beb2a5f13c34f8bde1002ebe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ee0c941beb2a5f13c34f8bde1002ebe")).longValue();
        }
        long j = 0;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = null;
            }
        } catch (IOException unused) {
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                j += entries.nextElement().getSize();
            }
            zipFile.close();
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
            return j;
        } catch (IOException unused3) {
            zipFile2 = zipFile;
            long length = new File(str).length();
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }
}
