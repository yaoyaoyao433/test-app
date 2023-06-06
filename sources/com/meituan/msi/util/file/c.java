package com.meituan.msi.util.file;

import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static double a(String str, int i) {
        long j;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9c55112f587b13c7f517a87d6419e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9c55112f587b13c7f517a87d6419e0e")).doubleValue();
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
            com.meituan.msi.log.a.a("获取文件大小失败，文件不存在!");
            j = 0;
        }
        Object[] objArr2 = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64cbad125da06e9faa91c9c33703498a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64cbad125da06e9faa91c9c33703498a")).doubleValue();
        }
        switch (i) {
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

    private static long a(DioFile dioFile) throws Exception {
        InputStream inputStream;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f69464cc01ddb7f8e5ac1c40fa8e8dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f69464cc01ddb7f8e5ac1c40fa8e8dd")).longValue();
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
            com.meituan.msi.log.a.a("获取文件大小失败，文件不存在!");
        }
        return j;
    }

    private static long b(DioFile dioFile) throws Exception {
        long a2;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c6b0469e71f941ebcc6774878cf3bf4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c6b0469e71f941ebcc6774878cf3bf4")).longValue();
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

    public static long a(String str) {
        ZipFile zipFile;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipFile zipFile2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88d41b790f0baead429c8694bbc0766f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88d41b790f0baead429c8694bbc0766f")).longValue();
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
