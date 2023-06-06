package com.meituan.mtwebkit.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static a<String, Boolean> b = new a<String, Boolean>() { // from class: com.meituan.mtwebkit.internal.c.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mtwebkit.internal.c.a
        public final /* synthetic */ Boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ad3eb263ece271f563642d2cdea4cf", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ad3eb263ece271f563642d2cdea4cf") : Boolean.TRUE;
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T, R> {
        R a(T t);
    }

    public static boolean a(File file, a<String, Boolean> aVar) {
        File[] listFiles;
        Object[] objArr = {file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5921f7e53a78e394c1f3396397a61554", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5921f7e53a78e394c1f3396397a61554")).booleanValue();
        }
        if (!file.exists()) {
            file.delete();
            return true;
        } else if (aVar == null || aVar.a(file.getPath()).booleanValue()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    a(file2, aVar);
                }
            }
            boolean delete = file.delete();
            if (!delete) {
                e.b("FileUtils", "Failed to delete: %s" + file);
            }
            return delete;
        } else {
            return true;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e886141a117d5a79b21691d7966429b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e886141a117d5a79b21691d7966429b");
            return;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        Object[] objArr = {inputStream, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b59884825048863603a95700f5a70df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b59884825048863603a95700f5a70df3");
            return;
        }
        File file2 = new File(file.getPath() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            new StringBuilder("Writing to %s").append(file);
            a(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                throw new IOException();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileOutputStream.close();
                }
                throw th2;
            }
        }
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f232dc1a6c59fc7621e0f5e47e96e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f232dc1a6c59fc7621e0f5e47e96e9a")).booleanValue();
        }
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                new FileOutputStream(file).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file.setLastModified(System.currentTimeMillis());
    }

    public static final String b(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "162c44e25adce8cdff17084c430f40ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "162c44e25adce8cdff17084c430f40ae");
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            for (int read = fileInputStream.read(bArr, 0, 8192); read >= 0; read = fileInputStream.read(bArr, 0, 8192)) {
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b2 : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & 15];
            }
            String str = new String(cArr2);
            fileInputStream.close();
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }
}
