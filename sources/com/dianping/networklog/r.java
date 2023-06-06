package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public static final m b = new m(1024);

    public static String a(File file) {
        FileInputStream fileInputStream;
        int i = 0;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1dd5ac378c6429624d1fbfa82620570", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1dd5ac378c6429624d1fbfa82620570");
        }
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                while (length > 0) {
                    int read = fileInputStream.read(bArr, i, length);
                    if (read == -1) {
                        a(fileInputStream);
                        return null;
                    }
                    i += read;
                    length -= read;
                }
                String str = new String(bArr);
                a(fileInputStream);
                return str;
            } catch (IOException unused) {
                a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                a(fileInputStream);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Closeable] */
    public static String a(String str) {
        FileInputStream fileInputStream;
        File file;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd2ceb38e1ffaecb2ac849019c238753", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd2ceb38e1ffaecb2ac849019c238753");
        }
        byte[] a2 = b.a(1024);
        try {
            try {
                file = new File(str);
            } catch (Throwable th) {
                th = th;
                b.a(a2);
                a((Closeable) str);
                throw th;
            }
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            str = 0;
            b.a(a2);
            a((Closeable) str);
            throw th;
        }
        if (!file.exists() || !file.isFile()) {
            b.a(a2);
            a((Closeable) null);
            return null;
        }
        fileInputStream = new FileInputStream(file);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = fileInputStream.read(a2);
                if (read == -1) {
                    String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                    b.a(a2);
                    a(fileInputStream);
                    return bigInteger;
                }
                messageDigest.update(a2, 0, read);
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            b.a(a2);
            a(fileInputStream);
            return null;
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7edb284edf8e651e3d4b8034366b994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7edb284edf8e651e3d4b8034366b994");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(File file, String str) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31f89f759763d2ce50dc0ea440bffdfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31f89f759763d2ce50dc0ea440bffdfc");
        } else if (file == null) {
        } else {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException unused) {
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(str.getBytes());
                a(fileOutputStream);
            } catch (IOException unused2) {
                a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                a(fileOutputStream);
                throw th;
            }
        }
    }

    private static boolean a(File file, File file2, boolean z) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Object[] objArr = {file, file2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efcf294055cd3bca3a5c1c949dbe1d83", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efcf294055cd3bca3a5c1c949dbe1d83")).booleanValue();
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, false);
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                byte[] a2 = b.a(1024);
                while (true) {
                    int read = fileInputStream.read(a2);
                    if (read < 0) {
                        a(fileInputStream);
                        a(fileOutputStream);
                        return true;
                    }
                    fileOutputStream.write(a2, 0, read);
                    fileOutputStream.flush();
                }
            } catch (IOException e2) {
                e = e2;
                fileInputStream2 = fileInputStream;
                try {
                    e.printStackTrace();
                    a(fileInputStream2);
                    a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                a(fileInputStream);
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16fd97540bab2912aa937926f29f4625", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16fd97540bab2912aa937926f29f4625")).booleanValue() : a(new File(str), new File(str2), false);
    }
}
