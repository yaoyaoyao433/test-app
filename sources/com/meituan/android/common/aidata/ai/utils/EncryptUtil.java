package com.meituan.android.common.aidata.ai.utils;

import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EncryptUtil {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String sha1(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48fba5fa6efc13dc6c98f716495d5967", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48fba5fa6efc13dc6c98f716495d5967") : digest(file, "SHA-1");
    }

    public static String md5(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2efb4081886105a8767dbb20521deda6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2efb4081886105a8767dbb20521deda6") : digest(file, "MD5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static String digest(File file, String str) {
        FileInputStream fileInputStream;
        ?? r0 = {file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(r0, null, changeQuickRedirect2, true, "6d558fe1846606646a8f8cf37e19c863", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(r0, null, changeQuickRedirect2, true, "6d558fe1846606646a8f8cf37e19c863");
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(str);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String encodeHexString = encodeHexString(messageDigest.digest());
                            closeQuietly(fileInputStream);
                            return encodeHexString;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    c.a(String.format("MRNLogan digest catch error:%s", e.getMessage()), 3);
                    closeQuietly(fileInputStream);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                r0 = 0;
                closeQuietly(r0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String encodeHexString(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42e01734dad2b0c9159229a03a0bccec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42e01734dad2b0c9159229a03a0bccec") : new String(encodeHex(bArr, DIGITS_LOWER));
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        Object[] objArr = {bArr, cArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0fd3121ad1377adb3e7295a6c551f05", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0fd3121ad1377adb3e7295a6c551f05");
        }
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public static void closeQuietly(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c787874755d23cb35f2dd426a2a1c858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c787874755d23cb35f2dd426a2a1c858");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
