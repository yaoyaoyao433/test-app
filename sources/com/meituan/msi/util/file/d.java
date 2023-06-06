package com.meituan.msi.util.file;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.dio.easy.DioFile;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DecodeFormat;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Method b;
    private static Field c;
    private static Field d;
    private static Object e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a = 0;
        public long b = 0;
    }

    public static File a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4591e7215b2c5ac5c453f0238c79049", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4591e7215b2c5ac5c453f0238c79049");
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return file;
    }

    public static File b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66a8e45e073d45267f86436558b0fb58", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66a8e45e073d45267f86436558b0fb58");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static void a(String str, HashSet<File> hashSet, boolean z, boolean z2) {
        File[] listFiles;
        Object[] objArr = {str, hashSet, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad9ab2a5b6fbab3e9112b5d7ba7827c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad9ab2a5b6fbab3e9112b5d7ba7827c6");
            return;
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        if (listFiles.length == 0) {
            hashSet.add(file);
            return;
        }
        if (z2) {
            hashSet.add(file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && z) {
                if (z2) {
                    hashSet.add(file2);
                }
                a(file2.getAbsolutePath(), hashSet, z, z2);
            } else {
                hashSet.add(file2);
            }
        }
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d2abb2d07438cd4b574054490f04d46", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d2abb2d07438cd4b574054490f04d46");
        }
        a aVar = new a();
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat lstat = Os.lstat(str);
                aVar.b = lstat.st_atime;
                aVar.a = lstat.st_mode;
                return aVar;
            } catch (Exception e2) {
                com.meituan.msi.log.a.a(str + StringUtil.SPACE + e2.getMessage());
            }
        } else {
            if (e == null) {
                try {
                    Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(null);
                    e = obj;
                    Method method = obj.getClass().getMethod("lstat", String.class);
                    b = method;
                    d = method.getClass().getDeclaredField("st_atime");
                    c = b.getClass().getDeclaredField("st_mode");
                    if (!d.isAccessible()) {
                        d.setAccessible(true);
                    }
                    if (!c.isAccessible()) {
                        d.setAccessible(true);
                    }
                } catch (Exception e3) {
                    com.meituan.msi.log.a.a(str + StringUtil.SPACE + e3.getMessage());
                }
            }
            try {
                Object invoke = b.invoke(e, str);
                aVar.a = c.getInt(invoke);
                aVar.b = d.getLong(invoke);
                return aVar;
            } catch (Exception e4) {
                com.meituan.msi.log.a.a(str + StringUtil.SPACE + e4.getMessage());
            }
        }
        return aVar;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426432090cfeee330d8e2c41f1594d37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426432090cfeee330d8e2c41f1594d37");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf(CommonConstant.Symbol.DOT);
        return (lastIndexOf2 == -1 || lastIndexOf2 < lastIndexOf) ? "" : str.substring(lastIndexOf2);
    }

    public static String c(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "165353e089773989a4b5298de9cd9e27", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "165353e089773989a4b5298de9cd9e27");
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
                h.a(fileInputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    String d2 = d(file);
                    h.a(fileInputStream);
                    return d2;
                } catch (Throwable th3) {
                    h.a(fileInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a38533014c0832b4499c366383d6844c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a38533014c0832b4499c366383d6844c");
        }
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    return a(messageDigest.digest());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a38106544fa6fd35759348046ce6fcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a38106544fa6fd35759348046ce6fcb");
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[4096];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                }
                String a2 = a(messageDigest.digest());
                h.a(fileInputStream);
                return a2;
            } catch (Exception unused) {
                h.a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                h.a(fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static String d(File file) {
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
                            h.a(fileInputStream);
                            return a2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        h.a(fileInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                h.a(null);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            h.a(null);
            throw th;
        }
    }

    private static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d896c713d21126e46209c72dd410fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d896c713d21126e46209c72dd410fd7");
        }
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static boolean a(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "669ca90401b08171849db9d22051a2f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "669ca90401b08171849db9d22051a2f0")).booleanValue();
        }
        if (inputStream == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            return false;
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        h.a(inputStream, fileOutputStream);
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Exception unused) {
                h.a(inputStream, fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                h.a(inputStream, fileOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static boolean a(String str, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bf16211fcde8f77efe3ca08a4439642", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bf16211fcde8f77efe3ca08a4439642")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        DioFile dioFile = new DioFile(str);
        if (!dioFile.c()) {
            return false;
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            inputStream = dioFile.b();
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            h.a(inputStream, fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception unused) {
                    fileOutputStream2 = fileOutputStream;
                    h.a(inputStream, fileOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    h.a(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    public static RequestCreator a(Context context, String str, MsiContext msiContext) {
        Object[] objArr = {context, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5107834fa5fa2122488a91c6f8e8ca1", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5107834fa5fa2122488a91c6f8e8ca1");
        }
        if (str == null) {
            return null;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return Picasso.g(context).d(str).g().a(DecodeFormat.PREFER_ARGB_8888);
        }
        String a2 = msiContext.getFileProvider().a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return Picasso.g(context).a(new DioFile(a2)).g().a(DecodeFormat.PREFER_ARGB_8888);
    }

    public static boolean a(String str, String str2, String str3) {
        InputStream b2;
        FileOutputStream fileOutputStream;
        Closeable[] closeableArr;
        byte[] bArr;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff8bb9c4698d3fa1b5dabc9dfb2de1f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff8bb9c4698d3fa1b5dabc9dfb2de1f0")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            try {
                t createContentResolver = Privacy.createContentResolver(com.meituan.msi.a.f(), str3);
                b2 = createContentResolver != null ? createContentResolver.b(parse) : null;
            } catch (FileNotFoundException unused) {
                return false;
            }
        } else {
            try {
                DioFile dioFile = new DioFile(str);
                if (!dioFile.c()) {
                    return false;
                }
                b2 = dioFile.b();
            } catch (IOException unused2) {
                return false;
            }
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bArr = new byte[4096];
            } catch (Exception unused3) {
                closeableArr = new Closeable[]{b2, fileOutputStream};
                h.a(closeableArr);
                return false;
            } catch (Throwable th) {
                th = th;
                h.a(b2, fileOutputStream);
                throw th;
            }
        } catch (Exception unused4) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        if (b2 == null) {
            closeableArr = new Closeable[]{b2, fileOutputStream};
            h.a(closeableArr);
            return false;
        }
        while (true) {
            int read = b2.read(bArr);
            if (read < 0) {
                h.a(b2, fileOutputStream);
                return true;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean a(InputStream inputStream, OutputStream outputStream) {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea49a094f7a5df6a48281aee2a92b18c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea49a094f7a5df6a48281aee2a92b18c")).booleanValue();
        }
        if (inputStream == null || outputStream == null) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    h.a(inputStream, outputStream);
                    return true;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            h.a(inputStream, outputStream);
            return false;
        } catch (Throwable th) {
            h.a(inputStream, outputStream);
            throw th;
        }
    }

    public static long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a623f8723813cb71ffee9cafc895a279", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a623f8723813cb71ffee9cafc895a279")).longValue();
        }
        if (str == null || str.trim().length() == 0) {
            return -1L;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return -1L;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "011dfe88f2afe387234cc7694bcc092b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "011dfe88f2afe387234cc7694bcc092b")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.support.annotation.RequiresApi(api = 29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@android.support.annotation.NonNull android.content.Context r25, @android.support.annotation.NonNull java.io.InputStream r26, @android.support.annotation.NonNull java.lang.String r27, @android.support.annotation.NonNull java.lang.String r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.util.file.d.a(android.content.Context, java.io.InputStream, java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82ae169935253c3ec16d5124798d31df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82ae169935253c3ec16d5124798d31df")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                return file.delete();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            boolean z = true;
            for (File file2 : listFiles) {
                z = !file2.isFile() ? !(e(file2.getAbsolutePath()) && z) : !(file2.delete() && z);
            }
            return file.delete() && z;
        }
        return true;
    }

    public static String a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b74b393a32bd94acdeba6be42e1f7c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b74b393a32bd94acdeba6be42e1f7c4");
        }
        File a2 = msiContext.getFileProvider().a();
        if (a2 != null) {
            return a2.getAbsolutePath() + File.separator + "store/";
        }
        return null;
    }

    public static InputStream a(String str, com.meituan.msi.provider.a aVar) {
        String a2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e83e1b73ea3be9e6c8dadb4f64f58e84", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e83e1b73ea3be9e6c8dadb4f64f58e84");
        }
        if (URLUtil.isNetworkUrl(str) || (a2 = aVar.a(str)) == null || !new DioFile(a2).c()) {
            return null;
        }
        try {
            return new DioFile(a2).b();
        } catch (IOException e2) {
            e2.printStackTrace();
            h.a(null);
            return null;
        }
    }
}
