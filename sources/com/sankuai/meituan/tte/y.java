package com.sankuai.meituan.tte;

import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import dianping.com.nvlinker.NVLinker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final byte[] c = {-54, 18, 45, -93, -30, 107, -14, 107, 112, 73, 17, 9, 103, -50, 48, -127};

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b917d9684f296ac26f1e0aa9abd94937", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b917d9684f296ac26f1e0aa9abd94937");
        }
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public static byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e09e2413f6fdb1ae913adcc9f54233cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e09e2413f6fdb1ae913adcc9f54233cf");
        }
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    public static String a(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce59fc195953922e5583c3652bedcb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce59fc195953922e5583c3652bedcb5");
        }
        if (i <= 0) {
            return "0";
        }
        int i3 = i >>> 10;
        while (true) {
            i3 >>>= 1;
            if (i3 == 0) {
                return String.valueOf(i2);
            }
            i2++;
        }
    }

    public static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb3114812d6646e8cb16ddc2fa6ec3f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb3114812d6646e8cb16ddc2fa6ec3f7") : i > 1024 ? "-1" : String.valueOf(i / 50);
    }

    public static byte[] b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd655f93f2ceb3f93f4a7d8443901766", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd655f93f2ceb3f93f4a7d8443901766");
        }
        int length = c.length;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (c[i % length] ^ bArr[i]);
        }
        return bArr2;
    }

    public static byte[] a(byte[]... bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d96e56946d58bef4a89f8a55ccf504d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d96e56946d58bef4a89f8a55ccf504d1");
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte[] bArr3 : bArr) {
            allocate.put(bArr3);
        }
        return allocate.array();
    }

    public static void a(AutoCloseable autoCloseable) {
        Object[] objArr = {autoCloseable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e761803883a465e25de412bd019bd0c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e761803883a465e25de412bd019bd0c4");
        } else if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "949eff47004454fcdcb34b38851fff33", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "949eff47004454fcdcb34b38851fff33");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce4569c4ebda7902d7db31a7ae7e26f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce4569c4ebda7902d7db31a7ae7e26f4")).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static com.meituan.android.cipstorage.q a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e52c18a8bc7a08c377ca6cf59984a9d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e52c18a8bc7a08c377ca6cf59984a9d3");
        }
        String currentProcessName = ProcessUtils.getCurrentProcessName(context);
        return com.meituan.android.cipstorage.q.a(context, "bfe_tte_" + str + CommonConstant.Symbol.UNDERLINE + currentProcessName);
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ec30429cd21b754ae34227f6069d2d3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ec30429cd21b754ae34227f6069d2d3")).intValue() : NVLinker.getAppID();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec4e3bae346c57e75d7331a84bf0586a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec4e3bae346c57e75d7331a84bf0586a");
        }
        try {
            return NVLinker.isLinkerInit() ? NVLinker.getUnionID() : "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
