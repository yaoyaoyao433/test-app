package com.sankuai.xm.base.util;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class o {
    private static volatile com.sankuai.xm.base.service.d a = null;
    public static ChangeQuickRedirect b = null;
    public static int c = 1024;
    public static String d = File.separator;

    public static com.sankuai.xm.base.service.d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54c6a4fef428e562bb666972fa13f652", 6917529027641081856L)) {
            return (com.sankuai.xm.base.service.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54c6a4fef428e562bb666972fa13f652");
        }
        if (a == null) {
            synchronized (o.class) {
                if (a == null) {
                    a = (com.sankuai.xm.base.service.d) com.sankuai.xm.base.service.m.a(com.sankuai.xm.base.service.d.class);
                }
            }
        }
        return a;
    }

    public static String m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12c028e74f5456d1b71a5c62ff57939a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12c028e74f5456d1b71a5c62ff57939a");
        }
        if (a() != null) {
            return a().b(str);
        }
        return new File(str).getPath();
    }

    public static String n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b2ef02348720f872fc6131af476cce", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b2ef02348720f872fc6131af476cce");
        }
        if (a() != null) {
            return a().a(str);
        }
        return new File(str).getName();
    }

    public static boolean o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63ca91e0ce1d28cbf06961a65a77a7c4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63ca91e0ce1d28cbf06961a65a77a7c4")).booleanValue();
        }
        if (a() != null) {
            return a().c(str);
        }
        return new File(str).exists();
    }

    public static long p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e25280089abbf3d38554b68d7194c32", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e25280089abbf3d38554b68d7194c32")).longValue();
        }
        if (a() != null) {
            return a().e(str);
        }
        return new File(str).length();
    }

    public static InputStream q(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b76fdf253a92f95d4df68a8a13b7e8ed", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b76fdf253a92f95d4df68a8a13b7e8ed");
        }
        if (a() != null) {
            return a().g(str);
        }
        return new FileInputStream(str);
    }

    public static OutputStream r(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfac5b4980239e35597d85fad318e37f", 6917529027641081856L) ? (OutputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfac5b4980239e35597d85fad318e37f") : a(str, false);
    }

    public static OutputStream a(String str, boolean z) throws IOException {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27f91242e0f3ff6abcc532d10f885ea1", 6917529027641081856L)) {
            return (OutputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27f91242e0f3ff6abcc532d10f885ea1");
        }
        if (a() != null) {
            return a().h(str);
        }
        if (!o(str)) {
            s(str);
        }
        return new FileOutputStream(str, z);
    }

    public static boolean s(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7811e16bf79ccd4f563ffcf834d86a5b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7811e16bf79ccd4f563ffcf834d86a5b")).booleanValue();
        }
        if (ac.a(str)) {
            return false;
        }
        if (str.startsWith(d) || str.startsWith("file://") || !str.contains("://")) {
            if (str.startsWith("file://")) {
                str = str.substring(7);
            }
            File file = new File(str);
            if (file.exists()) {
                return false;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        }
        return true;
    }

    public static boolean t(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46f1e7cf8c2abaf99c03cd60d23ea3bd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46f1e7cf8c2abaf99c03cd60d23ea3bd")).booleanValue();
        }
        if (a() != null) {
            return a().d(str);
        }
        File file = new File(str);
        if (file.isDirectory()) {
            b(file);
        }
        return a(str);
    }

    public static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "039ae0a1517ead9f26d92872f394d502", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "039ae0a1517ead9f26d92872f394d502")).booleanValue();
        }
        if (a() != null) {
            return a().a(str, str2);
        }
        return d(str, str2);
    }

    public static boolean c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c92e7e3797cd5cf42ee7c9d6a57cff65", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c92e7e3797cd5cf42ee7c9d6a57cff65")).booleanValue();
        }
        if (e(str, str2) && t(str)) {
            return true;
        }
        t(str2);
        return false;
    }

    public static boolean d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3746eda14624cd0ee5323d55cbeed371", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3746eda14624cd0ee5323d55cbeed371")).booleanValue();
        }
        if (ac.a(str) || ac.a(str2)) {
            return false;
        }
        try {
            boolean renameTo = new File(str).renameTo(new File(str2));
            if (!renameTo && Build.VERSION.SDK_INT >= 26) {
                renameTo = Files.move(Paths.get(str, new String[0]), Paths.get(str2, new String[0]), StandardCopyOption.REPLACE_EXISTING).toFile().exists();
                com.sankuai.xm.log.a.a("JavaFileUtils::safeMove result: %s ,src: %s, dst: %s", Boolean.valueOf(renameTo), str, str2);
            }
            return !renameTo ? c(str, str2) : renameTo;
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th);
            return c(str, str2);
        }
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80c2e5d7d5a748d3271cb2186650feae", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80c2e5d7d5a748d3271cb2186650feae")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                if (file.delete()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e);
            return false;
        }
    }

    public static boolean e(String str, String str2) {
        InputStream inputStream;
        OutputStream outputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df3daadebadd18bce496ea5e25550b32", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df3daadebadd18bce496ea5e25550b32")).booleanValue();
        }
        if (ac.a(str) || ac.a(str2)) {
            return false;
        }
        try {
            inputStream = q(str);
            try {
                outputStream = r(str2);
                try {
                    byte[] bArr = new byte[c];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            outputStream.write(bArr, 0, read);
                        } else {
                            outputStream.flush();
                            m.a(inputStream);
                            m.a(outputStream);
                            return true;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    inputStream2 = inputStream;
                    try {
                        com.sankuai.xm.log.a.a(e);
                        m.a(inputStream2);
                        m.a(outputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        m.a(inputStream);
                        m.a(outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m.a(inputStream);
                    m.a(outputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            outputStream = null;
        }
    }

    public static boolean b(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ab5203fb7556fb9075fb4a005ad0ced", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ab5203fb7556fb9075fb4a005ad0ced")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f31b0cf63ac1e80f26f9d42f178711e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f31b0cf63ac1e80f26f9d42f178711e");
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j < 1024) {
            return decimalFormat.format(j) + ErrorCode.ERROR_TYPE_B;
        } else if (j < 1048576) {
            return decimalFormat.format(j / 1024.0d) + "K";
        } else if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + ErrorCode.ERROR_TYPE_M;
        } else {
            return decimalFormat.format(j / 1.073741824E9d) + "G";
        }
    }

    public static String f(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eedc00f39b473b82b967d861f1e27307", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eedc00f39b473b82b967d861f1e27307");
        }
        if (ac.a(str)) {
            return "";
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (ac.a(str2)) {
            return str;
        }
        return str + str2;
    }

    public static String u(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "074be1b03388ab2f8a83672528c12a63", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "074be1b03388ab2f8a83672528c12a63") : ac.a(str) ? str : new File(str).getName();
    }

    public static void a(File file, long j) {
        Object[] objArr = {file, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "999df461c61d4da4b58c157b04adc5d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "999df461c61d4da4b58c157b04adc5d2");
        } else if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            a(file2, j);
                        }
                    }
                } else if (System.currentTimeMillis() - file.lastModified() >= j && !file.delete()) {
                    com.sankuai.xm.log.a.c("deleteFileByTime::delete file fail info:%s", file.getAbsolutePath());
                }
            } catch (Exception e) {
                com.sankuai.xm.log.a.a(e);
            }
        }
    }

    public static long a(String str, int i) {
        Object[] objArr = {str, 16};
        ChangeQuickRedirect changeQuickRedirect = b;
        RandomAccessFile randomAccessFile = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83f2fc3101ad25bfa74a8d8b62bcaf8f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83f2fc3101ad25bfa74a8d8b62bcaf8f")).longValue();
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                return -1L;
            }
            try {
                long length = file.length();
                if (16 >= length) {
                    file.delete();
                    file.createNewFile();
                    m.a(null);
                    return 0L;
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                long j = length - 16;
                try {
                    randomAccessFile2.seek(j);
                    byte[] bArr = new byte[16];
                    Arrays.fill(bArr, (byte) 0);
                    randomAccessFile2.write(bArr);
                    randomAccessFile2.setLength(j);
                    long length2 = randomAccessFile2.length();
                    m.a(randomAccessFile2);
                    return length2;
                } catch (Exception e) {
                    randomAccessFile = randomAccessFile2;
                    e = e;
                    com.sankuai.xm.log.a.a(e);
                    m.a(randomAccessFile);
                    return -1L;
                } catch (Throwable th) {
                    randomAccessFile = randomAccessFile2;
                    th = th;
                    m.a(randomAccessFile);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
