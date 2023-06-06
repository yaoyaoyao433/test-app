package com.dianping.logreportswitcher.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static String b;

    public static int a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9125ef3a364055d3acee3bbded87f942", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9125ef3a364055d3acee3bbded87f942")).intValue();
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static byte[] a(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ab507e0192359fa4dad099962a06da", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ab507e0192359fa4dad099962a06da");
        }
        if (b(bArr)) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean b(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6757262c07b83f72cab9472faaf5f4cf", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6757262c07b83f72cab9472faaf5f4cf")).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.?)+").matcher(b(context));
            if (matcher.find()) {
                return Integer.parseInt(matcher.group().replace(CommonConstant.Symbol.DOT, ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static synchronized String b(Context context) {
        synchronized (f.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38271512ce9bba2f550326fe50b0aacc", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38271512ce9bba2f550326fe50b0aacc");
            }
            if (TextUtils.isEmpty(b)) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (b == null) {
                b = "";
            }
            return b;
        }
    }
}
