package com.meituan.msc.common.utils;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DecodeFormat;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static final Charset b = Charset.forName("UTF-8");

    public static boolean a(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c23c7e9ee98b440198a471a4d857361e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c23c7e9ee98b440198a471a4d857361e")).booleanValue();
        }
        if (inputStream == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            com.meituan.msc.modules.reporter.g.d(str + " can't delete");
            return false;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    v.a(inputStream, fileOutputStream);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            com.meituan.msc.modules.reporter.g.a(e);
            v.a(inputStream, fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            v.a(inputStream, fileOutputStream);
            throw th;
        }
    }

    private static boolean a(InputStream inputStream, OutputStream outputStream) {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0db80282aec5ec8736fd87b5c855962a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0db80282aec5ec8736fd87b5c855962a")).booleanValue();
        }
        if (inputStream == null || outputStream == null) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        v.a(inputStream, outputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (Exception e) {
                Log.d("FileUtil", "copyAll file exception", e);
                v.a(inputStream, outputStream);
                return false;
            }
        } catch (Throwable th) {
            v.a(inputStream, outputStream);
            throw th;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0871fbadeb32b08fec38699c46afd7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0871fbadeb32b08fec38699c46afd7a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return a(new File(str));
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c68b0e64185d8996cce5bd0d3ffb1cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c68b0e64185d8996cce5bd0d3ffb1cdd")).booleanValue();
        }
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = !file2.isFile() ? !(a(file2.getAbsolutePath()) && z) : !(file2.delete() && z);
        }
        return file.delete() && z;
    }

    public static String a(DioFile dioFile) throws IOException {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8b161a03e56447502ba4c1bef2b3865", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8b161a03e56447502ba4c1bef2b3865");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        if (dioFile.l() > 1048576) {
            return c(dioFile);
        }
        return b(dioFile);
    }

    private static String b(DioFile dioFile) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c24885967b58d351f822ceaec8b2273", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c24885967b58d351f822ceaec8b2273");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = dioFile.b();
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read >= 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            String str = new String(byteArrayOutputStream.toByteArray());
                            v.a(byteArrayOutputStream, inputStream);
                            return str;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v.a(byteArrayOutputStream, inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    private static String c(DioFile dioFile) throws IOException {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf69cb6604e7dd0f6c838d88fe462b0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf69cb6604e7dd0f6c838d88fe462b0a");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        try {
            return new String(dioFile.a(true));
        } catch (Exception unused) {
            return b(dioFile);
        }
    }

    public static String a(Context context, String str) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a47652a93abbc88617f52eb918e14535", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a47652a93abbc88617f52eb918e14535");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = context.getAssets().open(str);
            } catch (Exception e) {
                e = e;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    v.a(byteArrayOutputStream, inputStream);
                    return str2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            try {
                Log.e("FileUtil", "read assets file content exception", e);
                v.a(byteArrayOutputStream2, inputStream);
                return "";
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                v.a(byteArrayOutputStream, inputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            v.a(byteArrayOutputStream, inputStream);
            throw th;
        }
    }

    public static String b(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c458e14bab1c13d4ff5675b498111fd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c458e14bab1c13d4ff5675b498111fd6");
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
                v.a(fileInputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    String e = e(file);
                    v.a(fileInputStream);
                    return e;
                } catch (Throwable th3) {
                    v.a(fileInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    private static String e(File file) {
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
                            v.a(fileInputStream);
                            return a2;
                        }
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        v.a(fileInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                v.a(null);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            v.a(null);
            throw th;
        }
    }

    private static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "885ba990d5d297b9281ffd5738d17871", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "885ba990d5d297b9281ffd5738d17871");
        }
        StringBuilder sb = new StringBuilder("");
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

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10c1427adc9a4acaed33156ad064eea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10c1427adc9a4acaed33156ad064eea3");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf(CommonConstant.Symbol.DOT);
        return (lastIndexOf2 == -1 || lastIndexOf2 < lastIndexOf) ? "" : str.substring(lastIndexOf2);
    }

    @Nullable
    public static String a(String str, IFileModule iFileModule) {
        Object[] objArr = {str, iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "856acda0f1b02d3d7eab47069b958637", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "856acda0f1b02d3d7eab47069b958637");
        }
        if (str.startsWith(ag.d)) {
            return iFileModule.M_() + str.substring(3);
        } else if (str.startsWith(ag.c)) {
            String substring = str.substring(5);
            return iFileModule.a() + substring;
        } else if (str.startsWith("store_")) {
            return iFileModule.a() + str;
        } else if (str.startsWith("tmp_")) {
            return iFileModule.c() + str;
        } else {
            return null;
        }
    }

    @Nullable
    public static String b(String str, IFileModule iFileModule) {
        String substring;
        Object[] objArr = {str, iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19f0501916fa843a92c025b0ec9cdf55", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19f0501916fa843a92c025b0ec9cdf55");
        }
        if (str.startsWith("mscfile://")) {
            substring = str.substring(10);
        } else {
            substring = str.startsWith("wdfile://") ? str.substring(9) : null;
        }
        if (substring != null) {
            return a(substring, iFileModule);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        DioFile b2 = iFileModule.b(str);
        if (b2 == null || !b2.c()) {
            return null;
        }
        return b2.h();
    }

    public static RequestCreator a(Context context, String str, IFileModule iFileModule) {
        Object[] objArr = {context, str, iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90594645892cfb0284e44d206ddab367", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90594645892cfb0284e44d206ddab367");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return Picasso.g(context).d(str).g().a(DecodeFormat.PREFER_ARGB_8888);
        }
        String b2 = b(str, iFileModule);
        if (b2 == null) {
            return null;
        }
        return Picasso.g(context).a(new DioFile(b2)).g().a(DecodeFormat.PREFER_ARGB_8888);
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bdd80da30ff77b916de28f6021f0762", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bdd80da30ff77b916de28f6021f0762")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @android.support.annotation.RequiresApi(api = 29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@android.support.annotation.NonNull android.content.Context r24, @android.support.annotation.NonNull java.io.InputStream r25, @android.support.annotation.NonNull java.lang.String r26, @android.support.annotation.NonNull java.lang.String r27, boolean r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.common.utils.r.a(android.content.Context, java.io.InputStream, java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static File c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da6b3ccb1854be445970c2bab83b2161", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da6b3ccb1854be445970c2bab83b2161");
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static File d(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccfece98ab5dd04a3be69d401756499a", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccfece98ab5dd04a3be69d401756499a");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(String str, String str2, String str3) {
        File file;
        do {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3704d977d34b0300c8935195f3897f64", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3704d977d34b0300c8935195f3897f64");
            }
            file = new File(str, "tmp_" + UUID.randomUUID().toString() + str2 + str3);
        } while (file.exists());
        return file;
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b85f460cbc21af716319954038a8676c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b85f460cbc21af716319954038a8676c");
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.toHexString(crc32.getValue());
        } catch (Exception unused) {
            return "";
        }
    }
}
