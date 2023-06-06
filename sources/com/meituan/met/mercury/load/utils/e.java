package com.meituan.met.mercury.load.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91ac1e6c9c41b531d73a0e4faaf49a8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91ac1e6c9c41b531d73a0e4faaf49a8a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(c(file));
    }

    public static boolean a(InputStream inputStream, String str) {
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b21bd9f9cd3919c11242d9f949976f28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b21bd9f9cd3919c11242d9f949976f28")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(a(inputStream));
    }

    private static String c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79d388661942006039fd2b2515a77858", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79d388661942006039fd2b2515a77858");
        }
        if (file != null && file.exists() && file.isFile()) {
            try {
                return a((InputStream) new FileInputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e776354846a26a62f8f1de9cdd8e0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e776354846a26a62f8f1de9cdd8e0f");
        }
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                while (true) {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                a((Closeable) inputStream);
                byte[] digest = messageDigest.digest();
                Object[] objArr2 = {digest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7b2c040215f9d82c13ab2964b8082cce", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7b2c040215f9d82c13ab2964b8082cce");
                }
                StringBuilder sb = new StringBuilder("");
                if (digest == null || digest.length <= 0) {
                    return null;
                }
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                a((Closeable) inputStream);
                return null;
            }
        } catch (Throwable th) {
            a((Closeable) inputStream);
            throw th;
        }
    }

    public static long a(File file, InputStream inputStream) throws IOException {
        Object[] objArr = {file, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedOutputStream bufferedOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6c17c1daa41949d6828fb7b46f57e46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6c17c1daa41949d6828fb7b46f57e46")).longValue();
        }
        long j = 0;
        a(file);
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream2.write(bArr, 0, read);
                        j += read;
                    } else {
                        a(bufferedOutputStream2);
                        a((Closeable) inputStream);
                        return j;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File a(InputStream inputStream, File file, String str) {
        ZipInputStream zipInputStream;
        Object[] objArr = {inputStream, file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipInputStream zipInputStream2 = null;
        r2 = null;
        ZipInputStream zipInputStream3 = null;
        ZipInputStream zipInputStream4 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae662dcb922ccb7671c86ebe53aff37b", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae662dcb922ccb7671c86ebe53aff37b");
            }
            try {
                zipInputStream = new ZipInputStream(inputStream);
                try {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null && !nextEntry.isDirectory()) {
                            String parent = file.getParent();
                            File file2 = new File(parent, nextEntry.getName());
                            try {
                                if (!file2.exists() || !a(file2, str)) {
                                    a(file2, zipInputStream);
                                }
                                file = file2;
                                zipInputStream3 = parent;
                            } catch (IOException e) {
                                e = e;
                                zipInputStream4 = zipInputStream;
                                file = file2;
                                e.printStackTrace();
                                a(zipInputStream4);
                                zipInputStream2 = zipInputStream4;
                                return file;
                            }
                        }
                        a(zipInputStream);
                        zipInputStream2 = zipInputStream3;
                    } catch (Throwable th) {
                        th = th;
                        a(zipInputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    zipInputStream4 = zipInputStream;
                }
            } catch (IOException e3) {
                e = e3;
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = zipInputStream2;
        }
    }

    private static void a(ZipInputStream zipInputStream) {
        Object[] objArr = {zipInputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "035eca437a7c1d1226ae087fdc3072e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "035eca437a7c1d1226ae087fdc3072e9");
            return;
        }
        try {
            zipInputStream.close();
        } catch (Exception unused) {
        }
    }

    public static long a(File file, File file2) {
        ZipInputStream zipInputStream;
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipInputStream zipInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c6923cb0a4b3785276881f8c5965d92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c6923cb0a4b3785276881f8c5965d92")).longValue();
        }
        long j = -1;
        try {
            try {
                zipInputStream = new ZipInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ZipInputStream zipInputStream3 = nextEntry;
            if (nextEntry != null) {
                boolean isDirectory = nextEntry.isDirectory();
                zipInputStream3 = isDirectory;
                if (!isDirectory) {
                    j = a(file2, zipInputStream);
                    zipInputStream3 = isDirectory;
                }
            }
            a(zipInputStream);
            zipInputStream2 = zipInputStream3;
        } catch (IOException e2) {
            e = e2;
            zipInputStream2 = zipInputStream;
            c.a("ZipInputStream unzip fail " + file);
            e.printStackTrace();
            a(zipInputStream2);
            zipInputStream2 = zipInputStream2;
            return j;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream2 = zipInputStream;
            a(zipInputStream2);
            throw th;
        }
        return j;
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6da56427ea00e61ddb3da84387c4fa4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6da56427ea00e61ddb3da84387c4fa4d");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e0cd6d9bceab2990f8d922c3f123138", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e0cd6d9bceab2990f8d922c3f123138")).booleanValue();
        }
        if (file.getParentFile().exists()) {
            return true;
        }
        return file.getParentFile().mkdirs();
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5733428e1c94785989464ec88b4f5a19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5733428e1c94785989464ec88b4f5a19");
        }
        if (str == null) {
            return "";
        }
        try {
            String host = new URL(str).getHost();
            if (host.length() > 0) {
                if (str.endsWith(host)) {
                    return "";
                }
            }
            int lastIndexOf = str.lastIndexOf(47) + 1;
            int length = str.length();
            int lastIndexOf2 = str.lastIndexOf(63);
            if (lastIndexOf2 == -1) {
                lastIndexOf2 = length;
            }
            int lastIndexOf3 = str.lastIndexOf(35);
            if (lastIndexOf3 != -1) {
                length = lastIndexOf3;
            }
            return str.substring(lastIndexOf, Math.min(lastIndexOf2, length));
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static void b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96c748f1ad23a0a8c0ed6a472409a0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96c748f1ad23a0a8c0ed6a472409a0d1");
        } else if (file == null) {
            System.out.println("DDD:文件删除失败directory is null");
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                System.out.println("DDD:文件删除失败directory listFiles is null");
                return;
            }
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        file2.delete();
                        System.out.println("DDD:文件已删除=" + file2.getName());
                    }
                }
            }
            file.delete();
            System.out.println("DDD:目录已删除=" + file.getName());
        }
    }
}
