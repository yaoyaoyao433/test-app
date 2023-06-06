package com.meituan.android.common.fingerprint.utils;

import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class StringUtils {
    private static final String LoganTag = "owl_logan";
    private static final String TAG = "owlLog";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String md5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29edfaa32eaed3560c8dd1362f6e3119", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29edfaa32eaed3560c8dd1362f6e3119");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    sb.append('0');
                    sb.append(hexString.charAt(hexString.length() - 1));
                } else {
                    sb.append(hexString.substring(hexString.length() - 2));
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            setErrorLogan(th);
            return "";
        }
    }

    public static String getStackTrace(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f234b1cabd4f13790dbf53f43ae177d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f234b1cabd4f13790dbf53f43ae177d");
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static void setLogan(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15f860b30848c0f8988675a7338d3060", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15f860b30848c0f8988675a7338d3060");
        } else {
            c.a(str, 3, new String[]{LoganTag});
        }
    }

    public static void setErrorLogan(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98eded1684b8da76c427a4a136320465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98eded1684b8da76c427a4a136320465");
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        String str = "Error: " + th.getMessage() + "\ntraceElements:\n" + sb.toString();
        Log.e(TAG, str);
        c.a(str, 3, new String[]{LoganTag});
    }
}
