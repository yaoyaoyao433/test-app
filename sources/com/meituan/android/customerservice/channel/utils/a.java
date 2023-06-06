package com.meituan.android.customerservice.channel.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90ecd88002c1e76f9a05582281e61e5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90ecd88002c1e76f9a05582281e61e5a");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484b5d8f8e368b37a6f55527990c8051", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484b5d8f8e368b37a6f55527990c8051");
        }
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(CommonConstant.Symbol.DOT);
        return lastIndexOf < 0 ? "" : str.substring(lastIndexOf + 1);
    }

    public static ByteArrayOutputStream a(Activity activity, File file, Bitmap.CompressFormat compressFormat, int i) {
        Bitmap a2;
        Object[] objArr = {activity, file, compressFormat, 20};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b31d11027eb24dab311791d1a6b47110", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteArrayOutputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b31d11027eb24dab311791d1a6b47110");
        }
        if (activity == null || activity.isFinishing() || (a2 = a(activity, file)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a2.compress(compressFormat, 20, byteArrayOutputStream);
        } catch (Exception unused) {
        }
        if (byteArrayOutputStream.size() <= 0) {
            return null;
        }
        return byteArrayOutputStream;
    }

    private static Bitmap a(Activity activity, File file) {
        Object[] objArr = {activity, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5431c860cbf2c258913d966e1262c70f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5431c860cbf2c258913d966e1262c70f");
        }
        if (file == null || !file.exists() || activity == null || activity.isFinishing()) {
            return null;
        }
        try {
            return com.sankuai.waimai.launcher.util.image.a.a(Privacy.createContentResolver(activity, "pt-76641b6e2e3e4ebb").b(Uri.fromFile(file)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.customerservice.channel.utils.a.a
            java.lang.String r10 = "d2d8e054c143b9c65884669fd1bc7ede"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            byte[] r11 = (byte[]) r11
            return r11
        L1e:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r1 = "r"
            r0.<init>(r11, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            long r3 = r0.length()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4e
            int r11 = (int) r3     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4e
            byte[] r11 = new byte[r11]     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4e
            r0.read(r11)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4e
            r0.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r0 = move-exception
            r0.printStackTrace()
        L38:
            return r11
        L39:
            r11 = move-exception
            goto L40
        L3b:
            r11 = move-exception
            r0 = r2
            goto L4f
        L3e:
            r11 = move-exception
            r0 = r2
        L40:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r11 = move-exception
            r11.printStackTrace()
        L4d:
            return r2
        L4e:
            r11 = move-exception
        L4f:
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.channel.utils.a.a(java.io.File):byte[]");
    }
}
