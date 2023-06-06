package com.meituan.android.mtplayer.video.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32ae43094dbb7a994ccfb0c37b28f16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32ae43094dbb7a994ccfb0c37b28f16a");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                com.meituan.android.mtplayer.video.utils.c.a("Proxy", "ProxyCacheUtils:Error closing resource:", e);
            }
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab5ba6b37ced1cb90eab6a33049b0926", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab5ba6b37ced1cb90eab6a33049b0926");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.defaultCharset()));
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d043089efc222a641d5928ec2660bc0e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d043089efc222a641d5928ec2660bc0e");
            }
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static long a(d dVar, String str, String str2) throws Exception {
        Object[] objArr = {dVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "906901ca081ceb7fe0e8e8ce0a7b7db6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "906901ca081ceb7fe0e8e8ce0a7b7db6")).longValue();
        }
        File file = new com.meituan.android.mtplayer.video.proxy.file.b(dVar.a(str, str2), dVar.e).b;
        if (file == null || !file.exists()) {
            return -1L;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                long available = fileInputStream2.available();
                fileInputStream2.close();
                return available;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
