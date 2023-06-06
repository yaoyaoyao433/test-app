package com.sankuai.meituan.kernel.net.msi;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d72f09d5edf819deb83d92fae03ecf2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d72f09d5edf819deb83d92fae03ecf2f");
        }
        if (!file.isFile()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(map);
                String a2 = a(messageDigest.digest());
                a(fileInputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    String b = b(file);
                    a(fileInputStream);
                    return b;
                } catch (Throwable th3) {
                    a(fileInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    private static String b(File file) {
        FileInputStream fileInputStream;
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[4096];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read >= 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String a2 = a(messageDigest.digest());
                            a(fileInputStream);
                            return a2;
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        a(fileInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                a(null);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a(null);
            throw th;
        }
    }

    private static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0dd19c296e972cd4212497895078cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0dd19c296e972cd4212497895078cc7");
        }
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df54eef140e8973a69ebe969f73aed2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df54eef140e8973a69ebe969f73aed2a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return true;
        }
        try {
            return a(new File(str).getCanonicalFile(), new File(str2).getCanonicalFile());
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean a(File file, File file2) {
        while (true) {
            Object[] objArr = {file, file2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e3fbca11911a0d66cef609b9ab39f5d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e3fbca11911a0d66cef609b9ab39f5d")).booleanValue();
            }
            if (file == null) {
                return false;
            }
            if (file2.equals(file)) {
                return true;
            }
            file = file.getParentFile();
        }
    }

    public static boolean a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33ab50d21623187f129725b6c9f22272", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33ab50d21623187f129725b6c9f22272")).booleanValue();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        a(inputStream, fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException unused) {
                a(inputStream, fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                a(inputStream, fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    private static void a(Closeable... closeableArr) {
        Object[] objArr = {closeableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bf4fe9c82a0d61be32ea31fd9b7a27d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bf4fe9c82a0d61be32ea31fd9b7a27d");
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
