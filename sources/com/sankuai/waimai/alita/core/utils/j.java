package com.sankuai.waimai.alita.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c2318aca2ba2d9df227a647ceb797ff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c2318aca2ba2d9df227a647ceb797ff") : a(file, "MD5");
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
            if (PatchProxy.isSupport(r1, null, changeQuickRedirect, true, "9640be315b05985e636df938016aa894", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(r1, null, changeQuickRedirect, true, "9640be315b05985e636df938016aa894");
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
                    String str2 = PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42cc70e82302459e1d3e571eed334a04", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42cc70e82302459e1d3e571eed334a04") : new String(a(digest, b));
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

    private static char[] a(byte[] bArr, char[] cArr) {
        Object[] objArr = {bArr, cArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff61cf8e72a290bbbca72c889c22dd1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff61cf8e72a290bbbca72c889c22dd1f");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26b213278b133e55ff9a3b8c262617cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26b213278b133e55ff9a3b8c262617cf");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
