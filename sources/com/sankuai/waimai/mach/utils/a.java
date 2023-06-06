package com.sankuai.waimai.mach.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a5262204623c00f16248bd16db5f0ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a5262204623c00f16248bd16db5f0ed") : a(file, "MD5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private static String a(File file, String str) {
        FileInputStream fileInputStream;
        ?? r1 = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(r1, null, changeQuickRedirect, true, "dc6aaa451431a06b91afcbebb0a2ceae", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(r1, null, changeQuickRedirect, true, "dc6aaa451431a06b91afcbebb0a2ceae");
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(str);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    byte[] digest = messageDigest.digest();
                    Object[] objArr = {digest};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    String str2 = PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e1ad3474880f702524faa24b290321a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e1ad3474880f702524faa24b290321a") : new String(a(digest, c));
                    a(fileInputStream);
                    return str2;
                } catch (Exception e) {
                    e = e;
                    com.dianping.networklog.c.a(String.format("MRNLogan digest catch error:%s", e.getMessage()), 3);
                    a(fileInputStream);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
                a((Closeable) r1);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39cc7ca14a6e65b7b11388c8ab56e061", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39cc7ca14a6e65b7b11388c8ab56e061");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2);
                if (hexString.length() == 1) {
                    sb.append('0');
                    sb.append(hexString.charAt(hexString.length() - 1));
                } else {
                    sb.append(hexString.substring(hexString.length() - 2));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa18b7fdcfe5a4e22aa018eccd5b6cf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa18b7fdcfe5a4e22aa018eccd5b6cf3");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[digest.length * 2];
            int i = 0;
            for (byte b2 : digest) {
                int i2 = i + 1;
                cArr[i] = b[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr[i2] = b[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return "";
        }
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        Object[] objArr = {bArr, cArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b962dc016ba0cbfde3fa4d377e177e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b962dc016ba0cbfde3fa4d377e177e5f");
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

    private static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da2be557e7a98ae90ffe31f33bf2889f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da2be557e7a98ae90ffe31f33bf2889f");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
