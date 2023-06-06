package com.meituan.android.neohybrid.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        String str2;
        String str3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "863d99631aac65ba619cf36c99cf6c32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "863d99631aac65ba619cf36c99cf6c32");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "36838037054733d527677235891dc866", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "36838037054733d527677235891dc866");
            } else {
                if (!TextUtils.isEmpty(str) && str.startsWith("/")) {
                    int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
                    str2 = indexOf < 0 ? str : str.substring(0, indexOf);
                }
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (TextUtils.isEmpty(scheme)) {
                    str3 = "";
                } else {
                    str3 = scheme + "://";
                }
                String host = parse.getHost();
                if (TextUtils.isEmpty(host)) {
                    host = "";
                }
                String path = parse.getPath();
                if (TextUtils.isEmpty(path)) {
                    path = "";
                }
                return str3 + host + path;
            }
            return str2;
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "UrlUtils_getUrlWithoutQuery");
            return str;
        }
    }

    public static String a(Uri uri) {
        String str;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bc11efada7dc64a1675ce5968332d66", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bc11efada7dc64a1675ce5968332d66");
        }
        if (uri == null) {
            return "";
        }
        try {
            String scheme = uri.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                str = "";
            } else {
                str = scheme + "://";
            }
            String authority = uri.getAuthority();
            if (TextUtils.isEmpty(authority)) {
                authority = "";
            }
            return str + authority;
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "UrlUtils_getDomain");
            return "";
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d89f930c330af233f823e81c37d8d65f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d89f930c330af233f823e81c37d8d65f");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Uri.parse(str).getPath();
            } catch (Exception e) {
                com.meituan.android.neohybrid.exception.a.a(e, "UrlUtils_getPath");
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d153687817faee04cdf824c83165bb7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d153687817faee04cdf824c83165bb7d");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getQueryParameter(str2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static Map<String, String> b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01b378f157e2b75069d0e44f4f26ed4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01b378f157e2b75069d0e44f4f26ed4f");
        }
        if (uri == null) {
            return Collections.emptyMap();
        }
        try {
            HashMap hashMap = new HashMap();
            l.a(uri, hashMap);
            return hashMap;
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "UrlUtils_getQueries");
            return Collections.emptyMap();
        }
    }
}
