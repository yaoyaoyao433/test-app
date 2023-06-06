package com.tencent.smtt.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.common.StringUtil;
import com.tencent.connect.common.Constants;
import com.tencent.mapsdk.internal.ki;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.WebView;
/* loaded from: classes6.dex */
public class k {
    private static String a = null;
    private static String b = "GA";
    private static String c = "GE";
    private static String d = "9422";
    private static String e = "0";
    private static String f = "";
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;

    public static String a(Context context) {
        return a(context, "0");
    }

    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(a)) {
            String a2 = a(context, String.valueOf(WebView.getTbsSDKVersion(context)), str, b, c, d, e, f, g);
            a = a2;
            return a2;
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.k.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private static String a(String str) {
        return "com.tencent.mm".equals(str) ? "WX" : "com.tencent.mobileqq".equals(str) ? Constants.SOURCE_QQ : "com.qzone".equals(str) ? "QZ" : TbsConfig.APP_QB.equals(str) ? "QB" : ki.l;
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
    }

    private static int b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getWidth();
        }
        return -1;
    }

    private static int c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getHeight();
        }
        return -1;
    }

    private static String d(Context context) {
        String d2 = r.d(context);
        return StringUtil.SPACE + d2.replaceAll("[ |\\/|\\_|\\&|\\|]", "") + StringUtil.SPACE;
    }

    private static boolean e(Context context) {
        if (h) {
            return i;
        }
        try {
            i = (Math.min(b(context), c(context)) * 160) / f(context) >= 700;
            h = true;
            return i;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int f(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }
        return 160;
    }
}
