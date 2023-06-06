package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.meituan.robust.common.CommonConstant;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static boolean a(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            com.huawei.secure.android.common.util.b.b("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str, String[] strArr) {
        boolean z;
        if (strArr == null || strArr.length == 0) {
            com.huawei.secure.android.common.util.b.b("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
                z = false;
            } else {
                z = TextUtils.equals(a(str), b(str2));
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        String a = a(str);
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(str2)) {
            com.huawei.secure.android.common.util.b.b("UriUtil", "url or whitelist is null");
            return false;
        }
        String b = b(str2);
        if (TextUtils.isEmpty(b)) {
            Log.e("UriUtil", "whitelist host is null");
            return false;
        } else if (b.equals(a)) {
            return true;
        } else {
            if (a.endsWith(b)) {
                try {
                    String substring = a.substring(0, a.length() - b.length());
                    if (substring.endsWith(CommonConstant.Symbol.DOT)) {
                        return substring.matches("^[A-Za-z0-9.-]+$");
                    }
                    return false;
                } catch (IndexOutOfBoundsException e) {
                    com.huawei.secure.android.common.util.b.b("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                    return false;
                } catch (Exception e2) {
                    com.huawei.secure.android.common.util.b.b("UriUtil", "Exception : " + e2.getMessage());
                    return false;
                }
            }
            return false;
        }
    }

    @TargetApi(9)
    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.secure.android.common.util.b.a("UriUtil", "url is null");
            return str;
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                com.huawei.secure.android.common.util.b.b("UriUtil", "url don't starts with http or https");
                return "";
            }
            return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
        } catch (MalformedURLException e) {
            com.huawei.secure.android.common.util.b.b("UriUtil", "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : a(str);
        }
        com.huawei.secure.android.common.util.b.a("UriUtil", "whiteListUrl is null");
        return null;
    }
}
